package com.fcp.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/meextServiceFallBack")
    public String userServiceFallBackMethod() {
        return "meext Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/vcloudServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "vcloud Service is taking longer than Expected." +
                " Please try again later";
    }
}
