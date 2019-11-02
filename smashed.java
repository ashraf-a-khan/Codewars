import java.util.Arrays;

public class SmashWords {

	public static String smash(String... words) {
    // TODO Write your code below this comment please
    String finalword =  "";
    for(int i = 0; i < words.length; ++i){
      finalword += words[i] ;
      if(i != words.length - 1) 
           finalword += " ";
    }
    return finalword;
  }
}