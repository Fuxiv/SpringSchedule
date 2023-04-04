package com.autoschedule.autoscheduleonline.Service;

import com.autoschedule.autoscheduleonline.Model.BusStop813101;
import com.autoschedule.autoscheduleonline.Model.BusStop813102;
import com.autoschedule.autoscheduleonline.Repository.BusStopRepository813101;
import com.autoschedule.autoscheduleonline.Repository.BusStopRepository813102;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusStopService {
    private final BusStopRepository813101 busStopRepository813101;
    private final BusStopRepository813102 busStopRepository813102;

    @Autowired
    public BusStopService(BusStopRepository813101 busStopRepository813101, BusStopRepository813102 busStopRepository813102) {
        this.busStopRepository813101 = busStopRepository813101;
        this.busStopRepository813102 = busStopRepository813102;
    }

    public List<BusStop813101> getAllStops813101() {
        return busStopRepository813101.findAll();
    }
    public List<BusStop813102> getAllStops813102() {
        return busStopRepository813102.findAll();
    }
    private String getStopName813101(short i){
        return getAllStops813101().get(i).getName();
    }
    private String getStopTime813101(short i){
        return getAllStops813101().get(i).getTime();
    }

}
