package empresa;

import java.util.Arrays;
import java.util.Objects;

public class Company implements ICompany{
    private String name, cif;
    private Department [] departments;
    //-------------------------- CONSTRUCTOR -----------------------------------//
    public Company(String name, String cif, Department[] departments) {
        this.name = name;
        this.cif = cif;
        this.departments = departments;
    }
    //-------------------------- METODOS PRIVADOS -----------------------------------//
    private Department findDepartment (String departmentName){
        Department result = null;
        boolean found = false;
        for (int i = 0 ; i < departments.length && !found; i++){
            Department department = departments[i];
            if (department != null){
                if (department.getName().equals(departmentName)){
                    result = department;
                    found = true;
                }
            }
        }
        if (!found){
            System.out.println("no se ha encontrado el departamento");
        }
        return result;
    }
    //-------------------------- METODOS PUBLICOS -----------------------------------//

    @Override
    public void showNameOfDepartments() {
        for (int i = 0 ; i < departments.length; i++){
            departments[i].nameDepartment();
        }
    }

    @Override
    public Employee[] getEmployeesDepartment(String departmentName) {
        Department department = findDepartment(departmentName);
        Employee [] employees = null;
        if (department != null){
            employees = department.getEmployees();
        }else {
            System.out.println("el departamento no se ha encontrado");
        }
        return employees;
    }

    @Override
    public void showEmployeesDepartment(String departmentName) {
        Employee[] employees = getEmployeesDepartment(departmentName);
        if (employees != null) {
            for (int i = 0; i < employees.length; i++) {
                employees[i].info();
            }
        }
    }

    @Override
    public void showAllEmployees() {
        for (int i = 0 ; i < departments.length;i++){
            Department department = departments[i];
            department.printInfoEmployee();
        }
    }

    @Override
    public void showAllDepartmentHeads(String position) {
        for (int i = 0 ; i < departments.length; i++){
            Department department = departments[i];
            department.getHeads(position);
        }
    }

    @Override
    public void getDirectorDepartment(String departmentName, String position) {
    }

    @Override
    public void getAllDepartmentHeads(String position) {

    }
    //-------------- GETTERS, SETTERS, HASHCODDE, EQUALS --------------//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) &&
                Objects.equals(cif, company.cif) &&
                Arrays.equals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, cif);
        result = 31 * result + Arrays.hashCode(departments);
        return result;
    }

}
