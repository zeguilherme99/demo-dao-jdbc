package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class MainDepartment {

    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n==== TEST 1: department insert =====");
        Department department = new Department(null, "Chocolate");
        departmentDao.insert(department);
        System.out.println("Created");

        System.out.println("\n==== TEST 2: department update =====");
        department.setName("Chocolate Branco");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("\n==== TEST 3: department findAll =====");
        List<Department> departments = departmentDao.findAll();
        departments.forEach(System.out::println);

        System.out.println("\n==== TEST 4: department delete =====");
        departmentDao.deleteById(8);
        System.out.println("Deleted");

        System.out.println("\n==== TEST 5: seller findById =====");
        Department departmentFind = departmentDao.findById(2);
        System.out.println(departmentFind);
    }
}
