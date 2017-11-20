package drugstore.entity;

import javax.persistence.*;

@Entity
@Table(name = "type_of_drugs", schema = "pharmacy")
public class Type {

    private int id;
    private String type;

    public Type() {}

    public Type(Type type) {
        this.id = type.getId();
        this.type = type.getType();
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
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
