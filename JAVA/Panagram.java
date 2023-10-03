import java.util.Scanner; 

public class Panagram {
    private static boolean isPanagram(String sentence){
      int [] mapping = new int[26];
      
      sentence =  sentence.toLowerCase();
      
      // for(int i)
      for(int i = 0; i < sentence.length(); i++){
        if(Character.isLetter(sentence.charAt(i))){
          mapping[sentence.charAt(i) - 'a'] = 1;
        }
      }
      
      for(int i = 0; i < mapping.length; i++){
        if(mapping[i] == 0) return false;
      }
      
      return true;
    }
  
    public static void main(String[] args) {
      Scanner cin = new Scanner(System.in);
      
      String sentence = cin.nextLine();
      
      if(isPanagram(sentence))
        System.out.println("It is Panagram.");
      else
        System.out.println("It is a NOT Panagram.");
  }
}