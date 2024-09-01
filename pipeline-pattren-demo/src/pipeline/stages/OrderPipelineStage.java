package pipeline.stages;

import models.Order;

public interface OrderPipelineStage {

    default public Order process(Order order) {
        throw  new RuntimeException("No stage setup");
    }
}
