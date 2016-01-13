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
public interface Unit {

  String getAbbreviation();

  Collection getCategoryDetailCollection();

  String getDescription();

  Magnitude getMagnitude();

  String getName();

  boolean getShownAsPrefix();

  UnitPK getUnitPK();

  void setAbbreviation(String abbreviation);

  void setDescription(String description);

  void setName(String name);

  void setShownAsPrefix(boolean shownAsPrefix);

}
