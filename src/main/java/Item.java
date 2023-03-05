import java.util.HashSet;
import java.util.Set;


public class Item {
   private Integer id;
   private Integer total;
   private Set<Card> carts = new HashSet<Card>();

   public Item( Integer total) {
      this.total = total;
   }

   public Item() {

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

   public Set<Card> getCarts() {
      return carts;
   }

   public void setCarts(Set<Card> carts) {
      this.carts = carts;
   }

   @Override
   public String toString() {
      return "Item{" +
              "id=" + id +
              ", total=" + total +
              ", carts=" + carts +
              '}';
   }

}
