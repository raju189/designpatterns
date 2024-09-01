package pipeline.stages;

import models.Order;

public class DeliveredStage implements OrderPipelineStage {
    @Override
    public Order process(Order order) {
        if("SHIPMENT".equals(order.getStatus())) {
            order.setStatus("DELIVERED");
        }
        return order;
    }
}
