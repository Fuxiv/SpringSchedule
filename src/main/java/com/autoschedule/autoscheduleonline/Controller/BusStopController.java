package com.autoschedule.autoscheduleonline.Controller;

import com.autoschedule.autoscheduleonline.Model.BusStop;
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

    public List<BusStop> getAllStops813101() {
        return busStopService.getAllStops();
    }


    @GetMapping("/all")
    public Object getAllStops(@RequestParam String line) {
        return switch (line) {
            case "813101" -> getAllStops813101();
            case "1" -> busStopService.getStopByLineAndTrip(101, 12);
            case "2" -> scheduleService.writeFirstLine();
            default -> line;
        };
    }
}
