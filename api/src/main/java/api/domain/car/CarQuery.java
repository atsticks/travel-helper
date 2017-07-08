package api.domain.car;

import api.domain.airport.Airport;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Car Query
 * Created by claudio on 07/07/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarQuery {

  Airport airport;

  String pickUp;

  String dropOf;

}