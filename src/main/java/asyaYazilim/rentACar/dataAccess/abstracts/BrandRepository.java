package asyaYazilim.rentACar.dataAccess.abstracts;

import asyaYazilim.rentACar.entities.concretes.Brand;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();
}
