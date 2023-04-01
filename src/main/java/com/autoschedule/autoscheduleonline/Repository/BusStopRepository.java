package com.autoschedule.autoscheduleonline.Repository;

import com.autoschedule.autoscheduleonline.Model.BusStop813101;
import com.autoschedule.autoscheduleonline.Model.BusStop813102;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusStopRepository extends JpaRepository<BusStop813101, Integer> {
    BusStop813101 findBusStopByName(String name);
}
