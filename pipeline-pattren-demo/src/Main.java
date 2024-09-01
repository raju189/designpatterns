import models.Order;
import pipeline.process.OrderPipelineProcess;
import pipeline.stages.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var orderPipelineProcess = new OrderPipelineProcess();
        orderPipelineProcess
                .addStages(new ValidationStage())
                .addStages(new PaymentStage())
                .addStages(new ShipmentStage())
                .addStages(new DeliveredStage())
                .addStages(new OrderCompleteStage());

        for (Order or : List.of(new Order("x1", 23.49), new Order("x2", 0.0))) {
            orderPipelineProcess.execute(or);
            System.out.println("Order ::"+or);
        }

    }
}