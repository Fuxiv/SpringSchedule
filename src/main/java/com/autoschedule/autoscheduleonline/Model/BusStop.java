package com.autoschedule.autoscheduleonline.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "firstview")
public class BusStop {
    @Id
    @Column(name = "bus_stop_id")
    private Integer id;
    @Column(name = "stop_name")
    private String name;
    @Column(name = "stop_time")
    private String time;
    @Column(name = "trip_index_id")
    private int trip_index_id;
    @Column(name = "line_number_id")
    private int line_number_id;


    public BusStop(Integer id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }


    public BusStop(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public int getTrip_index_id() {
        return trip_index_id;
    }

    public int getLine_number_id() {
        return line_number_id;
    }

    public BusStop() {

    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

}
