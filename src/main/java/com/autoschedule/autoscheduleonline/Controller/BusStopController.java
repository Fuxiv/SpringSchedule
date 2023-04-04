package com.autoschedule.autoscheduleonline.Controller;

import com.autoschedule.autoscheduleonline.Model.BusStop813101;
import com.autoschedule.autoscheduleonline.Model.BusStop813102;
import com.autoschedule.autoscheduleonline.Service.BusStopService;
import com.autoschedule.autoscheduleonline.Service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/stop")
public class BusStopController {
    private final BusStopService busStopService;
    private final ScheduleService scheduleService;

    public BusStopController(BusStopService busStopService, ScheduleService scheduleService) {
        this.busStopService = busStopService;
        this.scheduleService = scheduleService;
    }
    public List<BusStop813101> getAllStops813101(){
        return busStopService.getAllStops813101();
    }
    public List<BusStop813102> getAllStops813102(){
        return busStopService.getAllStops813102();
    }



    @GetMapping("/all")
    public Object getAllStops(@RequestParam String line){
        return switch (line) {
            case "813101" -> getAllStops813101();
            case "813102" -> getAllStops813102();
            default -> line;
        };
    }
}
