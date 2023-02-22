package tn.esprit.spring.interfaces;

import tn.esprit.spring.entities.Department;

import java.util.List;

public interface IDepartmentService {
     Department saveDepartment(Department department);

     List<Department> fetchDepartmentList();

     Department
     updateDepartment(Department department,
                      Long departmentId);


     void deleteDepartmentById(Long departmentId);
}
