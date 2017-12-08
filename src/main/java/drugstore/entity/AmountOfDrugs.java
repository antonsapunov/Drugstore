package drugstore.entity;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "amount_of_drugs", schema = "pharmacy")
public class AmountOfDrugs {
    @EmbeddedId
    private AmountOfDrugsPK id;

    @ManyToOne
    @MapsId("drugstoreId")
    private Drugstore drugstore;

    @ManyToOne
    @MapsId("drugId")
    private Drug drug;

    private short count;
    private BigDecimal price;

    public AmountOfDrugs() {}

    public AmountOfDrugs(AmountOfDrugs amountOfDrugs) {
        this.drugstore = amountOfDrugs.getDrugstore();
        this.drug = amountOfDrugs.getDrug();
        this.count = amountOfDrugs.getCount();
        this.price = amountOfDrugs.getPrice();
    }

    public AmountOfDrugs(Drugstore drugstore, Drug drug, short count, BigDecimal price) {
        this.drugstore = drugstore;
        this.drug = drug;
        this.count = count;
        this.price = price;
    }

    public Drugstore getDrugstore() {
        return drugstore;
    }

    public void setDrugstore(Drugstore drugstore) {
        this.drugstore = drugstore;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    @Basic
    @Column(name = "count")
    public short getCount() {
        return count;
    }

    public void setCount(short count) {
        this.count = count;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
