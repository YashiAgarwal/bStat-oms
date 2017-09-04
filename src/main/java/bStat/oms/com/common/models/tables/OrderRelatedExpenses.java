package bStat.oms.com.common.models.tables;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "order_related_expenses")
public class OrderRelatedExpenses {

    @Id
    @Column(name = "id")
    private String id;

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("order_item_id")
    private String orderItemId;

    @JsonProperty("expense_type")   //like shipping, pickup, transaction fee etc.
    private String expenseType;

    @JsonProperty("amount")
    private double amount;

    @JsonProperty("description")
    private String description;

    @JsonProperty("created_on")
    private Date createdOn;

    @JsonProperty("modified_on")
    private Date modifiedOn;
}
