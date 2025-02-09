package JavaRush0902;
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//int a = 42 / 0;
public class JRQArethmeticExeption {
    public void catchExeption(){
    System.out.println("Program starts");
        try
    {
        System.out.println("Before method1 calling");
        method1();
        System.out.println("After method1 calling. Never will be shown ");
    }
        catch (ArithmeticException e)
    {
        System.out.println("Division by zero. Exception has been caught");
    }
        System.out.println("Program is still running");
}

public void method1()
{
    int a = 42;
    int b = 0;
    System.out.println(a / b);
}
}
