package riders.uber.demo.UberDriver;

import java.time.LocalDateTime;

public class Driver {
    private String firstname;

    private  String lastname;

    private  String email;

    private String  password;

    private  String licenseNumber;

    private String idNumber;

    private  String phoneNumber;

    private String vehicleModel;

    private String vehicleNumberPlate;

    private  String vehicleType;


    private Integer totalTrips;

    private Boolean available = true;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();





    public Driver(
                  String firstname,
                  String lastname,
                  String email,
                  String password,
                  String licensenumber,
                  String idnumber,
                  String phonenumber,
                  String vehiclemodel,
                  String vehiclenumberplate,
                  String vehicleType,
                  Integer totalTrips,
                  Boolean available,
                  LocalDateTime createdAt,
                  LocalDateTime updatedAt) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.licenseNumber = licensenumber;
        this.idNumber = idnumber;
        this.phoneNumber = phonenumber;
        this.vehicleModel = vehiclemodel;
        this.vehicleNumberPlate = vehiclenumberplate;
        this.vehicleType = vehicleType;
        this.totalTrips = totalTrips;
        this.available = available;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {

        this.licenseNumber = licenseNumber;
    }

    public String getIdNumber() {

        return idNumber;
    }

    public void setIdNumber(String idNumber) {

        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {

        this.vehicleModel = vehicleModel;
    }

    public String getVehicleNumberPlate() {
        return vehicleNumberPlate;
    }

    public void setVehicleNumberPlate(String vehicleNumberPlate) {

        this.vehicleNumberPlate = vehicleNumberPlate;
    }

    public String getVehicleType() {
        return vehicleType ;
    }

    public void setVehicleType(String vehicleType) {

        this.vehicleType = vehicleType;
    }

    public Integer getTotalTrips() {

        return totalTrips;
    }

    public void setTotalTrips(Integer totalTrips) {

        this.totalTrips = totalTrips;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {

        this.available = available;
    }

    public LocalDateTime getCreatedAt() {

        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {

        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }



    public Driver() {
    }
}
