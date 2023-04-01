package com.autoschedule.autoscheduleonline.Service;

import com.autoschedule.autoscheduleonline.Model.BusStop813101;
import com.autoschedule.autoscheduleonline.Model.BusStop813102;
import com.autoschedule.autoscheduleonline.Repository.BusStopRepository;
import com.autoschedule.autoscheduleonline.Repository.BusStopRepository813102;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusStopService {
    private final BusStopRepository busStopRepository;
    private final BusStopRepository813102 busStopRepository813102;

    public BusStopService(BusStopRepository busStopRepository, BusStopRepository813102 busStopRepository813102) {
        this.busStopRepository = busStopRepository;
        this.busStopRepository813102 = busStopRepository813102;
    }

    public List<BusStop813101> getStop(){
        return busStopRepository.findAll();
    }
    public Optional<BusStop813101> getStopById(int id){
        return busStopRepository.findById(id);
    }
    public BusStop813101 getBusStopByName(String name){
        return busStopRepository.findBusStopByName(name);
    }
    public List<BusStop813102> getAllStops813102(){
        return busStopRepository813102.findAll();
    }
}
