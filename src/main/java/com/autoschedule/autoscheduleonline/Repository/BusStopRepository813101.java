package com.autoschedule.autoscheduleonline.Repository;

import com.autoschedule.autoscheduleonline.Model.BusStop813101;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BusStopRepository813101 extends JpaRepository<BusStop813101, Integer> {
    BusStop813101 findBusStopByName(String name);
    @Query("select new com.autoschedule.autoscheduleonline.Model.BusStop813101(b.name, b.time) from BusStop813101 b")
    List<BusStop813101> findBusStopNameAndTime();
    @Query("select new com.autoschedule.autoscheduleonline.Model.BusStop813101(b.name) from BusStop813101 b where b.id = :param ")
    String findBusStop813101Name(@Param("param") Integer param);

    @Query("select new com.autoschedule.autoscheduleonline.Model.BusStop813101(b.name) from BusStop813101 b where b.id = :param ")
    List<BusStop813101> findBusStop813101Name1(@Param("param") Integer param);
}
