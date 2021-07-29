package zero.programmer.singleton;

public class SingletonApp {
    public static void main(String[] args){

        OrderService orderService = new OrderService();
        orderService.save("0001");

        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save("0001", "Indomie");
        orderDetailService.save("0001", "Bakso");
        orderDetailService.save("0001", "Susu Sapi");


    }
}
