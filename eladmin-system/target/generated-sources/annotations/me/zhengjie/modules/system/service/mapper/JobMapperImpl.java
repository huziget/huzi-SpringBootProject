package me.zhengjie.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.modules.system.domain.Job;
import me.zhengjie.modules.system.service.dto.JobDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:32:01+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class JobMapperImpl implements JobMapper {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Job toEntity(JobDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Job job = new Job();

        job.setId( arg0.getId() );
        job.setName( arg0.getName() );
        job.setSort( arg0.getSort() );
        job.setEnabled( arg0.getEnabled() );
        job.setDept( deptMapper.toEntity( arg0.getDept() ) );
        job.setCreateTime( arg0.getCreateTime() );

        return job;
    }

    @Override
    public JobDTO toDto(Job arg0) {
        if ( arg0 == null ) {
            return null;
        }

        JobDTO jobDTO = new JobDTO();

        jobDTO.setId( arg0.getId() );
        jobDTO.setSort( arg0.getSort() );
        jobDTO.setName( arg0.getName() );
        jobDTO.setEnabled( arg0.getEnabled() );
        jobDTO.setDept( deptMapper.toDto( arg0.getDept() ) );
        jobDTO.setCreateTime( arg0.getCreateTime() );

        return jobDTO;
    }

    @Override
    public List<Job> toEntity(List<JobDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Job> list = new ArrayList<Job>( arg0.size() );
        for ( JobDTO jobDTO : arg0 ) {
            list.add( toEntity( jobDTO ) );
        }

        return list;
    }

    @Override
    public List<JobDTO> toDto(List<Job> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<JobDTO> list = new ArrayList<JobDTO>( arg0.size() );
        for ( Job job : arg0 ) {
            list.add( toDto( job ) );
        }

        return list;
    }

    @Override
    public JobDTO toDto(Job job, String deptSuperiorName) {
        if ( job == null && deptSuperiorName == null ) {
            return null;
        }

        JobDTO jobDTO = new JobDTO();

        if ( job != null ) {
            jobDTO.setId( job.getId() );
            jobDTO.setSort( job.getSort() );
            jobDTO.setName( job.getName() );
            jobDTO.setEnabled( job.getEnabled() );
            jobDTO.setDept( deptMapper.toDto( job.getDept() ) );
            jobDTO.setCreateTime( job.getCreateTime() );
        }
        if ( deptSuperiorName != null ) {
            jobDTO.setDeptSuperiorName( deptSuperiorName );
        }

        return jobDTO;
    }
}
