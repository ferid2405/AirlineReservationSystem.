package Farid.MMC.AirlineReservationSystem.dto.mapper;

import Farid.MMC.AirlineReservationSystem.dto.UserRequest;
import Farid.MMC.AirlineReservationSystem.dto.UserResponse;
import Farid.MMC.AirlineReservationSystem.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserRequest userRequest);
    UserResponse toUserResponse(User user);
}
