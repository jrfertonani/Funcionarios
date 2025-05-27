package back.Employees.respository;

import back.Employees.model.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeesRepository extends JpaRepository<EmployeesEntity, Integer> {
}
