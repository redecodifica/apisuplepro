package proyecto.apiSuplepro.model;

import jakarta.persistence.*;

//Order.java
@Entity
@Table(name = "orders")
public class Order {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @ManyToOne
 @JoinColumn(name = "cliente_id", nullable = false)
 private User cliente;

 @Column(nullable = false)
 private String estado;

 @Column(nullable = false)
 private Double total;

 @Column(nullable = false)
 private String fechaPedido;

 @Column(columnDefinition = "json")
 private String metaData;

 // Constructores
 public Order() {}

 public Order(Long id, User cliente, String estado, Double total, String fechaPedido, String metaData) {
     this.id = id;
     this.cliente = cliente;
     this.estado = estado;
     this.total = total;
     this.fechaPedido = fechaPedido;
     this.metaData = metaData;
 }

 // Getters y Setters
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public User getCliente() {
     return cliente;
 }

 public void setCliente(User cliente) {
     this.cliente = cliente;
 }

 public String getEstado() {
     return estado;
 }

 public void setEstado(String estado) {
     this.estado = estado;
 }

 public Double getTotal() {
     return total;
 }

 public void setTotal(Double total) {
     this.total = total;
 }

 public String getFechaPedido() {
     return fechaPedido;
 }

 public void setFechaPedido(String fechaPedido) {
     this.fechaPedido = fechaPedido;
 }

 public String getMetaData() {
     return metaData;
 }

 public void setMetaData(String metaData) {
     this.metaData = metaData;
 }
}