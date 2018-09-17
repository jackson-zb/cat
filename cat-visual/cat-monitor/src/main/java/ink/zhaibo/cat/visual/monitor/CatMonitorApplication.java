package ink.zhaibo.cat.visual.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @Author zhaibo
 * @Description Hystrix-Dashboard
 * @Date 2018/9/13
 */
@EnableAdminServer
@EnableTurbine
@EnableDiscoveryClient
@SpringCloudApplication
public class CatMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatMonitorApplication.class, args);
    }
}
