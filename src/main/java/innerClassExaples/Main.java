package innerClassExaples;

public class Main {

    public static void main(String[] args) {
        User user = new User();

        User.Manager manager = user.new Manager("Zino", 4_302_334D);
        System.out.println("Manager salary is "+ manager.getSalary());

        User.Supervisor supervisor = new User.Supervisor();
        supervisor.name = "Someone";

        User.Customer customer = user.new Customer();
        customer.name = "Zino2";
    }
}

