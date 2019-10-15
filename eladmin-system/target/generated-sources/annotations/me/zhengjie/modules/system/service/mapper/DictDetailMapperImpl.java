package me.zhengjie.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.modules.system.domain.DictDetail;
import me.zhengjie.modules.system.service.dto.DictDetailDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:32:02+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class DictDetailMapperImpl implements DictDetailMapper {

    @Override
    public DictDetail toEntity(DictDetailDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DictDetail dictDetail = new DictDetail();

        dictDetail.setId( arg0.getId() );
        dictDetail.setLabel( arg0.getLabel() );
        dictDetail.setValue( arg0.getValue() );
        dictDetail.setSort( arg0.getSort() );

        return dictDetail;
    }

    @Override
    public DictDetailDTO toDto(DictDetail arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DictDetailDTO dictDetailDTO = new DictDetailDTO();

        dictDetailDTO.setId( arg0.getId() );
        dictDetailDTO.setLabel( arg0.getLabel() );
        dictDetailDTO.setValue( arg0.getValue() );
        dictDetailDTO.setSort( arg0.getSort() );

        return dictDetailDTO;
    }

    @Override
    public List<DictDetail> toEntity(List<DictDetailDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DictDetail> list = new ArrayList<DictDetail>( arg0.size() );
        for ( DictDetailDTO dictDetailDTO : arg0 ) {
            list.add( toEntity( dictDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<DictDetailDTO> toDto(List<DictDetail> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DictDetailDTO> list = new ArrayList<DictDetailDTO>( arg0.size() );
        for ( DictDetail dictDetail : arg0 ) {
            list.add( toDto( dictDetail ) );
        }

        return list;
    }
}
