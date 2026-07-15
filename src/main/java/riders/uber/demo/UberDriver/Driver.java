package riders.uber.demo.UberDriver;

import java.time.LocalDateTime;

public class Driver {
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
                  String vehicletype,
                  Integer totalTrips,
                  Boolean available,
                  LocalDateTime createdAt,
                  LocalDateTime updatedAt) {
        this.firstname = firstname;
        this.lastname = lastname;
        Email = email;
        this.password = password;
        this.licensenumber = licensenumber;
        this.idnumber = idnumber;
        this.phonenumber = phonenumber;
        this.vehiclemodel = vehiclemodel;
        this.vehiclenumberplate = vehiclenumberplate;
        this.vehicletype = vehicletype;
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
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getVehiclemodel() {
        return vehiclemodel;
    }

    public void setVehiclemodel(String vehiclemodel) {
        this.vehiclemodel = vehiclemodel;
    }

    public String getVehiclenumberplate() {
        return vehiclenumberplate;
    }

    public void setVehiclenumberplate(String vehiclenumberplate) {
        this.vehiclenumberplate = vehiclenumberplate;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
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

    private String firstname;

     private  String lastname;

     private  String Email;

     private String  password;

     private  String licensenumber;

     private String   idnumber;



     private  String phonenumber;

     private String vehiclemodel;

     private String vehiclenumberplate;

     private  String vehicletype;

    private Integer totalTrips;

    private Boolean available = true;


    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();

    public Driver() {
    }
}
