package riders.uber.demo.Vehicle;

import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class VehicleService {

    public List<Vehicle> findAllVehicles() {
        return List.of(
                new Vehicle(
                        "Demio",
                        "KDA234G",
                        "white",
                        2,
                        "2023"



                ),
                new Vehicle(
                        "nissan",
                        "KDG234G",
                        "black",
                        7,
                        "2024"

                )
        );
    }
}




