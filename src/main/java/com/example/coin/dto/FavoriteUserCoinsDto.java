package com.example.coin.dto;

public class FavoriteUserCoinsDto {

    private String coinName;

    public FavoriteUserCoinsDto() {
    }

    public FavoriteUserCoinsDto(String coinName) {
        this.coinName = coinName;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }
}
