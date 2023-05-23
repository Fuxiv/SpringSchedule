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

    private String randomSecondsTime1(String stopTime, int rSeconds) {
        String[] stopNameSplit = stopTime.split(":");
        short stopMinutes = Short.parseShort(stopNameSplit[1]);
        short stopHours = Short.parseShort(stopNameSplit[0]);
        String stopHoursString = stopNameSplit[0];
        if (rSeconds <= -10) {
            stopMinutes--;
            if (stopMinutes < 0) {
                stopHours--;
                return stopHours + ":" + "59" + ":" + Math.abs(rSeconds);
            }
            if (stopMinutes < 10) {
                return stopHoursString + ":" + "0" + stopMinutes + ":" + Math.abs(rSeconds);
            }
            return stopHoursString + ":" + stopMinutes + ":" + Math.abs(rSeconds);
        }
        if (rSeconds < 0) {
            stopMinutes--;
            if (stopMinutes < 0) {
                stopHours--;
                return stopHours + ":" + "59" + ":" + "0" + Math.abs(rSeconds);
            }
            if (stopMinutes < 10) {
                return stopHoursString + ":" + "0" + stopMinutes + ":" + "0" + Math.abs(rSeconds);
            }
            return stopHoursString + ":" + stopMinutes + ":" + "0" + Math.abs(rSeconds);
        }
        if (rSeconds < 10) {
            return stopTime + "0" + rSeconds;
        }
        return stopTime + rSeconds;
    }

    private String secondsDifference(String stopTime, int rSeconds) {
        if (rSeconds < 0) {
            int rSeconds2 = 60 - Math.abs(rSeconds);
            if (rSeconds2 < 10) {
                return " -00:00:0" + rSeconds2;
            }
            return " -00:00:" + rSeconds2;
        }
        if (rSeconds < 10) {
            return "  00:00:0" + Math.abs(rSeconds);
        }
        return "  00:00:" + rSeconds;
    }
    private final Random random = new Random();
    public String writeFirstLine(int trip_index_id, int line_number_id) {
        List<BusStop> busStopList = busStopService.getStopByLineAndTrip(trip_index_id, line_number_id);
        String stopName = busStopList.get(0).getName();
        String stopTime = busStopList.get(0).getTime();
        if (stopName.length() > 30) {
            stopName = stopName.substring(0, 30);
        }
        int rSeconds = random.nextInt(-5, 55);
        return "  " + rightPadding(stopName, ' ', 32) + " ".repeat(30) + stopTime + "00" + "  " + randomSecondsTime1(stopTime, rSeconds) + secondsDifference(stopTime, rSeconds) + "  ok";
    }

    public String writeLastLine(int trip_index_id, int line_number_id) {
        List<BusStop> busStopList = busStopService.getStopByLineAndTrip(trip_index_id, line_number_id);
        String stopName = busStopList.get(busStopList.size() - 1).getName();
        String stopTime = busStopList.get(busStopList.size() - 1).getTime();
        if (stopName.length() > 30) {
            stopName = stopName.substring(0, 30);
        }
        int rSeconds = random.nextInt(-55, 55);
        return "  " + rightPadding(stopName, ' ', 32) + stopTime + "00" + "  " + randomSecondsTime1(stopTime, rSeconds) + secondsDifference(stopTime, rSeconds) + " ".repeat(32) + "ok";
    }

    public String writeDefaultLine(int trip_index_id, int line_number_id, short stopNumber) {
        List<BusStop> busStopList = busStopService.getStopByLineAndTrip(trip_index_id, line_number_id);
        BusStop busStop = busStopList.get(stopNumber);
        if (stopNumber == busStopList.size() - 2) {
            return null;
        }
        if (busStop == null) {
            return null;
        }
        String stopName = busStop.getName();
        String stopTime = busStop.getTime();

        if (stopName.length() > 30) {
            stopName = stopName.substring(0, 30);
        }

        int arrivalTimeSeconds = random.nextInt(-45, 30);
        int departureTimeSeconds = random.nextInt(-10, 55);
        if (arrivalTimeSeconds < 0) {
            arrivalTimeSeconds = -60 + Math.abs(arrivalTimeSeconds);
        }
//        System.out.println("arrivalTimeSeconds:" + arrivalTimeSeconds);
//        System.out.println("departureTimeSeconds:" + departureTimeSeconds);
        while (Math.abs(departureTimeSeconds) < Math.abs(arrivalTimeSeconds) || departureTimeSeconds < arrivalTimeSeconds) {
            departureTimeSeconds = random.nextInt(arrivalTimeSeconds, 55);
        }
        String arrivalTime = randomSecondsTime1(stopTime, arrivalTimeSeconds);
        String departureTime = randomSecondsTime1(stopTime, departureTimeSeconds);
        return "  " + rightPadding(stopName, ' ', 32) + stopTime + "00" + "  " + arrivalTime + secondsDifference(stopTime, arrivalTimeSeconds) + "  " + stopTime + "00" + "  " + departureTime + secondsDifference(stopTime, departureTimeSeconds) + "  " + "ok";
    }

}