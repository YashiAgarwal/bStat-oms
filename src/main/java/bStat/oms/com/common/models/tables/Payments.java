package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.Flow;
import bStat.oms.com.common.enums.PartyType;
import bStat.oms.com.common.enums.PaymentMode;
import bStat.oms.com.common.enums.PaymentStatus;
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
@Table(name = "payments")
public class Payments {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "bill_number")
    private String billNumber;

    @Column(name = "party_id")
    private String partyId;       // can be purchaser id/seller id

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

    @Column(name = "transaction_number")
    private String transactionNumber;           //can be cheque number, draft, NB ref number, transaction id

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "order_amount")
    private double orderAmount;

    @Column(name = "amount_paid")
    private double amountPaid;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;
}
