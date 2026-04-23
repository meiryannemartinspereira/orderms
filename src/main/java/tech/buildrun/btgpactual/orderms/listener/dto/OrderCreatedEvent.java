package tech.buildrun.btgpactual.orderms.listener.dto;

import java.math.BigDecimal;
import java.util.List;

public record OrderCreatedEvent(Long orderId,
                                Long customerId,
                                List<OrderItemEvent> items) {
}
