package com.seeker.ecommerceportal.Repository;

import com.seeker.ecommerceportal.entity.ShipmentTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShipmentTrackerRepository  extends JpaRepository<ShipmentTracker,Long> {

}