package practice4.problem2;

public class Restaurant {
    boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Person) {
            // process payment
            System.out.println("Processing payment");
        }
        return true;
    }
}
