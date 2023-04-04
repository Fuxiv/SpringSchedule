package com.autoschedule.autoscheduleonline.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "line813trip101")
public class BusStop813101 extends BusStop{
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "stop_name")
    private String name;
    @Column(name = "stop_time")
    private String time;


    public BusStop813101(Integer id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public BusStop813101(String name) {
        this.name = name;
    }

    public BusStop813101(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public BusStop813101() {

    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
