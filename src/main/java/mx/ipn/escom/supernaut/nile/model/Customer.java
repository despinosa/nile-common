/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author supernaut
 */
public class Customer {

  private Date addedOn;
  private Collection<? extends Address> addressCollection;
  private Integer customerId;
  private String firstName;
  private Date lastLogin;
  private String lastName;
  private Collection<? extends Order> orderCollection;
  private String pwordHash;
  private String pwordSalt;
  private String username;

  public Customer() {}

  public Date getAddedOn() {
    return addedOn;
  }

  public Collection<? extends Address> getAddressCollection() {
    return addressCollection;
  }

  public Integer getCustomerId() {
    return customerId;
  }

  public String getFirstName() {
    return firstName;
  }

  public Date getLastLogin() {
    return lastLogin;
  }

  public String getLastName() {
    return lastName;
  }

  public Collection<? extends Order> getOrderCollection() {
    return orderCollection;
  }

  public String getPwordHash() {
    return pwordHash;
  }

  public String getPwordSalt() {
    return pwordSalt;
  }

  public String getUsername() {
    return username;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastLogin(Date lastLogin) {
    this.lastLogin = lastLogin;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setPwordHash(String pwordHash) {
    this.pwordHash = pwordHash;
  }

  public void setPwordSalt(String pwordSalt) {
    this.pwordSalt = pwordSalt;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setAddedOn(Date addedOn) {
    this.addedOn = addedOn;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

}
