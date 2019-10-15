package me.zhengjie.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.modules.system.domain.Dept;
import me.zhengjie.modules.system.service.dto.DeptSmallDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:32:01+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class DeptSmallMapperImpl implements DeptSmallMapper {

    @Override
    public Dept toEntity(DeptSmallDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Dept dept = new Dept();

        dept.setId( arg0.getId() );
        dept.setName( arg0.getName() );

        return dept;
    }

    @Override
    public DeptSmallDTO toDto(Dept arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DeptSmallDTO deptSmallDTO = new DeptSmallDTO();

        deptSmallDTO.setId( arg0.getId() );
        deptSmallDTO.setName( arg0.getName() );

        return deptSmallDTO;
    }

    @Override
    public List<Dept> toEntity(List<DeptSmallDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Dept> list = new ArrayList<Dept>( arg0.size() );
        for ( DeptSmallDTO deptSmallDTO : arg0 ) {
            list.add( toEntity( deptSmallDTO ) );
        }

        return list;
    }

    @Override
    public List<DeptSmallDTO> toDto(List<Dept> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DeptSmallDTO> list = new ArrayList<DeptSmallDTO>( arg0.size() );
        for ( Dept dept : arg0 ) {
            list.add( toDto( dept ) );
        }

        return list;
    }
}
