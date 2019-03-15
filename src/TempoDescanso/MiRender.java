/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempoDescanso;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author andres
 */
public class MiRender extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table,
      Object value,
      boolean isSelected,
      boolean hasFocus,
      int row,
      int column)
   {
      super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
      long tope = 30;
      
      long valor = (long)table.getValueAt(row, 4);
      if (valor > tope){
         
         this.setOpaque(true);        
         this.setForeground(Color.RED);
      } else {
          this.setOpaque(true);        
         this.setForeground(Color.BLACK);
      }

      return this;
   }
    
}
