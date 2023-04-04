package com.autoschedule.autoscheduleonline.Model;


public class BusStop {
    private Integer id;
    private String name;
    private String time;

    public BusStop(Integer id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public BusStop() {
    }
}
