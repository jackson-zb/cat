package ink.zhaibo.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author zhaibo
 * @Date 2018/9/4
 * @Description Config Server
 */
@SpringBootApplication
@EnableConfigServer
public class CatConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(CatConfigApplication.class, args);
	}
}
