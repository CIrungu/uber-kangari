package riders.uber.demo.Vehicle;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class InMemoryVehicleService implements VehicleService{



private  final InMemoryVehicleDao dao;


    public InMemoryVehicleService(InMemoryVehicleDao dao) {
        this.dao = dao;

}

     @Override
     public Vehicle save(   Vehicle v) {
         return dao.save(v);
     }
    @Override
    public List<Vehicle> findAllVehicles() {
        return dao.findAllVehicles();
    }

    @Override
    public Vehicle findByNumberPlate(String numberPlate) {
        return dao.findByNumberPlate(numberPlate);
    }

    @Override
    public Vehicle update(Vehicle v) {
        return dao.update(v);
    }

    @Override
    public void delete(String numberPlate) {

   dao.delete(numberPlate);
    }
}
