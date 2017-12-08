package drugstore;

import drugstore.dao.AmountOfDrugsDao;
import drugstore.dao.Dao;
import drugstore.entity.*;
import drugstore.repository.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DrugstoreConfiguration {

    @Bean
    public DrugsRepository drugRepository(Dao<Drug> drugDao) {
        return new DrugsRepository(drugDao);
    }

    @Bean
    public ProvidersRepository providersRepository(Dao<Provider> providerDao) {
        return new ProvidersRepository(providerDao);
    }

    @Bean
    public ActiveElementsRepository activeElemtntsRepository(Dao<ActiveElement> activeElementDao) {
        return new ActiveElementsRepository(activeElementDao);
    }

    @Bean
    public TypesRepository typesRepository(Dao<Type> typeDao) {
        return new TypesRepository(typeDao);
    }

    @Bean
    public DrugstoresRepository drugstoresRepository(Dao<Drugstore> drugstoreDao) {
        return new DrugstoresRepository(drugstoreDao);
    }

    @Bean
    public AmountOfDrugsRepository amountOfDrugsRepository(AmountOfDrugsDao amountOfDrugsDao) {
        return new AmountOfDrugsRepository(amountOfDrugsDao);
    }
}
