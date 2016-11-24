

public class Temp{
  public static void main(String[] args){
    Temp tm = new Temp();
    tm.say("Chinese");
    tm.say("English");

    boolean result = tm.add(2,4);
     System.out.println(result);
  }  
  void say(String language) {
    System.out.println("หตฃบ"+language);
  }
  boolean add(int x, int y){
      boolean g = x<y;
    return g;
  }

}