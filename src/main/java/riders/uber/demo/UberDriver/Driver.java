package riders.uber.demo.UberDriver;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table




public class Driver {
    @Id
    @GeneratedValue
    private Long id;


private String firstname;

private String lastname;

@Column(unique = true)

private String email;
@Column(nullable = false)
private String password;
@Column(unique = true)
private String licenseNumber;

@Column(unique = true)
private String idNumber;

@Column(unique = true)
private String phoneNumber;
@Column
private String vehicleModel;
@Column
private String vehicleNumberPlate;
@Column
private String vehicleType;

@Column
private Integer totalTrips;
@Column
private Boolean available = true;
@Column
private LocalDateTime createdAt = LocalDateTime.now();
@Column
private LocalDateTime updatedAt = LocalDateTime.now();


public Driver(
        String firstname,
        String lastname,
        String email,
        String password,
        String licenseNumber,
        String idNumber,
        String phoneNumber,
        String vehicleModel,
        String vehicleNumberPlate,
        String vehicleType,
        Integer totalTrips,
        Boolean available,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.password = password;
    this.licenseNumber = licenseNumber;
    this.idNumber = idNumber;
    this.phoneNumber = phoneNumber;
    this.vehicleModel = vehicleModel;
    this.vehicleNumberPlate = vehicleNumberPlate;
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
    return vehicleType;
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


}


