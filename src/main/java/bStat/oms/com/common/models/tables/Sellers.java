package bStat.oms.com.common.models.tables;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Table(name = "sellers")
public class Sellers{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    private long sellerId;

    @Column(name = "email_id")
    private long emailId;

    @Column(name = "tin_number")
    private String tinNumber;

    @Column(name = "primary_person")
    private String primaryPerson;

    @Column(name = "seller_name")
    private String sellerName;

    @Column(name = "score")
    private double score;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "bank_id")
    private long bankId;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public Sellers() {
    }

    public Sellers(long sellerId, long emailId, Date createdOn, Date updatedOn, String tinNumber, String primaryPerson,
                   String sellerName, int score, String address, String phoneNumber, String description, long bankId,
                   String businessName) {
        this.sellerId = sellerId;
        this.emailId = emailId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.tinNumber = tinNumber;
        this.primaryPerson = primaryPerson;
        this.sellerName = sellerName;
        this.score = score;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.bankId = bankId;
        this.businessName = businessName;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public long getEmailId() {
        return emailId;
    }

    public void setEmailId(long emailId) {
        this.emailId = emailId;
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

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public String getPrimaryPerson() {
        return primaryPerson;
    }

    public void setPrimaryPerson(String primaryPerson) {
        this.primaryPerson = primaryPerson;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getBankId() {
        return bankId;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
}
