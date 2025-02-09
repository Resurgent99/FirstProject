package JavaRush0902;
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//String s = null;
//String m = s.toLowerCase();
public class JRQExeptionString {
    public void catchExeption(){
        System.out.println("Program starts");
        try
        {
            System.out.println("Before method1 calling");
            method1();
            System.out.println("After method1 calling. Never will be shown ");
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException.Exception has been caught");
        }
        System.out.println("Program is still running");
    }

    public void method1()
    {
        String s = null;
        String m = s.toLowerCase();
    }
}
