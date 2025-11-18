package HW2Problem2_Paulino;

import java.util.ArrayList;
import static HW2Problem2_Paulino.Customer.customers;

public class BlackFridayDeals {
    //notify all subscribed customers
    public void notifyCustomers(ArrayList<Customer> SubscriberList, String deal){
        //for each customer in general customer list notify
        for(Customer customer: customers){
            customer.recieveNotification(SubscriberList, deal);
        }
    }

}
