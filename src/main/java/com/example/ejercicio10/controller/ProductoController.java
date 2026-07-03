package com.example.ejercicio10.controller;

import com.example.ejercicio10.model.Producto;
import com.example.ejercicio10.repository.ProductoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoRepository productoRepository;

    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }

    @GetMapping
    public Page<Producto> listarProductos(
            @RequestParam int page,
            @RequestParam int size
    ) {
        return productoRepository.findAll(PageRequest.of(page, size));
    }
}