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
@Table(name = "purchaser_customer")
public class Purchaser_Customer {

    @Id
    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "tin_number")
    private String tinNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "bank_details")
    private String bankDetails;

    @Column(name = "primary_person")
    private String primaryPerson;

    @Column(name = "address_id")
    private String addressId;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "proprietor_name")
    private String proprietorName;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "score")
    private int score;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;
}
