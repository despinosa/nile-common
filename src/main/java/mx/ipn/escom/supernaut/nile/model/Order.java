/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author supernaut
 */
public class Order {

  private Date closedOn;
  private Customer customer1;
  private Date openedOn;
  private Collection<? extends OrderDetail> orderDetailCollection;
  private OrderPK orderPK;
  private String status;
  private BigDecimal total;
  private Short uniqueProducts;

  public Order() {}

  public Date getClosedOn() {
    return closedOn;
  }

  public Customer getCustomer1() {
    return customer1;
  }

  public Date getOpenedOn() {
    return openedOn;
  }

  public Collection<? extends OrderDetail> getOrderDetailCollection() {
    return orderDetailCollection;
  }

  public OrderPK getOrderPK() {
    return orderPK;
  }

  public String getStatus() {
    return status;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public Short getUniqueProducts() {
    return uniqueProducts;
  }

  public void setClosedOn(Date closedOn) {
    this.closedOn = closedOn;
  }

  public void setOpenedOn(Date openedOn) {
    this.openedOn = openedOn;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public void setUniqueProducts(Short uniqueProducts) {
    this.uniqueProducts = uniqueProducts;
  }

  public void setCustomer1(Customer customer1) {
    this.customer1 = customer1;
  }

  public void setOrderPK(OrderPK orderPK) {
    this.orderPK = orderPK;
  }

}
