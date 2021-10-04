package org.devTayu.busTayu.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TB_Liked")
public class LikedDB {

    //Room에서 자동으로 id를 할당
    @PrimaryKey(autoGenerate = true)
    private int uid;
    private String busNumber;
    private String stationNumber;

    public LikedDB(String busNumber, String stationNumber) {
        this.busNumber = busNumber;
        this.stationNumber = stationNumber;
    }

    public int getUid(){
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

}