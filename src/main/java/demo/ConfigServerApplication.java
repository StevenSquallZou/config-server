package demo;


import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
//import org.springframework.cloud.config.server.environment.EnvironmentRepository;
//import org.springframework.cloud.config.server.environment.JdbcEnvironmentRepository;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Import;
//import org.springframework.core.Ordered;
//import java.util.List;


@SpringBootApplication
@EnableConfigServer
@Slf4j
public class ConfigServerApplication {

    public static void main(String[] args) {
        log.info("main -> starting ConfigServerApplication...");

        SpringApplication.run(ConfigServerApplication.class, args);

        log.info("main -> started ConfigServerApplication");
    }

/*
    @Bean
    public ApplicationRunner jdbcDebugRunner(EnvironmentRepository repo) {
        return args -> {
            log.info("=== CONFIG REPOSITORY TYPE ===");
            log.info("Repository class: {}", repo.getClass().getName());

            if (repo instanceof JdbcEnvironmentRepository) {
                log.info("JDBC repository is ACTIVE");
            } else {
                log.warn("JDBC repository is NOT active");
            }
        };
    }


    @Bean
    public ApplicationRunner repositoryChecker(List<EnvironmentRepository> repos) {
        return args -> {
            log.info("=== ACTIVE CONFIG REPOSITORIES ===");
            repos.forEach(repo ->
                log.info("Repository: {}", repo.getClass().getSimpleName())
            );
        };
    }
*/
}
