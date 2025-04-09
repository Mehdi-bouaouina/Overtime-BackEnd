package mehdi_bouaouina.overtime.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
//@AllArgsConstructor
@NoArgsConstructor

public class OvertimeResponseDto {
    private BigDecimal nbHoursSum;
    private String firstName;

    public OvertimeResponseDto(BigDecimal nbHoursSum, String firstName) {
        this.nbHoursSum = nbHoursSum;
        this.firstName = firstName;
    }
}
