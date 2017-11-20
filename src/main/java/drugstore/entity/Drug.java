package drugstore.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "drugs", schema = "pharmacy")
public class Drug {

    private int id;
    private String name;
//    private Provider provider;
    private int providerId;
    private int typeId;
    private int activeId;
    private double price;
    private Date dateOfProduction;
    private Date expiryDate;

    public Drug() {}

    public Drug(Drug drug) {
        id = drug.getId();
        name = drug.getName();
        providerId = drug.getProviderId();
//        provider = drug.getProvider();
        typeId = drug.getTypeId();
        activeId = drug.getActiveId();
        price = drug.getPrice();
        dateOfProduction = drug.getDateOfProduction();
        expiryDate = drug.getExpiryDate();
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "provider_id")
    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    @Basic
    @Column(name = "type_id")
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "active_id")
    public int getActiveId() {
        return activeId;
    }

    public void setActiveId(int activeId) {
        this.activeId = activeId;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "date_of_production")
    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    @Basic
    @Column(name = "expiry_date")
    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }


//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "provider",
//            joinColumns = @JoinColumn(name = "brand")
//    )
//    public Provider getProvider() {
//        return provider;
//    }
//
//    public void setProvider(Provider provider) {
//        this.provider = provider;
//    }

}
