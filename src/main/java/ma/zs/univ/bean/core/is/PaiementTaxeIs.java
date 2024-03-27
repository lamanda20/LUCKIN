package ma.zs.univ.bean.core.is;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import ma.zs.univ.bean.core.commun.Societe;
import ma.zs.univ.bean.core.is.TauxIs;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "paiement_taxe_is")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="paiement_taxe_is_seq",sequenceName="paiement_taxe_is_seq",allocationSize=1, initialValue = 1)
public class PaiementTaxeIs   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    private Integer annee = 0;
    private BigDecimal totalCharge = BigDecimal.ZERO;
    private BigDecimal totalProduit = BigDecimal.ZERO;
    private BigDecimal resAvantImpo = BigDecimal.ZERO;
    private BigDecimal resApreImpot = BigDecimal.ZERO;
    private BigDecimal montantIs = BigDecimal.ZERO;
    private LocalDateTime datePresentation ;

    private Societe societe ;
    private TauxIs tauxIs ;


    public PaiementTaxeIs(){
        super();
    }

    public PaiementTaxeIs(Long id){
        this.id = id;
    }

    public PaiementTaxeIs(Long id,String code){
        this.id = id;
        this.code = code ;
    }
    public PaiementTaxeIs(String code){
        this.code = code ;
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="paiement_taxe_is_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public Integer getAnnee(){
        return this.annee;
    }
    public void setAnnee(Integer annee){
        this.annee = annee;
    }
    public BigDecimal getTotalCharge(){
        return this.totalCharge;
    }
    public void setTotalCharge(BigDecimal totalCharge){
        this.totalCharge = totalCharge;
    }
    public BigDecimal getTotalProduit(){
        return this.totalProduit;
    }
    public void setTotalProduit(BigDecimal totalProduit){
        this.totalProduit = totalProduit;
    }
    public BigDecimal getResAvantImpo(){
        return this.resAvantImpo;
    }
    public void setResAvantImpo(BigDecimal resAvantImpo){
        this.resAvantImpo = resAvantImpo;
    }
    public BigDecimal getResApreImpot(){
        return this.resApreImpot;
    }
    public void setResApreImpot(BigDecimal resApreImpot){
        this.resApreImpot = resApreImpot;
    }
    public BigDecimal getMontantIs(){
        return this.montantIs;
    }
    public void setMontantIs(BigDecimal montantIs){
        this.montantIs = montantIs;
    }
    public LocalDateTime getDatePresentation(){
        return this.datePresentation;
    }
    public void setDatePresentation(LocalDateTime datePresentation){
        this.datePresentation = datePresentation;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "societe")
    public Societe getSociete(){
        return this.societe;
    }
    public void setSociete(Societe societe){
        this.societe = societe;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taux_is")
    public TauxIs getTauxIs(){
        return this.tauxIs;
    }
    public void setTauxIs(TauxIs tauxIs){
        this.tauxIs = tauxIs;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaiementTaxeIs paiementTaxeIs = (PaiementTaxeIs) o;
        return id != null && id.equals(paiementTaxeIs.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

