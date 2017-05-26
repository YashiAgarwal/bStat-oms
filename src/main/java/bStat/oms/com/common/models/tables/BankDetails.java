package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.AccountHolderType;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Table(name = "bank_details")
public class BankDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "account_holder_id")
    private long accountHolderId;

    @Column(name = "account_holder_type")
    @Enumerated(EnumType.STRING)
    private AccountHolderType accountHolderType;

    @Column(name = "account_name")
    private long accountName;

    @Column(name = "account_number")
    private long accountNumber;

    @Column(name = "IFSC_code")
    private long IFSCCode;

    @Column(name = "branch_name")
    private long branchName;

    @Column(name = "branch_city")
    private long branchCity;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public BankDetails() {
    }

    public BankDetails(long id, long accountHolderId, AccountHolderType accountHolderType, long accountName,
                       long accountNumber, long IFSCCode, long branchName, long branchCity, Date createdOn, Date updatedOn) {
        this.id = id;
        this.accountHolderId = accountHolderId;
        this.accountHolderType = accountHolderType;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.IFSCCode = IFSCCode;
        this.branchName = branchName;
        this.branchCity = branchCity;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccountHolderId() {
        return accountHolderId;
    }

    public void setAccountHolderId(long accountHolderId) {
        this.accountHolderId = accountHolderId;
    }

    public AccountHolderType getAccountHolderType() {
        return accountHolderType;
    }

    public void setAccountHolderType(AccountHolderType accountHolderType) {
        this.accountHolderType = accountHolderType;
    }

    public long getAccountName() {
        return accountName;
    }

    public void setAccountName(long accountName) {
        this.accountName = accountName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(long IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    public long getBranchName() {
        return branchName;
    }

    public void setBranchName(long branchName) {
        this.branchName = branchName;
    }

    public long getBranchCity() {
        return branchCity;
    }

    public void setBranchCity(long branchCity) {
        this.branchCity = branchCity;
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
