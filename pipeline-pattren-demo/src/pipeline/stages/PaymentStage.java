package pipeline.stages;

import models.Order;

public class PaymentStage implements OrderPipelineStage{
    @Override
    public Order process(Order order) {
        if("VALID".equals(order.getStatus())) {
            order.setStatus("PAID");
        }
        return order;
    }
}
