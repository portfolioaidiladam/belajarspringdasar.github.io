package programmerzamannow.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.repository.ProductRepository;

// belajar Component
/*@Scope("prototype")
@Lazy  */
@Component
public class ProductService {
    // belajar Constructor-based Dependency Injection
    @Getter
    private ProductRepository productRepository;

    // ingin secara otomatis di inject maka kita bikin Constructornya
    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    // gimana kalau ada dua konstruktor?
    public ProductService(ProductRepository productRepository, String name){
        this.productRepository = productRepository;
    }
}
