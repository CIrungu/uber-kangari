package riders.uber.demo.UberDriver;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/uberdrivers")
public class DriverController {

    public DriverController(DriverService service) {
        this.service = service;
    }

    private DriverService service;

    @PostMapping
    public Driver save(
            @RequestBody Driver driver) {
        return service.SAVE(driver);
    }


    @GetMapping
    public List<Driver> findAllDrivers() {
        return service.findAllDrivers();

    }

    @GetMapping("/ email{email}")
    public Driver findByEmail(
            @PathVariable String email) {
        return service.findByEmail(email);
    }

    @GetMapping("/ phone{phoneNumber}")
    public Driver findByPhoneNumber(
            @PathVariable String phoneNumber) {
        return service.findByPhoneNumber(phoneNumber);
    }

    @PutMapping
    public Driver update(
            @RequestBody Driver driver)
    {
        return service.update(driver);
    }

    @DeleteMapping("/{email}")
    public void delete(
            @PathVariable String email) {

        {
            service.delete(email);


        }
    }
}