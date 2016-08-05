import java.io.File;
import java.util.Arrays;

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
	
	public static void Combination()
	{
		private static void comb2(String prefix, String s) {
	        System.out.println(prefix);
	        for (int i = 0; i < s.length(); i++)
	            comb2(prefix + s.charAt(i), s.substring(i + 1));
	}
	
	public static String Permutation(Tile<> tile,int k,Tile<> perm)
	{
	        if (k == tile.length) 
	        {
	            for (int i = 0; i < tile.length; i++) 
	            {
	                perm[i].letter=tile[i].letter;
	                return Perm;
	            }
	        } 
	        else 
	        {
	            for (int i = k; i < tile.length; i++) 
	            {
	                char temp = tile[k].letter;
	                tile[k].letter = a[i].letter;
	                tile[i].letter = temp;
	 
	                Permutation(tile, k + 1,perm);
	 
	                temp = tile[k].letter;
	                tile[k].letter = tile[i].letter;
	                tile[i].letter = temp;
	            }
	        }
	}
	
	
	public static String sortLetters(String word){
		String sortedWord="";
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        sortedWord = new String(chars);
        return sortedWord;
	}
	
	public static void permutation(String str) { 
		String sortWord = sortLetters(str);
		genanagrams(str); 
	}

	private static void genanagrams(String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < str.length; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
		
	public static boolean isValidWord(Tiles[] tile ){
			
			String word="";
			
			for(int i = 0;i < tile.length; i++ ){
				
				word += (tile[i].letter); 
				
			}
			System.out.println(word);
			try{
				Scanner s = new Scanner(new File("C:/Users/sganeriwal/Desktop/PYPLtraining/Anagrams/sowpods.txt"));
				String line ="";
				while(s.hasNextLine()){
					line = s.nextLine();
					if(line.equalsIgnoreCase(word)){
						return true;
					}
				}
			}
			catch(Exception E){
				System.out.println("Exception"+E);
			}
			
			return false;
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
		r.combination();
	}

}
