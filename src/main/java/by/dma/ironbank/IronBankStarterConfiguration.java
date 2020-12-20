package by.dma.ironbank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author dzmitry.marudau
 * @since 2020.4
 */
@Configuration
public class IronBankStarterConfiguration {
    @Bean
    public IronBankListener ironBankListener() {
        return new IronBankListener();
    }
}
