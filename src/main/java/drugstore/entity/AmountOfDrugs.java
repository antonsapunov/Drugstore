package drugstore.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


//@Entity
//@Table(name = "amount_of_drugs", schema = "pharmacy")
public class AmountOfDrugs {

    private int drugstoreId;
    private int drugId;
    private int count;
    private double price;


    public AmountOfDrugs(AmountOfDrugs amountOfDrugs) {
        this.drugstoreId = amountOfDrugs.getDrugstoreId();
        this.drugId = amountOfDrugs.getDrugId();
        this.count = amountOfDrugs.getCount();
        this.price = amountOfDrugs.getPrice();
    }

    public int getDrugstoreId() {
        return drugstoreId;
    }

    public void setDrugstoreId(int drugstoreId) {
        this.drugstoreId = drugstoreId;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
