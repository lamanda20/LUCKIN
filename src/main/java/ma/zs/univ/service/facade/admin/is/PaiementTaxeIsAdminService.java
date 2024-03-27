package ma.zs.univ.service.facade.admin.is;

import java.util.List;
import ma.zs.univ.bean.core.is.PaiementTaxeIs;
import ma.zs.univ.dao.criteria.core.is.PaiementTaxeIsCriteria;
import ma.zs.univ.zynerator.service.IService;



public interface PaiementTaxeIsAdminService extends  IService<PaiementTaxeIs,PaiementTaxeIsCriteria>  {

    List<PaiementTaxeIs> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);

    long countBySocieteIce(String ice);
    List<PaiementTaxeIs> findByTauxIsId(Long id);
    int deleteByTauxIsId(Long id);
    long countByTauxIsCode(String code);




}
