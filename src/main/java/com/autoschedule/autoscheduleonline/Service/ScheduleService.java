package com.autoschedule.autoscheduleonline.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ScheduleService {
    private final BusStopService busStopService;

    @Autowired
    public ScheduleService(BusStopService busStopService) {
        this.busStopService = busStopService;
    }
    private Random random = new Random();

    /* a few ideas for the writer
    1. get 3 functions, one writes the first line (without arrival time), second is a default writer (arrival time and departure time)
    third works just at the first one with one difference - only writes arrival time and leaves departure time empty

    2. everything packed into one function, just as it was done in the c# project of the schedule writer
     */

}
