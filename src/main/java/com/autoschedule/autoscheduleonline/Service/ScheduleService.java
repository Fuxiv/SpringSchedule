package com.autoschedule.autoscheduleonline.Service;

import com.autoschedule.autoscheduleonline.Model.BusStop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
        String[] stopNameSplit = stopTime.split(":");
        short stopMinutes = Short.parseShort(stopNameSplit[1]);
        String stopHoursString = stopNameSplit[0];
        if (rSeconds < 10 && rSeconds >= 0) {
            return stopTime + "0" + rSeconds;
        }
        if (rSeconds < 0) {
            stopMinutes--;
            if (stopMinutes < 0) {
                short stopHours = Short.parseShort(stopNameSplit[0]);
                stopMinutes = 59;
                stopHours--;
                if (stopHours < 0) {
                    stopHours = 23;
                    if (rSeconds > -10) {
                        return stopHours + ":" + stopMinutes + ":" + "0" + Math.abs(rSeconds);
                    }
                    return stopHours + ":" + stopMinutes + ":" + Math.abs(rSeconds);
                }
                if (stopHours < 10) {
                    if (rSeconds > -10) {
                        return "0" + stopHours + ":" + stopMinutes + ":" + "0" + Math.abs(rSeconds);
                    }
                    return "0" + stopHours + ":" + stopMinutes + ":" + Math.abs(rSeconds);
                }
                if (rSeconds > -10) {
                    return stopHours + ":" + stopMinutes + ":" + "0" + Math.abs(rSeconds);
                }
                return stopHours + ":" + stopMinutes + ":" + Math.abs(rSeconds);
            }
            if (rSeconds > -10) {
                return stopHoursString + ":" + "0" + stopMinutes + ":" + "0" + Math.abs(rSeconds);
            }
            if (stopMinutes < 10){
                return stopHoursString + ":" + "0" + stopMinutes + ":" + Math.abs(rSeconds);
            }
            return stopNameSplit[0] + ":" + stopMinutes + ":" + Math.abs(rSeconds);
        }
        return stopTime + rSeconds;
    }

    private String departureTime(int rSeconds, String stopTime) {
        String[] stopTimeSplit = stopTime.split(":");
        if (stopTimeSplit[1].equals("00") && rSeconds < 0){
            rSeconds = 60 - Math.abs(rSeconds);
            if (rSeconds < 10){
                return " -00:00:0" + rSeconds;
            }
            return " -00:00:" + rSeconds;
        }
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

    public String writeFirstLine(int trip_index_id, int line_number_id) {
        List<BusStop> busStopList = busStopService.getStopByLineAndTrip(trip_index_id, line_number_id);
        String stopName = busStopList.get(0).getName();
        String stopTime = busStopList.get(0).getTime();
        stopTime = "00:00:";
        if (stopName.length() > 30) {
            stopName = stopName.substring(0, 30);
        }
        int rSeconds = random.nextInt(-55, 55);
        return "  " + rightPadding(stopName, ' ', 32) + " ".repeat(40) + stopTime + "00" + "  " + randomSecondsTime(stopTime, rSeconds) + departureTime(rSeconds, stopTime) + "  OK";
    }

    public String writeLastLine(int trip_index_id, int line_number_id) {
        List<BusStop> busStopList = busStopService.getStopByLineAndTrip(trip_index_id, line_number_id);
        String stopName = busStopList.get(busStopList.size() - 1).getName();
        String stopTime = busStopList.get(busStopList.size() - 1).getTime();
        stopTime = "00:00:";
        if (stopName.length() > 30) {
            stopName = stopName.substring(0, 30);
        }
        int rSeconds = random.nextInt(-55, 55);
        return "  " + rightPadding(stopName, ' ', 32) + stopTime + "00" + "  " + randomSecondsTime(stopTime, rSeconds) + departureTime(rSeconds, stopTime) + " ".repeat(40) + "OK";
    }

}