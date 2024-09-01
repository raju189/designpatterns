package pipeline.stages;

import models.Order;

public class OrderCompleteStage implements OrderPipelineStage {
    @Override
    public Order process(Order order) {
        if("DELIVERED".equals(order.getStatus())) {
            order.setStatus("COMPLETED");
        }
        return order;
    }
}
