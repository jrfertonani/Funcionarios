package back.Employees.resource;

import back.Employees.Service.employeesService;
import back.Employees.model.DTO.employeesRequest;
import back.Employees.model.entity.EmployeesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@CrossOrigin("*")
@RestController
@RequestMapping("/employees")
public class employeesResource {

    @Autowired
    public employeesService service;


    @PostMapping
    public ResponseEntity<employeesRequest> postEmployees(@RequestBody employeesRequest DTO){

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(
                        service.createEmployees(DTO)).toUri();
                        return ResponseEntity.created(uri).body(DTO);
    }



}
