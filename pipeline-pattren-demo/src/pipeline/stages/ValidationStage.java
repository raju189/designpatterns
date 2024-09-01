package pipeline.stages;

import models.Order;

public class ValidationStage implements OrderPipelineStage {
    @Override
    public Order process(Order order) {
        if (order.getAmount() <= 0) {
            order.setStatus("INVALID");
        } else {
            order.setStatus("VALID");
        }
        return order;
    }

}
