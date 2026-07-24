package riders.uber.demo.UberDriver;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class Db_DriverService implements DriverService  {

    private final  DriverRepository repository;

    public Db_DriverService(DriverRepository repository) {
        this.repository = repository;
    }

    @Override
    public Driver SAVE(Driver d) {

        return repository.save(d);
    }

    @Override
    public List<Driver> findAllDrivers() {

        return repository.findAll();
    }

    @Override
    public List<Driver> findByAvailable(Boolean available) {

        return List.of();
    }

    @Override
    public Driver findByEmail(String email) {

        return repository.findByEmail(email);
    }

    @Override
    public Driver findByPhoneNumber(String phoneNumber) {
        return repository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public Driver update(Driver driver) {
        return repository.save(driver);
    }

    @Override
    public void delete(String email) {
     repository.deleteByEmail(email);
    }
}
