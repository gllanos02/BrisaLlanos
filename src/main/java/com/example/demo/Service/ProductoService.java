/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.Producto;

/**
 *
 * @author Brisa
 */
public interface ProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);

    public Producto save(Producto producto);

    public void delete(Producto producto);

    public void deleteById(Long id);

}
