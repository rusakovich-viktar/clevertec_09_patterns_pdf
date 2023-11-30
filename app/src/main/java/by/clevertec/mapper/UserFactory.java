package by.clevertec.mapper;

import by.clevertec.dto.UserDto;
import by.clevertec.entity.User;

public class UserFactory {
    public static User createUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPhoneNumber(userDto.getPhoneNumber());
        return user;
    }
}
