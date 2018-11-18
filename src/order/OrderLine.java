package order;

import restaurant.Dish;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 13:35
 */


public class OrderLine {

    private int quantity;
    private String remark;

    private Dish dish;
    private Order order;


    public OrderLine(int quantity, Dish dish, Order order) {
        this(quantity, dish, order, "");
    }

    public OrderLine(int quantity, Dish dish, Order order, String remark) {
        this.quantity = quantity;
        this.remark = remark;
        this.dish = dish;
        this.order = order;
    }


    public Dish getDish() {
        return dish;
    }

}
