import java.util.*;

public class Main {
    public static void main(String[] args) {
//Todo бул жерде 3 массив бар. Бири рандомдон толтурат экинчиси жуп сан, учунчусу так сандарды чыгарат.
        Random random = new Random();
        List<Integer> num = new ArrayList<>();
        List<Integer> sum1 = new ArrayList<>(); //Жуп сан чыгарган массив.
        List<Integer> sum2 = new ArrayList<>(); // Так сан.
        for (int i = 0; i < 100; i++) {
            num.add(random.nextInt(0, 50));
            System.out.print(num.get(i)+" ");
            if (num.get(i) % 2 == 0) {
                sum1.add(num.get(i));
            } else {
                sum2.add(num.get(i));
            }
        }
        System.out.println("\nЖуп сандар: "+sum1);
        System.out.println("Так сандар: "+sum2);
    }
}