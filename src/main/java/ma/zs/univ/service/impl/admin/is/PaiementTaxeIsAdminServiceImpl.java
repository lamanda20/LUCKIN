package ma.zs.univ.service.impl.admin.is;


import ma.zs.univ.bean.core.is.PaiementTaxeIs;
import ma.zs.univ.dao.criteria.core.is.PaiementTaxeIsCriteria;
import ma.zs.univ.dao.facade.core.is.PaiementTaxeIsDao;
import ma.zs.univ.dao.specification.core.is.PaiementTaxeIsSpecification;
import ma.zs.univ.service.facade.admin.is.PaiementTaxeIsAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.univ.service.facade.admin.commun.SocieteAdminService ;
import ma.zs.univ.bean.core.commun.Societe ;
import ma.zs.univ.service.facade.admin.is.TauxIsAdminService ;
import ma.zs.univ.bean.core.is.TauxIs ;

import java.util.List;
@Service
public class PaiementTaxeIsAdminServiceImpl extends AbstractServiceImpl<PaiementTaxeIs, PaiementTaxeIsCriteria, PaiementTaxeIsDao> implements PaiementTaxeIsAdminService {






    public PaiementTaxeIs findByReferenceEntity(PaiementTaxeIs t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(PaiementTaxeIs t){
        if( t != null) {
            t.setSociete(societeService.findOrSave(t.getSociete()));
            t.setTauxIs(tauxIsService.findOrSave(t.getTauxIs()));
        }
    }

    public List<PaiementTaxeIs> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }
    public long countBySocieteIce(String ice){
        return dao.countBySocieteIce(ice);
    }
    public List<PaiementTaxeIs> findByTauxIsId(Long id){
        return dao.findByTauxIsId(id);
    }
    public int deleteByTauxIsId(Long id){
        return dao.deleteByTauxIsId(id);
    }
    public long countByTauxIsCode(String code){
        return dao.countByTauxIsCode(code);
    }

    public List<PaiementTaxeIs> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(PaiementTaxeIs.class, PaiementTaxeIsSpecification.class);
    }


    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private TauxIsAdminService tauxIsService ;

    public PaiementTaxeIsAdminServiceImpl(PaiementTaxeIsDao dao) {
        super(dao);
    }


}
