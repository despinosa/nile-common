/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.logic;

import javax.ejb.Remote;
import mx.ipn.escom.supernaut.nile.model.Category;

/**
 *
 * @author supernaut
 */
@Remote
public interface CategoryBeanRemote extends
    AbstractBeanRemote<Integer, Category> {
}
