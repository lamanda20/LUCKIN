package  ma.zs.univ.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.univ.ws.converter.commun.VilleConverter;



import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.commun.Societe;
import ma.zs.univ.ws.dto.commun.SocieteDto;

@Component
public class SocieteConverter extends AbstractConverter<Societe, SocieteDto> {

    @Autowired
    private VilleConverter villeConverter ;
    private boolean ville;

    public  SocieteConverter() {
        super(Societe.class, SocieteDto.class);
        init(true);
    }

    @Override
    public Societe toItem(SocieteDto dto) {
        if (dto == null) {
            return null;
        } else {
        Societe item = new Societe();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getIdentifiantFiscal()))
                item.setIdentifiantFiscal(dto.getIdentifiantFiscal());
            if(StringUtil.isNotEmpty(dto.getIce()))
                item.setIce(dto.getIce());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getRc()))
                item.setRc(dto.getRc());
            if(this.ville && dto.getVille()!=null)
                item.setVille(villeConverter.toItem(dto.getVille())) ;




        return item;
        }
    }

    @Override
    public SocieteDto toDto(Societe item) {
        if (item == null) {
            return null;
        } else {
            SocieteDto dto = new SocieteDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getIdentifiantFiscal()))
                dto.setIdentifiantFiscal(item.getIdentifiantFiscal());
            if(StringUtil.isNotEmpty(item.getIce()))
                dto.setIce(item.getIce());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getRc()))
                dto.setRc(item.getRc());
            if(this.ville && item.getVille()!=null) {
                dto.setVille(villeConverter.toDto(item.getVille())) ;

            }


        return dto;
        }
    }

    public void copy(SocieteDto dto, Societe t) {
    super.copy(dto, t);
    if (dto.getVille() != null)
        villeConverter.copy(dto.getVille(), t.getVille());
    }



    public void initObject(boolean value) {
        this.ville = value;
    }


    public VilleConverter getVilleConverter(){
        return this.villeConverter;
    }
    public void setVilleConverter(VilleConverter villeConverter ){
        this.villeConverter = villeConverter;
    }
    public boolean  isVille(){
        return this.ville;
    }
    public void  setVille(boolean ville){
        this.ville = ville;
    }
}
