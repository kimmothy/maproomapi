package com.maproom.api.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
public class Room {
    private int longitude;
    private int latitude;
    private String roomName;
    private String endTime;
    @Id
    private String roomKey;

    public Room(int longitude, int latitude, String roomName, String endTime) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.roomName = roomName;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[roomKey=%s, roomName='%s']", roomKey, roomName
        );
    }
}
