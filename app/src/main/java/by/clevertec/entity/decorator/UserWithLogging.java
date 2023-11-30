package by.clevertec.entity.decorator;

import by.clevertec.entity.User;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class UserWithLogging extends User {
    private final User user;

    public UserWithLogging(User user) {
        this.user = user;
    }

    @Override
    public void setId(int id) {
        log.info("Setting id");
        user.setId(id);
    }

    @Override
    public int getId() {
        log.info("Getting id");
        return user.getId();
    }

}
