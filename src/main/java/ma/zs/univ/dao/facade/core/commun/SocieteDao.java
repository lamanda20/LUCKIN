package ma.zs.univ.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.commun.Societe;
import org.springframework.stereotype.Repository;
import ma.zs.univ.bean.core.commun.Societe;
import java.util.List;


@Repository
public interface SocieteDao extends AbstractRepository<Societe,Long>  {

    Societe findByIce(String ice);
    int deleteByIce(String ice);

    List<Societe> findByVilleId(Long id);

    int deleteByVilleId(Long id);

    long countByVilleCode(String code);

    @Query("SELECT NEW Societe(item.id,item.rc) FROM Societe item")
    List<Societe> findAllOptimized();

    int deleteByIdentifiantFiscal(String nif);

     Societe findByIdentifiantFiscal(String nif);
}
