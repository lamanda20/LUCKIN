package  ma.zs.univ.ws.converter.is;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.univ.ws.converter.commun.SocieteConverter;
import ma.zs.univ.ws.converter.is.TauxIsConverter;



import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.is.PaiementTaxeIs;
import ma.zs.univ.ws.dto.is.PaiementTaxeIsDto;

@Component
public class PaiementTaxeIsConverter extends AbstractConverter<PaiementTaxeIs, PaiementTaxeIsDto> {

    @Autowired
    private SocieteConverter societeConverter ;
    @Autowired
    private TauxIsConverter tauxIsConverter ;
    private boolean societe;
    private boolean tauxIs;

    public  PaiementTaxeIsConverter() {
        super(PaiementTaxeIs.class, PaiementTaxeIsDto.class);
        init(true);
    }

    @Override
    public PaiementTaxeIs toItem(PaiementTaxeIsDto dto) {
        if (dto == null) {
            return null;
        } else {
        PaiementTaxeIs item = new PaiementTaxeIs();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(dto.getAnnee());
            if(StringUtil.isNotEmpty(dto.getTotalCharge()))
                item.setTotalCharge(dto.getTotalCharge());
            if(StringUtil.isNotEmpty(dto.getTotalProduit()))
                item.setTotalProduit(dto.getTotalProduit());
            if(StringUtil.isNotEmpty(dto.getResAvantImpo()))
                item.setResAvantImpo(dto.getResAvantImpo());
            if(StringUtil.isNotEmpty(dto.getResApreImpot()))
                item.setResApreImpot(dto.getResApreImpot());
            if(StringUtil.isNotEmpty(dto.getMontantIs()))
                item.setMontantIs(dto.getMontantIs());
            if(StringUtil.isNotEmpty(dto.getDatePresentation()))
                item.setDatePresentation(DateUtil.stringEnToDate(dto.getDatePresentation()));
            if(this.societe && dto.getSociete()!=null)
                item.setSociete(societeConverter.toItem(dto.getSociete())) ;

            if(this.tauxIs && dto.getTauxIs()!=null)
                item.setTauxIs(tauxIsConverter.toItem(dto.getTauxIs())) ;




        return item;
        }
    }

    @Override
    public PaiementTaxeIsDto toDto(PaiementTaxeIs item) {
        if (item == null) {
            return null;
        } else {
            PaiementTaxeIsDto dto = new PaiementTaxeIsDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getAnnee()))
                dto.setAnnee(item.getAnnee());
            if(StringUtil.isNotEmpty(item.getTotalCharge()))
                dto.setTotalCharge(item.getTotalCharge());
            if(StringUtil.isNotEmpty(item.getTotalProduit()))
                dto.setTotalProduit(item.getTotalProduit());
            if(StringUtil.isNotEmpty(item.getResAvantImpo()))
                dto.setResAvantImpo(item.getResAvantImpo());
            if(StringUtil.isNotEmpty(item.getResApreImpot()))
                dto.setResApreImpot(item.getResApreImpot());
            if(StringUtil.isNotEmpty(item.getMontantIs()))
                dto.setMontantIs(item.getMontantIs());
            if(item.getDatePresentation()!=null)
                dto.setDatePresentation(DateUtil.dateTimeToString(item.getDatePresentation()));
            if(this.societe && item.getSociete()!=null) {
                dto.setSociete(societeConverter.toDto(item.getSociete())) ;

            }
            if(this.tauxIs && item.getTauxIs()!=null) {
                dto.setTauxIs(tauxIsConverter.toDto(item.getTauxIs())) ;

            }


        return dto;
        }
    }

    public void copy(PaiementTaxeIsDto dto, PaiementTaxeIs t) {
    super.copy(dto, t);
    if (dto.getSociete() != null)
        societeConverter.copy(dto.getSociete(), t.getSociete());
    if (dto.getTauxIs() != null)
        tauxIsConverter.copy(dto.getTauxIs(), t.getTauxIs());
    }



    public void initObject(boolean value) {
        this.societe = value;
        this.tauxIs = value;
    }


    public SocieteConverter getSocieteConverter(){
        return this.societeConverter;
    }
    public void setSocieteConverter(SocieteConverter societeConverter ){
        this.societeConverter = societeConverter;
    }
    public TauxIsConverter getTauxIsConverter(){
        return this.tauxIsConverter;
    }
    public void setTauxIsConverter(TauxIsConverter tauxIsConverter ){
        this.tauxIsConverter = tauxIsConverter;
    }
    public boolean  isSociete(){
        return this.societe;
    }
    public void  setSociete(boolean societe){
        this.societe = societe;
    }
    public boolean  isTauxIs(){
        return this.tauxIs;
    }
    public void  setTauxIs(boolean tauxIs){
        this.tauxIs = tauxIs;
    }
}
