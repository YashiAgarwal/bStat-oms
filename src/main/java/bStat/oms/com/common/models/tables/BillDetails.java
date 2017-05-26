package bStat.oms.com.common.models.tables;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Table(name = "bill_details")
public class BillDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "purchase_Id")
    private long purchaseId;

    @Column(name = "dated")
    private Date dated;

    @Column(name = "amount")
    private double amount;

    @Column(name = "comments")
    private String comments;

    @Column(name = "in_name_of")
    private String inNameOf;

    @Column(name = "address")
    private String address;

    @Column(name = "tax")
    private double tax;

    @Column(name = "packing_charges")
    private double packingCharges;

    @Column(name = "shipping_charges")
    private double shippingCharges;

    @Column(name = "discounts")
    private double discounts;

    @Column(name = "net_amount_to_pay")
    private long netAmountToPay;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public BillDetails() {
    }

    public BillDetails(long id, long purchaseId, Date createdOn, Date dated, Date updatedOn, int amount, String comments,
                       String inNameOf, String address, int tax, int packingCharges, int shippingCharges, int netAmountToPay,
                       int discounts) {
        this.id = id;
        this.purchaseId = purchaseId;
        this.createdOn = createdOn;
        this.dated = dated;
        this.updatedOn = updatedOn;
        this.amount = amount;
        this.comments = comments;
        this.inNameOf = inNameOf;
        this.address = address;
        this.tax = tax;
        this.packingCharges = packingCharges;
        this.shippingCharges = shippingCharges;
        this.netAmountToPay = netAmountToPay;
        this.discounts = discounts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getDated() {
        return dated;
    }

    public void setDated(Date dated) {
        this.dated = dated;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getInNameOf() {
        return inNameOf;
    }

    public void setInNameOf(String inNameOf) {
        this.inNameOf = inNameOf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPackingCharges() {
        return packingCharges;
    }

    public void setPackingCharges(double packingCharges) {
        this.packingCharges = packingCharges;
    }

    public double getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(double shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    public long getNetAmountToPay() {
        return netAmountToPay;
    }

    public void setNetAmountToPay(long netAmountToPay) {
        this.netAmountToPay = netAmountToPay;
    }

    public double getDiscounts() {
        return discounts;
    }

    public void setDiscounts(double discounts) {
        this.discounts = discounts;
    }
}
