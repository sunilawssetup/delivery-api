package com.app.delivery.service.impl;

import com.app.delivery.dto.DeliveryDto;
import com.app.delivery.repo.DeliveryRepo;
import com.app.delivery.service.IDeliveryService;
import com.app.delivery.util.DeliveryMapper;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl implements IDeliveryService {

    @Autowired
    public DeliveryRepo deliveryRepo;

    @Override
    public DeliveryDto saveDelivery(DeliveryDto deliveryDto){
        return DeliveryMapper.deliveryMapByDeliveryDto(deliveryRepo.save(DeliveryMapper.deliveryDtoMapByDelivery(deliveryDto)));
    }
}
