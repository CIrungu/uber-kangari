package riders.uber.demo.Vehicle;

public class Vehicle {


    private String model;

    private String numberPlate;

    private  String colour;

    private  Integer driverId;

    private String yearOfManufacture;

    public Vehicle(
            String model,
             String numberPlate,
                   String colour,
                   Integer driverId,
                   String yearOfManufacture
     )
    {
        this.model = model;
        this.numberPlate = numberPlate;
        this.colour = colour;
        this.driverId = driverId;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
