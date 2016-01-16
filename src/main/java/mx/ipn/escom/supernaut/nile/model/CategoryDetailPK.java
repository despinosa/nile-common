/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

/**
 *
 * @author supernaut
 */
public class CategoryDetailPK {

  private int attribute;
  private short category;

  public CategoryDetailPK() {}

  public int getAttribute() {
    return attribute;
  }

  public short getCategory() {
    return category;
  }

  public void setAttribute(int attribute) {
    this.attribute = attribute;
  }

  public void setCategory(short category) {
    this.category = category;
  }

}
