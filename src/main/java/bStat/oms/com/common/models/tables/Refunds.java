package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.RefundReason;
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
@Table(name = "refunds")
public class Refunds {  //Returns / Cancellations

    @Id
    @Column(name = "refund_id")
    private String refundId;

    @Column(name = "refund_amount")
    private double refundAmount;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_id")
    private String orderItemId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "refund_mode")
    private String refundMode;      //todo can make enum

    @Column(name = "refund_reason")
    @Enumerated(EnumType.STRING)
    private RefundReason refundReason;

    @Column(name = "payment_id")
    private String paymentId;

    @Column(name = "remark")
    private String remark;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;
}
