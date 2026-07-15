package riders.uber.demo.UberDriver;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/uberdrivers")
public class DriverController  {

    public DriverController(DriverService service) {
        this.service = service;
    }

    private  DriverService service;


    @GetMapping
    public List<Driver> findAllDrivers() {
        return service.findAllDrivers();
    }
}