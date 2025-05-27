package back.Employees.model.DTO;

import back._config.Enums.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class employeesRequest {

    @Schema(description = "Unique product identifier", example = "1")
    private Integer id;

    @Schema(description = "employees Name", example = "Jord", required = true)
    private String name;

    @Schema(description = "employees Email", example = "email@email.com", required = true)
    private String email;

    @Schema(description = "Staus", example = "JUNIOR", required = true)
    private Status status;

}
