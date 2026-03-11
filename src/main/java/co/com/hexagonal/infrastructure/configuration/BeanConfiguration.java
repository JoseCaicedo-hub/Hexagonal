package co.com.hexagonal.infrastructure.configuration;

import co.com.hexagonal.domain.api.IObjectServicePort;
import co.com.hexagonal.domain.spi.IObjectPersistencePort;
import co.com.hexagonal.domain.usecase.ObjectUseCase;
import co.com.hexagonal.infrastructure.output.adapter.ObjectJpaAdapter;
import co.com.hexagonal.infrastructure.output.mapper.IObjectEntityMapper;
import co.com.hexagonal.infrastructure.output.repository.IObjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class BeanConfiguration {

    private final IObjectRepository objectRepository;
    private final IObjectEntityMapper objectEntityMapper;

    @Bean
    public IObjectPersistencePort objectPersistencePort(){
        return new ObjectJpaAdapter(objectRepository, objectEntityMapper);
    }
<ZSDFIOIIO90999999
TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT    @Bean
    public IObjectServicePort objectServicePort(){
        return new ObjectUseCase(objectPersistencePort());
    }

}
