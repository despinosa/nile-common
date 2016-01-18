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
  private Collection categoryDetailCollection;
  private String description;
  private String name;
  private Collection productDetailCollection;

  public Attribute() {}

  public Integer getAttributeId() {
    return attributeId;
  }

  public Collection getCategoryDetailCollection() {
    return categoryDetailCollection;
  }

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }

  public Collection getProductDetailCollection() {
    return productDetailCollection;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAttributeId(Integer attributeId) {
    this.attributeId = attributeId;
  }

}
