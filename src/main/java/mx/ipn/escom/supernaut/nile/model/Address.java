/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

/**
 *
 * @author supernaut
 */
public class Address {

  private AddressPK addressPK;
  private Customer customer1;
  private String line1;
  private String line2;
  private Integer postcode;
  private String state;

  public Address() {}

  public AddressPK getAddressPK() {
    return addressPK;
  }

  public Customer getCustomer1() {
    return customer1;
  }

  public String getLine1() {
    return line1;
  }

  public String getLine2() {
    return line2;
  }

  public Integer getPostcode() {
    return postcode;
  }

  public String getState() {
    return state;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public void setPostcode(Integer postcode) {
    this.postcode = postcode;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setAddressPK(AddressPK addressPK) {
    this.addressPK = addressPK;
  }

  public void setCustomer1(Customer customer1) {
    this.customer1 = customer1;
  }

}
