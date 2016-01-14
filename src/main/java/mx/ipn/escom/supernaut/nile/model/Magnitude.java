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
public class Magnitude {

  private Collection<? extends Attribute> attributeCollection;
  private String description;
  private Short magniId;
  private String name;
  private Collection<? extends Unit> unitCollection;

  public Magnitude() {}

  public Collection<? extends Attribute> getAttributeCollection() {
    return attributeCollection;
  }

  public String getDescription() {
    return description;
  }

  public Short getMagniId() {
    return magniId;
  }

  public String getName() {
    return name;
  }

  public Collection<? extends Unit> getUnitCollection() {
    return unitCollection;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setMagniId(Short magniId) {
    this.magniId = magniId;
  }

}
