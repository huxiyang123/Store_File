public class TestPrime{
  public static void main(String args []){
    int j=0;
    for(int num1=100,num2=200;num1<num2;num1++){
      int x = 1;
      for(int i=2;i<num1-1;i++){
        if(num1%i==0){
          x= -x;
          break;
        }
      }
      if(x==1){
        System.out.println(num1+"是素数");
        j++;
      }
    }
    System.out.println("共有"+j);
  }
}