/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;


/**
 *
 * @author supernaut
 */
public interface OrderDetail {

  Order getOrder1();

  OrderDetailPK getOrderDetailPK();

  Product getProduct1();

  short getQuantity();

  void setQuantity(short quantity);

}