package demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
@Slf4j
public class ConfigServerApplication {

    public static void main(String[] args) {
        log.info("main -> starting ConfigServerApplication...");

        SpringApplication.run(ConfigServerApplication.class, args);

        log.info("main -> started ConfigServerApplication");
    }

}
