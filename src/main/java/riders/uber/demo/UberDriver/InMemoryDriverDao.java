package riders.uber.demo.UberDriver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Locale.filter;
@Repository
public class InMemoryDriverDao {


    private  final List<Driver> DRIVER = new ArrayList<>();



    public Driver SAVE(Driver d) {
        DRIVER.add (d);
                 return d;
    }

    public List<Driver> findAllDrivers() {

        return (DRIVER);
    }

    public List<Driver> findByAvailable(boolean available) {
        return DRIVER.stream()
                .filter(d -> d.getAvailable() == available)
                .toList();
    }




    public Driver findByEmail(String Email) {

        return DRIVER.stream()
        .filter (d -> Email.equals(d.getEmail()))
                .findFirst()
                .orElse(null);


    }




    public Driver findByPhoneNumber(String phoneNumber) {
        return DRIVER.stream()
                .filter(d ->phoneNumber.equals(d.getPhoneNumber()))
                .findFirst()
                .orElse(null);
    }



    public Driver update(Driver d) {
        var driverIndex = IntStream.range(0 , DRIVER.size())
                .filter(index -> DRIVER.get(index).getEmail().equals(d.getEmail()))
                .findFirst()
                .orElse(-1);

                if (driverIndex > -1){
                     DRIVER.set(driverIndex, d);
                             return d;
                }

                return  null;

    }





    public void delete(String email) {

        var driver = findByEmail(email);
                if (driver != null) {

            DRIVER.remove(driver);
        }

    }



}
