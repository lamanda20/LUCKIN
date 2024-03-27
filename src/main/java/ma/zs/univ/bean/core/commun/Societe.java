package ma.zs.univ.bean.core.commun;

import java.util.Objects;

import ma.zs.univ.bean.core.commun.Ville;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.univ.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "societe")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="societe_seq",sequenceName="societe_seq",allocationSize=1, initialValue = 1)
public class Societe   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String identifiantFiscal;
    @Column(length = 500)
    private String ice;
    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String rc;

    private Ville ville ;


    public Societe(){
        super();
    }

    public Societe(Long id){
        this.id = id;
    }

    public Societe(Long id,String rc){
        this.id = id;
        this.rc = rc ;
    }
    public Societe(String rc){
        this.rc = rc ;
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="societe_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getIdentifiantFiscal(){
        return this.identifiantFiscal;
    }
    public void setIdentifiantFiscal(String identifiantFiscal){
        this.identifiantFiscal = identifiantFiscal;
    }
    public String getIce(){
        return this.ice;
    }
    public void setIce(String ice) {
        this.ice = ice;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getRc(){
        return this.rc;
    }
    public void setRc(String rc){
        this.rc = rc;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ville")
    public Ville getVille(){
        return this.ville;
    }
    public void setVille(Ville ville){
        this.ville = ville;
    }

    @Transient
    public String getLabel() {
        label = rc;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Societe societe = (Societe) o;
        return id != null && id.equals(societe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

