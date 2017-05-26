package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.OfferLevel;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Table(name = "offers")
public class Offers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "start_date")
    private Date startDate;     //start date of offer period

    @Column(name = "end_date")
    private Date endDate;       //end date of offer period

    @Column(name = "offer_name")
    private String offerName;

    @Column(name = "offer_code")
    private String offerCode;

    @Column(name = "description")
    private String description;

    @Column(name = "formula")
    private int formula;

    @Column(name = "offer_level")
    @Enumerated(EnumType.STRING)
    private OfferLevel offer_level;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public Offers() {
    }

    public Offers(long id, Date startDate, Date endDate, String offerName, String offerCode, String description,
                  int formula, OfferLevel offer_level, Date createdOn, Date updatedOn) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.offerName = offerName;
        this.offerCode = offerCode;
        this.description = description;
        this.formula = formula;
        this.offer_level = offer_level;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferCode() {
        return offerCode;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFormula() {
        return formula;
    }

    public void setFormula(int formula) {
        this.formula = formula;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public OfferLevel getOffer_level() {
        return offer_level;
    }

    public void setOffer_level(OfferLevel offer_level) {
        this.offer_level = offer_level;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
