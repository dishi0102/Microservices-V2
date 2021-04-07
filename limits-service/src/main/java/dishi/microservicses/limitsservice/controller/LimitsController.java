package dishi.microservicses.limitsservice.controller;

import dishi.microservicses.limitsservice.bean.Limits;
import dishi.microservicses.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public Limits retriveLimits(){
//        return  new Limits(1,200);
return new Limits(configuration.getMaximum(), configuration.getMinimum());

    }
}
