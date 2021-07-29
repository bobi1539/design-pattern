package zero.programmer.factory_method.satu;

public class FactoryApp {

    public static void main(String[] args) {

        Employee manager1 = new EmployeeFactory().createManager("ucup");
        System.out.println(manager1.getName());
        System.out.println(manager1.getTitle());
        System.out.println(manager1.getSalary());

        System.out.println("----------");
        Employee manager2 = new EmployeeFactory().createManager("tono");
        Employee staff1 = new EmployeeFactory().createStaff("mario");
        System.out.println(staff1.getName());
        System.out.println(staff1.getTitle());
        System.out.println(staff1.getSalary());

    }

}
