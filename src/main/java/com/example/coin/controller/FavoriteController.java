package com.example.coin.controller;

import com.example.coin.dto.FavoriteSaveDto;
import com.example.coin.dto.FavoriteUserCoinsDto;
import com.example.coin.repository.FavoriteRepository;
import com.example.coin.service.abstracts.FavoriteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
@CrossOrigin
public class FavoriteController {

    private final FavoriteService favoriteService;
    private final FavoriteRepository favoriteRepository;

    public FavoriteController(FavoriteService favoriteService, FavoriteRepository favoriteRepository) {
        this.favoriteService = favoriteService;
        this.favoriteRepository = favoriteRepository;
    }
    @PostMapping(value = "/favorite")
    public ResponseEntity<Void> save(@RequestBody FavoriteSaveDto favoriteSaveDto) {
        favoriteService.save(favoriteSaveDto);
        return ResponseEntity.ok().build();
    }
    @GetMapping(value = "/get/{userId}")
    public ResponseEntity<List<FavoriteUserCoinsDto>> a(@PathVariable Long userId) {
        return ResponseEntity.ok(favoriteRepository.getByCoinName(userId));
    }



}
