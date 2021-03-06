package com.cewit.fm1.models;

import java.util.List;

/**
 * Created by Taeyu Im on 18. 7. 18.
 * qvo@cs.stonybrook.edu
 */

public class Place  {
    private String id;
    private String name;
    private String address;
    private String cityId;
    private String contact;
    private String site;
    private String info;
    private String email;
    private long lat;
    private long lng;
    private int rate;
    private String openTime;
    private String closeTime;
    private int entranceFee;
    private List<Integer> imageIds;
    private String type;
    private boolean isFavorite;


    public Place() {

    }

    public Place(String id, String name, String address, String cityId, String contact, String site, String info, String email, long lat, long lng, int rate, String openTime, String closeTime, int entranceFee, List<Integer> imageIds, String type, boolean isFavorite) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cityId = cityId;
        this.contact = contact;
        this.site = site;
        this.info = info;
        this.email = email;
        this.lat = lat;
        this.lng = lng;
        this.rate = rate;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.entranceFee = entranceFee;
        this.imageIds = imageIds;
        this.type = type;
        this.isFavorite = isFavorite;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getLat() {
        return lat;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }

    public long getLng() {
        return lng;
    }

    public void setLng(long lng) {
        this.lng = lng;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public int getEntranceFee() {
        return entranceFee;
    }

    public void setEntranceFee(int entranceFee) {
        this.entranceFee = entranceFee;
    }

    public List<Integer> getImageIds() {
        return imageIds;
    }

    public void setImageIds(List<Integer> imageIds) {
        this.imageIds = imageIds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}

