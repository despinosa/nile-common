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
public class Category {

  private Collection categoryDetailCollection;
  private Short categoryId;
  private String description;
  private String name;
  private Collection productCollection;

  public Category() {}

  public Collection getCategoryDetailCollection() {
    return categoryDetailCollection;
  }

  public Short getCategoryId() {
    return categoryId;
  }

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }

  public Collection getProductCollection() {
    return productCollection;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCategoryId(Short categoryId) {
    this.categoryId = categoryId;
  }

}
