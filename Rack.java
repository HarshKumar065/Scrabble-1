
public class Rack {
	Tiles[] rack = new Tiles[7];
	static String maxWord;
	static int maxScore;
	
	public Rack(String s){
		for(int i =0 ;i < s.length();i++){
			rack[i].letter = s.charAt(i);
		}
		maxWord = "";
		maxScore = 0;
	}
	
	public static int calcScore(Tiles[] tile){
		int score = 0;
		for(int i = 0;i<tile.length;i++){
			score += tile[i].score;
		}
		return score;
	}
	
	public static void checkMaxWord(Tiles[] tile, int score){
		if(score >= maxScore){
			maxScore = score;
			for(int i = 0;i<tile.length;i++){
				maxWord += tile[i].letter;
		}
		}
		maxWord += " ";
	}
	
	public static void main(String[] args){
		String input = args[0];
		Rack r = new Rack(input);
		
	}

}
