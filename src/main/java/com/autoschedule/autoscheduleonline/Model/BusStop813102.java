package com.autoschedule.autoscheduleonline.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "line813trip102")
public class BusStop813102 {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "stop_name")
    private String name;
    @Column(name = "stop_time")
    private String time;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public BusStop813102() {
    }

    public BusStop813102(Integer id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }
}
