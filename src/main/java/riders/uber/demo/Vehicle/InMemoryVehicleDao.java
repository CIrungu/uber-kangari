package riders.uber.demo.Vehicle;

import jakarta.persistence.Index;
import org.springframework.stereotype.Repository;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


@Repository
public class InMemoryVehicleDao {
    private final List<Vehicle> VEHICLE = new ArrayList<>();

    public Vehicle save(Vehicle v) {
         VEHICLE.add(v);
                 return (v);
    }


    public List<Vehicle> findAllVehicles() {
        return (VEHICLE);
    }


    public Vehicle findByNumberPlate(String numberPlate) {
        return VEHICLE.stream()
                .filter(v -> numberPlate.equals(v.getNumberPlate()))
                .findFirst()
                .orElse(null);
    }

    public Vehicle update(Vehicle v) {
        var vehicleIndex = IntStream.range(0, VEHICLE.size())
        .filter(index -> VEHICLE.get(index).getNumberPlate().equals(v.getNumberPlate()))
                .findFirst()
                .orElse(-1);

        if (vehicleIndex > -1 ){
            VEHICLE.set(vehicleIndex, v);
            return v;
        }
        return null;

    }


    public void delete(String numberPlate) {
        var vehicle = findByNumberPlate( numberPlate);
        if (vehicle != null) {
            VEHICLE.remove(vehicle);
        }
    }
}


