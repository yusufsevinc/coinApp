package com.example.coin.service.abstracts;

import com.example.coin.dto.FavoriteSaveDto;
import com.example.coin.model.Favorite;

public interface FavoriteService {


    void save(FavoriteSaveDto favoriteSaveDto);
}
