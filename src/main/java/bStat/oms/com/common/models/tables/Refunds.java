package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.RefundReason;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Table(name = "refunds")
public class Refunds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refund_id")
    private long refundId;

    @Column(name = "order_id")
    private long orderId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "refund_mode")
    private String refundMode;      //todo can make enum

    @Column(name = "refund_amount")
    private int refundAmount;

    @Column(name = "refund_reason")
    @Enumerated(EnumType.STRING)
    private RefundReason refundReason;

    @Column(name = "comments")
    private String comments;        //return OR cancel OR TOA

    @Column(name = "remark")
    private String remark;

    @Column(name = "order_item_id")
    private long orderItemId;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public Refunds() {
    }

    public Refunds(long refundId, long orderId, Date createdOn, Date updatedOn, int quantity, String refundMode,
                   int refundAmount, RefundReason refundReason, String comments, String remark, long orderItemId) {
        this.refundId = refundId;
        this.orderId = orderId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.quantity = quantity;
        this.refundMode = refundMode;
        this.refundAmount = refundAmount;
        this.refundReason = refundReason;
        this.comments = comments;
        this.remark = remark;
        this.orderItemId = orderItemId;
    }

    public long getRefundId() {
        return refundId;
    }

    public void setRefundId(long refundId) {
        this.refundId = refundId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRefundMode() {
        return refundMode;
    }

    public void setRefundMode(String refundMode) {
        this.refundMode = refundMode;
    }

    public int getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(int refundAmount) {
        this.refundAmount = refundAmount;
    }

    public RefundReason getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(RefundReason refundReason) {
        this.refundReason = refundReason;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(long orderItemId) {
        this.orderItemId = orderItemId;
    }
}
