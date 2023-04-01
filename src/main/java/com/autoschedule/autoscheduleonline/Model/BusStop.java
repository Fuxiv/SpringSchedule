package com.autoschedule.autoscheduleonline.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class BusStop {
    private Integer id;
    private String name;
    private String time;

    public BusStop(Integer id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public BusStop() {
    }
}
