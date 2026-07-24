package riders.uber.demo.UberDriver;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryDriverService implements DriverService {

    private final InMemoryDriverDao dao;

    public InMemoryDriverService(InMemoryDriverDao dao) {
        this.dao = dao;
    }


    @Override
    public Driver SAVE(Driver d) {
        return dao.SAVE( d);
    }

    @Override
    public List<Driver> findAllDrivers() {
        return  dao.findAllDrivers();
    }

    @Override
    public List<Driver> findByAvailable(Boolean available) {
        return dao.findByAvailable(available);
    }

    @Override
    public Driver findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Driver findByPhoneNumber(String phoneNumber) {
        return dao.findByPhoneNumber(phoneNumber);
    }

    @Override
    public Driver update(Driver d) {
        return dao.update(d);
    }

    @Override
    public void delete(String email) {
    dao.delete(email);
    }
}
