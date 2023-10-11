package Shop;
import java.util.Comparator;

public class Product {
    private String title;
    private Integer cost;

    public Product(String title, Integer cost) {
        this.title = title;
        this.cost = cost;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}