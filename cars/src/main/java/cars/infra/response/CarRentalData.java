package cars.infra.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Car Rental Data
 * Created by claudio on 07/07/17.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarRentalData {

  Provider provider;

  String airport;

  VehicleOffer cars;

}
