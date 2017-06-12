package site.moree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by MORE-E on 6/12/2017.
 */
@Component
public class BootStrapListener {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent event) {
        logger.info("Do something after Spring has been initialized.");
    }
}
