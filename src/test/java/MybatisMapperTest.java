import com.sunhu.dao.SysUserMapper;
import com.sunhu.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Administrator on 2019/11/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@WebAppConfiguration("src/main/web")//指定的是Web资源的位置,默认为 src/main/webapp
public class MybatisMapperTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void addUser(){
        SysUser user = new SysUser();
        user.setId(UUID.randomUUID().toString().replaceAll("-",""));
        user.setUsername("rose");
        user.setPassword("123456");
        Random random = new Random();
        user.setAge( random.nextInt(100));
        sysUserMapper.insert(user);
    }
}
