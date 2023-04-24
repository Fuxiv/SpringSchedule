package com.autoschedule.autoscheduleonline.Repository;

import com.autoschedule.autoscheduleonline.Model.BusStop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BusStopRepository extends JpaRepository<BusStop, Integer> {
    @Query("select new com.autoschedule.autoscheduleonline.Model.BusStop(b.name, b.time) from BusStop b where b.trip_index_id = :trip_index_id and b.line_number_id = :line_number_id")
    List<BusStop> getBusStopByLineAndTrip(@Param("trip_index_id") int trip_index_id, @Param("line_number_id") int line_number_id);
}
