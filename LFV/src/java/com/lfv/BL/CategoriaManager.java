/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.BL;
import com.lfv.entitys.Categoria;
import com.lfv.entitys.Equipo;
import java.util.List;
public interface CategoriaManager {
    public List<Categoria> getAllCategoryList();
    public Categoria getCategoriaById(int idCategoria);
    public void guardarCategoria(Categoria categoria);
    public void actualizarCategor(Categoria categoria);
}
