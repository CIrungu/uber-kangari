package riders.uber.demo.UberDriver;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class DriverService {


    public List<Driver> findAllDrivers() {
        return List.of(
                new Driver(
                        "clement",
                        "mwangi",
                        "irunguclymoh@gmail.com",
                        "12345",
                        "A123",
                        "37636566",
                        "0768403210",
                        "vitz2023",
                        "KDG 123G",
                        "VITZ",
                        3,
                        true,
                        LocalDateTime.now(),
                        LocalDateTime.now()
                ),
                new Driver(
                        "clemt",
                        "ingi",
                        "irungucleymoh@gmail.com",
                        "123456",
                        "AB123",
                        "3763656656",
                        "0768404210",
                        "vitz2024",
                        "KDH 123G",
                        "VITZ",
                        6,
                        false,
                        LocalDateTime.now(),
                        LocalDateTime.now()
                )
        );
    }
}


