package drugstore.entity;

import javax.persistence.*;

@Entity
@Table(name = "drugs", schema = "pharmacy")
public class Drug {

    private int id;
    private String name;
    private Provider provider;
    private Type type;
    private ActiveElement activeElement;

    public Drug() {}

    public Drug(Drug drug) {
        id = drug.getId();
        name = drug.getName();
        provider = drug.getProvider();
        type = drug.getType();
        activeElement = drug.getActiveElement();
    }

    public Drug(String name, int provider_id, int type_id, int activeElement_id) {
        this.name = name;
        this.provider = new Provider();
        this.provider.setId(provider_id);
        this.type = new Type();
        this.type.setId(type_id);
        this.activeElement = new ActiveElement();
        this.activeElement.setId(activeElement_id);
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "provider_id")
    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @ManyToOne
    @JoinColumn(name = "type_id")
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @ManyToOne
    @JoinColumn(name = "active_id")
    public ActiveElement getActiveElement() {
        return activeElement;
    }

    public void setActiveElement(ActiveElement activeElement) {
        this.activeElement = activeElement;
    }
}
