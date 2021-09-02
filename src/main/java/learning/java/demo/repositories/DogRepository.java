package learning.java.demo.repositories;

import learning.java.demo.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;



public interface DogRepository extends JpaRepository<Dog, Integer>{
    
}
