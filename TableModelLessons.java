package doc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TableModelLessons extends AbstractTableModel{
	String[] title={"Name","1","2","3","4","5","6",
					"7","8","9","10","11","12",
					"13","14","15","16","17","18",
					"19","20","21","extends","implements","main",
					"resources","nameResources","description"};
	List<Lessons> list=new ArrayList<Lessons>();
	@Override	
	public int getColumnCount() {
		return title.length;
	}

	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public Object getValueAt(int row, int column) {
		switch(column){
		case 0: return list.get(row).getNameClass();
		case 1 : return list.get(row).isL01();
		case 2 : return list.get(row).isL02();
		case 3 : return list.get(row).isL03();
		case 4 : return list.get(row).isL04();
		case 5 : return list.get(row).isL05();
		case 6 : return list.get(row).isL06();
		case 7 : return list.get(row).isL07();
		case 8 : return list.get(row).isL08();
		case 9 : return list.get(row).isL09();
		case 10 : return list.get(row).isL10();
		case 11 : return list.get(row).isL11();
		case 12 : return list.get(row).isL12();
		case 13 : return list.get(row).isL13();
		case 14 : return list.get(row).isL14();
		case 15 : return list.get(row).isL15();
		case 16 : return list.get(row).isL16();
		case 17 : return list.get(row).isL17();
		case 18 : return list.get(row).isL18();
		case 19 : return list.get(row).isL19();
		case 20 : return list.get(row).isL20();
		case 21 : return list.get(row).isL21();
		case 22 : return list.get(row).getHerite();
		case 23 : return list.get(row).getImplementes();
		case 24 : return list.get(row).isMainClass();
		case 25 : return list.get(row).isResources();
		case 26 : return list.get(row).getNameResources();
		case 27 : return list.get(row).getDescription();
		default :throw new IllegalArgumentException();
		}
	}
	@Override
	public String getColumnName(int columnIndex) {return title[columnIndex];}
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case 0:return String.class;
			case 1:return Boolean.class;
			case 2:return Boolean.class;
			case 3:return Boolean.class;
			case 4:return Boolean.class;
			case 5:return Boolean.class;
			case 6:return Boolean.class;
			case 7:return Boolean.class;
			case 8:return Boolean.class;
			case 9:return Boolean.class;
			case 10:return Boolean.class;
			case 11:return Boolean.class;
			case 12:return Boolean.class;
			case 13:return Boolean.class;
			case 14:return Boolean.class;
			case 15:return Boolean.class;
			case 16:return Boolean.class;
			case 17:return Boolean.class;
			case 18:return Boolean.class;
			case 19:return Boolean.class;
			case 20:return Boolean.class;
			case 21:return Boolean.class;
			case 22:return String.class;
			case 23:return String.class;
			case 24:return Boolean.class;
			case 25:return Boolean.class;
			case 26:return String.class;
			case 27:return String[].class;
			default:
				return Object.class;
		}
	}
	public void add(String nameClass,boolean l01, boolean l02, boolean l03, boolean l04, boolean l05, boolean l06, boolean l07,
			boolean l08, boolean l09, boolean l10, boolean l11, boolean l12, boolean l13, boolean l14, boolean l15,
			boolean l16, boolean l17, boolean l18, boolean l19, boolean l20, boolean l21, String herite,
			String implementes, String description, boolean mainClass, boolean resources, String[] nameResources){
		Lessons lessons=new Lessons( nameClass,l01, l02, l03,  l04,  l05, l06,  l07,
			 l08,  l09,  l10,  l11,l12, l13, l14,l15,
			l16, l17,  l18,  l19, l20, l21, herite,
			 implementes, description, mainClass,  resources, nameResources);
		list.add(lessons);
		fireTableRowsInserted(list.size()-1, list.size()-1);
	}
	@Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {return true;}
	public void openJSon(String fileName,String nameOfClass){
		try {
			FileReader file=new FileReader(fileName);
			JSONParser parser = new JSONParser();
		   Object obj = parser.parse(file);
		   JSONObject jsonObject = (JSONObject) obj;
		   JSONObject nameBattleCommand =  (JSONObject) jsonObject.get(nameOfClass);
		   System.out.println("nameOfClass : "+nameOfClass);
		   System.out.println("total : "+nameBattleCommand);
		   String herite = (String) nameBattleCommand.get("extends");
		   System.out.println("herite : "+herite);
		   String implementes = (String) nameBattleCommand.get("implements");
		   System.out.println("implements : "+implementes);
		   String description = (String) nameBattleCommand.get("description");
		   System.out.println("description : "+description);
		   Boolean mainClass = (Boolean) nameBattleCommand.get("main");
		   System.out.println("main : "+mainClass);
		   Boolean resources = (Boolean) nameBattleCommand.get("resources");
		   System.out.println("resources : "+resources);
		   JSONArray listLessons = (JSONArray) nameBattleCommand.get("lessons");
		   Boolean l01=(Boolean) listLessons.get(0);
		   Boolean l02=(Boolean) listLessons.get(1);
		   Boolean l03=(Boolean) listLessons.get(2);
		   Boolean l04=(Boolean) listLessons.get(3);
		   Boolean l05=(Boolean) listLessons.get(4);
		   Boolean l06=(Boolean) listLessons.get(5);
		   Boolean l07=(Boolean) listLessons.get(6);
		   Boolean l08=(Boolean) listLessons.get(7);
		   Boolean l09=(Boolean) listLessons.get(8);
		   Boolean l10=(Boolean) listLessons.get(9);
		   Boolean l11=(Boolean) listLessons.get(10);
		   Boolean l12=(Boolean) listLessons.get(11);
		   Boolean l13=(Boolean) listLessons.get(12);
		   Boolean l14=(Boolean) listLessons.get(13);
		   Boolean l15=(Boolean) listLessons.get(14);
		   Boolean l16=(Boolean) listLessons.get(15);
		   Boolean l17=(Boolean) listLessons.get(16);
		   Boolean l18=(Boolean) listLessons.get(17);
		   Boolean l19=(Boolean) listLessons.get(18);
		   Boolean l20=(Boolean) listLessons.get(19);
		   Boolean l21=(Boolean) listLessons.get(20);
		   System.out.println("Lessons : "+listLessons);
		   JSONArray listNameResources = (JSONArray) nameBattleCommand.get("nameResources");
		   String[] arr = listNameResources.toString().replace("},{", " ,").split(" ");

		   System.out.println("Lessons : "+listNameResources);
			Lessons lesson=new Lessons( nameOfClass,l01, l02, l03,  l04,  l05, l06,  l07,
					 l08,  l09,  l10,  l11,l12, l13, l14,l15,
					l16, l17,  l18,  l19, l20, l21, herite,
					 implementes, description, mainClass,  resources,arr);
			list.add(lesson);
			
			fireTableRowsInserted(list.size()-1, list.size()-1);
	} catch (FileNotFoundException e1) {e1.printStackTrace();
	} catch (ParseException e1) {e1.printStackTrace();
	} catch (IOException e1) {e1.printStackTrace();}
	}

	public void saveJSON(String fileName, String nameOfClass) {
		try {
			FileWriter file=new FileWriter(fileName);
			JSONParser parser = new JSONParser();

			JSONObject jsonObject = new JSONObject();
			JSONObject nameBattleCommand =  (JSONObject) jsonObject.get(nameOfClass);
			System.out.println("nameOfClass : "+nameOfClass);
			System.out.println("total : "+nameBattleCommand);
			String herite = (String) nameBattleCommand.get("extends");
			System.out.println("herite : "+herite);
			String implementes = (String) nameBattleCommand.get("implements");
			System.out.println("implements : "+implementes);
			String description = (String) nameBattleCommand.get("description");
			System.out.println("description : "+description);
			Boolean mainClass = (Boolean) nameBattleCommand.get("main");
			System.out.println("main : "+mainClass);
			Boolean resources = (Boolean) nameBattleCommand.get("resources");
			System.out.println("resources : "+resources);
			JSONArray listLessons = (JSONArray) nameBattleCommand.get("lessons");
			Boolean l01=(Boolean) listLessons.get(0);
			Boolean l02=(Boolean) listLessons.get(1);
			Boolean l03=(Boolean) listLessons.get(2);
			Boolean l04=(Boolean) listLessons.get(3);
			Boolean l05=(Boolean) listLessons.get(4);
			Boolean l06=(Boolean) listLessons.get(5);
			Boolean l07=(Boolean) listLessons.get(6);
			Boolean l08=(Boolean) listLessons.get(7);
			Boolean l09=(Boolean) listLessons.get(8);
			Boolean l10=(Boolean) listLessons.get(9);
			Boolean l11=(Boolean) listLessons.get(10);
			Boolean l12=(Boolean) listLessons.get(11);
			Boolean l13=(Boolean) listLessons.get(12);
			Boolean l14=(Boolean) listLessons.get(13);
			Boolean l15=(Boolean) listLessons.get(14);
			Boolean l16=(Boolean) listLessons.get(15);
			Boolean l17=(Boolean) listLessons.get(16);
			Boolean l18=(Boolean) listLessons.get(17);
	   		Boolean l19=(Boolean) listLessons.get(18);
	   		Boolean l20=(Boolean) listLessons.get(19);
	   		Boolean l21=(Boolean) listLessons.get(20);
	   		System.out.println("Lessons : "+listLessons);
	   		JSONArray listNameResources = (JSONArray) nameBattleCommand.get("nameResources");
	   		String[] arr = listNameResources.toString().replace("},{", " ,").split(" ");

	   		System.out.println("Lessons : "+listNameResources);
	   		Lessons lesson=new Lessons( nameOfClass,l01, l02, l03,  l04,  l05, l06,  l07,
				 l08,  l09,  l10,  l11,l12, l13, l14,l15,
				l16, l17,  l18,  l19, l20, l21, herite,
				 implementes, description, mainClass,  resources,arr);
	   		list.add(lesson);

			file.write(jsonObject.toJSONString());
	        file.flush();
			fireTableRowsInserted(list.size()-1, list.size()-1);
		} catch (IOException e) {e.printStackTrace();}}

	public void clear() {
		this.clear();
	}
	
}
