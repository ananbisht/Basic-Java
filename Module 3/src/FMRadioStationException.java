
public class FMRadioStationException extends Exception{
	public FMRadioStationException (String stationcallsign, float frequency) {
		
		 super("call sign invalid : " + stationcallsign + " or frequency : " + frequency);
		
	}
	
}


