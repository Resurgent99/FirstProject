package JavaRush0902.DopBlock;
//Написать в цикле обратный отсчёт от 10 до 0. Для задержки иcпользовать Thread.sleep(100);
//Обернуть вызов sleep в try..catch.
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
