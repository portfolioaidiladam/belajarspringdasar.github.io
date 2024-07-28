package programmerzamannow.spring.core.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.data.User;
import programmerzamannow.spring.core.event.LoginSuccessEvent;
// Belajar Event Listener
@Component
public class UserService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    // ini otomatis di inject oleh si springnya
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login (String username, String password){
        if (isLoginSuccess(username,password)){
            // setelah loginnya berhasil kita kirimkan kesemua listener
            // nanti semua listener yang mendengarkan event Login Success Event dia akan beraksi terhadap event ini
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        }else {
            return false;
        }

    }

    private boolean isLoginSuccess(String username, String password) {
        return "aidil".equals(username) && "aidil".equals(password);
    }
}
