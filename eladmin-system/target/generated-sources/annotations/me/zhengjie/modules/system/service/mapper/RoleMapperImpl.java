package me.zhengjie.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import me.zhengjie.modules.system.domain.Dept;
import me.zhengjie.modules.system.domain.Menu;
import me.zhengjie.modules.system.domain.Permission;
import me.zhengjie.modules.system.domain.Role;
import me.zhengjie.modules.system.service.dto.DeptDTO;
import me.zhengjie.modules.system.service.dto.MenuDTO;
import me.zhengjie.modules.system.service.dto.PermissionDTO;
import me.zhengjie.modules.system.service.dto.RoleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:32:02+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Role toEntity(RoleDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( arg0.getId() );
        role.setName( arg0.getName() );
        role.setDataScope( arg0.getDataScope() );
        role.setLevel( arg0.getLevel() );
        role.setRemark( arg0.getRemark() );
        role.setPermissions( permissionDTOSetToPermissionSet( arg0.getPermissions() ) );
        role.setMenus( menuDTOSetToMenuSet( arg0.getMenus() ) );
        role.setDepts( deptDTOSetToDeptSet( arg0.getDepts() ) );
        role.setCreateTime( arg0.getCreateTime() );

        return role;
    }

    @Override
    public RoleDTO toDto(Role arg0) {
        if ( arg0 == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( arg0.getId() );
        roleDTO.setName( arg0.getName() );
        roleDTO.setDataScope( arg0.getDataScope() );
        roleDTO.setLevel( arg0.getLevel() );
        roleDTO.setRemark( arg0.getRemark() );
        roleDTO.setPermissions( permissionSetToPermissionDTOSet( arg0.getPermissions() ) );
        roleDTO.setMenus( menuSetToMenuDTOSet( arg0.getMenus() ) );
        roleDTO.setDepts( deptSetToDeptDTOSet( arg0.getDepts() ) );
        roleDTO.setCreateTime( arg0.getCreateTime() );

        return roleDTO;
    }

    @Override
    public List<Role> toEntity(List<RoleDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Role> list = new ArrayList<Role>( arg0.size() );
        for ( RoleDTO roleDTO : arg0 ) {
            list.add( toEntity( roleDTO ) );
        }

        return list;
    }

    @Override
    public List<RoleDTO> toDto(List<Role> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<RoleDTO> list = new ArrayList<RoleDTO>( arg0.size() );
        for ( Role role : arg0 ) {
            list.add( toDto( role ) );
        }

        return list;
    }

    protected Set<Permission> permissionDTOSetToPermissionSet(Set<PermissionDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Permission> set1 = new HashSet<Permission>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PermissionDTO permissionDTO : set ) {
            set1.add( permissionMapper.toEntity( permissionDTO ) );
        }

        return set1;
    }

    protected Set<Menu> menuDTOSetToMenuSet(Set<MenuDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Menu> set1 = new HashSet<Menu>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( MenuDTO menuDTO : set ) {
            set1.add( menuMapper.toEntity( menuDTO ) );
        }

        return set1;
    }

    protected Set<Dept> deptDTOSetToDeptSet(Set<DeptDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Dept> set1 = new HashSet<Dept>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( DeptDTO deptDTO : set ) {
            set1.add( deptMapper.toEntity( deptDTO ) );
        }

        return set1;
    }

    protected Set<PermissionDTO> permissionSetToPermissionDTOSet(Set<Permission> set) {
        if ( set == null ) {
            return null;
        }

        Set<PermissionDTO> set1 = new HashSet<PermissionDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Permission permission : set ) {
            set1.add( permissionMapper.toDto( permission ) );
        }

        return set1;
    }

    protected Set<MenuDTO> menuSetToMenuDTOSet(Set<Menu> set) {
        if ( set == null ) {
            return null;
        }

        Set<MenuDTO> set1 = new HashSet<MenuDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Menu menu : set ) {
            set1.add( menuMapper.toDto( menu ) );
        }

        return set1;
    }

    protected Set<DeptDTO> deptSetToDeptDTOSet(Set<Dept> set) {
        if ( set == null ) {
            return null;
        }

        Set<DeptDTO> set1 = new HashSet<DeptDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Dept dept : set ) {
            set1.add( deptMapper.toDto( dept ) );
        }

        return set1;
    }
}
