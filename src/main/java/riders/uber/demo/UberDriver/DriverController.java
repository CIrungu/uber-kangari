package riders.uber.demo.UberDriver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/uberdrivers")
public class DriverController {

 @GetMapping
    public  List <String> findAllDrivers () {
     return List.of(
             "clement",
             "hello"
     );
 }

}
