package pipeline.stages;

import models.Order;

public class ShipmentStage implements OrderPipelineStage {
    @Override
    public Order process(Order order) {
        if("PAID".equals(order.getStatus())){
            order.setStatus("SHIPMENT");
        }
        return order;
    }
}
