/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

import java.util.Collection;

/**
 *
 * @author supernaut
 */
public class Attribute {

  private Integer attributeId;
  private Collection<? extends CategoryDetail> categoryDetailCollection;
  private String description;
  private Magnitude magni;
  private String name;
  private Collection<? extends ProductDetail> productDetailCollection;

  public Attribute() {}

  public Integer getAttributeId() {
    return attributeId;
  }

  public Collection<? extends CategoryDetail> getCategoryDetailCollection() {
    return categoryDetailCollection;
  }

  public String getDescription() {
    return description;
  }

  public Magnitude getMagni() {
    return magni;
  }

  public String getName() {
    return name;
  }

  public Collection<? extends ProductDetail> getProductDetailCollection() {
    return productDetailCollection;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setMagni(Magnitude magni) {
    this.magni = magni;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAttributeId(Integer attributeId) {
    this.attributeId = attributeId;
  }

}
