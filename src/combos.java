import java.util.ArrayList;


public class combos extends control {
	public static int Aces(ArrayList<Integer> diceList){
		
		int aceScore = 0;
		for (Integer dice : diceList){
			if (dice == 1){
				aceScore += 1;
			}	
		}
		 
		return aceScore;
	}
	
	public static int Twos(ArrayList<Integer> diceList){
		int twoScore = 0;
		for (Integer dice : diceList){
			if (dice == 2){
				twoScore += 2;
			}	
		}
		 
		return twoScore;
	}
	
	public static int Threes(ArrayList<Integer> diceList){
		int threeScore = 0;
		for (Integer dice : diceList){
			if (dice == 3){
				threeScore += 3;
			}	
		}
		 
		return threeScore;
	}
	
	public static int Fours(ArrayList<Integer> diceList){
		int fourScore = 0;
		for (Integer dice : diceList){
			if (dice == 4){
				fourScore += 4;
			}	
		}
		 
		return fourScore;
	}
	
	public static int Fives(ArrayList<Integer> diceList){
		int fiveScore = 0;
		for (Integer dice : diceList){
			if (dice == 5){
				fiveScore += 5;
			}	
		}
		 
		return fiveScore;
	}
	
	public static int Sixes(ArrayList<Integer> diceList){
		int sixScore = 0;
		for (Integer dice : diceList){
			if (dice == 6){
				sixScore += 6;
			}	
		}
		 
		return sixScore;
	}

	@Override
	public int Aces() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Threes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Fours() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Fives() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Sixes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Twos() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
