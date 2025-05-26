package back.Employees.Service;

import back.Employees.model.DTO.employeesRequest;
import back.Employees.model.entity.EmployeesEntity;
import back.Employees.respository.employeesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeesService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    public employeesRepository repository;


    public Integer createEmployees(employeesRequest request){
        EmployeesEntity entity = new EmployeesEntity();
        BeanUtils.copyProperties(request, entity);
        return repository.save(entity).getId();
    }

    public List<EmployeesEntity> getAllEmployees(){
        return repository.findAll();
    }

}
