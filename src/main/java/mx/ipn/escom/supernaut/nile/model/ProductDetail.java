/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

/**
 *
 * @author supernaut
 */
public class ProductDetail {

  private Product product1;
  private Attribute attribute1;
  private ProductDetailPK productDetailPK;
  private String value;

  public ProductDetail() {}

  public Attribute getAttribute1() {
    return attribute1;
  }

  public Product getProduct1() {
    return product1;
  }

  public ProductDetailPK getProductDetailPK() {
    return productDetailPK;
  }

  public String getValue() {
    return value;
  }

  public void setProduct1(Product product1) {
    this.product1 = product1;
  }

  public void setAttribute1(Attribute attribute1) {
    this.attribute1 = attribute1;
  }

  public void setProductDetailPK(ProductDetailPK productDetailPK) {
    this.productDetailPK = productDetailPK;
  }

  public void setValue(String value) {
    this.value = value;
  }

}
