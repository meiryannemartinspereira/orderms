package tech.buildrun.btgpactual.orderms.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import tech.buildrun.btgpactual.orderms.listener.dto.OrderCreatedEvent;

@Component
public class OrderCreatedListener {

    @RabbitListener
    public void listen(Message<OrderCreatedEvent> message){}
}
