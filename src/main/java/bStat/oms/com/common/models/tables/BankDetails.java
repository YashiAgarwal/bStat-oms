package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.AccountHolderType;
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
@Table(name = "bank_details")
public class BankDetails {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "account_holder_id")
    private String accountHolderId;   // here it will be seller/customer id

    @Column(name = "account_holder_type")
    @Enumerated(EnumType.STRING)
    private AccountHolderType accountHolderType;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "IFSC_code")
    private String IFSCCode;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "branch_city")
    private String branchCity;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;
}
