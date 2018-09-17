package ink.zhaibo.cat.services.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CatServiceOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatServiceOneApplication.class, args);
    }
}
