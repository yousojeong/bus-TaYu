package org.devTayu.busTayu.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "liked_table")
public class LikedDB {

    //Room에서 자동으로 id를 할당
    @PrimaryKey(autoGenerate = true)
    private int uid;
    private String busNumber;
    private String stationNumber;
    private String stationName;
    // private java.util.Date likedDate;
    // 나중엔 즐겨찾기 추가일도 저장해야 함 : 순서 때문에 최신을 맨 위로 올리기 위함

    public LikedDB() {
    }

    public LikedDB(String busNumber, String stationNumber) {
        this.busNumber = busNumber;
        this.stationNumber = stationNumber;
    }

    public LikedDB(String busNumber, String stationNumber, String stationName) {
        this.busNumber = busNumber;
        this.stationNumber = stationNumber;
        this.stationName = stationName;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(String stationNumber) {
        this.stationNumber = stationNumber;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /*
    @Override
    public String toString() {
        return "\n busNumber=> " + this.busNumber + " , stationNumber=> " + this.stationNumber + this.likedDate;
    }
    */

    @Override
    public String toString() {
        return "\n busNumber=> " + this.busNumber + " , stationNumber=> " + this.stationNumber + " , stationName=>" + this.stationName;
    }

}