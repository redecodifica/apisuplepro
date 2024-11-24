package proyecto.apiSuplepro.model;

import jakarta.persistence.*;

//Category.java
@Entity
@Table(name = "categories")
public class Category {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(nullable = false)
 private String nombre;

 @Column(nullable = false, unique = true)
 private String slug;

 @ManyToOne
 @JoinColumn(name = "parent_id")
 private Category parent;

 // Constructores
 public Category() {}

 public Category(Long id, String nombre, String slug, Category parent) {
     this.id = id;
     this.nombre = nombre;
     this.slug = slug;
     this.parent = parent;
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

 public Category getParent() {
     return parent;
 }

 public void setParent(Category parent) {
     this.parent = parent;
 }
}