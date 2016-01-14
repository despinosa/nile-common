/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

/**
 *
 * @author supernaut
 */
public class OrderPK {

  private int customer;
  private short orderId;

  public OrderPK() {}

  public int getCustomer() {
    return customer;
  }

  public short getOrderId() {
    return orderId;
  }

  public void setCustomer(int customer) {
    this.customer = customer;
  }

  public void setOrderId(short orderId) {
    this.orderId = orderId;
  }

}
