package  ma.zs.univ.ws.dto.is;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


import ma.zs.univ.ws.dto.commun.SocieteDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaiementTaxeIsDto  extends AuditBaseDto {

    private String code  ;
    private Integer annee  = 0 ;
    private BigDecimal totalCharge  ;
    private BigDecimal totalProduit  ;
    private BigDecimal resAvantImpo  ;
    private BigDecimal resApreImpot  ;
    private BigDecimal montantIs  ;
    private String datePresentation ;

    private SocieteDto societe ;
    private TauxIsDto tauxIs ;



    public PaiementTaxeIsDto(){
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
    public Integer getAnnee(){
        return this.annee;
    }
    public void setAnnee(Integer annee){
        this.annee = annee;
    }

    @Log
    public BigDecimal getTotalCharge(){
        return this.totalCharge;
    }
    public void setTotalCharge(BigDecimal totalCharge){
        this.totalCharge = totalCharge;
    }

    @Log
    public BigDecimal getTotalProduit(){
        return this.totalProduit;
    }
    public void setTotalProduit(BigDecimal totalProduit){
        this.totalProduit = totalProduit;
    }

    @Log
    public BigDecimal getResAvantImpo(){
        return this.resAvantImpo;
    }
    public void setResAvantImpo(BigDecimal resAvantImpo){
        this.resAvantImpo = resAvantImpo;
    }

    @Log
    public BigDecimal getResApreImpot(){
        return this.resApreImpot;
    }
    public void setResApreImpot(BigDecimal resApreImpot){
        this.resApreImpot = resApreImpot;
    }

    @Log
    public BigDecimal getMontantIs(){
        return this.montantIs;
    }
    public void setMontantIs(BigDecimal montantIs){
        this.montantIs = montantIs;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatePresentation(){
        return this.datePresentation;
    }
    public void setDatePresentation(String datePresentation){
        this.datePresentation = datePresentation;
    }


    public SocieteDto getSociete(){
        return this.societe;
    }

    public void setSociete(SocieteDto societe){
        this.societe = societe;
    }
    public TauxIsDto getTauxIs(){
        return this.tauxIs;
    }

    public void setTauxIs(TauxIsDto tauxIs){
        this.tauxIs = tauxIs;
    }






}
