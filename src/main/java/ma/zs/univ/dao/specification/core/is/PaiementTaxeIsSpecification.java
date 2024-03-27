package  ma.zs.univ.dao.specification.core.is;

import ma.zs.univ.dao.criteria.core.is.PaiementTaxeIsCriteria;
import ma.zs.univ.bean.core.is.PaiementTaxeIs;
import ma.zs.univ.zynerator.specification.AbstractSpecification;


public class PaiementTaxeIsSpecification extends  AbstractSpecification<PaiementTaxeIsCriteria, PaiementTaxeIs>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateInt("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateBigDecimal("totalCharge", criteria.getTotalCharge(), criteria.getTotalChargeMin(), criteria.getTotalChargeMax());
        addPredicateBigDecimal("totalProduit", criteria.getTotalProduit(), criteria.getTotalProduitMin(), criteria.getTotalProduitMax());
        addPredicateBigDecimal("resAvantImpo", criteria.getResAvantImpo(), criteria.getResAvantImpoMin(), criteria.getResAvantImpoMax());
        addPredicateBigDecimal("resApreImpot", criteria.getResApreImpot(), criteria.getResApreImpotMin(), criteria.getResApreImpotMax());
        addPredicateBigDecimal("montantIs", criteria.getMontantIs(), criteria.getMontantIsMin(), criteria.getMontantIsMax());
        addPredicate("datePresentation", criteria.getDatePresentation(), criteria.getDatePresentationFrom(), criteria.getDatePresentationTo());
        addPredicateFk("societe","id", criteria.getSociete()==null?null:criteria.getSociete().getId());
        addPredicateFk("societe","id", criteria.getSocietes());
        addPredicateFk("societe","ice", criteria.getSociete()==null?null:criteria.getSociete().getIce());
        addPredicateFk("tauxIs","id", criteria.getTauxIs()==null?null:criteria.getTauxIs().getId());
        addPredicateFk("tauxIs","id", criteria.getTauxIss());
        addPredicateFk("tauxIs","code", criteria.getTauxIs()==null?null:criteria.getTauxIs().getCode());
    }

    public PaiementTaxeIsSpecification(PaiementTaxeIsCriteria criteria) {
        super(criteria);
    }

    public PaiementTaxeIsSpecification(PaiementTaxeIsCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
