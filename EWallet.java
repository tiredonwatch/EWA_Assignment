import java.util.ArrayList;

public class EWallet{

    // Hmmm, this one's to add amount to the ArrayList.
    public static void addTransaction(ArrayList<Double> hold,double Amount){
        hold.add(Amount);
    }

    // it Totals all the transactions in the Arraylist. That's nice, Thank you function.
    public static double getTotalSpent(ArrayList<Double> hold){

        double amt = 0;
        for (int i=0; i<hold.size(); i++){
            amt += hold.get(i);
        }
        return amt;
    }

    // I know the complexity is O(n^2). I wonder how I can optimize it.
    public static double getLargestTransaction(ArrayList<Double> hold){
        double largest=0;
        for(int i=0; i<hold.size(); i++){
            largest = hold.get(i); 

            for (double var1 : hold){  //compares the values and sets largest accordingly.
                if (var1 > largest){
                    largest = var1;
                }
            }
        }

        return largest;
    }

    // Someone's printing all the transactions to the BUFFER!
    public static void printAllTransactions(ArrayList<Double> hold){

        for (double var2 : hold) {
            System.out.println(var2);
        }
    }

    // Can't believe I forgot what a threshold was. 😔
    public static void printAboveThreshold(ArrayList<Double> hold,double threshold)
    {
        double holder =0;
        System.out.println("Transactions greater than threshold are :");
        for (int i =0; i<hold.size(); i++){ //compares each transaction with the threshold. if greater then prints them
            holder = hold.get(i);

            if (holder > threshold){
                System.out.println(holder);
            }
        }
    }

    // this is the smallest function? oh nah, we got addTransaction on the TOP! (I mean its on the top)
    public static void refundLastTransaction(ArrayList<Double> hold){
        System.out.println("Refunded Value: ");
        System.out.println(hold.getLast());
        hold.remove(hold.size() -1); //removes the last transaction that occured.
    }

    // Compiler, here's the thing you're looking for! Oh wait you can't see this message right? lol
    public static void main(String[] args){

        ArrayList<Double> hold = new ArrayList<>();

        addTransaction(hold, 99.5); //sample transactions
        addTransaction(hold, 100.5);
        addTransaction(hold, 700.10);
        addTransaction(hold, 500.5);
        addTransaction(hold, 85.5);
        addTransaction(hold, 990.5);
        addTransaction(hold, 1000.0);
        addTransaction(hold, 450.5);
        addTransaction(hold, 670.0);
        addTransaction(hold, 270.5);

        System.out.println(" ");

        System.out.println("*** Transaction Total ***");
        System.out.println(" ");
        System.out.println("The Total Spent amount is: ");
        System.out.println(getTotalSpent(hold));

        System.out.println(" ");

        System.out.println("*** The Largest Transaction is ***");
        System.out.println(" ");
        System.out.println("Transaction Value: ");
        System.out.println(getLargestTransaction(hold));

        System.out.println(" ");
        System.out.println("*** All Transactions ***");
        System.out.println(" ");
        printAllTransactions(hold);

        System.out.println(" ");
        System.out.println("*** Maximum Threshold ***");
        System.out.println(" ");
        System.out.println("Threshold Value: 500.0");
        printAboveThreshold(hold, 500.0);

        System.out.println(" ");
        System.out.println("*** Refunded Transaction ***");
        System.out.println(" ");
        refundLastTransaction(hold);

        System.out.println(" ");
        System.out.println("Updated List after Refund: ");
        printAllTransactions(hold);
    }
}