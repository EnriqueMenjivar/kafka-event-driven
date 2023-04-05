package com.eventdriven.basedomain.event;

import com.eventdriven.basedomain.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEvent {

    private String message;
    private String status;
    private Order order;
}
