package person;

import common.Position;
import order.Order;

import java.util.List;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 12:33
 */
public class Courier extends Person{
    private boolean isAvailable;
    private Position currentPosition;
    private Partner partner;
    private List<DeliveryPointEvent> deliveryPointEvents;
    private List<Order> orders;

}
