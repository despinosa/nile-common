/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.logic;

import javax.ejb.Remote;
import mx.ipn.escom.supernaut.nile.model.Customer;
import mx.ipn.escom.supernaut.nile.model.Order;

/**
 *
 * @author supernaut
 */
@Remote
public interface CustomerBeanRemote extends
    AbstractBeanInterface<Integer, Customer> {

  public void initByUsername(String username);

  public boolean initWithLogin(String username, String pword);

  public void addOrder(Order order) throws IllegalStateException;

}
