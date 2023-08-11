public class SecureTester{
  //https://www.codewars.com/kata/526dbd6c8c0eb53254000110/train/java
    private static boolean check(char s){
      if((s >= 'a' && s <= 'z') ||
        (s >='A' && s <= 'Z') ||
        (s >= '0' && s<= '9')){
        return true;
      }
      return false;
    }
    
    public static boolean alphanumeric(String s){
      if(s.length() == 0) return false;
      for(int i = 0; i < s.length(); i++){
        if(!check(s.charAt(i)))
          return false;
      }
      return true;
    }
  
  }