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
public interface Attribute {

  Integer getAttributeId();

  Collection getCategoryDetailCollection();

  String getDescription();

  Magnitude getMagni();

  String getName();

  Collection getProductDetailCollection();

  void setDescription(String description);

  void setMagni(Magnitude magni);

  void setName(String name);

}
