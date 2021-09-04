package learning.java.demo.controllers;

import java.util.List;
import java.util.Optional;

import learning.java.demo.entity.Dog;
import learning.java.demo.repositories.DogRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dogcontroller {
    public DogRepository Dogs;

    public Dogcontroller(DogRepository Dogs){
        this.Dogs = Dogs;
    }
    @GetMapping("/dogs")
    @CrossOrigin // enable cors
    public List<Dog> index(){
        return Dogs.findAll();
    }
    // SHOW ROUTE
    @CrossOrigin // enable cors
    @GetMapping("/dog/{id}")
    public Optional<Dog> show(@PathVariable  Integer id){
        return Dogs.findById(id);
    }
    // CREATE ROUTE
    @CrossOrigin // enable cors
    @PostMapping("/dogs")
    public List<Dog> create(@RequestBody  Dog newDog){
        Dogs.save(newDog); // creating the dog 
        return Dogs.findAll();
    }
    //EDIT ROUT
    @CrossOrigin // enable cors
    @PutMapping("/dog/{id}")
    public List<Dog> update(@RequestBody Dog fixDog, @PathVariable Integer id){
        // find dog by its id then user map to updated it 
        Dogs.findById(id).map(dog ->{
            dog.setReport(fixDog.getReport());
            dog.setName(fixDog.getName());
            dog.setAge(fixDog.getAge());
            dog.setBreed(fixDog.getBreed());
            dog.setImage(fixDog.getImage());
            dog.setFur(fixDog.getFur());
            dog.setEars(fixDog.getEars());
            dog.setSize(fixDog.getSize());
            dog.setColor(fixDog.getColor());
            dog.setNeutured(fixDog.getNeutured());
            dog.setGender(fixDog.getGender());
            dog.setLocation(fixDog.getLocation());
            dog.setDate(fixDog.getDate());
            Dogs.save(dog);
            return dog;
        })
        .orElseGet(()->{
            return Dogs.save(fixDog);
        });

        return Dogs.findAll();
    }
    //DELETE ROUTE
    @CrossOrigin // enable cors
    @DeleteMapping("/dog/{id}")
    public List<Dog> destroy(@PathVariable Integer id){
        Dogs.deleteById(id);
        return Dogs.findAll();
    }
}
