import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.io.FileReader;
import java.io.IOException;

public class chapter7 {
    public static void main(String[] args) throws IOException {
                FileReader file = new FileReader("numbers.txt");
                int[] integers = new int[10];
                int i = 0;
                try {
                    Scanner input = new Scanner(file);
                    while (input.hasNext()) {
                        integers[i] = input.nextInt();
                        i++;
			}
                    
               }catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Arrays.toString(integers));
                int sum = IntStream.of(integers).sum();
               	System.out.println("The sum of all numbers in documet is: " + (double)sum);
               	System.out.println("The Avarage is " + (double) sum/10);
            }
        }