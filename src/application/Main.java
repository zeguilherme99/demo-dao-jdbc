package application;

import model.entities.Department;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(1, "Maria");
        System.out.println(department);
    }
}