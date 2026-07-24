package riders.uber.demo.Vehicle;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/vehicle")

public class VehicleController {


    private VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }


    @PostMapping

    public Vehicle save(
            @RequestBody Vehicle v) {
        return service.save(v);
    }
    @GetMapping
    public List<Vehicle> findAllVehicles() {
        return service.findAllVehicles();
    }


    @GetMapping("numberPlate/{numberPlate}")
    public Vehicle findByNumberPlate(
            @PathVariable String numberPlate) {
        return service.findByNumberPlate(numberPlate);
    }

    @PutMapping("/numberPlate/{numberPlate}")
    public Vehicle update(
            @RequestBody Vehicle v,
            @PathVariable String numberPlate)

    {
        return service.update(v);
    }

    @DeleteMapping("/numberPlate/{numberPlate}")
    public void delete(
            @PathVariable String numberPlate) {

        service.delete(numberPlate);
    }
}

