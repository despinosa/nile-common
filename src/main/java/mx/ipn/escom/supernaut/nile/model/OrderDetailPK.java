/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

/**
 *
 * @author supernaut
 */
public class OrderDetailPK {

  private int customer;
  private short order;
  private int product;

  public OrderDetailPK() {}

  public int getCustomer() {
    return customer;
  }

  public short getOrder() {
    return order;
  }

  public int getProduct() {
    return product;
  }

  public void setCustomer(int customer) {
    this.customer = customer;
  }

  public void setOrder(short order) {
    this.order = order;
  }

  public void setProduct(int product) {
    this.product = product;
  }

}
