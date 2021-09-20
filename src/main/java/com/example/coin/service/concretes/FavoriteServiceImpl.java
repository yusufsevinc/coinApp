package com.example.coin.service.concretes;

import com.example.coin.dto.FavoriteSaveDto;
import com.example.coin.exception.InternalServerError;
import com.example.coin.model.Favorite;
import com.example.coin.model.Users;
import com.example.coin.repository.FavoriteRepository;
import com.example.coin.service.abstracts.FavoriteService;
import com.example.coin.service.abstracts.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    private final FavoriteRepository favoriteRepository;
    private final UserService userService;

    public FavoriteServiceImpl(FavoriteRepository favoriteRepository, UserService userService) {
        this.favoriteRepository = favoriteRepository;
        this.userService = userService;
    }
    @Override
    public void save(FavoriteSaveDto favoriteSaveDto) {
        try {
            Favorite favorite = new Favorite();
            Users user = userService.getById(favoriteSaveDto.getUserId());
            List<Users> users = new ArrayList<>();
            users.add(user);
            favorite.setCoinName(favoriteSaveDto.getCoinName());
            favorite.setId(favoriteSaveDto.getId());
            favorite.setUser(users);
            favoriteRepository.save(favorite);
        }catch (InternalServerError e){
            throw new InternalServerError(e.getMessage());
        }
    }


}
