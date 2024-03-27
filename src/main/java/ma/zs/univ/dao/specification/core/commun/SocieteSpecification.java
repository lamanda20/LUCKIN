package  ma.zs.univ.dao.specification.core.commun;

import ma.zs.univ.dao.criteria.core.commun.SocieteCriteria;
import ma.zs.univ.bean.core.commun.Societe;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class SocieteSpecification extends  AbstractSpecification<SocieteCriteria, Societe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("identifiantFiscal", criteria.getIdentifiantFiscal(),criteria.getIdentifiantFiscalLike());
        addPredicate("ice", criteria.getIce(),criteria.getIceLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("rc", criteria.getRc(),criteria.getRcLike());
        addPredicateFk("ville","id", criteria.getVille()==null?null:criteria.getVille().getId());
        addPredicateFk("ville","id", criteria.getVilles());
        addPredicateFk("ville","code", criteria.getVille()==null?null:criteria.getVille().getCode());
    }

    public SocieteSpecification(SocieteCriteria criteria) {
        super(criteria);
    }

    public SocieteSpecification(SocieteCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
