package drugstore.entity;

import javax.persistence.*;

@Entity
@Table(name = "provider", schema = "pharmacy")
public class Provider {
    private int id;
    private String brand;

    public Provider() {}

    public Provider(Provider provider) {
        id = provider.getId();
        brand = provider.getBrand();
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
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
