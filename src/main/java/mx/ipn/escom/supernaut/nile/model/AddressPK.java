/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

/**
 *
 * @author supernaut
 */
public class AddressPK {

  private int customer;
  private String type;

  public AddressPK() {}

  public int getCustomer() {
    return customer;
  }

  public String getType() {
    return type;
  }

  public void setCustomer(int customer) {
    this.customer = customer;
  }

  public void setType(String type) {
    this.type = type;
  }

}
