/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.logic;

import javax.ejb.Remote;
import mx.ipn.escom.supernaut.nile.model.Order;
import mx.ipn.escom.supernaut.nile.model.OrderDetail;
import mx.ipn.escom.supernaut.nile.model.OrderPK;
import mx.ipn.escom.supernaut.nile.model.Product;

/**
 *
 * @author supernaut
 */
@Remote
public interface OrderBeanRemote extends CommonBeanInterface<OrderPK, Order> {

  public void addProduct(Product product, short quantity);

    void addOrderDetail(OrderDetail orderDetail);

}
