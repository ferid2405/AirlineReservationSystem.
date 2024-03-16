package Farid.MMC.AirlineReservationSystem.service;

import Farid.MMC.AirlineReservationSystem.dto.UserRequest;
import Farid.MMC.AirlineReservationSystem.entity.Category;
import Farid.MMC.AirlineReservationSystem.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(Integer id);
    void  save(UserRequest userSaveRequest);
    void delete(Integer id);
    void update(Integer id, UserRequest userUpdateRequest);
}
