package com.autoschedule.autoscheduleonline.Controller;

import com.autoschedule.autoscheduleonline.Model.BusStop;
import com.autoschedule.autoscheduleonline.Model.BusStop813101;
import com.autoschedule.autoscheduleonline.Model.BusStop813102;
import com.autoschedule.autoscheduleonline.Service.BusStopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/stop")
public class BusStopController {
    private final BusStopService busStopService;

    public BusStopController(BusStopService busStopService) {
        this.busStopService = busStopService;
    }

    @GetMapping("/byid")
    public Optional<BusStop813101> getStopById(@RequestParam int id){
        return busStopService.getStopById(id);
    }
    @GetMapping("/byname")
    public BusStop813101 getStopByName(@RequestParam String name){
        return busStopService.getBusStopByName(name);
    }
    public List<BusStop813101> getAllStops813101(){
        return busStopService.getStop();
    }
    public List<BusStop813102> getAllStops813102(){
        return busStopService.getAllStops813102();
    }
    @GetMapping("/all")
    public Object getAllStops(@RequestParam String line){
        switch (line) {
            case "813101" -> getAllStops813101();
            case "813102" -> getAllStops813102();
        }
        return null;
    }
//pierdole nie umiem

}
