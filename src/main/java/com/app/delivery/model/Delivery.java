package com.app.delivery.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_delivery")
public class Delivery {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    public Long deliveryId;
    public Long orderId;
    public String deliveryStatus;

}
