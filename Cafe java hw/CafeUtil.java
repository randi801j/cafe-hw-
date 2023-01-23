import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {
    public int getStreakGoal(){
        int sum=0;
        for (int i=1;i<=10;i++){
            sum = sum +i;

        }
        return sum; 
    }
    public double getOrderTotal(double[] prices){
        double all= 0;
        for( int i = 0; i < prices.length; i++){
            all= all+prices[i];
        }
        return all;
    }
    public void displayMenu(ArrayList<String> menuItems){
        //String name = myArray.get(0); // to access an element in an ArrayList using an index
        for (int i = 0;1< menuItems.size();i++){
            System.out.printf ("%s %s",i, menuItems.get(i));
        }
    public void addCustomer(ArrayList<String> customers){
        System.out.println ("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello!"+userName);
        System.out.println("There are %s people infront of you."+ customers.size());
        customers.add(userName);
    }
}
