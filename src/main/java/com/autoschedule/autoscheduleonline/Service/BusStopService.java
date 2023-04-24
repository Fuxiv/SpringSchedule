package com.autoschedule.autoscheduleonline.Service;

import com.autoschedule.autoscheduleonline.Model.BusStop;
import com.autoschedule.autoscheduleonline.Repository.BusStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusStopService {
    private final BusStopRepository busStopRepository;

    @Autowired
    public BusStopService(BusStopRepository busStopRepository) {
        this.busStopRepository = busStopRepository;
    }

    public List<BusStop> getAllStops() {
        return busStopRepository.findAll();
    }

    public String getStopName(short i) {
        return getAllStops().get(i).getName();
    }

    public String getStopTime(short i) {
        return getAllStops().get(i).getTime();
    }

    public List<BusStop> getStopByLineAndTrip(int trip_index_id, int line_number_id) {
        return busStopRepository.getBusStopByLineAndTrip(trip_index_id, line_number_id);
    }

}
