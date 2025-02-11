package JavaRush0902.DopBlock;

public class DownCount {
  public void method1() throws InterruptedException {
    int n = 10;
    for(int i = 10; i >=0; i--){
      n--;
      Thread.sleep(100);
      System.out.println(n);
    }
  }

}
