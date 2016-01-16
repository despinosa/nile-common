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
public class Unit {

  private String abbreviation;
  private Collection<? extends CategoryDetail> categoryDetailCollection;
  private String description;
  private Magnitude magnitude;
  private String name;
  private boolean shownAsPrefix;
  private UnitPK unitPK;

  public Unit() {}

  public String getAbbreviation() {
    return abbreviation;
  }

  public Collection<? extends CategoryDetail> getCategoryDetailCollection() {
    return categoryDetailCollection;
  }

  public String getDescription() {
    return description;
  }

  public Magnitude getMagnitude() {
    return magnitude;
  }

  public String getName() {
    return name;
  }

  public boolean getShownAsPrefix() {
    return shownAsPrefix;
  }

  public UnitPK getUnitPK() {
    return unitPK;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }


  public void setDescription(String description) {
    this.description = description;
  }

  public void setMagnitude(Magnitude magnitude) {
    this.magnitude = magnitude;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setShownAsPrefix(boolean shownAsPrefix) {
    this.shownAsPrefix = shownAsPrefix;
  }

  public void setUnitPK(UnitPK unitPK) {
    this.unitPK = unitPK;
  }

}
