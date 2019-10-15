package me.zhengjie.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.domain.LocalStorage;
import me.zhengjie.service.dto.LocalStorageDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:31:51+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class LocalStorageMapperImpl implements LocalStorageMapper {

    @Override
    public LocalStorage toEntity(LocalStorageDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        LocalStorage localStorage = new LocalStorage();

        localStorage.setId( arg0.getId() );
        localStorage.setRealName( arg0.getRealName() );
        localStorage.setName( arg0.getName() );
        localStorage.setSuffix( arg0.getSuffix() );
        localStorage.setType( arg0.getType() );
        localStorage.setSize( arg0.getSize() );
        localStorage.setOperate( arg0.getOperate() );
        localStorage.setCreateTime( arg0.getCreateTime() );
        localStorage.setUpdateTime( arg0.getUpdateTime() );

        return localStorage;
    }

    @Override
    public LocalStorageDTO toDto(LocalStorage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        LocalStorageDTO localStorageDTO = new LocalStorageDTO();

        localStorageDTO.setId( arg0.getId() );
        localStorageDTO.setRealName( arg0.getRealName() );
        localStorageDTO.setName( arg0.getName() );
        localStorageDTO.setSuffix( arg0.getSuffix() );
        localStorageDTO.setType( arg0.getType() );
        localStorageDTO.setSize( arg0.getSize() );
        localStorageDTO.setOperate( arg0.getOperate() );
        localStorageDTO.setCreateTime( arg0.getCreateTime() );
        localStorageDTO.setUpdateTime( arg0.getUpdateTime() );

        return localStorageDTO;
    }

    @Override
    public List<LocalStorage> toEntity(List<LocalStorageDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<LocalStorage> list = new ArrayList<LocalStorage>( arg0.size() );
        for ( LocalStorageDTO localStorageDTO : arg0 ) {
            list.add( toEntity( localStorageDTO ) );
        }

        return list;
    }

    @Override
    public List<LocalStorageDTO> toDto(List<LocalStorage> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<LocalStorageDTO> list = new ArrayList<LocalStorageDTO>( arg0.size() );
        for ( LocalStorage localStorage : arg0 ) {
            list.add( toDto( localStorage ) );
        }

        return list;
    }
}
