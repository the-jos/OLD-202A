package order;

import person.DeliveryPointEvent;

import java.time.LocalDateTime;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 13:34
 */
public class OrderStateEvent {
    private LocalDateTime time;
    private OrderState state;
    private String remark;

    private DeliveryPointEvent deliveryPointEvent; // NULLABLE
}
