package com.app.delivery.util;

import com.app.delivery.dto.DeliveryDto;
import com.app.delivery.model.Delivery;

public class DeliveryMapper {
    public static Delivery deliveryDtoMapByDelivery(DeliveryDto deliveryDto){
        Delivery delivery=new Delivery();
        delivery.setDeliveryId(deliveryDto.getDeliveryId());
        delivery.setOrderId(deliveryDto.getOrderId());
        delivery.setDeliveryStatus(deliveryDto.getDeliveryStatus());
        return  delivery;
    }
    public static DeliveryDto deliveryMapByDeliveryDto(Delivery delivery){
        DeliveryDto deliveryDto=new DeliveryDto();
        deliveryDto.setDeliveryId(delivery.getDeliveryId());
        deliveryDto.setOrderId(delivery.getOrderId());
        deliveryDto.setDeliveryStatus(delivery.getDeliveryStatus());
        return  deliveryDto;
    }

}
