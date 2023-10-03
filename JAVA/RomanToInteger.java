public class RomanToInteger{
  public static int getInt(char c){
    switch(c){
      case 'I': return 1;
      case 'V': return 5;
      case 'X': return 10;
      case 'L': return 50;
      case 'C': return 100;
      case 'D': return 500;
      case 'M': return 1000;
      default: return -1;
    }
  }

  public static int getAns(String roman){
    int ans = 0;
    for(int i=0; i < roman.length(); i++){
      if(i == roman.length() - 1){
        ans += getInt(roman.charAt(i));
        break;
      }
      if(getInt(roman.charAt(i)) < getInt(roman.charAt(i+1))){
        ans -= getInt(roman.charAt(i));
      }else{
        ans += getInt(roman.charAt(i));
      }
    }
    return ans;
  }

  public static void main(String[] args){
    String [] romans = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
    for(int i=0; i < romans.length; i++){
      System.out.println(getAns(romans[i]));
    }
  }
}