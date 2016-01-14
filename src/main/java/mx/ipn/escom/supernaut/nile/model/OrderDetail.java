/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;


/**
 *
 * @author supernaut
 */
public class OrderDetail {

  private Order order1;
  private OrderDetailPK orderDetailPK;
  private Product product1;
  private short quantity;

  public OrderDetail() {}

  public Order getOrder1() {
    return order1;
  }

  public OrderDetailPK getOrderDetailPK() {
    return orderDetailPK;
  }

  public Product getProduct1() {
    return product1;
  }

  public short getQuantity() {
    return quantity;
  }

  public void setQuantity(short quantity) {
    this.quantity = quantity;
  }

  public void setOrder1(Order order1) {
    this.order1 = order1;
  }

  public void setProduct1(Product product1) {
    this.product1 = product1;
  }

}
