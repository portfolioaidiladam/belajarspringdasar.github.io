package programmerzamannow.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

// belajar Spring Application Event
// ini gak perlu buat component karena ini akan dieksekusi sebelum bean dibuat
@Slf4j
public class AppStartingListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info("Application Starting ");
    }
}
