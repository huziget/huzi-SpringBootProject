package me.zhengjie.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.modules.system.domain.Dept;
import me.zhengjie.modules.system.service.dto.DeptDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:32:01+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class DeptMapperImpl implements DeptMapper {

    @Override
    public Dept toEntity(DeptDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Dept dept = new Dept();

        dept.setId( arg0.getId() );
        dept.setName( arg0.getName() );
        dept.setEnabled( arg0.getEnabled() );
        dept.setPid( arg0.getPid() );
        dept.setCreateTime( arg0.getCreateTime() );

        return dept;
    }

    @Override
    public DeptDTO toDto(Dept arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DeptDTO deptDTO = new DeptDTO();

        deptDTO.setId( arg0.getId() );
        deptDTO.setName( arg0.getName() );
        deptDTO.setEnabled( arg0.getEnabled() );
        deptDTO.setPid( arg0.getPid() );
        deptDTO.setCreateTime( arg0.getCreateTime() );

        return deptDTO;
    }

    @Override
    public List<Dept> toEntity(List<DeptDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Dept> list = new ArrayList<Dept>( arg0.size() );
        for ( DeptDTO deptDTO : arg0 ) {
            list.add( toEntity( deptDTO ) );
        }

        return list;
    }

    @Override
    public List<DeptDTO> toDto(List<Dept> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DeptDTO> list = new ArrayList<DeptDTO>( arg0.size() );
        for ( Dept dept : arg0 ) {
            list.add( toDto( dept ) );
        }

        return list;
    }
}
