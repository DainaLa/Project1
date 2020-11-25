package Spring.Project.repository;


import Spring.Project.modell.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**Repository interface for {@link Product} class.**/
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {


}
