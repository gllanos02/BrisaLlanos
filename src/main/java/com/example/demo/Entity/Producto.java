/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.demo.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Brisa
 */
@Entity
@Data
@Table(name = "producto")
public class Producto implements Serializable {

    @Id
    @Column(name = "prod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodId;

    @Column(name = "prod_nombre")
    private String prodNombre;

    @Column(name = "prod_precio")
    private String prodPrecio;

    @Column(name = "prod_categoria")
    private String prodCategoria;

    @Column(name = "prod_cantidad")
    private String prodCantidad;
    
    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Categoria categoria;

}
