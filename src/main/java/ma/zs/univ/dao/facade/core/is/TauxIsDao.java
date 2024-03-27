package ma.zs.univ.dao.facade.core.is;

import org.springframework.data.jpa.repository.Query;
import ma.zs.univ.zynerator.repository.AbstractRepository;
import ma.zs.univ.bean.core.is.TauxIs;
import org.springframework.stereotype.Repository;
import ma.zs.univ.bean.core.is.TauxIs;
import java.util.List;


@Repository
public interface TauxIsDao extends AbstractRepository<TauxIs,Long>  {
    TauxIs findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TauxIs(item.id,item.code) FROM TauxIs item")
    List<TauxIs> findAllOptimized();

}
