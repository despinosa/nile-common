/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

/**
 *
 * @author supernaut
 */
public interface ProductDetail {

  Attribute getAttribute1();

  Product getProduct1();

  ProductDetailPK getProductDetailPK();

  String getValue();

  void setValue(String value);

}
