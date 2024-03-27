package  ma.zs.univ.ws.dto.is;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class TauxIsDto  extends AuditBaseDto {

    private String code  ;
    private BigDecimal montantMin  ;
    private BigDecimal montantMax  ;
    private BigDecimal pourcentage  ;
    private String dateMin ;
    private String dateMax ;
    private String dateApplicationMin ;
    private String dateApplicationMax ;
    private BigDecimal montantRetard  ;




    public TauxIsDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public BigDecimal getMontantMin(){
        return this.montantMin;
    }
    public void setMontantMin(BigDecimal montantMin){
        this.montantMin = montantMin;
    }

    @Log
    public BigDecimal getMontantMax(){
        return this.montantMax;
    }
    public void setMontantMax(BigDecimal montantMax){
        this.montantMax = montantMax;
    }

    @Log
    public BigDecimal getPourcentage(){
        return this.pourcentage;
    }
    public void setPourcentage(BigDecimal pourcentage){
        this.pourcentage = pourcentage;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateMin(){
        return this.dateMin;
    }
    public void setDateMin(String dateMin){
        this.dateMin = dateMin;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateMax(){
        return this.dateMax;
    }
    public void setDateMax(String dateMax){
        this.dateMax = dateMax;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateApplicationMin(){
        return this.dateApplicationMin;
    }
    public void setDateApplicationMin(String dateApplicationMin){
        this.dateApplicationMin = dateApplicationMin;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateApplicationMax(){
        return this.dateApplicationMax;
    }
    public void setDateApplicationMax(String dateApplicationMax){
        this.dateApplicationMax = dateApplicationMax;
    }

    @Log
    public BigDecimal getMontantRetard(){
        return this.montantRetard;
    }
    public void setMontantRetard(BigDecimal montantRetard){
        this.montantRetard = montantRetard;
    }








}
