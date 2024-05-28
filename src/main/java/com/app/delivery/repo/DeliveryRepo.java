package com.app.delivery.repo;

import com.app.delivery.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepo extends JpaRepository<Delivery,Long> {
}
