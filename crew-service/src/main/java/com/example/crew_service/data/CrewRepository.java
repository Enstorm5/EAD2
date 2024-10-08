package com.example.crew_service.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CrewRepository extends JpaRepository<Crew,Integer>{

    @Query("Select c from Crew c where c.name=?1")
    List<Crew> findCrewByName(String name);

    @Query("Select c from Crew c where c.shipId=?1")
    List<Crew> findCrewByShipId(int shipId);

}
