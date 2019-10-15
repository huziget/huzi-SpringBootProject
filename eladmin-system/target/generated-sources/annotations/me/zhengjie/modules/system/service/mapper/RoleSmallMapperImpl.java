package me.zhengjie.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.modules.system.domain.Role;
import me.zhengjie.modules.system.service.dto.RoleSmallDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:32:01+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class RoleSmallMapperImpl implements RoleSmallMapper {

    @Override
    public Role toEntity(RoleSmallDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( arg0.getId() );
        role.setName( arg0.getName() );
        role.setDataScope( arg0.getDataScope() );
        role.setLevel( arg0.getLevel() );

        return role;
    }

    @Override
    public RoleSmallDTO toDto(Role arg0) {
        if ( arg0 == null ) {
            return null;
        }

        RoleSmallDTO roleSmallDTO = new RoleSmallDTO();

        roleSmallDTO.setId( arg0.getId() );
        roleSmallDTO.setName( arg0.getName() );
        roleSmallDTO.setLevel( arg0.getLevel() );
        roleSmallDTO.setDataScope( arg0.getDataScope() );

        return roleSmallDTO;
    }

    @Override
    public List<Role> toEntity(List<RoleSmallDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Role> list = new ArrayList<Role>( arg0.size() );
        for ( RoleSmallDTO roleSmallDTO : arg0 ) {
            list.add( toEntity( roleSmallDTO ) );
        }

        return list;
    }

    @Override
    public List<RoleSmallDTO> toDto(List<Role> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<RoleSmallDTO> list = new ArrayList<RoleSmallDTO>( arg0.size() );
        for ( Role role : arg0 ) {
            list.add( toDto( role ) );
        }

        return list;
    }
}
