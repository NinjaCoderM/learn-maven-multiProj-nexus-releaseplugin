package at.codecrafters.controller;

import at.codecrafters.entities.User;
import at.codecrafters.domain.UserCommand;
import at.codecrafters.tools.ConvertUsers;

public class UserController {
    User saveUser (UserCommand command){
        //fake Impl
        return ConvertUsers.INSTANCE.convertUserCommandToUser(command);
    }
}
