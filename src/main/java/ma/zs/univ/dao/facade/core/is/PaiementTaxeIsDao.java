package ma.zs.univ.dao.facade.core.is;

import org.springframework.data.jpa.repository.Query;
import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.is.PaiementTaxeIs;
import org.springframework.stereotype.Repository;
import ma.zs.univ.bean.core.is.PaiementTaxeIs;
import java.util.List;


@Repository
public interface PaiementTaxeIsDao extends AbstractRepository<PaiementTaxeIs,Long>  {
    PaiementTaxeIs findByCode(String code);
    int deleteByCode(String code);

    List<PaiementTaxeIs> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    long countBySocieteIce(String ice);
    List<PaiementTaxeIs> findByTauxIsId(Long id);
    int deleteByTauxIsId(Long id);
    long countByTauxIsCode(String code);

    @Query("SELECT NEW PaiementTaxeIs(item.id,item.code) FROM PaiementTaxeIs item")
    List<PaiementTaxeIs> findAllOptimized();

}
