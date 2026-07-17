package riders.uber.demo.UberDriver;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

public interface DriverService {

 Driver SAVE(Driver d);

     List<Driver> findAllDrivers ();

    List<Driver> findByAvailable(Boolean available);


     Driver findByEmail(String email);

     Driver findByPhoneNumber(String phoneNumber);


     Driver update (Driver driver);

     void delete (String email);




 }
