package drugstore.entity;

import javax.persistence.*;

@Entity
@Table(name = "drugstores", schema = "pharmacy")
public class Drugstore {

    private int id;
    private String drugstore;
    private String address;
    private String phoneNumber;
    private String workingHours;

    public Drugstore() {}

    public Drugstore(Drugstore drugstore) {
        this.id = drugstore.getId();
        this.drugstore = drugstore.getDrugstore();
        this.address = drugstore.getAddress();
        this.phoneNumber = drugstore.getPhoneNumber();
        this.workingHours = drugstore.getWorkingHours();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "drugstore")
    public String getDrugstore() {
        return drugstore;
    }

    public void setDrugstore(String drugstore) {
        this.drugstore = drugstore;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "working_hours")
    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

}
