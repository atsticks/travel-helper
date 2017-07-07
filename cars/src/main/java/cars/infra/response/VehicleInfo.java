package cars.infra.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Vehicle Info
 * Created by claudio on 07/07/17.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleInfo {

  String transmission;

  Boolean airConditioning;

  String category;

  String type;

}
