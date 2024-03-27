package ma.zs.univ.service.facade.admin.commun;

import java.util.List;
import ma.zs.univ.bean.core.commun.Societe;
import ma.zs.univ.dao.criteria.core.commun.SocieteCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface SocieteAdminService extends  IService<Societe,SocieteCriteria> {

    List<Societe> findByVilleId(Long id);

    int deleteByVilleId(Long id);

    long countByVilleCode(String code);


    Societe saveSociete(Societe societe);

    int deleteByIdentifiantFiscal(String nif);

    Societe findByIdentifiantFiscal(String nif);

}

