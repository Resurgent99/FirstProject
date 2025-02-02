package JavaRush2901;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaRushQuest29013 {
    Scanner scanner = new Scanner(System.in);

    List<Integer> massive_int = new ArrayList<>();

    public void setMassive_int(){
        for (int i = 0; i < 10; i++){
            massive_int.add(i, scanner.nextInt());
        }
    }

    public void sortMassive_int(){
        int n = massive_int.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (massive_int.get(j) < massive_int.get(j + 1)) {
                    int temp = massive_int.get(j);
                    massive_int.set(j, massive_int.get(j + 1));
                    massive_int.set(j + 1, temp);
                }
            }
        }
    }

    public void showMassive29013(){
        System.out.println(massive_int);
    }
}
