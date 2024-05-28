package com.app.delivery.dto;

import lombok.Data;

@Data
public class DeliveryDto {
    public Long deliveryId;
    public Long orderId;
    public String deliveryStatus;
}
