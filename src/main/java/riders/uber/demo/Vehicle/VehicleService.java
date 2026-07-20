package riders.uber.demo.Vehicle;

import org.springframework.stereotype.Service;

import java.util.List;




public interface VehicleService {

    Vehicle save (Vehicle v);

    List<Vehicle> findAllVehicles();

    Vehicle findByNumberPlate(String numberPlate);

    Vehicle update(Vehicle v);

    void delete(String numberPlate);
}






