/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;


/**
 *
 * @author supernaut
 */
public interface CategoryDetail {

  Attribute getAttribute1();

  Category getCategory1();

  CategoryDetailPK getCategoryDetailPK();

  Unit getUnit();

  void setCategoryDetailPK(CategoryDetailPK categoryDetailPK);

  void setUnit(Unit unit);

}
