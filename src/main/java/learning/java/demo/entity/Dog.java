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

    public String report_type;

    public String name;

    public Integer age;

    public String breed;

    public String image;

    public String fur;

    public String ears;

    public String size;

    public String color;

    public String  neutured;

    public String gender;

    public String location;

    public String date;




    //**************************************** */
    //  Constructors
    //**************************************** */
    public Dog(){

    }
    public Dog(String name, Integer age, String breed, String image, String color, String fur, String ears, String  size, String neutured, String gender, String location, String date, String report_type){
        this.report_type = report_type;
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.image = image;
        this.fur = fur;
        this.ears = ears;
        this.size = size;
        this.color = color;
        this.neutured = neutured;
        this.gender = gender;
        this.location = location;
        this.date = date;

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
    public String getFur(){
        return this.fur;
    }
    public void setFur(String fur){
        this.fur= fur;
    }
    public String getEars(){
        return this.ears;
    }
    public void setEars(String ears){
        this.ears = ears;
    }
    public String getSize(){
        return this.size;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getNeutured(){
        return this.neutured;
    }
    public void setNeutured(String neutured){
        this.neutured = neutured;
    }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getLocation(){
        return this.gender;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getDate(){
        return this.date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getReport(){
        return this.report_type;
    }
    public void setReport(String report_type){
        this.report_type = report_type;
    }

}
// public class entities {
    
// }
