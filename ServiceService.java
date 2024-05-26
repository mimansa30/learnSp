package service;

import Repository.serviceRepository;
import entity.servicesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceService {
    @Autowired
    private serviceRepository ServiceRepo;

    public List<servicesEntity> getAllServices()
    {
        return ServiceRepo.findAll();
    }

    public Optional<servicesEntity> getServiceByName(String name)
    {
        return ServiceRepo.findByName(name);
    }
}
