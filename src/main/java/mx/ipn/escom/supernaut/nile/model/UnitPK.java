/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.model;

/**
 *
 * @author supernaut
 */
public class UnitPK {

  private short magni;
  private short unitId;

  public UnitPK() {}

  public short getMagni() {
    return magni;
  }

  public short getUnitId() {
    return unitId;
  }

  public void setMagni(short magni) {
    this.magni = magni;
  }

  public void setUnitId(short unitId) {
    this.unitId = unitId;
  }

}
