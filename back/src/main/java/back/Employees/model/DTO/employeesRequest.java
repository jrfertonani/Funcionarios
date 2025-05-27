package back.Employees.model.DTO;

import back._config.Enums.Status;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class employeesRequest {

    private Integer id;
    private String name;
    private String email;
    private Status status;

}
