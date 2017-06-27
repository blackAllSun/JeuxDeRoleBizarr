
public class TestReflection {
	String[] nameOfClass={"BattleCommand","BattleController","BattleEnnemy",
			"BattleGame","BattleGameState","BattleHud",
			"BattlePlayer","MainScreenGameState","Map",
			"MapCamera","MapGameState","MapHud","MapPlayer",
			"MapPlayerController","MapTriggerController","WindowGame",
			"MapGame","CharacterGame","CameraGame","CollisionGame",
			"TriggerGame","MusicGame","ChangeMapGame","ObjectsGame",
			"Player","Camera","TriggerController","PlayerController",
			"ControllerGame","HudGame","Hud","AnalogGame","StateGame"};
	public TestReflection(){
		try {
			for(String name : nameOfClass){
				for(int i=1;i<=21;i++){
					 Class cl = Class.forName("lesson"+i+"."+name);
					 if(cl.getEnumConstants()!=null)
						 System.out.println(cl.getName()); 
					 
					 if(cl.isMemberClass())
						 System.out.println(cl.getName()); 
					 System.out.println(cl.getPackage().getName());}}}
			catch (ClassNotFoundException e) {System.out.println(e.getMessage());}
		   
		    catch (IllegalArgumentException e) {System.out.println(e.getMessage()); }}
		
	public static void main(String[] args) {

			new TestReflection();

	}

}
