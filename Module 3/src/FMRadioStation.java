
public class FMRadioStation {
	String stationcallsign;
	float frequency;
	
	public FMRadioStation (String stationcallsign, float frequency) throws FMRadioStationException{
		try {
		if(stationcallsign.length()==4 && (stationcallsign.startsWith("A") || stationcallsign.startsWith("K") || stationcallsign.startsWith("N") || stationcallsign.startsWith("W")) && (frequency<=108 && frequency>88)) {
			boolean q=true;
			while (q==true) {
				for (int i=0; i<stationcallsign.length(); i++) {
					char n = stationcallsign.charAt(i);
					q=Character.isUpperCase(n);
				}
			}
			
			
				
					
		}
		}
		
		catch (Exception e) {
			throw new FMRadioStationException(stationcallsign, frequency);
		}
		this.stationcallsign = stationcallsign;
        this.frequency = frequency;
	}
}
