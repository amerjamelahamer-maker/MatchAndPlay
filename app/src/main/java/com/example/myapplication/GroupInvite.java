package com.example.myapplication;

import java.util.List;

public class GroupInvite {
    private String placeName;
    private String city;
    private String fullAddress;
    private String placeType;
    private String imageUr1;
    private String latitude;
    private String longitude;
    private String maxPlayers;
    private String price;
    private String openHours;
    private String rating;
    private String placeId;
    private String status;
    private String currentPlayers;
    List<User> invitedUsers;

    public GroupInvite() {

    }

    public GroupInvite(String placeName, String city, String fullAddress, String placeType, String imageUr1, String latitude, String longitude, String maxPlayers, String price, String openHours, String rating, String placeId, String status, String currentPlayers) {
        this.placeName = placeName;
        this.city = city;
        this.fullAddress = fullAddress;
        this.placeType = placeType;
        this.imageUr1 = imageUr1;
        this.latitude = latitude;
        this.longitude = longitude;
        this.maxPlayers = maxPlayers;
        this.price = price;
        this.openHours = openHours;
        this.rating = rating;
        this.placeId = placeId;
        this.status = status;
        this.currentPlayers = currentPlayers;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getCity() {
        return city;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public String getPlaceType() {
        return placeType;
    }

    public String getImageUr1() {
        return imageUr1;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getMaxPlayers() {
        return maxPlayers;
    }

    public String getPrice() {
        return price;
    }

    public String getOpenHours() {
        return openHours;
    }

    public String getRating() {
        return rating;
    }

    public String getPlaceId() {
        return placeId;
    }

    public String getStatus() {
        return status;
    }

    public String getCurrentPlayers() {
        return currentPlayers;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public void setImageUr1(String imageUr1) {
        this.imageUr1 = imageUr1;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setMaxPlayers(String maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCurrentPlayers(String currentPlayers) {
        this.currentPlayers = currentPlayers;
    }

    @Override
    public String toString() {
        return "GroupInvite{" +
                "placeName='" + placeName + '\'' +
                ", city='" + city + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                ", placeType='" + placeType + '\'' +
                ", imageUr1='" + imageUr1 + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", maxPlayers='" + maxPlayers + '\'' +
                ", price='" + price + '\'' +
                ", openHours='" + openHours + '\'' +
                ", rating='" + rating + '\'' +
                ", placeId='" + placeId + '\'' +
                ", status='" + status + '\'' +
                ", currentPlayers='" + currentPlayers + '\'' +
                '}';
    }

}
