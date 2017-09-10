package bStat.oms.com.common.models.tables;

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
@Table(name = "bill_details")
public class InvoiceDetails {

    @Id
    @Column(name = "id")
    private String id;      //Invoice number

    @Column(name = "purchaser_Id")
    private String purchaserId;

    @Column(name = "dated")
    private Date dated;

    @Column(name = "amount")
    private double amount;

    @Column(name = "comments")
    private String comments;

    @Column(name = "in_name_of")
    private String inNameOf;

    @Column(name = "address_id")
    private String addressId;

    @Column(name = "tax")       //TODO
    private double tax;

    @Column(name = "packing_charges")
    private double packingCharges;

    @Column(name = "shipping_charges")
    private double shippingCharges;

    @Column(name = "discounts")
    private double discounts;       //Calculated from offers applied

    @Column(name = "net_amount_to_pay")
    private double netAmountToPay;

    @Column(name = "status")
    private double status;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;
}
