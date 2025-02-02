package JavaRush2901;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaRushQuest29014 {
    Scanner scanner = new Scanner(System.in);

    List<Integer> big_massive = new ArrayList<>();
    List<Integer> first_half_massive = new ArrayList<>();
    List<Integer> second_half_massive = new ArrayList<>();
    public void setBig_massive(){
        for (int i = 0; i < 20; i++){
            System.out.println("Введите число " + (i + 1));
            big_massive.add(scanner.nextInt());
        }
    }
    public void sortBigMassive(){
        int n = big_massive.size();
        for (int i = 0; i < n; i++) {
            if(i < (n/2)){
                first_half_massive.add(big_massive.get(i));
            } else {
                second_half_massive.add(big_massive.get(i));
            }

        }
    }

    public void showMassive29014(){
        System.out.println(big_massive);
        System.out.println(first_half_massive);
        System.out.println(second_half_massive);
    }
}
