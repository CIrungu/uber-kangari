package riders.uber.demo.Vehicle;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/vehicle")

public class VehicleController {


    private VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }


    @GetMapping


    public List<Vehicle> findAllVehicles() {
        return service.findAllVehicles();
    }
}