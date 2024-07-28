package programmerzamannow.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.repository.CategoryRepository;

// belajar Setter-based Dependency Injection
@Component
public class CategoryService {
    @Getter
    private CategoryRepository categoryRepository;
    // disini kita tidak memakai constructor misalnya kita makai setter
    @Autowired  // otomatis dia akan diinject oleh springframework
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
