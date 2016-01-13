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
public interface Order {

  Date getClosedOn();

  Customer getCustomer1();

  Date getOpenedOn();

  Collection getOrderDetailCollection();

  OrderPK getOrderPK();

  String getStatus();

  BigDecimal getTotal();

  Short getUniqueProducts();

  void setClosedOn(Date closedOn);

  void setOpenedOn(Date openedOn);

  void setStatus(String status);

  void setTotal(BigDecimal total);

  void setUniqueProducts(Short uniqueProducts);

}
