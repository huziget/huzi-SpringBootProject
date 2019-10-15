package me.zhengjie.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.modules.system.domain.Job;
import me.zhengjie.modules.system.service.dto.JobSmallDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:32:01+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class JobSmallMapperImpl implements JobSmallMapper {

    @Override
    public Job toEntity(JobSmallDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Job job = new Job();

        job.setId( arg0.getId() );
        job.setName( arg0.getName() );

        return job;
    }

    @Override
    public JobSmallDTO toDto(Job arg0) {
        if ( arg0 == null ) {
            return null;
        }

        JobSmallDTO jobSmallDTO = new JobSmallDTO();

        jobSmallDTO.setId( arg0.getId() );
        jobSmallDTO.setName( arg0.getName() );

        return jobSmallDTO;
    }

    @Override
    public List<Job> toEntity(List<JobSmallDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Job> list = new ArrayList<Job>( arg0.size() );
        for ( JobSmallDTO jobSmallDTO : arg0 ) {
            list.add( toEntity( jobSmallDTO ) );
        }

        return list;
    }

    @Override
    public List<JobSmallDTO> toDto(List<Job> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<JobSmallDTO> list = new ArrayList<JobSmallDTO>( arg0.size() );
        for ( Job job : arg0 ) {
            list.add( toDto( job ) );
        }

        return list;
    }
}
