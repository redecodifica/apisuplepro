package proyecto.apiSuplepro.model;

import jakarta.persistence.*;

//Product.java
@Entity
@Table(name = "products")
public class Product {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(nullable = false)
 private String nombre;

 @Column(nullable = false, unique = true)
 private String slug;

 @Column(nullable = false)
 private Double precio;

 @Column(nullable = false)
 private Integer stock;

 @Column(nullable = false)
 private String estado;

 @Column(columnDefinition = "json")
 private String metaData;

 // Constructores
 public Product() {}

 public Product(Long id, String nombre, String slug, Double precio, Integer stock, String estado, String metaData) {
     this.id = id;
     this.nombre = nombre;
     this.slug = slug;
     this.precio = precio;
     this.stock = stock;
     this.estado = estado;
     this.metaData = metaData;
 }

 // Getters y Setters
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public String getSlug() {
     return slug;
 }

 public void setSlug(String slug) {
     this.slug = slug;
 }

 public Double getPrecio() {
     return precio;
 }

 public void setPrecio(Double precio) {
     this.precio = precio;
 }

 public Integer getStock() {
     return stock;
 }

 public void setStock(Integer stock) {
     this.stock = stock;
 }

 public String getEstado() {
     return estado;
 }

 public void setEstado(String estado) {
     this.estado = estado;
 }

 public String getMetaData() {
     return metaData;
 }

 public void setMetaData(String metaData) {
     this.metaData = metaData;
 }
}