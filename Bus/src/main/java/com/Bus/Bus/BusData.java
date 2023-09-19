package com.Bus.Bus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusData extends JpaRepository<Buses,Integer> {
    @Query(value = "Select * from bus where bus_no=?",nativeQuery = true)
    public List<Buses> got(int id);

    @Query("select u from Buses u where u.bus_no=?1")
    public List<Buses> got1(int id);
}
