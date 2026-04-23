package tech.buildrun.btgpactual.orderms.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String ORDER_CREATED_QUEUE = "btgpactual-order-created";

    @Bean
    public Queue orderCreatedQueue(){
        return new Queue(ORDER_CREATED_QUEUE, true);
    }

    @Bean
    public MessageConverter messageConverter() {
        return new JacksonJsonMessageConverter();
    }
}