public class VariablesAndDataTypes{
	
	public static void main (String[] args){
		
		
		String temp = "The temperature in Baguio City has warmed throughout the years.";
		char letter = 'A';
		float degreesDawn = 16.0f;
		double degreesNoon = 23.5;
		byte hours = 24;
		short days= 7;
		int weeks= 4;
		long months= 12;
		
		boolean checking = true;
		if(checking){
      System.out.println(temp + "\n\t" + letter + " recent news article stated that the City has been averaging " + degreesDawn
       + " degrees celcius at dawn and " + degreesNoon + " at noon." + "\n\t\t" + "Regardless, lowlanders still feel cold "+
       hours + " hours a day, "+ days +" days a week, " + weeks + " weeks per month and " + months + " months"+  " each year." );
       
      
		
		}
		else{
      System.out.println("The boolean was changed to a False value.");
		
		
		}
		
		
		
		
	}
	
}