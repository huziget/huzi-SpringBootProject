package me.zhengjie.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.modules.system.domain.Permission;
import me.zhengjie.modules.system.service.dto.PermissionDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:32:02+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class PermissionMapperImpl implements PermissionMapper {

    @Override
    public Permission toEntity(PermissionDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Permission permission = new Permission();

        permission.setId( arg0.getId() );
        permission.setName( arg0.getName() );
        permission.setPid( arg0.getPid() );
        permission.setAlias( arg0.getAlias() );
        permission.setCreateTime( arg0.getCreateTime() );

        return permission;
    }

    @Override
    public PermissionDTO toDto(Permission arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PermissionDTO permissionDTO = new PermissionDTO();

        permissionDTO.setId( arg0.getId() );
        permissionDTO.setName( arg0.getName() );
        permissionDTO.setPid( arg0.getPid() );
        permissionDTO.setAlias( arg0.getAlias() );
        permissionDTO.setCreateTime( arg0.getCreateTime() );

        return permissionDTO;
    }

    @Override
    public List<Permission> toEntity(List<PermissionDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Permission> list = new ArrayList<Permission>( arg0.size() );
        for ( PermissionDTO permissionDTO : arg0 ) {
            list.add( toEntity( permissionDTO ) );
        }

        return list;
    }

    @Override
    public List<PermissionDTO> toDto(List<Permission> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PermissionDTO> list = new ArrayList<PermissionDTO>( arg0.size() );
        for ( Permission permission : arg0 ) {
            list.add( toDto( permission ) );
        }

        return list;
    }
}
