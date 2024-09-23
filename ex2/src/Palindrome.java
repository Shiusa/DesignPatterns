public class Palindrome implements Strategy{

  @Override
  public boolean estValide(String mot) {
    if (mot == null) {
      return false;
    }
    StringBuffer stringBuffer = new StringBuffer(mot);
    return mot.equals(stringBuffer.reverse().toString())&&mot.length()>1;
  }
}
