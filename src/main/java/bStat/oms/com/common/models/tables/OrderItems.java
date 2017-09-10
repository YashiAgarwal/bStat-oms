package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.OrderItemStatus;
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
@Table(name = "order_items")
public class OrderItems {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "product_Id")
    private String productId;

    @Column(name = "product_variation_id")
    private String productVariationId;

    @Column(name = "order_Id")
    private String orderId;

    @Column(name = "order_item_status")
    @Enumerated(EnumType.STRING)
    private OrderItemStatus orderItemStatus;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price_per_unit")
    private double pricePerUnit;

    @Column(name = "price_per_unit_of_measurement")
    private double pricePerUnitOfMeasurement;

    @Column(name = "offer_id")
    private String offerId;       //order item level offers only

    @Column(name = "comments")
    private String comments;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;
}
