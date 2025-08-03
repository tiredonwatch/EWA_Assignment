import java.util.LinkedList;

public class SupportQueue {

    // function to addCustomers to the queue.
    public static void addCustomer(LinkedList<String> customer, String name){
        customer.add(name);
    }

    //serves a customer and prints their name.
    public static String serveCustomer(LinkedList<String> customer){
        String served = customer.poll(); //poll command pops the head/first customer
        System.out.print("Served Customer: ");
        return served;
    }

    // peeking the next customer in line.
    public static String peekNextCustomer(LinkedList<String> customer){
        System.out.println("The Next in line Customer is: ");
        String peeked =customer.peek(); //it only peeks the head of the list
        // so once a customer is served, the next in line automatically becomes the head.

        return peeked;
    }

    //prints the queue.
    public static void printQueue(LinkedList<String> customer){
        System.out.println("Queue of Customers: ");
        for(String names: customer){
            System.out.println(names);
        }
    }

    //for prioritized customers. puts them on the top.
    public static void prioritizeCustomer(LinkedList<String> customer, String priname){
        System.out.println("Prioritized Customer: ");
        customer.addFirst(priname);
    }

    //adds the served customer back, but at last.
    public static void reAddCustomerToEnd(LinkedList<String> customer, String rename){
        System.out.println("Re Adding Customer to last: ");
        customer.addLast(rename);
        System.out.println(customer.getLast());
    }
    public static void main(String[] args){

        LinkedList<String> customer = new LinkedList<>(); //linkedlist for storing customer names

        addCustomer(customer, "Sam"); //adding customers.
        addCustomer(customer, "James");
        addCustomer(customer, "Daniel");
        addCustomer(customer, "Arthur");
        addCustomer(customer, "Jacob");
        addCustomer(customer, "William");

        System.out.println(" ");
        printQueue(customer);
        System.out.println(" ");

        System.out.println("*** Serving Customers ***");
        for (int i=1; i<4; i++){    // invoking serve customer 3 times to serve 3 customers.
            System.out.println(serveCustomer(customer));
            System.out.println(peekNextCustomer(customer)); //peeking next in line customers alongside.
            System.out.println(" ");

        }
        System.out.println(" ");

        System.out.println("*** Remaining Customers ***");
        System.out.println(" ");
        printQueue(customer); //prints the updated queue for remaining customers.
        System.out.println("");

        System.out.println("*** Prioritizing Customer ***");
        System.out.println(" ");
        prioritizeCustomer(customer, "Tobias"); //prioritizing a customer and putting them on top
        System.out.println(customer.peek()); 
        System.out.println(" ");

        System.out.println("*** Updated List! ***");
        System.out.println(" ");
        printQueue(customer);
        System.out.println(" ");


        reAddCustomerToEnd(customer, "James"); // adds the served customer to last.
        System.out.println(" ");

        printQueue(customer); //prints the updated queue
        System.out.println(" ");
    }
}
