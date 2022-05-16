
public class Executive {
	public static void main(String[] args) {
		 String[] stationcallsign = {"ABCD", "EFGH", "QBRZ", "NCIS", "ACBN"};
		 float[] frequency = {(float) 88.0, (float) 89.0, (float) 109.3, 108, (float) 204.3};
		 FMRadioStation radiostation[]= new FMRadioStation[8];
		 int count=0;
		try {
		 for(int i=0;i<stationcallsign.length;i++){
			 FMRadioStation station1 = new FMRadioStation(stationcallsign[i], frequency[i]);
			 radiostation[count]=station1;
			 count++;
			 if (count==8) {
				 break;
			 }
		 }
	}
		 catch (FMRadioStationException e){
			 System.out.print("Error");
			 System.out.println("Invalid station input");
			// System.out.println(e.getMessage());
		 }
		 
		
		 System.out.println("\n FMRADIO STATION OBJECTS: \n");
	     int i=0;
	     while (i<8) {
	    	 System.out.println(radiostation[i]);
	    	 i++;
	     }

}
}
