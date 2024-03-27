package ma.zs.univ.service.facade.admin.commun;

import ma.zs.univ.bean.core.commun.Ville;
import ma.zs.univ.dao.criteria.core.commun.VilleCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface VilleAdminService extends  IService<Ville,VilleCriteria>  {


    Ville findByLibelle(String libelle);
}
