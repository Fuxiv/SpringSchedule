package com.autoschedule.autoscheduleonline.Service;

import com.autoschedule.autoscheduleonline.Model.BusStop813101;
import com.autoschedule.autoscheduleonline.Model.BusStop813102;
import com.autoschedule.autoscheduleonline.Repository.BusStopRepository813101;
import com.autoschedule.autoscheduleonline.Repository.BusStopRepository813102;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BusStopService {
    private final BusStopRepository813101 busStopRepository813101;
    private final BusStopRepository813102 busStopRepository813102;
    Gson gson = new Gson();

    @Autowired
    public BusStopService(BusStopRepository813101 busStopRepository813101, BusStopRepository813102 busStopRepository813102) {
        this.busStopRepository813101 = busStopRepository813101;
        this.busStopRepository813102 = busStopRepository813102;
    }

    public List<BusStop813101> getStop() {
        return busStopRepository813101.findAll();
    }
    public Object[] getStopToArray() {
        return busStopRepository813101.findAll().toArray();
    }

    public Optional<BusStop813101> getStopById(int id) {
        return busStopRepository813101.findById(id);
    }

    public BusStop813101 getBusStopByName(String name) {
        return busStopRepository813101.findBusStopByName(name);
    }

    public List<BusStop813102> getAllStops813102() {
        return busStopRepository813102.findAll();
    }

    public List<BusStop813101> getStopNameAndTime() {
        return busStopRepository813101.findBusStopNameAndTime();
    }

    public String getBusStop813101Name() {
        return busStopRepository813101.findBusStop813101Name(1);
    }

    public List<BusStop813101> getBusStop813101Name1() {
        return busStopRepository813101.findBusStop813101Name1(1);
    }
    public void writeToFile() throws IOException {
        Files.write(Paths.get("src/main/resources/test.txt"), Arrays.toString(getStopToArray()).getBytes());
    }

}
