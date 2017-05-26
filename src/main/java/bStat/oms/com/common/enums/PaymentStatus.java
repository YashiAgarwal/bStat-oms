package bStat.oms.com.common.enums;

/**
 * Created by Yashi Agarwal on 24-05-2017.
 */
public enum PaymentStatus {
    PENDING, // The payment is pending. Can add pending reason too
    PARTIALLY_COMPLETED,
    COMPLETED, //The payment has been completed, and the funds have been added successfully to your account balance.
    DENIED, // You denied the payment. This happens only if the payment was previously pending because of possible reasons described for the pending_reason variable or the Fraud_Management_Filters_x variable.
    EXPIRED, // This authorization has expired and cannot be captured.
    FAILED, // The payment has failed. This happens only if the payment was made from your customer’s bank account.
    REFUNDED,  //You refunded the payment.
    REVERED, // A payment was reversed due to a chargeback or other type of reversal. The funds have been removed from your account balance and returned to the buyer.
    PROCESSED, // A payment has been accepted.
    VOIDED, // This authorization has been voided.
    CANCELLED_REVERSAL, //: A reversal has been canceled. For example, you won a dispute with the customer, and the funds for the transaction that was reversed have been returned to you.
}
