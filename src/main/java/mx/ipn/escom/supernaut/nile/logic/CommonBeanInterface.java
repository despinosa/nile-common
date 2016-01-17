/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package mx.ipn.escom.supernaut.nile.logic;

import java.util.List;

/**
 *
 * @author supernaut
 * @param <PK>
 * @param <Model>
 */
public interface CommonBeanInterface<PK, Model> {

  public void initByPK(PK pk);

  public void initNew(Model model);

  public List<Model> getAll();

  public Model getModel();

  public void deleteModel();

  public void commitModel();

}
