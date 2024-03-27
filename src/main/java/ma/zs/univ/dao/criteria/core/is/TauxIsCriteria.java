package  ma.zs.univ.dao.criteria.core.is;



import ma.zs.univ.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class TauxIsCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String montantMin;
    private String montantMinMin;
    private String montantMinMax;
    private String montantMax;
    private String montantMaxMin;
    private String montantMaxMax;
    private String pourcentage;
    private String pourcentageMin;
    private String pourcentageMax;
    private LocalDateTime dateMin;
    private LocalDateTime dateMinFrom;
    private LocalDateTime dateMinTo;
    private LocalDateTime dateMax;
    private LocalDateTime dateMaxFrom;
    private LocalDateTime dateMaxTo;
    private LocalDateTime dateApplicationMin;
    private LocalDateTime dateApplicationMinFrom;
    private LocalDateTime dateApplicationMinTo;
    private LocalDateTime dateApplicationMax;
    private LocalDateTime dateApplicationMaxFrom;
    private LocalDateTime dateApplicationMaxTo;
    private String montantRetard;
    private String montantRetardMin;
    private String montantRetardMax;



    public TauxIsCriteria(){}

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

    public String getMontantMin(){
        return this.montantMin;
    }
    public void setMontantMin(String montantMin){
        this.montantMin = montantMin;
    }   
    public String getMontantMinMin(){
        return this.montantMinMin;
    }
    public void setMontantMinMin(String montantMinMin){
        this.montantMinMin = montantMinMin;
    }
    public String getMontantMinMax(){
        return this.montantMinMax;
    }
    public void setMontantMinMax(String montantMinMax){
        this.montantMinMax = montantMinMax;
    }
      
    public String getMontantMax(){
        return this.montantMax;
    }
    public void setMontantMax(String montantMax){
        this.montantMax = montantMax;
    }   
    public String getMontantMaxMin(){
        return this.montantMaxMin;
    }
    public void setMontantMaxMin(String montantMaxMin){
        this.montantMaxMin = montantMaxMin;
    }
    public String getMontantMaxMax(){
        return this.montantMaxMax;
    }
    public void setMontantMaxMax(String montantMaxMax){
        this.montantMaxMax = montantMaxMax;
    }
      
    public String getPourcentage(){
        return this.pourcentage;
    }
    public void setPourcentage(String pourcentage){
        this.pourcentage = pourcentage;
    }   
    public String getPourcentageMin(){
        return this.pourcentageMin;
    }
    public void setPourcentageMin(String pourcentageMin){
        this.pourcentageMin = pourcentageMin;
    }
    public String getPourcentageMax(){
        return this.pourcentageMax;
    }
    public void setPourcentageMax(String pourcentageMax){
        this.pourcentageMax = pourcentageMax;
    }
      
    public LocalDateTime getDateMin(){
        return this.dateMin;
    }
    public void setDateMin(LocalDateTime dateMin){
        this.dateMin = dateMin;
    }
    public LocalDateTime getDateMinFrom(){
        return this.dateMinFrom;
    }
    public void setDateMinFrom(LocalDateTime dateMinFrom){
        this.dateMinFrom = dateMinFrom;
    }
    public LocalDateTime getDateMinTo(){
        return this.dateMinTo;
    }
    public void setDateMinTo(LocalDateTime dateMinTo){
        this.dateMinTo = dateMinTo;
    }
    public LocalDateTime getDateMax(){
        return this.dateMax;
    }
    public void setDateMax(LocalDateTime dateMax){
        this.dateMax = dateMax;
    }
    public LocalDateTime getDateMaxFrom(){
        return this.dateMaxFrom;
    }
    public void setDateMaxFrom(LocalDateTime dateMaxFrom){
        this.dateMaxFrom = dateMaxFrom;
    }
    public LocalDateTime getDateMaxTo(){
        return this.dateMaxTo;
    }
    public void setDateMaxTo(LocalDateTime dateMaxTo){
        this.dateMaxTo = dateMaxTo;
    }
    public LocalDateTime getDateApplicationMin(){
        return this.dateApplicationMin;
    }
    public void setDateApplicationMin(LocalDateTime dateApplicationMin){
        this.dateApplicationMin = dateApplicationMin;
    }
    public LocalDateTime getDateApplicationMinFrom(){
        return this.dateApplicationMinFrom;
    }
    public void setDateApplicationMinFrom(LocalDateTime dateApplicationMinFrom){
        this.dateApplicationMinFrom = dateApplicationMinFrom;
    }
    public LocalDateTime getDateApplicationMinTo(){
        return this.dateApplicationMinTo;
    }
    public void setDateApplicationMinTo(LocalDateTime dateApplicationMinTo){
        this.dateApplicationMinTo = dateApplicationMinTo;
    }
    public LocalDateTime getDateApplicationMax(){
        return this.dateApplicationMax;
    }
    public void setDateApplicationMax(LocalDateTime dateApplicationMax){
        this.dateApplicationMax = dateApplicationMax;
    }
    public LocalDateTime getDateApplicationMaxFrom(){
        return this.dateApplicationMaxFrom;
    }
    public void setDateApplicationMaxFrom(LocalDateTime dateApplicationMaxFrom){
        this.dateApplicationMaxFrom = dateApplicationMaxFrom;
    }
    public LocalDateTime getDateApplicationMaxTo(){
        return this.dateApplicationMaxTo;
    }
    public void setDateApplicationMaxTo(LocalDateTime dateApplicationMaxTo){
        this.dateApplicationMaxTo = dateApplicationMaxTo;
    }
    public String getMontantRetard(){
        return this.montantRetard;
    }
    public void setMontantRetard(String montantRetard){
        this.montantRetard = montantRetard;
    }   
    public String getMontantRetardMin(){
        return this.montantRetardMin;
    }
    public void setMontantRetardMin(String montantRetardMin){
        this.montantRetardMin = montantRetardMin;
    }
    public String getMontantRetardMax(){
        return this.montantRetardMax;
    }
    public void setMontantRetardMax(String montantRetardMax){
        this.montantRetardMax = montantRetardMax;
    }
      

}
