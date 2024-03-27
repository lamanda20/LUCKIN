package  ma.zs.univ.ws.converter.is;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.univ.zynerator.util.StringUtil;
import ma.zs.univ.zynerator.converter.AbstractConverter;
import ma.zs.univ.zynerator.util.DateUtil;
import ma.zs.univ.bean.core.is.TauxIs;
import ma.zs.univ.ws.dto.is.TauxIsDto;

@Component
public class TauxIsConverter extends AbstractConverter<TauxIs, TauxIsDto> {


    public  TauxIsConverter() {
        super(TauxIs.class, TauxIsDto.class);
    }

    @Override
    public TauxIs toItem(TauxIsDto dto) {
        if (dto == null) {
            return null;
        } else {
        TauxIs item = new TauxIs();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getMontantMin()))
                item.setMontantMin(dto.getMontantMin());
            if(StringUtil.isNotEmpty(dto.getMontantMax()))
                item.setMontantMax(dto.getMontantMax());
            if(StringUtil.isNotEmpty(dto.getPourcentage()))
                item.setPourcentage(dto.getPourcentage());
            if(StringUtil.isNotEmpty(dto.getDateMin()))
                item.setDateMin(DateUtil.stringEnToDate(dto.getDateMin()));
            if(StringUtil.isNotEmpty(dto.getDateMax()))
                item.setDateMax(DateUtil.stringEnToDate(dto.getDateMax()));
            if(StringUtil.isNotEmpty(dto.getDateApplicationMin()))
                item.setDateApplicationMin(DateUtil.stringEnToDate(dto.getDateApplicationMin()));
            if(StringUtil.isNotEmpty(dto.getDateApplicationMax()))
                item.setDateApplicationMax(DateUtil.stringEnToDate(dto.getDateApplicationMax()));
            if(StringUtil.isNotEmpty(dto.getMontantRetard()))
                item.setMontantRetard(dto.getMontantRetard());



        return item;
        }
    }

    @Override
    public TauxIsDto toDto(TauxIs item) {
        if (item == null) {
            return null;
        } else {
            TauxIsDto dto = new TauxIsDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getMontantMin()))
                dto.setMontantMin(item.getMontantMin());
            if(StringUtil.isNotEmpty(item.getMontantMax()))
                dto.setMontantMax(item.getMontantMax());
            if(StringUtil.isNotEmpty(item.getPourcentage()))
                dto.setPourcentage(item.getPourcentage());
            if(item.getDateMin()!=null)
                dto.setDateMin(DateUtil.dateTimeToString(item.getDateMin()));
            if(item.getDateMax()!=null)
                dto.setDateMax(DateUtil.dateTimeToString(item.getDateMax()));
            if(item.getDateApplicationMin()!=null)
                dto.setDateApplicationMin(DateUtil.dateTimeToString(item.getDateApplicationMin()));
            if(item.getDateApplicationMax()!=null)
                dto.setDateApplicationMax(DateUtil.dateTimeToString(item.getDateApplicationMax()));
            if(StringUtil.isNotEmpty(item.getMontantRetard()))
                dto.setMontantRetard(item.getMontantRetard());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
