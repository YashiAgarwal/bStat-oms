package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.OrderStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "orders")
public class Orders {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "purchaser_id")
    private String purchaserId;

    @Column(name = "bill_Id")
    private String billId;

    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "expected_delivery_date")
    private Date expectedDeliveryDate;

    @Column(name = "actual_delivery_date")
    private Date actualDeliveryDate;

    @Column(name = "offer_id")
    private String offerId;       //order level offers only

    @Column(name = "payment_id")
    private String paymentId;

    @Column(name = "order_amount")
    private double orderAmount;

    @Column(name = "worker_id")
    private String workerId;

    @Column(name = "comments")
    private String comments;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;
}
