/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author supernaut
 */
public interface Customer {

  Date getAddedOn();

  Collection getAddressCollection();

  Integer getCustomerId();

  String getFirstName();

  Date getLastLogin();

  String getLastName();

  Collection getOrderCollection();

  String getPwordHash();

  String getPwordSalt();

  String getUsername();

  void setFirstName(String firstName);

  void setLastLogin(Date lastLogin);

  void setLastName(String lastName);

  void setPwordHash(String pwordHash);

  void setPwordSalt(String pwordSalt);

  void setUsername(String username);

}
