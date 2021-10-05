package bo.edu.ucb.ingsoft.cities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class Cities {
    
    /*@GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    } */

    List<City> cityList = new ArrayList<>();

    @GetMapping(path = "/cityOld", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<City> listAll() {
        return cityList;
    }

    @PostMapping(path ="/city", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public City listAll(@RequestBody City city) {
        cityList.add(city);
        return city;
    }
}
