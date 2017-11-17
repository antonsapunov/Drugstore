package drugstore;

import drugstore.dao.Dao;
import drugstore.entity.Drug;
import drugstore.repository.DrugsRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DrugstoreConfiguration {

    @Bean
    public DrugsRepository drugRepository(Dao<Drug> drugDao) {
        return new DrugsRepository(drugDao);
    }
}
