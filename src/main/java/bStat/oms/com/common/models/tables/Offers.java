package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.OfferType;
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
@Table(name = "offers")
public class Offers {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "offer_type")
    @Enumerated(EnumType.STRING)
    private OfferType offerType;

    @Column(name = "start_date")
    private Date startDate;     //start date of offer period, can be null

    @Column(name = "end_date")
    private Date endDate;       //end date of offer period, can be null

    @Column(name = "offer_name")
    private String offerName;

    @Column(name = "tnc_id")
    private String tnCId;

    @Column(name = "action_id")
    private String actionId;

    @Column(name = "product_id")
    private String productId;       //if offerType is PRODUCT

    @Column(name = "offer_code")
    private String offerCode;

    @Column(name = "description")
    private String description;

    @Column(name = "ask_before_apply")
    private boolean askBeforeApply;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;
}
