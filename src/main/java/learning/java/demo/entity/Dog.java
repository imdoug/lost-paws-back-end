package learning.java.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog{

    //**************************************** */
    //  Entity Properties
    //**************************************** */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String name;

    public Integer age;

    public String breed;

    public String image;

    //**************************************** */
    //  Constructors
    //**************************************** */
    public Dog(){

    }
    public Dog(String name, Integer age, String breed, String image){
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.image = image;
    }
    // Getters and starters

    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getName(){
        return  this.name;
    }
    public void setName(String  name){
        this.name = name;
    }
    public Integer getAge(){
        return this.age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image= image;
    }


}
// public class entities {
    
// }
