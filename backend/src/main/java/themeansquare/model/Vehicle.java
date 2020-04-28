package themeansquare.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Vehicle {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
	
	@NotNull
    //@Column(columnDefinition = "TEXT")
    private String VIN;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "VehicleType", referencedColumnName = "Id")
	private VehicleType VehicleTypeId;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Location", referencedColumnName = "Id")
	private Location Location;
	
	@NotNull
	private String LicensePlate;
	
	@NotNull
	private String Make;
	
	@NotNull
	private String Model;
	
	@NotNull
	private int Year;
	
	@NotNull
	private boolean Status;

	public int getId() { return Id; }

	public void setId(int id) { Id = id; }

	public String getVIN() { return VIN; }

	public void setVIN(String vIN) { VIN = vIN; }

	public VehicleType getVehicleTypeId() { return VehicleTypeId; }

	public void setVehicleTypeId(VehicleType vehicleTypeId) { VehicleTypeId = vehicleTypeId; }

	public Location getLocation() { return Location; }

	public void setLocation(Location location) { Location = location; }

	public String getLicensePlate() { return LicensePlate; }

	public void setLicensePlate(String licensePlate) { LicensePlate = licensePlate; }

	public String getMake() { return Make; }

	public void setMake(String make) { Make = make; }

	public String getModel() { return Model; }

	public void setModel(String model) { Model = model; }

	public int getYear() { return Year; }

	public void setYear(int year) { Year = year; }

	public boolean isStatus() { return Status; }

	public void setStatus(boolean status) { Status = status; }
	
}
    