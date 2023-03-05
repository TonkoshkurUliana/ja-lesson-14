import java.util.HashSet;
import java.util.Set;

public class Card {
    private Integer id;
    private Integer total;
    private String name;
    private Set<Item> items = new HashSet<Item>();

    public Card(Integer total, String name) {
        this.total = total;
        this.name = name;
    }

    public Card() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", total=" + total +
                ", name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
