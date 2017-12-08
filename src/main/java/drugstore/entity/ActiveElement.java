package drugstore.entity;

import javax.persistence.*;

@Entity
@Table(name = "activeelement", schema = "pharmacy")
public class ActiveElement {

    private int id;
    private String activeElement;

    public ActiveElement() {}

    public ActiveElement(ActiveElement activeElement) {
        this.id = activeElement.getId();
        this.activeElement = activeElement.getActiveElement();
    }

    public ActiveElement(String activeElement) {
        this.activeElement = activeElement;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "activeelement")
    public String getActiveElement() {
        return activeElement;
    }

    public void setActiveElement(String activeElement) {
        this.activeElement = activeElement;
    }
}
