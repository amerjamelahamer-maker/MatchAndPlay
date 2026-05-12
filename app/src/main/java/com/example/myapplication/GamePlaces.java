package com.example.myapplication;

import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

public class GamePlaces {
    private String title;
    private String location;
    private String time;
    private String date;
    private String activity;
    private String creatorId;
    private String playerNeeded;
    private String currentPlayers;
    private String maxAge;
    private String minAge;
    List<User>  joinedUsers ;


    public GamePlaces() {
    }

    public GamePlaces(String title, String location, String time, String date, String activity, String creatorId, String playerNeeded, String currentPlayers, String maxAge, String minAge, List<User> joinedUsers) {
        this.title = title;
        this.location = location;
        this.time = time;
        this.date = date;
        this.activity = activity;
        this.creatorId = creatorId;
        this.playerNeeded = playerNeeded;
        this.currentPlayers = currentPlayers;
        this.maxAge = maxAge;
        this.minAge = minAge;
        this.joinedUsers = joinedUsers;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getActivity() {
        return activity;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public String getPlayerNeeded() {
        return playerNeeded;
    }

    public String getCurrentPlayers() {
        return currentPlayers;
    }

    public String getMaxAge() {
        return maxAge;
    }

    public String getMinAge() {
        return minAge;
    }

    public List<User> getJoinedUsers() {
        return joinedUsers;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public void setPlayerNeeded(String playerNeeded) {
        this.playerNeeded = playerNeeded;
    }

    public void setCurrentPlayers(String currentPlayers) {
        this.currentPlayers = currentPlayers;
    }

    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    public void setJoinedUsers(List<User> joinedUsers) {
        this.joinedUsers = joinedUsers;
    }

    @Override
    public String toString() {
        return "GamePlaces{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", activity='" + activity + '\'' +
                ", creatorId='" + creatorId + '\'' +
                ", playerNeeded='" + playerNeeded + '\'' +
                ", currentPlayers='" + currentPlayers + '\'' +
                ", maxAge='" + maxAge + '\'' +
                ", minAge='" + minAge + '\'' +
                ", joinedUsers=" + joinedUsers +
                '}';
    }
}
