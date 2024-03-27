package ma.zs.univ.service.impl.admin.commun;


import ma.zs.univ.bean.core.commun.Societe;
import ma.zs.univ.bean.core.commun.Ville;
import ma.zs.univ.dao.criteria.core.commun.SocieteCriteria;
import ma.zs.univ.dao.facade.core.commun.SocieteDao;
import ma.zs.univ.dao.facade.core.commun.VilleDao;
import ma.zs.univ.dao.specification.core.commun.SocieteSpecification;
import ma.zs.univ.service.ICEGenerator;
import ma.zs.univ.service.facade.admin.commun.SocieteAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.univ.service.facade.admin.commun.VilleAdminService;

import static ma.zs.univ.service.ICEGenerator.generateICE;


@Service
public class SocieteAdminServiceImpl extends AbstractServiceImpl<Societe, SocieteCriteria, SocieteDao> implements SocieteAdminService {

    @Override
    public Societe saveSociete(Societe societe) {

        String ice = ICEGenerator.generateICE();

        if (societe.getVille() != null) {
            Ville ville = villeService.findByLibelle(societe.getVille().getLibelle());
            societe.setVille(ville);
        }

        if (dao.findByIdentifiantFiscal(societe.getIdentifiantFiscal()) != null) {
            return null;
        } else if (dao.findByIce(ice) != null) {
            return null;
        } else {
            societe.setIce(ice);
            return dao.save(societe); // Utilisation de la méthode save du DAO;
        }
    }


    private @Autowired SocieteAdminService societeService;

    public int deleteByIdentifiantFiscal(String nif) {
        //int res1 = paiementtaxeisadminaervice.deleteBySocieteIdentifiantFiscal(nif);
        int res2 = societeService.deleteByIdentifiantFiscal(nif);
        return res2;
    }

    @Override
    public Societe findByIdentifiantFiscal(String nif) {
        return societeService.findByIdentifiantFiscal(nif);
    }

    public void findOrSaveAssociatedObject(Societe t) {
        if (t != null) {
            t.setVille(villeService.findOrSave(t.getVille()));
        }
    }

    public List<Societe> findByVilleId(Long id) {
        return dao.findByVilleId(id);
    }

    public int deleteByVilleId(Long id) {
        return dao.deleteByVilleId(id);
    }

    public long countByVilleCode(String code) {
        return dao.countByVilleCode(code);
    }

    public List<Societe> findAllOptimized() {
        return dao.findAllOptimized();
    }

    public void configure() {
        super.configure(Societe.class, SocieteSpecification.class);
    }


    @Autowired
    private VilleAdminService villeService;

    public SocieteAdminServiceImpl(SocieteDao dao) {
        super(dao);
    }

}
