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
public class Location{
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
	
	@NotNull
    @Column(columnDefinition = "TEXT")
    private String Name;
	
	@NotNull
	private int VehicleCapacity;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Address", referencedColumnName = "Id")
	private VehicleType Address;
	
	@NotNull
	private int ContactNumber;

	public int getId() { return Id; }

	public void setId(int id) { Id = id; }

	public String getName() { return Name; }

	public void setName(String name) { Name = name; }

	public int getVehicleCapacity() { return VehicleCapacity; }

	public void setVehicleCapacity(int vehicleCapacity) { VehicleCapacity = vehicleCapacity; }

	public VehicleType getAddress() { return Address; }

	public void setAddress(VehicleType address) { Address = address; }

	public int getContactNumber() { return ContactNumber; }

	public void setContactNumber(int contactNumber) { ContactNumber = contactNumber; }
	
	
}
    