package WorldPC.Service;

import WorldPC.Model.Computer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int idOrder;
    private final List<Computer> computerList;
    private static int orderCounter;

    public Order(){
        this.idOrder = ++orderCounter;
        computerList = new ArrayList<>();
    }
    public void addComputer(Computer computer){
        computerList.add(computer);
    }
    public void showOrder(){
        System.out.println("Order #: " + idOrder);
        System.out.println("Total computers: " + computerList.size());
        computerList.forEach(System.out::println);
    }
}
