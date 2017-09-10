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
@Table(name = "TNC")
public class TNC {

    @Id
    @Column(name = "id")
    private String id;

    @JsonProperty("parameter")
    private String parameter;

    @JsonProperty("comparator")
    private String comparator;

    @JsonProperty("value")
    private String value;
}
