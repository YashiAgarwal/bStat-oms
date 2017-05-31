package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.OrderItemStatus;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Table(name = "order_items")
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "product_Id")
    private long productId;

    @Column(name = "order_Id")
    private long orderId;

    @Column(name = "comments")
    private String comments;

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
    private long offerId;       //order item level offers only

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public OrderItems() {
    }

    public OrderItems(long id, long productId, Date createdOn, Date updatedOn, long orderId, String comments,
                      OrderItemStatus orderItemStatus, int quantity, int pricePerUnit, int pricePerUnitOfMeasurement,
                      long offerId) {
        this.id = id;
        this.productId = productId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.orderId = orderId;
        this.comments = comments;
        this.orderItemStatus = orderItemStatus;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.pricePerUnitOfMeasurement = pricePerUnitOfMeasurement;
        this.offerId = offerId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public OrderItemStatus getOrderItemStatus() {
        return orderItemStatus;
    }

    public void setOrderItemStatus(OrderItemStatus orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getPricePerUnitOfMeasurement() {
        return pricePerUnitOfMeasurement;
    }

    public void setPricePerUnitOfMeasurement(int pricePerUnitOfMeasurement) {
        this.pricePerUnitOfMeasurement = pricePerUnitOfMeasurement;
    }

    public long getOfferId() {
        return offerId;
    }

    public void setOfferId(long offerId) {
        this.offerId = offerId;
    }
}
