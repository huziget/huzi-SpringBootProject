package me.zhengjie.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import me.zhengjie.modules.system.domain.Dept;
import me.zhengjie.modules.system.domain.Job;
import me.zhengjie.modules.system.domain.Role;
import me.zhengjie.modules.system.domain.User;
import me.zhengjie.modules.system.domain.UserAvatar;
import me.zhengjie.modules.system.service.dto.DeptSmallDTO;
import me.zhengjie.modules.system.service.dto.JobSmallDTO;
import me.zhengjie.modules.system.service.dto.RoleSmallDTO;
import me.zhengjie.modules.system.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:32:02+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private JobMapper jobMapper;

    @Override
    public User toEntity(UserDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        User user = new User();

        user.setId( arg0.getId() );
        user.setUsername( arg0.getUsername() );
        user.setEmail( arg0.getEmail() );
        user.setPhone( arg0.getPhone() );
        user.setEnabled( arg0.getEnabled() );
        user.setPassword( arg0.getPassword() );
        user.setCreateTime( arg0.getCreateTime() );
        user.setLastPasswordResetTime( arg0.getLastPasswordResetTime() );
        user.setRoles( roleSmallDTOSetToRoleSet( arg0.getRoles() ) );
        user.setJob( jobSmallDTOToJob( arg0.getJob() ) );
        user.setDept( deptSmallDTOToDept( arg0.getDept() ) );

        return user;
    }

    @Override
    public List<User> toEntity(List<UserDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( arg0.size() );
        for ( UserDTO userDTO : arg0 ) {
            list.add( toEntity( userDTO ) );
        }

        return list;
    }

    @Override
    public List<UserDTO> toDto(List<User> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( arg0.size() );
        for ( User user : arg0 ) {
            list.add( toDto( user ) );
        }

        return list;
    }

    @Override
    public UserDTO toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        String realName = userUserAvatarRealName( user );
        if ( realName != null ) {
            userDTO.setAvatar( realName );
        }
        userDTO.setId( user.getId() );
        userDTO.setUsername( user.getUsername() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setPhone( user.getPhone() );
        userDTO.setEnabled( user.getEnabled() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setCreateTime( user.getCreateTime() );
        userDTO.setLastPasswordResetTime( user.getLastPasswordResetTime() );
        userDTO.setRoles( roleSetToRoleSmallDTOSet( user.getRoles() ) );
        userDTO.setJob( jobToJobSmallDTO( user.getJob() ) );
        userDTO.setDept( deptToDeptSmallDTO( user.getDept() ) );

        return userDTO;
    }

    protected Role roleSmallDTOToRole(RoleSmallDTO roleSmallDTO) {
        if ( roleSmallDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleSmallDTO.getId() );
        role.setName( roleSmallDTO.getName() );
        role.setDataScope( roleSmallDTO.getDataScope() );
        role.setLevel( roleSmallDTO.getLevel() );

        return role;
    }

    protected Set<Role> roleSmallDTOSetToRoleSet(Set<RoleSmallDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Role> set1 = new HashSet<Role>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleSmallDTO roleSmallDTO : set ) {
            set1.add( roleSmallDTOToRole( roleSmallDTO ) );
        }

        return set1;
    }

    protected Job jobSmallDTOToJob(JobSmallDTO jobSmallDTO) {
        if ( jobSmallDTO == null ) {
            return null;
        }

        Job job = new Job();

        job.setId( jobSmallDTO.getId() );
        job.setName( jobSmallDTO.getName() );

        return job;
    }

    protected Dept deptSmallDTOToDept(DeptSmallDTO deptSmallDTO) {
        if ( deptSmallDTO == null ) {
            return null;
        }

        Dept dept = new Dept();

        dept.setId( deptSmallDTO.getId() );
        dept.setName( deptSmallDTO.getName() );

        return dept;
    }

    private String userUserAvatarRealName(User user) {
        if ( user == null ) {
            return null;
        }
        UserAvatar userAvatar = user.getUserAvatar();
        if ( userAvatar == null ) {
            return null;
        }
        String realName = userAvatar.getRealName();
        if ( realName == null ) {
            return null;
        }
        return realName;
    }

    protected RoleSmallDTO roleToRoleSmallDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleSmallDTO roleSmallDTO = new RoleSmallDTO();

        roleSmallDTO.setId( role.getId() );
        roleSmallDTO.setName( role.getName() );
        roleSmallDTO.setLevel( role.getLevel() );
        roleSmallDTO.setDataScope( role.getDataScope() );

        return roleSmallDTO;
    }

    protected Set<RoleSmallDTO> roleSetToRoleSmallDTOSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleSmallDTO> set1 = new HashSet<RoleSmallDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleToRoleSmallDTO( role ) );
        }

        return set1;
    }

    protected JobSmallDTO jobToJobSmallDTO(Job job) {
        if ( job == null ) {
            return null;
        }

        JobSmallDTO jobSmallDTO = new JobSmallDTO();

        jobSmallDTO.setId( job.getId() );
        jobSmallDTO.setName( job.getName() );

        return jobSmallDTO;
    }

    protected DeptSmallDTO deptToDeptSmallDTO(Dept dept) {
        if ( dept == null ) {
            return null;
        }

        DeptSmallDTO deptSmallDTO = new DeptSmallDTO();

        deptSmallDTO.setId( dept.getId() );
        deptSmallDTO.setName( dept.getName() );

        return deptSmallDTO;
    }
}
