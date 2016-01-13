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
public interface Product {

  Date getAddedOn();

  Collection getCategoryCollection();

  String getDescription();

  byte[] getImage();

  String getName();

  Collection getOrderDetailCollection();

  BigDecimal getPrice();

  Collection getProductDetailCollection();

  Integer getSku();

  int getStock();

  void setDescription(String description);

  void setImage(byte[] image);

  void setName(String name);

  void setPrice(BigDecimal price);

  void setStock(int stock);

}
