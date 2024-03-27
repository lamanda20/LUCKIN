package  ma.zs.univ.dao.criteria.core.commun;



import ma.zs.univ.zynerator.criteria.BaseCriteria;
import java.util.List;

public class SocieteCriteria extends  BaseCriteria  {

    private String identifiantFiscal;
    private String identifiantFiscalLike;
    private String ice;
    private String iceLike;
    private String nom;
    private String nomLike;
    private String rc;
    private String rcLike;

    private VilleCriteria ville ;
    private List<VilleCriteria> villes ;


    public SocieteCriteria(){}

    public String getIdentifiantFiscal(){
        return this.identifiantFiscal;
    }
    public void setIdentifiantFiscal(String identifiantFiscal){
        this.identifiantFiscal = identifiantFiscal;
    }
    public String getIdentifiantFiscalLike(){
        return this.identifiantFiscalLike;
    }
    public void setIdentifiantFiscalLike(String identifiantFiscalLike){
        this.identifiantFiscalLike = identifiantFiscalLike;
    }

    public String getIce(){
        return this.ice;
    }
    public void setIce(String ice){
        this.ice = ice;
    }
    public String getIceLike(){
        return this.iceLike;
    }
    public void setIceLike(String iceLike){
        this.iceLike = iceLike;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }

    public String getRc(){
        return this.rc;
    }
    public void setRc(String rc){
        this.rc = rc;
    }
    public String getRcLike(){
        return this.rcLike;
    }
    public void setRcLike(String rcLike){
        this.rcLike = rcLike;
    }


    public VilleCriteria getVille(){
        return this.ville;
    }

    public void setVille(VilleCriteria ville){
        this.ville = ville;
    }
    public List<VilleCriteria> getVilles(){
        return this.villes;
    }

    public void setVilles(List<VilleCriteria> villes){
        this.villes = villes;
    }
}
