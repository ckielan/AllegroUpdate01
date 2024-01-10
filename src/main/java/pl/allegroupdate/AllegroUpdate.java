package pl.allegroupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication(scanBasePackages = "pl.allegroupdate")
@EnableScheduling
@Import(pl.allegroupdate.config.PersistenceJPAConfig.class)
public class AllegroUpdate {
    public static void main(String[] args) {
        SpringApplication.run(AllegroUpdate.class, args);
        
    }
}
