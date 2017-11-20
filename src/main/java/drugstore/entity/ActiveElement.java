package drugstore.entity;

import javax.persistence.*;

@Entity
@Table(name = "activeelement", schema = "pharmacy")
public class ActiveElement {

    private int id;
    private String activeelement;

    public ActiveElement() {}

    public ActiveElement(ActiveElement activeElement) {
        id = activeElement.getId();
        activeelement = activeElement.getActiveelement();
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
    @Column(name = "activeelement")
    public String getActiveelement() {
        return activeelement;
    }

    public void setActiveelement(String activeelement) {
        this.activeelement = activeelement;
    }
}
