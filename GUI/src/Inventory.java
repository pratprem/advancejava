import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class Inventory implements TableModel{
String[] products = {"Apples"
	@Override
	public void addTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		if(columnIndex == 0)
			return String.class;
		if(columnIndex == 1)
			return Integer.class;
		return String.class;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getColumnName(int arg0) {
		if(columnIndex == 0)
			return "Name";
		if(columnIndex == 1)
			return "Price";
		return "Foo";
				
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		if(columnIndex == 0)return products[rowIndex];
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}


}
