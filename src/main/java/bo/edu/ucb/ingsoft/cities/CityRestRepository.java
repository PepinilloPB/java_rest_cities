package bo.edu.ucb.ingsoft.cities;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
public interface CityRestRepository extends PagingAndSortingRepository<City, Integer>{
    List<City> findByCity(@Param("city") String city);
}
