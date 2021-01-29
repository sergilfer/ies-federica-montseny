package empresa;

public interface ICompany {
    void showNameOfDepartments();
    Employee[] getEmployeesDepartment(String departmentName);
    void showEmployeesDepartment(String departmentName);
    void showAllEmployees();
    void showAllDepartmentHeads(String position);
    void getDirectorDepartment(String departmentName, String position);
    void getAllDepartmentHeads(String position);
}
