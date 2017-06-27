package doc;

import java.awt.Component;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;

public class ResourcesTableCellRenderer extends JLabel implements TableCellRenderer {
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
			boolean hasFocus, int rowIndex, int vColIndex) {
		    setText(value.toString());
		    String[] resourcesNames=(String[]) value;
		   for(String name:resourcesNames){
			   this.setText(name);
		   }

		    return this;
		  }
}
