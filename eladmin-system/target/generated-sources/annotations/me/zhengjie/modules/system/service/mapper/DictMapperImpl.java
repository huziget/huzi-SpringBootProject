package me.zhengjie.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.modules.system.domain.Dict;
import me.zhengjie.modules.system.service.dto.DictDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:32:02+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class DictMapperImpl implements DictMapper {

    @Override
    public Dict toEntity(DictDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Dict dict = new Dict();

        dict.setId( arg0.getId() );
        dict.setName( arg0.getName() );
        dict.setRemark( arg0.getRemark() );

        return dict;
    }

    @Override
    public DictDTO toDto(Dict arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DictDTO dictDTO = new DictDTO();

        dictDTO.setId( arg0.getId() );
        dictDTO.setName( arg0.getName() );
        dictDTO.setRemark( arg0.getRemark() );

        return dictDTO;
    }

    @Override
    public List<Dict> toEntity(List<DictDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Dict> list = new ArrayList<Dict>( arg0.size() );
        for ( DictDTO dictDTO : arg0 ) {
            list.add( toEntity( dictDTO ) );
        }

        return list;
    }

    @Override
    public List<DictDTO> toDto(List<Dict> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DictDTO> list = new ArrayList<DictDTO>( arg0.size() );
        for ( Dict dict : arg0 ) {
            list.add( toDto( dict ) );
        }

        return list;
    }
}
