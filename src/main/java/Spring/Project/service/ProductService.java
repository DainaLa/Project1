package Spring.Project.service;

import Spring.Project.modell.Product;
import Spring.Project.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product get(Long id) {
        log.info("IN ProductServiceImpl getById{}, id");
        return (Product) productRepository.findById(id).get();
    }

    public void save(Product product) {
        log.info("IN ProductServiceImpl save{}, product");
        productRepository.save(product);
    }

    public void delete(Long id) {
        log.info("IN ProductServiceImpl delete{}, id");
        productRepository.deleteById(id);
    }

    public List<Product> ListAll() {
        log.info("IN ProductServiceImpl getAll");
        return (List<Product>) productRepository.findAll();
    }

}
