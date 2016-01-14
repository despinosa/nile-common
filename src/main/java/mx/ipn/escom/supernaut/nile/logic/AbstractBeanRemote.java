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
public interface AbstractBeanRemote<PK, Model> {

  void initByPK(PK pk);

  void initNew(Model model);

  List<Model> getAll();

  Model getModel();

  void deleteModel();

}
