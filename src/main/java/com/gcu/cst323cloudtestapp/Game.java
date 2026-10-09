package com.gcu.cst323cloudtestapp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String platform;

    private String genre;

    @Column(name = "release_year")
    private Integer releaseYear;

    private boolean hasGame;
    private boolean hasBox;
    private boolean hasManual;
    private boolean sealed;

    @Column(name = "game_condition")
    private String condition;

    private Double purchasePrice;

    private Double currentValue;

    public Game() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isHasGame() {
        return hasGame;
    }

    public void setHasGame(boolean hasGame) {
        this.hasGame = hasGame;
    }

    public boolean isHasBox() {
        return hasBox;
    }

    public void setHasBox(boolean hasBox) {
        this.hasBox = hasBox;
    }

    public boolean isHasManual() {
        return hasManual;
    }

    public void setHasManual(boolean hasManual) {
        this.hasManual = hasManual;
    }

    public boolean isSealed() {
        return sealed;
    }

    public void setSealed(boolean sealed) {
        this.sealed = sealed;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
}