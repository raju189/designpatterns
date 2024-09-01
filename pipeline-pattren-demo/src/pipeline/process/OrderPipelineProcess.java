package pipeline.process;


import models.Order;
import pipeline.stages.OrderCompleteStage;
import pipeline.stages.OrderPipelineStage;

import java.util.ArrayList;
import java.util.List;

public class OrderPipelineProcess {

    private List<OrderPipelineStage> stages = new ArrayList<>();

    public OrderPipelineProcess addStages(OrderPipelineStage stage){
        stages.add(stage);
        return this;
    }

    public Order execute(Order order){
        for(OrderPipelineStage stage : stages){
            if("INVALID".equals(order.getStatus())){
                break;
            }
            stage.process(order);
        }
        return order;
    }
}
