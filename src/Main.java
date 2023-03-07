import java.util.*;

public class Main {
    public static void main(String[] args) {
//Todo бул жерде 3 массив бар. Бири рандомдон толтурат экинчиси жуп сан, учунчусу так сандарды чыгарат.
        Random random = new Random();
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            num.add(random.nextInt(0, 50));
            System.out.println(num.get(i));
            if (num.get(i) % 2 == 0) {
                List<Integer> sum1 = new ArrayList<>(List.of(num.get(i))); //Жуп сан чыгарган массив.
                System.out.println(sum1);
            } else {
                List<Integer> sum2 = new ArrayList<>(List.of(num.get(i))); // Так сан.
                System.out.println(sum2);
            }

        }
    }
}