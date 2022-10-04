/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.demo.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.CategoriaService;
import com.example.demo.Entity.Categoria;

/**
 *
 * @author Brisa
 */
@RestController
@RequestMapping("/categoria")
@Api(value = "Microservicio de Gestion de categoria", description = "Microservicio de Gestion de categoria")
public class CategoriaController {

@Autowired
    CategoriaService categoriaService;

    @ApiOperation(value = "Lista de actividades")
    @GetMapping("/all")
    public List<Categoria> findAll() {
        return categoriaService.findAll();
    }

    @ApiOperation(value = "Obtiene datos de una categoria")
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id) {
        Categoria categoria = categoriaService.findById(id);
        return ResponseEntity.ok(categoria);
    }

    @ApiOperation(value = "Elimina una categoria")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id) {
        categoriaService.deleteById(id);
    }

    @ApiOperation(value = "Crea una categoria")
    @PostMapping("/save")
    public Categoria save(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }

    @ApiOperation(value = "Modifica datos de una categoria")
    @PutMapping("/update")
    public Categoria update(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }
}
