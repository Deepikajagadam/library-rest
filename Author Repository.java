package com.dxc.learning.Repository;

public class Author Repository {

    import com.springboot.demo.model.Author;
    
    import org.springframework.data.jpa.repository.JpaRepository;
    
    public interface AuthorRepository extends JpaRepository<Author , Integer> {
        
    }  
}
