package  ma.zs.univ.dao.criteria.core.is;


import ma.zs.univ.dao.criteria.core.commun.SocieteCriteria;

import ma.zs.univ.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PaiementTaxeIsCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String annee;
    private String anneeMin;
    private String anneeMax;
    private String totalCharge;
    private String totalChargeMin;
    private String totalChargeMax;
    private String totalProduit;
    private String totalProduitMin;
    private String totalProduitMax;
    private String resAvantImpo;
    private String resAvantImpoMin;
    private String resAvantImpoMax;
    private String resApreImpot;
    private String resApreImpotMin;
    private String resApreImpotMax;
    private String montantIs;
    private String montantIsMin;
    private String montantIsMax;
    private LocalDateTime datePresentation;
    private LocalDateTime datePresentationFrom;
    private LocalDateTime datePresentationTo;

    private SocieteCriteria societe ;
    private List<SocieteCriteria> societes ;
    private TauxIsCriteria tauxIs ;
    private List<TauxIsCriteria> tauxIss ;


    public PaiementTaxeIsCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getAnnee(){
        return this.annee;
    }
    public void setAnnee(String annee){
        this.annee = annee;
    }   
    public String getAnneeMin(){
        return this.anneeMin;
    }
    public void setAnneeMin(String anneeMin){
        this.anneeMin = anneeMin;
    }
    public String getAnneeMax(){
        return this.anneeMax;
    }
    public void setAnneeMax(String anneeMax){
        this.anneeMax = anneeMax;
    }
      
    public String getTotalCharge(){
        return this.totalCharge;
    }
    public void setTotalCharge(String totalCharge){
        this.totalCharge = totalCharge;
    }   
    public String getTotalChargeMin(){
        return this.totalChargeMin;
    }
    public void setTotalChargeMin(String totalChargeMin){
        this.totalChargeMin = totalChargeMin;
    }
    public String getTotalChargeMax(){
        return this.totalChargeMax;
    }
    public void setTotalChargeMax(String totalChargeMax){
        this.totalChargeMax = totalChargeMax;
    }
      
    public String getTotalProduit(){
        return this.totalProduit;
    }
    public void setTotalProduit(String totalProduit){
        this.totalProduit = totalProduit;
    }   
    public String getTotalProduitMin(){
        return this.totalProduitMin;
    }
    public void setTotalProduitMin(String totalProduitMin){
        this.totalProduitMin = totalProduitMin;
    }
    public String getTotalProduitMax(){
        return this.totalProduitMax;
    }
    public void setTotalProduitMax(String totalProduitMax){
        this.totalProduitMax = totalProduitMax;
    }
      
    public String getResAvantImpo(){
        return this.resAvantImpo;
    }
    public void setResAvantImpo(String resAvantImpo){
        this.resAvantImpo = resAvantImpo;
    }   
    public String getResAvantImpoMin(){
        return this.resAvantImpoMin;
    }
    public void setResAvantImpoMin(String resAvantImpoMin){
        this.resAvantImpoMin = resAvantImpoMin;
    }
    public String getResAvantImpoMax(){
        return this.resAvantImpoMax;
    }
    public void setResAvantImpoMax(String resAvantImpoMax){
        this.resAvantImpoMax = resAvantImpoMax;
    }
      
    public String getResApreImpot(){
        return this.resApreImpot;
    }
    public void setResApreImpot(String resApreImpot){
        this.resApreImpot = resApreImpot;
    }   
    public String getResApreImpotMin(){
        return this.resApreImpotMin;
    }
    public void setResApreImpotMin(String resApreImpotMin){
        this.resApreImpotMin = resApreImpotMin;
    }
    public String getResApreImpotMax(){
        return this.resApreImpotMax;
    }
    public void setResApreImpotMax(String resApreImpotMax){
        this.resApreImpotMax = resApreImpotMax;
    }
      
    public String getMontantIs(){
        return this.montantIs;
    }
    public void setMontantIs(String montantIs){
        this.montantIs = montantIs;
    }   
    public String getMontantIsMin(){
        return this.montantIsMin;
    }
    public void setMontantIsMin(String montantIsMin){
        this.montantIsMin = montantIsMin;
    }
    public String getMontantIsMax(){
        return this.montantIsMax;
    }
    public void setMontantIsMax(String montantIsMax){
        this.montantIsMax = montantIsMax;
    }
      
    public LocalDateTime getDatePresentation(){
        return this.datePresentation;
    }
    public void setDatePresentation(LocalDateTime datePresentation){
        this.datePresentation = datePresentation;
    }
    public LocalDateTime getDatePresentationFrom(){
        return this.datePresentationFrom;
    }
    public void setDatePresentationFrom(LocalDateTime datePresentationFrom){
        this.datePresentationFrom = datePresentationFrom;
    }
    public LocalDateTime getDatePresentationTo(){
        return this.datePresentationTo;
    }
    public void setDatePresentationTo(LocalDateTime datePresentationTo){
        this.datePresentationTo = datePresentationTo;
    }

    public SocieteCriteria getSociete(){
        return this.societe;
    }

    public void setSociete(SocieteCriteria societe){
        this.societe = societe;
    }
    public List<SocieteCriteria> getSocietes(){
        return this.societes;
    }

    public void setSocietes(List<SocieteCriteria> societes){
        this.societes = societes;
    }
    public TauxIsCriteria getTauxIs(){
        return this.tauxIs;
    }

    public void setTauxIs(TauxIsCriteria tauxIs){
        this.tauxIs = tauxIs;
    }
    public List<TauxIsCriteria> getTauxIss(){
        return this.tauxIss;
    }

    public void setTauxIss(List<TauxIsCriteria> tauxIss){
        this.tauxIss = tauxIss;
    }
}
