/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

/**
 *
 * @author supernaut
 */
public class ProductDetailPK {

  private int attribute;
  private int product;

  public ProductDetailPK() {}

  public int getAttribute() {
    return attribute;
  }

  public int getProduct() {
    return product;
  }

  public void setAttribute(int attribute) {
    this.attribute = attribute;
  }

  public void setProduct(int product) {
    this.product = product;
  }

}
