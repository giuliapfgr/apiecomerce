package br.com.fiap.apiatvjava.products;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductsController {

    @Autowired
    ProductsService service;

    @GetMapping
    public List<Products> get(){
        return service.findAll();
    }

}
