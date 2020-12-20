package by.dma.ironbank;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * TODO
 *
 * @author dzmitry.marudau
 * @since 2020.4
 */
public class IronBankListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Make some magic on start");
    }
}
