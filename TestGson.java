package doc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class TestGson {
	String fileName="/home/blackallsun/workspace/JeuxDeRoleBizar/lessonSlick.json";
	String[] nameOfClass={"BattleCommand","BattleController","BattleEnnemy",
			"BattleGame","BattleGameState","BattleHud",
			"BattlePlayer","MainScreenGameState","Map",
			"MapCamera","MapGameState","MapHud","MapPlayer",
			"MapPlayerController","MapTriggerController","WindowGame",
			"MapGame","CharacterGame","CameraGame","CollisionGame",
			"TriggerGame","MusicGame","ChangeMapGame","ObjectsGame",
			"Player","Camera","TriggerController","PlayerController",
			"ControllerGame","HudGame","Hud","AnalogGame","StateGame"};
	public TestGson() {
		for(String name:nameOfClass)
			openJSon(fileName,name);
	}
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
		   Boolean main = (Boolean) nameBattleCommand.get("main");
		   System.out.println("main : "+main);
		   Boolean resources = (Boolean) nameBattleCommand.get("resources");
		   System.out.println("resources : "+resources);
		   JSONArray listLessons = (JSONArray) nameBattleCommand.get("lessons");
		   System.out.println("Lessons : "+listLessons);
		   JSONArray listNameResources = (JSONArray) nameBattleCommand.get("nameResources");
		   System.out.println("Lessons : "+listNameResources);

	} catch (FileNotFoundException e1) {e1.printStackTrace();
	} catch (ParseException e1) {e1.printStackTrace();
	} catch (IOException e1) {e1.printStackTrace();}
	}



	
		public static void main(String[] args) {
		new TestGson();}

}
