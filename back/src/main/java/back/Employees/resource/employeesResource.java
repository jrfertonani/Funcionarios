package back.Employees.resource;

import back.Employees.Service.employeesService;
import back.Employees.model.DTO.employeesRequest;
import back.Employees.model.DTO.employeesResponse;
import back.Employees.model.entity.EmployeesEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
@Tag(name = "Clientes")
@CrossOrigin("*")
@RestController
@RequestMapping("/employees")
public class employeesResource {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    public employeesService service;


    @PostMapping
    @Operation(summary = "Employee registration",description = "\n" +
            "This function is responsible for registering employees.")
    @ApiResponse(responseCode = "200",description = "Employee registration completed successfully",
            content = {@Content(schema = @Schema(implementation = employeesRequest.class))})
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "500", description = "Internal server error")
    public ResponseEntity<employeesRequest> postEmployees(@RequestBody employeesRequest request){

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(
                        service.createEmployees(request)).toUri();
                        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    @Operation(summary = "Employee List")
    @ApiResponse(responseCode = "200",description = "Employee registration completed successfully",
            content = {@Content(schema = @Schema(implementation = employeesRequest.class))})
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "500", description = "Internal server error")
    public ResponseEntity<List<employeesResponse>> getAllEmployees(){
                return ResponseEntity.ok().body(
                        service.getAllEmployees()
                                .stream().map(
                                        x -> mapper.map(x, employeesResponse.class)
                                ).toList());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Search by employees ID", description = "\n" +
            "This function searches for one employee at a time 'ID'")
    @ApiResponse(responseCode = "200",description = "Employee registration completed successfully",
            content = {@Content(schema = @Schema(implementation = employeesRequest.class))})
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "500", description = "Internal server error")
    public ResponseEntity<employeesRequest> getIdEmployees(@PathVariable Integer id ){
        return ResponseEntity.ok().body(
                service.findByIdEmployees(id)
        );
    }

    @PutMapping("/{id}")
    @Operation(summary = "change employees.",description = "This function is responsible for changing the employee record.")
    @ApiResponse(responseCode = "200",description = "Employee registration completed successfully",
            content = {@Content(schema = @Schema(implementation = employeesRequest.class))})
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "500", description = "Internal server error")
    public ResponseEntity<employeesRequest> updateEmployees(@PathVariable Integer id,
                                                          @RequestBody employeesRequest request){
        request.setId(id);
        EmployeesEntity obj = service.update(id, request);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove employees", description = "This function is responsible for removing employees")
    @ApiResponse(responseCode = "200",description = "Employee registration completed successfully",
            content = {@Content(schema = @Schema(implementation = employeesRequest.class))})
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "500", description = "Internal server error")
    public ResponseEntity<employeesRequest> deleteEmployees(@PathVariable Integer id ){
        service.deleteByIdEmployees(id);
        return ResponseEntity.noContent().build();
    }


}
