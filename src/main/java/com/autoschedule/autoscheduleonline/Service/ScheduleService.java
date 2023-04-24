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

    public static String leftPadding(String input, char ch, int L) {
        return String.format("%" + L + "s", input).replace(' ', ch);
    }

    public static String rightPadding(String input, char ch, int L) {
        return String.format("%" + (-L) + "s", input).replace(' ', ch);
    }


    private final Random random = new Random();


    private String randomSecondsTime(String stopTime, int rSeconds) {
        short stopMinutes;
        if (rSeconds < 10 && rSeconds >= 0) {
            return stopTime + "0" + rSeconds;
        }
        if (rSeconds < 0) {
            String[] stopNameSplit = stopTime.split(":");
            stopMinutes = Short.parseShort(stopNameSplit[1]);
            stopMinutes--;
            if (rSeconds > -10) {
                return stopNameSplit[0] + ':' + stopMinutes + ':' + "0" + Math.abs(rSeconds);
            }
            return stopNameSplit[0] + ':' + stopMinutes + ':' + Math.abs(rSeconds);
        }
        return stopTime + rSeconds;
    }

    private String departureTime(int rSeconds) {
        if (rSeconds < 0) {
            if (rSeconds > -10) {
                return " -00:00:0" + Math.abs(rSeconds);
            }
            return " -00:00:" + Math.abs(rSeconds);
        }
        if (rSeconds < 10) {
            return "  00:00:0" + Math.abs(rSeconds);
        }
        return "  00:00:" + rSeconds;
    }

    public String writeFirstLine() {
        String stopName = busStopService.getStopName((short) 8);
        if (stopName.length() > 30) {
            stopName = stopName.substring(0, 30);
        }
        int rSeconds = random.nextInt(-55, -1);
        String stopTime = busStopService.getStopTime((short) 0);
        return "  " + rightPadding(stopName, ' ', 32) + " ".repeat(40) + stopTime + "00" + "  " + randomSecondsTime(stopTime, rSeconds) + departureTime(rSeconds);
    }

    /* a few ideas for the writer
    1. get 3 functions, one writes the first line (without arrival time), second is a default writer (arrival time and departure time)
    third works just at the first one with one difference - only writes arrival time and leaves departure time empty

    2. everything packed into one function, just as it was done in the c# project of the schedule writer
     */

}
