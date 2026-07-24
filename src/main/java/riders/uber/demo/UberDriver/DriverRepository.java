package riders.uber.demo.UberDriver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository  extends JpaRepository<Driver, Long> {

    Driver findByEmail (String email);

    Driver findByPhoneNumber(String phoneNumber);



    void deleteByEmail(String email);
}
