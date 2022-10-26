package asyaYazilim.rentACar.dataAccess.concretes;

import asyaYazilim.rentACar.dataAccess.abstracts.BrandRepository;
import asyaYazilim.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // Bu sınıf bir data acccess nesnesidir
public class InMemoryBrandRepository implements BrandRepository {
    ArrayList<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Mercedes"));
        brands.add(new Brand(3, "Auid"));
        brands.add(new Brand(4, "Skoda"));
        brands.add(new Brand(5, "Toyota"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
