package com.example.coin.dto;

public class FavoriteSaveDto {

    private Long id;
    private Long userId;
    private String coinName;

    public FavoriteSaveDto() {

    }

    public FavoriteSaveDto(Long id, Long userId, String coinName) {
        this.id = id;
        this.userId = userId;
        this.coinName = coinName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }
}

