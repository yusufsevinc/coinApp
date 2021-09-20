package com.example.coin.service.concretes;

import com.example.coin.dto.UserDto;
import com.example.coin.dto.UserDtoConvertor;
import com.example.coin.dto.UserLoginRequest;
import com.example.coin.exception.UserNotFoundException;
import com.example.coin.model.Users;
import com.example.coin.repository.UsersRepository;
import com.example.coin.service.abstracts.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UsersRepository usersRepository;
    private final UserDtoConvertor userDtoConvertor;

    public UserServiceImpl(UsersRepository usersRepository, UserDtoConvertor userDtoConvertor) {
        this.usersRepository = usersRepository;
        this.userDtoConvertor = userDtoConvertor;
    }
    @Override
    public List<UserDto> getAllUsers(){
        List<Users> userList = usersRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        for (Users user: userList
        ) { userDtoList.add(userDtoConvertor.convert(user)); }
        return userDtoList;
    }
    @Override
    public UserDto login(UserLoginRequest request){
        Optional<Users> optionalUsers = usersRepository.
                findByUsernameAndPassword(request.getUserName() , request.getPassword());
        return userDtoConvertor.convert(optionalUsers.orElseThrow(() -> new UserNotFoundException("Kullanıcı bulunamadı")));
    }
    @Override
    public Optional<Users> findByUsername(String username) {
        return usersRepository.findByUsername(username);
    }
    @Override
    public Users getById(Long userId){
      return usersRepository.findById(userId).orElseThrow(() ->
              new UserNotFoundException("Kullanıcı bulunamadı"));
    }
}


