package me.zhengjie.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.domain.Log;
import me.zhengjie.service.dto.LogErrorDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T13:58:22+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class LogErrorMapperImpl implements LogErrorMapper {

    @Override
    public Log toEntity(LogErrorDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Log log = new Log();

        log.setId( arg0.getId() );
        log.setUsername( arg0.getUsername() );
        log.setDescription( arg0.getDescription() );
        log.setMethod( arg0.getMethod() );
        log.setParams( arg0.getParams() );
        log.setRequestIp( arg0.getRequestIp() );
        log.setAddress( arg0.getAddress() );
        log.setCreateTime( arg0.getCreateTime() );

        return log;
    }

    @Override
    public LogErrorDTO toDto(Log arg0) {
        if ( arg0 == null ) {
            return null;
        }

        LogErrorDTO logErrorDTO = new LogErrorDTO();

        logErrorDTO.setId( arg0.getId() );
        logErrorDTO.setUsername( arg0.getUsername() );
        logErrorDTO.setDescription( arg0.getDescription() );
        logErrorDTO.setMethod( arg0.getMethod() );
        logErrorDTO.setParams( arg0.getParams() );
        logErrorDTO.setRequestIp( arg0.getRequestIp() );
        logErrorDTO.setAddress( arg0.getAddress() );
        logErrorDTO.setCreateTime( arg0.getCreateTime() );

        return logErrorDTO;
    }

    @Override
    public List<Log> toEntity(List<LogErrorDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Log> list = new ArrayList<Log>( arg0.size() );
        for ( LogErrorDTO logErrorDTO : arg0 ) {
            list.add( toEntity( logErrorDTO ) );
        }

        return list;
    }

    @Override
    public List<LogErrorDTO> toDto(List<Log> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<LogErrorDTO> list = new ArrayList<LogErrorDTO>( arg0.size() );
        for ( Log log : arg0 ) {
            list.add( toDto( log ) );
        }

        return list;
    }
}
