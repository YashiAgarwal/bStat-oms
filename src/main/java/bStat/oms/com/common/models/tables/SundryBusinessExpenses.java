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
@Table(name = "sundry_business_expenses")
public class SundryBusinessExpenses {

    @Id
    @Column(name = "id")
    private String id;

    @JsonProperty("expense_name")
    private String expenseName;

    @JsonProperty("expenseType")
    private String expenseType;

    @JsonProperty("amount")
    private double amount;

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("unit_of_quantity")
    private String unitOfQuantity;

    @JsonProperty("created_on")
    private Date createdOn;

    @JsonProperty("modified_on")
    private Date modifiedOn;
}
