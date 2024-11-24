package proyecto.apiSuplepro.model;

import jakarta.persistence.*;

//OrderDetail.java
@Entity
@Table(name = "order_details")
public class OrderDetail {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @ManyToOne
 @JoinColumn(name = "pedido_id", nullable = false)
 private Order pedido;

 @ManyToOne
 @JoinColumn(name = "producto_id", nullable = false)
 private Product producto;

 @Column(nullable = false)
 private Integer cantidad;

 @Column(nullable = false)
 private Double precio;

 // Constructores
 public OrderDetail() {}

 public OrderDetail(Long id, Order pedido, Product producto, Integer cantidad, Double precio) {
     this.id = id;
     this.pedido = pedido;
     this.producto = producto;
     this.cantidad = cantidad;
     this.precio = precio;
 }

 // Getters y Setters
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public Order getPedido() {
     return pedido;
 }

 public void setPedido(Order pedido) {
     this.pedido = pedido;
 }

 public Product getProducto() {
     return producto;
 }

 public void setProducto(Product producto) {
     this.producto = producto;
 }

 public Integer getCantidad() {
     return cantidad;
 }

 public void setCantidad(Integer cantidad) {
     this.cantidad = cantidad;
 }

 public Double getPrecio() {
     return precio;
 }

 public void setPrecio(Double precio) {
     this.precio = precio;
 }
}