package bo.edu.ucb.ingsoft.cities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
+-------------+----------------------+------+-----+---------------------+-------------------------------+
| Field       | Type                 | Null | Key | Default             | Extra                         |
+-------------+----------------------+------+-----+---------------------+-------------------------------+
| city_id     | smallint(5) unsigned | NO   | PRI | NULL                | auto_increment                |
| city        | varchar(50)          | NO   |     | NULL                |                               |
| country_id  | smallint(5) unsigned | NO   | MUL | NULL                |                               |
| last_update | timestamp            | NO   |     | current_timestamp() | on update current_timestamp() |
+-------------+----------------------+------+-----+---------------------+-------------------------------+
*/ 
@Entity(name = "city")
public class City {
    
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer city_id;

    @Column(name="city")
    private String city;
    
    private Integer country_id;
    private Timestamp last_update;

    public Integer getCity_id(){
        return city_id;
    } 

    public String getCity(){
        return city;
    } 

    public Integer getCountry_id(){
        return country_id;
    } 

    public Timestamp getLast_update(){
        return last_update;
    } 

    public void setCity_id(Integer city_id){
        this.city_id = city_id;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setCountry_id(Integer country_id){
        this.country_id = country_id;
    }

    public void setLast_update(Timestamp last_update){
        this.last_update = last_update;
    }
}
