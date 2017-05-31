package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.Flow;
import bStat.oms.com.common.enums.PartyType;
import bStat.oms.com.common.enums.PaymentMode;
import bStat.oms.com.common.enums.PaymentStatus;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Table(name = "payments")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "order_id")
    private long order_id;

    @Column(name = "bill_number")
    private long bill_number;

    @Column(name = "referenceNumber")
    private long referenceNumber;           //can be cheque number, draft, NB ref number, transaction id

    @Column(name = "party_id")
    private long partyId;       // can be purchaser id/seller id

    @Column(name = "party_type")
    @Enumerated(EnumType.STRING)
    private PartyType party_type;        // purchaser / seller

    @Column(name = "flow")
    @Enumerated(EnumType.STRING)
    private Flow flow;      // Debit / credit

    @Column(name = "comments")
    private String comments;

    @Column(name = "payment_status")
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Column(name = "payment_mode")
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "total_amount_paid")
    private long totalAmountPaid;       //total amount paid till now for this order

    @Column(name = "order_amount")
    private double orderAmount;

    @Column(name = "amount_paid")
    private double amountPaid;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public Payments() {
    }

    public Payments(long id, long order_id, long bill_number, long referenceNumber, long partyId, PartyType party_type,
                    Flow flow, String comments, PaymentStatus paymentStatus, PaymentMode paymentMode,
                    Date paymentDate, long totalAmountPaid, long orderAmount, long amountPaid, Date createdOn,
                    Date updatedOn) {
        this.id = id;
        this.order_id = order_id;
        this.bill_number = bill_number;
        this.referenceNumber = referenceNumber;
        this.partyId = partyId;
        this.party_type = party_type;
        this.flow = flow;
        this.comments = comments;
        this.paymentStatus = paymentStatus;
        this.paymentMode = paymentMode;
        this.paymentDate = paymentDate;
        this.totalAmountPaid = totalAmountPaid;
        this.orderAmount = orderAmount;
        this.amountPaid = amountPaid;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public long getBill_number() {
        return bill_number;
    }

    public void setBill_number(long bill_number) {
        this.bill_number = bill_number;
    }

    public long getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(long referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public long getPartyId() {
        return partyId;
    }

    public void setPartyId(long partyId) {
        this.partyId = partyId;
    }

    public PartyType getParty_type() {
        return party_type;
    }

    public void setParty_type(PartyType party_type) {
        this.party_type = party_type;
    }

    public Flow getFlow() {
        return flow;
    }

    public void setFlow(Flow flow) {
        this.flow = flow;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public long getTotalAmountPaid() {
        return totalAmountPaid;
    }

    public void setTotalAmountPaid(long totalAmountPaid) {
        this.totalAmountPaid = totalAmountPaid;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(long amountPaid) {
        this.amountPaid = amountPaid;
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
}
