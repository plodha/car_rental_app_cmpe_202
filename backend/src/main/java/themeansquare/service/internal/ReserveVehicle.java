package themeansquare.service.internal;

import themeansquare.service.IReservation;
import themeansquare.model.Customer;
import themeansquare.model.Location;
import themeansquare.model.Vehicle;
import themeansquare.model.Invoice;
import themeansquare.service.internal.ReserveVehicle;
import themeansquare.repository.CustomerRepository;
import themeansquare.repository.LocationRepository;
import themeansquare.repository.VehicleRepository;
import themeansquare.repository.InvoiceRepository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReserveVehicle implements IReservation {
    
    private CustomerRepository customerRepository;
    private LocationRepository locationRepository;
    private VehicleRepository vehicleRepository;
    private InvoiceRepository invoiceRepository;

    private String actualDropOffTime; 
    private String estimateDropOffTime;
    private Double estimatedPrice;
    private String pickUpTime;
    private Boolean status;
    private int vehicleId;
    private int locationId;
    private int vehicleTypeId;

    public ReserveVehicle(String actualDropOffTime, String estimateDropOffTime,Double estimatedPrice,String pickUpTime, Boolean status,
                          int vehicleId, int vehicleTypeId, int locationId, 
                          CustomerRepository customerRepository, LocationRepository locationRepository,
                          VehicleRepository vehicleRepository, InvoiceRepository invoiceRepository) {

        this.actualDropOffTime= actualDropOffTime;
        this.estimateDropOffTime = estimateDropOffTime;
        this.estimatedPrice = estimatedPrice;
        this.pickUpTime = pickUpTime;
        this.status = status;
        this.vehicleId = vehicleId; 
        this.vehicleTypeId = vehicleTypeId; 
        this.locationId = locationId;
        this.customerRepository = customerRepository; 
        this.locationRepository = locationRepository;
        this.vehicleRepository = vehicleRepository; 
        this.invoiceRepository = invoiceRepository;
    }

    public String addReservation() throws Exception {
        return null;
    }
}