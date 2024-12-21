package at.codecrafters.tools;

import at.codecrafters.entities.User;
import at.codecrafters.domain.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConvertUsers {
    ConvertUsers INSTANCE = Mappers.getMapper(ConvertUsers.class);

    // Mapping UserCommand -> User
    @Mapping(source = "firstname", target = "firstName")
    @Mapping(source = "lastname", target = "lastName")
    User convertUserCommandToUser(UserCommand userCommand);

    // Mapping User -> UserCommand
    @Mapping(source = "firstName", target = "firstname")
    @Mapping(source = "lastName", target = "lastname")
    UserCommand convertUserToUserCommand(User user);
}
