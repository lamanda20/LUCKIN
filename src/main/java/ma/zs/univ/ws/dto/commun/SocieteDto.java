package  ma.zs.univ.ws.dto.commun;

import ma.zs.univ.zynerator.audit.Log;
import ma.zs.univ.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;





@JsonInclude(JsonInclude.Include.NON_NULL)
public class SocieteDto  extends AuditBaseDto {

    private String identifiantFiscal  ;
    private String ice  ;
    private String nom  ;
    private String rc  ;

    private VilleDto ville ;



    public SocieteDto(){
        super();
    }



    @Log
    public String getIdentifiantFiscal(){
        return this.identifiantFiscal;
    }
    public void setIdentifiantFiscal(String identifiantFiscal){
        this.identifiantFiscal = identifiantFiscal;
    }

    @Log
    public String getIce(){
        return this.ice;
    }
    public void setIce(String ice){
        this.ice = ice;
    }

    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    public String getRc(){
        return this.rc;
    }
    public void setRc(String rc){
        this.rc = rc;
    }


    public VilleDto getVille(){
        return this.ville;
    }

    public void setVille(VilleDto ville){
        this.ville = ville;
    }






}
