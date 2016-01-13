/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

/**
 *
 * @author supernaut
 */
public interface Address {

  AddressPK getAddressPK();

  Customer getCustomer1();

  String getLine1();

  String getLine2();

  Integer getPostcode();

  String getState();

  void setLine1(String line1);

  void setLine2(String line2);

  void setPostcode(Integer postcode);

  void setState(String state);

}
