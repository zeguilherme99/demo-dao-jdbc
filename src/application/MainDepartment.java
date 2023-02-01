package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class MainDepartment {

    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n==== TEST 1: seller insert =====");
        Department department = new Department(null, "Chocolate");
        departmentDao.insert(department);
        System.out.println("Created");

        System.out.println("\n==== TEST 2: seller update =====");
        department.setName("Chocolate Branco");
        departmentDao.update(department);
        System.out.println("Update completed");
    }
}
