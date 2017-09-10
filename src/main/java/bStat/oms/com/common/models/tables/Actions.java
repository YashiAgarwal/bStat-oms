package bStat.oms.com.common.models.tables;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "TNC")
public class Actions {

    @Id
    @Column(name = "id")
    private String id;

    @JsonProperty("parameter")
    private String parameter;

    @JsonProperty("operator")
    private String operator;

    @JsonProperty("value")
    private String value;
}