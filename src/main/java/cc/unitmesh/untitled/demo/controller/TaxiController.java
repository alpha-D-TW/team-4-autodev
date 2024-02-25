package cc.unitmesh.untitled.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/taxi")
public class TaxiController {

    public Double calculate(double distance, double waitingTime) {
        if (distance < 8) {
            return 4.0;
        } else {
            double baseFare = 6.4;
            double extraFare = 0.25 * (distance - 8);
            double waitingFare = 0.25 * waitingTime;
            return baseFare + extraFare + waitingFare;
        }
    }
}
