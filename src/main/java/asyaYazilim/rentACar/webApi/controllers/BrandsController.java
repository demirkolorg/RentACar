package asyaYazilim.rentACar.webApi.controllers;

import asyaYazilim.rentACar.business.abstracts.BrandService;
import asyaYazilim.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private final BrandService brandService;

    @Autowired //git parameterelerine bak (brandService)
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @RequestMapping("/getAll")
    public List<Brand> getAll() {
        return brandService.getAll();
    }
}
