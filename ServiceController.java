package controller;

import entity.servicesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ServiceService;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {

    @Autowired
    private ServiceService serviceservice;
//responeentiry-represents the whole http request

    @GetMapping
    public ResponseEntity<List<servicesEntity>> getAllServices() {
        List<servicesEntity> services = serviceservice.getAllServices();
        return ResponseEntity.ok(services);
    }
@GetMapping("/{name}")
public ResponseEntity<servicesEntity> getServiceByName(@PathVariable String name) {
    return serviceservice.getServiceByName(name)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
}
}
