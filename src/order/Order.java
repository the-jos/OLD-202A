package order;

import common.Address;
import common.Position;
import external.standaardAlgoritme;
import payment.DirectPayment;
import payment.TransferPayment;
import person.Courier;
import person.Customer;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 12:57
 */
public class Order {
    private int orderId;
    private Address deliveryAddress;
    private String deliveryInstructions;
    private int averageDeliveryPoints;

    private List<OrderLine> orderLines;
    private Customer customer;
    private Courier courier;
    private List<OrderStateEvent> orderStateEvents;
    private TransferPayment restaurantPayment; // NULLABLE
    private DirectPayment customerPayment; // NULLABLE



// TODO: METHODE geefBeschikbareLeveringen VERPLAATSEN NAAR REPOSITORY KLASSE
    public List<Order> geefBeschikbareLeveringen(Position position){

        List<Order> OrderRepositoryDieNogNietBestaat = new ArrayList<>(); // delete this later, dit zou repository moeten zijn

        List<Order> beschikbareLeveringen = new ArrayList<>();
        for (Order order: OrderRepositoryDieNogNietBestaat
             ) {
            if (order.orderStateEvents.size() == 1
                    && order.orderStateEvents.get(0).equals(OrderState.ORDER_PLACED)){

                float afstand = standaardAlgoritme.berekenAfstand(position, order.orderLines.get(0).getDish().getRestaurant().getContactInfo().getAddress().getPosition());
                int afstandInTijd = (int) Math.floor((double)(afstand * 4));

                // gerecht met langste bereidingstijd moet kleiner dan afstand in tijd
                boolean opTijdAfhaalbaar = (orderLines.stream()
                        .mapToInt(ol -> ol.getDish().getProductionTime()).max().getAsInt()
                         > afstandInTijd);

                if (opTijdAfhaalbaar) beschikbareLeveringen.add(order);
            }
        }
        return beschikbareLeveringen;
    }




}
