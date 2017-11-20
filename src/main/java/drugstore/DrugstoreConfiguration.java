package drugstore;

import drugstore.dao.Dao;
import drugstore.entity.ActiveElement;
import drugstore.entity.Drug;
import drugstore.entity.Provider;
import drugstore.entity.Type;
import drugstore.repository.ActiveElementsRepository;
import drugstore.repository.DrugsRepository;
import drugstore.repository.ProvidersRepository;
import drugstore.repository.TypesRepository;
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
}
