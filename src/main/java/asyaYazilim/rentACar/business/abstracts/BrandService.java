package asyaYazilim.rentACar.business.abstracts;

import asyaYazilim.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
