package ma.zs.univ.service.impl.admin.is;


import ma.zs.univ.bean.core.is.TauxIs;
import ma.zs.univ.dao.criteria.core.is.TauxIsCriteria;
import ma.zs.univ.dao.facade.core.is.TauxIsDao;
import ma.zs.univ.dao.specification.core.is.TauxIsSpecification;
import ma.zs.univ.service.facade.admin.is.TauxIsAdminService;
import ma.zs.univ.zynerator.service.AbstractServiceImpl;
import ma.zs.univ.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TauxIsAdminServiceImpl extends AbstractServiceImpl<TauxIs, TauxIsCriteria, TauxIsDao> implements TauxIsAdminService {






    public TauxIs findByReferenceEntity(TauxIs t){
        return  dao.findByCode(t.getCode());
    }


    public List<TauxIs> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(TauxIs.class, TauxIsSpecification.class);
    }



    public TauxIsAdminServiceImpl(TauxIsDao dao) {
        super(dao);
    }


}
