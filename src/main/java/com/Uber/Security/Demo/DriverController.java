
package com.Uber.Security.Demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/driver")
public class DriverController {

    @GetMapping
    public String get() {
        return "Get::Hello  Driver!";
    }



    @PutMapping
    public String put () {
        return "Put ::Hello Driver!";
    }


}
