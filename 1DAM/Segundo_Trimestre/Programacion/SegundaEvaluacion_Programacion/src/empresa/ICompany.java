package empresa;

public interface ICompany {
    void showNameOfDepartments();
    Employee[] getEmployeesDepartment(String departmentName);
    void showEmployeesDepartment(String departmentName);
    void showAllEmployees();
    void showAllDepartmentHeads(String position);
    Employee getDirectorDepartment(String departmentName, String position);
    Employee[] getAllDepartmentHeads(String position);
}
