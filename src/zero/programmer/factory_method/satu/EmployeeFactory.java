package zero.programmer.factory_method.satu;

public class EmployeeFactory {

    public Employee createManager(String name){
        return new Employee(name, "manager", 10000000);
    }

    public Employee createStaff(String name){
        return new Employee(name, "staff", 5000000);
    }

}
