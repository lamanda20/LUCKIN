package  ma.zs.univ.dao.specification.core.is;

import ma.zs.univ.dao.criteria.core.is.TauxIsCriteria;
import ma.zs.univ.bean.core.is.TauxIs;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class TauxIsSpecification extends  AbstractSpecification<TauxIsCriteria, TauxIs>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateBigDecimal("montantMin", criteria.getMontantMin(), criteria.getMontantMinMin(), criteria.getMontantMinMax());
        addPredicateBigDecimal("montantMax", criteria.getMontantMax(), criteria.getMontantMaxMin(), criteria.getMontantMaxMax());
        addPredicateBigDecimal("pourcentage", criteria.getPourcentage(), criteria.getPourcentageMin(), criteria.getPourcentageMax());
        addPredicate("dateMin", criteria.getDateMin(), criteria.getDateMinFrom(), criteria.getDateMinTo());
        addPredicate("dateMax", criteria.getDateMax(), criteria.getDateMaxFrom(), criteria.getDateMaxTo());
        addPredicate("dateApplicationMin", criteria.getDateApplicationMin(), criteria.getDateApplicationMinFrom(), criteria.getDateApplicationMinTo());
        addPredicate("dateApplicationMax", criteria.getDateApplicationMax(), criteria.getDateApplicationMaxFrom(), criteria.getDateApplicationMaxTo());
        addPredicateBigDecimal("montantRetard", criteria.getMontantRetard(), criteria.getMontantRetardMin(), criteria.getMontantRetardMax());
    }

    public TauxIsSpecification(TauxIsCriteria criteria) {
        super(criteria);
    }

    public TauxIsSpecification(TauxIsCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
