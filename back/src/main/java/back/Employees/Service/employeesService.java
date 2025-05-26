package back.Employees.Service;

import back.Employees.respository.employeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeesService {

    @Autowired
    public employeesRepository repository;



}
