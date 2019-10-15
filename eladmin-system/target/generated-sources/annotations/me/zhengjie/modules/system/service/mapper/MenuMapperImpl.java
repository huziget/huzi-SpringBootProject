package me.zhengjie.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.zhengjie.modules.system.domain.Menu;
import me.zhengjie.modules.system.service.dto.MenuDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-15T14:32:01+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class MenuMapperImpl implements MenuMapper {

    @Override
    public Menu toEntity(MenuDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Menu menu = new Menu();

        menu.setId( arg0.getId() );
        menu.setName( arg0.getName() );
        menu.setSort( arg0.getSort() );
        menu.setPath( arg0.getPath() );
        menu.setComponent( arg0.getComponent() );
        menu.setComponentName( arg0.getComponentName() );
        menu.setIcon( arg0.getIcon() );
        menu.setCache( arg0.getCache() );
        menu.setHidden( arg0.getHidden() );
        menu.setPid( arg0.getPid() );
        menu.setIFrame( arg0.getIFrame() );
        menu.setCreateTime( arg0.getCreateTime() );

        return menu;
    }

    @Override
    public MenuDTO toDto(Menu arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MenuDTO menuDTO = new MenuDTO();

        menuDTO.setId( arg0.getId() );
        menuDTO.setName( arg0.getName() );
        menuDTO.setSort( arg0.getSort() );
        menuDTO.setPath( arg0.getPath() );
        menuDTO.setComponent( arg0.getComponent() );
        menuDTO.setPid( arg0.getPid() );
        menuDTO.setIFrame( arg0.getIFrame() );
        menuDTO.setCache( arg0.getCache() );
        menuDTO.setHidden( arg0.getHidden() );
        menuDTO.setComponentName( arg0.getComponentName() );
        menuDTO.setIcon( arg0.getIcon() );
        menuDTO.setCreateTime( arg0.getCreateTime() );

        return menuDTO;
    }

    @Override
    public List<Menu> toEntity(List<MenuDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Menu> list = new ArrayList<Menu>( arg0.size() );
        for ( MenuDTO menuDTO : arg0 ) {
            list.add( toEntity( menuDTO ) );
        }

        return list;
    }

    @Override
    public List<MenuDTO> toDto(List<Menu> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MenuDTO> list = new ArrayList<MenuDTO>( arg0.size() );
        for ( Menu menu : arg0 ) {
            list.add( toDto( menu ) );
        }

        return list;
    }
}
