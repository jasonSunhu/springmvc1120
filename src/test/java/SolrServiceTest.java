import com.sunhu.service.productsolr.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Administrator on 2019/11/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@WebAppConfiguration("src/main/web")//指定的是Web资源的位置,默认为 src/main/webapp
public class SolrServiceTest {

    private static final Logger LOGGER = LogManager.getLogger(MybatisMapperTest.class);

    @Autowired
    private ProductService productService;

    @Test
    public void addProduct(){
        try {
            productService.addProduct();
        } catch (Exception e) {
            LOGGER.error("add to Solr error:{}",e);
        }
    }
}
