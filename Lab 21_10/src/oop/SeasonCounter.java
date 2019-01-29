package oop;

public class SeasonCounter extends ModNCounter {

	
	private static String[] names =  {"spring", "summer", "fall", "winter"};

    private int cycleLength;
	
	public SeasonCounter() {
        // fill-in by creating an object with 4 as the modulus
		super(4);
    }
	

	@Override
	public String toString() {
        // fill-in so it returns the season name

         if(super.value() == 0){
             return names[0];
         }
         if(super.value() == 1) {
             return names[1];
         }
         if(super.value() == 2){
             return names[2];

         }else{
             return names[3];
         }

	}
  	
}
