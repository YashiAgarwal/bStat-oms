package bStat.oms.com.common.models.tables;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Table(name = "purchaser_customer")
public class Purchaser_Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long customerId;

    @Column(name = "email_id")
    private long emailId;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    @Column(name = "tin_number")
    private int tinNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "bank-details")
    private String bankDetails;

    @Column(name = "primary_person")
    private String primaryPerson;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "proprieter_name")
    private String proprieterName;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "score")
    private int score;

    public Purchaser_Customer() {
    }

    public Purchaser_Customer(long customerId, long emailId, Date createdOn, Date updatedOn, int tinNumber, String description,
                              String bankDetails, String primaryPerson, String address, int phoneNumber, String proprieterName,
                              String companyName, int score) {
        this.customerId = customerId;
        this.emailId = emailId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.tinNumber = tinNumber;
        this.description = description;
        this.bankDetails = bankDetails;
        this.primaryPerson = primaryPerson;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.proprieterName = proprieterName;
        this.companyName = companyName;
        this.score = score;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
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

    public int getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(int tinNumber) {
        this.tinNumber = tinNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getPrimaryPerson() {
        return primaryPerson;
    }

    public void setPrimaryPerson(String primaryPerson) {
        this.primaryPerson = primaryPerson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProprieterName() {
        return proprieterName;
    }

    public void setProprieterName(String proprieterName) {
        this.proprieterName = proprieterName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
