package ma.zs.univ.bean.core.is;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;




import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "taux_is")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taux_is_seq",sequenceName="taux_is_seq",allocationSize=1, initialValue = 1)
public class TauxIs   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    private BigDecimal montantMin = BigDecimal.ZERO;
    private BigDecimal montantMax = BigDecimal.ZERO;
    private BigDecimal pourcentage = BigDecimal.ZERO;
    private LocalDateTime dateMin ;
    private LocalDateTime dateMax ;
    private LocalDateTime dateApplicationMin ;
    private LocalDateTime dateApplicationMax ;
    private BigDecimal montantRetard = BigDecimal.ZERO;



    public TauxIs(){
        super();
    }

    public TauxIs(Long id){
        this.id = id;
    }

    public TauxIs(Long id,String code){
        this.id = id;
        this.code = code ;
    }
    public TauxIs(String code){
        this.code = code ;
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="taux_is_seq")
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
    public BigDecimal getMontantMin(){
        return this.montantMin;
    }
    public void setMontantMin(BigDecimal montantMin){
        this.montantMin = montantMin;
    }
    public BigDecimal getMontantMax(){
        return this.montantMax;
    }
    public void setMontantMax(BigDecimal montantMax){
        this.montantMax = montantMax;
    }
    public BigDecimal getPourcentage(){
        return this.pourcentage;
    }
    public void setPourcentage(BigDecimal pourcentage){
        this.pourcentage = pourcentage;
    }
    public LocalDateTime getDateMin(){
        return this.dateMin;
    }
    public void setDateMin(LocalDateTime dateMin){
        this.dateMin = dateMin;
    }
    public LocalDateTime getDateMax(){
        return this.dateMax;
    }
    public void setDateMax(LocalDateTime dateMax){
        this.dateMax = dateMax;
    }
    public LocalDateTime getDateApplicationMin(){
        return this.dateApplicationMin;
    }
    public void setDateApplicationMin(LocalDateTime dateApplicationMin){
        this.dateApplicationMin = dateApplicationMin;
    }
    public LocalDateTime getDateApplicationMax(){
        return this.dateApplicationMax;
    }
    public void setDateApplicationMax(LocalDateTime dateApplicationMax){
        this.dateApplicationMax = dateApplicationMax;
    }
    public BigDecimal getMontantRetard(){
        return this.montantRetard;
    }
    public void setMontantRetard(BigDecimal montantRetard){
        this.montantRetard = montantRetard;
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
        TauxIs tauxIs = (TauxIs) o;
        return id != null && id.equals(tauxIs.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

