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
public interface Magnitude {

  Collection getAttributeCollection();

  String getDescription();

  Short getMagniId();

  String getName();

  Collection getUnitCollection();

  void setDescription(String description);

  void setName(String name);

}
