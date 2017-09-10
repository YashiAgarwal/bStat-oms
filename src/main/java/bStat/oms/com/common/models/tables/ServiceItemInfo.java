package bStat.oms.com.common.models.tables;

import bStat.oms.com.common.enums.ServiceType;
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
@Table(name = "service_item_info")
public class ServiceItemInfo {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "expiry_date")
    private Date expiryDate;    //after which current service will get lapsed

    @Column(name = "title")
    private String title;

    @Column(name = "order_item_id")
    private String orderItemId;

    @Column(name = "worker_id")
    private String workerId;        //person assigned to do the service

    @Column(name = "description")
    private String description;

    @Column(name = "service_type")
    private ServiceType serviceType;

    @Column(name = "status")
    private String status;

    @Column(name = "address")
    private String address;

    @Column(name = "committed_by")
    private String committedBy;

    @Column(name = "time_slot")
    private String timeSlot;

    @Column(name = "days_left_to_deliver")
    private int daysLeftToDeliver;

    @Column(name = "price")
    private double price;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;
}
