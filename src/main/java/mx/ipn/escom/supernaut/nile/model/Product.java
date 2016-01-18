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
public class Product {

  private Date addedOn;
  private Collection categoryCollection;
  private String description;
  private byte[] image;
  private String name;
  private Collection orderDetailCollection;
  private BigDecimal price;
  private Collection productDetailCollection;
  private Integer sku;
  private int stock;

  public Product() {}

  public Date getAddedOn() {
    return addedOn;
  }

  public Collection getCategoryCollection() {
    return categoryCollection;
  }

  public String getDescription() {
    return description;
  }

  public byte[] getImage() {
    return image;
  }

  public String getName() {
    return name;
  }

  public Collection getOrderDetailCollection() {
    return orderDetailCollection;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public Collection getProductDetailCollection() {
    return productDetailCollection;
  }

  public Integer getSku() {
    return sku;
  }

  public int getStock() {
    return stock;
  }

  public void setAddedOn(Date addedOn) {
    this.addedOn = addedOn;
  }


  public void setDescription(String description) {
    this.description = description;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public void setSku(Integer sku) {
    this.sku = sku;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

}
