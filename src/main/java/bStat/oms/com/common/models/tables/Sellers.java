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
@Table(name = "sellers")
public class Sellers{

    @Id
    @Column(name = "seller_id")
    private String sellerId;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "tin_number")
    private String tinNumber;

    @Column(name = "primary_person")
    private String primaryPerson;

    @Column(name = "seller_name")
    private String sellerName;

    @Column(name = "score")
    private double score;

    @Column(name = "address_id")
    private String addressId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "bank_id")
    private String bankId;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;
}
