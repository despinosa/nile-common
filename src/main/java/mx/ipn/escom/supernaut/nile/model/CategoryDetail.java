/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;


/**
 *
 * @author supernaut
 */
public class CategoryDetail {

  private Attribute attribute1;
  private Category category1;
  private CategoryDetailPK categoryDetailPK;
  private Unit unit;

  public CategoryDetail() {}

  public Attribute getAttribute1() {
    return attribute1;
  }

  public Category getCategory1() {
    return category1;
  }

  public CategoryDetailPK getCategoryDetailPK() {
    return categoryDetailPK;
  }

  public Unit getUnit() {
    return unit;
  }

  public void setUnit(Unit unit) {
    this.unit = unit;
  }

  public void setAttribute1(Attribute attribute1) {
    this.attribute1 = attribute1;
  }

  public void setCategory1(Category category1) {
    this.category1 = category1;
  }

  public void setCategoryDetailPK(CategoryDetailPK categoryDetailPK) {
    this.categoryDetailPK = categoryDetailPK;
  }

}
