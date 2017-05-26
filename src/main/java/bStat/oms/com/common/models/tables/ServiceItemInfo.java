package bStat.oms.com.common.models.tables;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 23-05-2017.
 */
@Entity
@Table(name = "service_item_info")
public class ServiceItemInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "order_id")
    private long orderId;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "title")
    private String title;

    @Column(name = "order_item_id")
    private long orderItemId;

    @Column(name = "worker_id")
    private long workerId;

    @Column(name = "description")
    private String description;

    @Column(name = "service_type")
    private String serviceType;

    @Column(name = "status")
    private String status;

    @Column(name = "address")
    private String address;

    @Column(name = "committed_by")
    private String committedby;

    @Column(name = "time_slot")
    private Time timeSlot;

    @Column(name = "days_left_to_deliver")
    private int daysLeftToDeliver;

    @Column(name = "price")
    private int price;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public ServiceItemInfo() {
    }

    public ServiceItemInfo(long id, long orderId, Date dueDate, String title, long orderItemId, long workerId,
                           String description, String serviceType, String status, String address, String committedby,
                           Time timeSlot, int daysLeftToDeliver, int price, Date createdOn, Date updatedOn) {
        this.id = id;
        this.orderId = orderId;
        this.dueDate = dueDate;
        this.title = title;
        this.orderItemId = orderItemId;
        this.workerId = workerId;
        this.description = description;
        this.serviceType = serviceType;
        this.status = status;
        this.address = address;
        this.committedby = committedby;
        this.timeSlot = timeSlot;
        this.daysLeftToDeliver = daysLeftToDeliver;
        this.price = price;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCommittedby() {
        return committedby;
    }

    public void setCommittedby(String committedby) {
        this.committedby = committedby;
    }

    public Time getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(Time timeSlot) {
        this.timeSlot = timeSlot;
    }

    public int getDaysLeftToDeliver() {
        return daysLeftToDeliver;
    }

    public void setDaysLeftToDeliver(int daysLeftToDeliver) {
        this.daysLeftToDeliver = daysLeftToDeliver;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
