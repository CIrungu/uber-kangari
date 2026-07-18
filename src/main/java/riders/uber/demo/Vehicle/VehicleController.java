package riders.uber.demo.Vehicle;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/vehicle")

public class VehicleController {

   @GetMapping

    public List<String>  findAllVehicles() {
       return List.of();
   }
    }
