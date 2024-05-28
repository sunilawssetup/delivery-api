package com.app.delivery.controller;

import com.app.delivery.dto.DeliveryDto;
import com.app.delivery.service.IDeliveryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "delivery-api",
        description = "here is the delivery api for the perform operation"

)
@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    public IDeliveryService deliveryService;

    @Operation(
            summary = "save delivery",
            description = "perform save delivery based on input parameter"
    )
    @ApiResponse(
            responseCode = "201",
            description = "save delivery",
            content = @Content(
                    schema = @Schema(
                            implementation = DeliveryDto.class
                    )
            )
    )
    @PostMapping("/saveDeliver")
    public ResponseEntity<DeliveryDto> saveDeliver(DeliveryDto deliveryDto) {
        return ResponseEntity.ok(deliveryService.saveDelivery(deliveryDto));
    }
}
