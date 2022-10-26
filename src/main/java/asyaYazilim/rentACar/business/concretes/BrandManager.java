package asyaYazilim.rentACar.business.concretes;

import asyaYazilim.rentACar.business.abstracts.BrandService;
import asyaYazilim.rentACar.dataAccess.abstracts.BrandRepository;
import asyaYazilim.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // bu sınıf bir business nesnesi olduğunu anlatıyoruz bu şekilde
public class BrandManager implements BrandService {
    private final BrandRepository brandRepository;

    @Autowired //git parameterelerine bak (brandRepository)
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
