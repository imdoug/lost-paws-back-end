package learning.java.demo.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    // initial hello worls
    @GetMapping("/")
    public String first(){
        return "Hello World";
    }
    // arrays
    @GetMapping("/numbers") //get request
    public ArrayList<Integer> numbers(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        return arr;
    }
    // objects 
    @GetMapping("/hash") //get request
    public HashMap<String, String> hash(){
        HashMap<String, String> myself = new HashMap<>();
        myself.put("name", "Doug Moreira");
        myself.put("age", "25");
        return myself;
    }
    // params on urls
    @GetMapping("/param/{myparam}") //get request
    public String para(@PathVariable String myparam){
        return myparam;
    }
    // queries
    @GetMapping("/param2/{qparam}")
    public String para(@PathVariable String qparam, @RequestParam("myquery") String  myquery){
        return qparam + " " + myquery;
    }
    // acessing the body
    @PostMapping("/getthebody")
    public HashMap<String, String> getbody(@RequestBody HashMap<String, String> body){
        return body;
    }
    // @PutMapping("/")
    // @DeleteMapping("/")
}
