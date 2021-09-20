package com.example.coin.repository;

import com.example.coin.dto.FavoriteUserCoinsDto;
import com.example.coin.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite , Long> {


  /*  @Modifying
    @Query(value = "select coinName from favorite_coin fc inner join users_coins u on fc.coin_id = u.coin_id where userId=:userId")
    List<Favorite> getByCoinName(Long userId);
*/
    @Query(value = "select new com.example.coin.dto.FavoriteUserCoinsDto(f.coinName ) from Favorite f inner join f.user u where u.userId=:userId")
    List<FavoriteUserCoinsDto> getByCoinName(Long userId);

}
