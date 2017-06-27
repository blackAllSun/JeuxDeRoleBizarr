package doc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import org.json.simple.*;

public class MainWindow extends JFrame implements ActionListener{
	JToolBar toolBar=new JToolBar();
	JCheckBox[] checkBoxLessons=new JCheckBox[21];
	List<JTextField> textFieldNameResources=new ArrayList<JTextField>();
	JButton ajouterNameResources=new JButton("Ajouter NameResources");
	JTextField[] textField=new JTextField[4];
	JCheckBox[] checkBoxMainResources=new JCheckBox[2];
	JButton[] buttonSerialize=new JButton[3];
	int i=0;
	TableModelLessons model=new TableModelLessons();
	JTable table=new JTable(model);
	String[] nameOfClass={"BattleCommand","BattleController","BattleEnnemy",
			"BattleGame","BattleGameState","BattleHud",
			"BattlePlayer","MainScreenGameState","Map",
			"MapCamera","MapGameState","MapHud","MapPlayer",
			"MapPlayerController","MapTriggerController","WindowGame",
			"MapGame","CharacterGame","CameraGame","CollisionGame",
			"TriggerGame","MusicGame","ChangeMapGame","ObjectsGame",
			"Player","Camera","TriggerController","PlayerController",
			"ControllerGame","HudGame","Hud","AnalogGame","StateGame"};

	public MainWindow(String string) {
		super(string);
	
		toolBar.add(new JLabel("N° Lessons"));
		for(int i=0;i<checkBoxLessons.length;i++){
			checkBoxLessons[i]=new JCheckBox("l"+i);
			toolBar.add(checkBoxLessons[i]);}
		toolBar.add(ajouterNameResources);
		ajouterNameResources.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				if(ajouterNameResources.getActionCommand()=="Ajouter NameResources")
					i+=1;
					toolBar.add(textFieldNameResources.get(i));}});
		textField[0]=new JTextField();toolBar.add(textField[0]);
		textField[1]=new JTextField();toolBar.add(textField[1]);
		textField[2]=new JTextField();toolBar.add(textField[2]);
		textField[3]=new JTextField();toolBar.add(textField[3]);
		checkBoxMainResources[0]=new JCheckBox("Main");toolBar.add(checkBoxMainResources[0]);
		checkBoxMainResources[1]=new JCheckBox("Main");toolBar.add(checkBoxMainResources[1]);
		buttonSerialize[0]=new JButton("Save");toolBar.add(buttonSerialize[0]);
		buttonSerialize[1]=new JButton("Open");toolBar.add(buttonSerialize[1]);
		buttonSerialize[2]=new JButton("Clear");toolBar.add(buttonSerialize[2]);
		for (JButton button : buttonSerialize)
			button.addActionListener(this);
		add(toolBar,BorderLayout.NORTH);
		table.setAutoCreateRowSorter(true);

		for(int i=1;i<22;i++){
			table.getColumnModel().getColumn(i).setMinWidth(22);
			table.getColumnModel().getColumn(i).setMaxWidth(22); }
		table.getColumnModel().getColumn(24).setMinWidth(40);
		table.getColumnModel().getColumn(24).setMaxWidth(40);
		table.getColumnModel().getColumn(25).setMinWidth(80);
		table.getColumnModel().getColumn(25).setMaxWidth(80);
		TableColumn col = table.getColumnModel().getColumn(26);
	    col.setCellRenderer(new ResourcesTableCellRenderer());
		add(new JScrollPane(table),BorderLayout.CENTER);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1024,840);
		pack();
	}
	public static void main(String[] args) {
		new MainWindow("Lessons Shionn").setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Save"){
			String nameClass=textField[3].getText();
			boolean l01=checkBoxLessons[0].isSelected();
			boolean l02=checkBoxLessons[1].isSelected();
			boolean l03=checkBoxLessons[2].isSelected();
			boolean l04=checkBoxLessons[3].isSelected();
			boolean l05=checkBoxLessons[4].isSelected();
			boolean l06=checkBoxLessons[5].isSelected();
			boolean l07=checkBoxLessons[6].isSelected();
			boolean l08=checkBoxLessons[7].isSelected();
			boolean l09=checkBoxLessons[8].isSelected();
			boolean l10=checkBoxLessons[9].isSelected();
			boolean l11=checkBoxLessons[10].isSelected();
			boolean l12=checkBoxLessons[11].isSelected();
			boolean l13=checkBoxLessons[12].isSelected();
			boolean l14=checkBoxLessons[13].isSelected();
			boolean l15=checkBoxLessons[14].isSelected();
			boolean l16=checkBoxLessons[15].isSelected();
			boolean l17=checkBoxLessons[16].isSelected();
			boolean l18=checkBoxLessons[17].isSelected();
			boolean l19=checkBoxLessons[18].isSelected();
			boolean l20=checkBoxLessons[19].isSelected();
			boolean l21=checkBoxLessons[20].isSelected();
			String herite=textField[0].getText();
			String implementes=textField[1].getText();
			String description=textField[2].getText();
			boolean mainClass=checkBoxMainResources[0].isSelected();
			boolean resources=checkBoxMainResources[1].isSelected();
			String[] nameResources={""};
			String fileName="/home/blackallsun/workspace/JeuxDeRoleBizar/lessonSlick1.json";
			for(String name:nameOfClass)
				model.saveJSON(fileName,name);
			model.add(nameClass,l01, l02, l03, l04, l05, l06, l07, l08, l09, l10,
					l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21,
					herite, implementes, description, mainClass, resources, nameResources);}
		else if(e.getActionCommand()=="Open"){
			String fileName="/home/blackallsun/workspace/JeuxDeRoleBizar/lessonSlick.json";
			
			for(String name:nameOfClass)
				model.openJSon(fileName,name);}
		else if(e.getActionCommand()=="Clear"){
			model.clear();}
	}

}
