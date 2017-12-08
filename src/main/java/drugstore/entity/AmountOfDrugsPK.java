package drugstore.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AmountOfDrugsPK implements Serializable {
    private int drugstoreId;
    private int drugId;

    @Column(name = "drugstore_id")
    @Id
    public int getDrugstoreId() {
        return drugstoreId;
    }

    public void setDrugstoreId(int drugstoreId) {
        this.drugstoreId = drugstoreId;
    }

    @Column(name = "drug_id")
    @Id
    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AmountOfDrugsPK that = (AmountOfDrugsPK) o;
        return drugstoreId == that.drugstoreId &&
                drugId == that.drugId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(drugstoreId, drugId);
    }
}
