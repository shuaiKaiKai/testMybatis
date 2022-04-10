package testmybatis.queue.configuration;

import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class DelayQueueRabbitConfig {

    public static final String DLX_QUEUE = "queue.dlx";//死信队列
    public static final String DLX_EXCHANGE = "exchange.dlx";//死信交换机
    public static final String DLX_ROUTING_KEY = "routingkey.dlx";//死信队列与死信交换机绑定的routing-key

    public static final String ORDER_QUEUE = "queue.order";//订单的延时队列
    public static final String ORDER_EXCHANGE = "exchange.order";//订单交换机
    public static final String ORDER_ROUTING_KEY = "routingkey.order";//延时队列与订单交换机绑定的routing-key
}
