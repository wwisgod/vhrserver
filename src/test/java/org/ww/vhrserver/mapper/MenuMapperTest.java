package org.ww.vhrserver.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.ww.vhrserver.model.Menu;

import java.util.List;

/**
 * @Author ww
 * @Date 2021/7/19 10:49
 */
@SpringBootTest
@Slf4j
public class MenuMapperTest {
    @Autowired
    MenuMapper menuMapper;
    @Test
    public void getMenusByHridTest() {
        List<Menu> menusByHrid = menuMapper.getMenusByHrid(3);
        for (Menu menu : menusByHrid) {
            for (Menu child : menu.getChildren()) {
                System.out.println(child);
            }
        }
    }
}
