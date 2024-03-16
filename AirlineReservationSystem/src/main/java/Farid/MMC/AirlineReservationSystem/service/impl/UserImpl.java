package Farid.MMC.AirlineReservationSystem.service.impl;

import Farid.MMC.AirlineReservationSystem.dto.UserRequest;
import Farid.MMC.AirlineReservationSystem.dto.mapper.UserMapper;
import Farid.MMC.AirlineReservationSystem.entity.Category;
import Farid.MMC.AirlineReservationSystem.entity.User;
import Farid.MMC.AirlineReservationSystem.exception.UserNotFound;
import Farid.MMC.AirlineReservationSystem.repository.UserRepository;
import Farid.MMC.AirlineReservationSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class UserImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;


    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Integer id) {
        return userRepository
                .findById(id)
                .orElseThrow(()->new UserNotFound("Məhsul tapılmadı"));
    }

    @Override
    public void save(UserRequest userSaveRequest) {
//        Product product = mapper.toProduct(productRequest);
//        product.setAddedDate(LocalDate.now());
//        repository.save(product);
//        User user=userMapper.toUser(UserRequest);

    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);

    }

    @Override
    public void update(Integer id, UserRequest userUpdateRequest) {

    }
}
