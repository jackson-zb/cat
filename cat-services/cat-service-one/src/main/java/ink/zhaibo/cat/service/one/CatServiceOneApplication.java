package ink.zhaibo.cat.service.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhaibo
 * @Date 2018/9/7
 * @Description Service One
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CatServiceOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatServiceOneApplication.class,args);
    }
}
