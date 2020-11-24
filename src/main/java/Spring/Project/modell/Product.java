package Spring.Project.modell;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
/** simple Java Bean domain object that represents Product**/
@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Product extends BaseEntity {

    private String title;
    private String name;
    private String price;

    public Product() {

    }
}
