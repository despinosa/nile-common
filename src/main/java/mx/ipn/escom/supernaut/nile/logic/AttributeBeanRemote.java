/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.logic;

import javax.ejb.Remote;
import mx.ipn.escom.supernaut.nile.model.Attribute;
import mx.ipn.escom.supernaut.nile.model.Category;
import mx.ipn.escom.supernaut.nile.model.CategoryDetail;

/**
 *
 * @author supernaut
 */
@Remote
public interface AttributeBeanRemote extends
    CommonBeanInterface<Integer, Attribute> {

    void addCategoryDetail(CategoryDetail categoryDetail);

    void addCategory(Category category);

}
