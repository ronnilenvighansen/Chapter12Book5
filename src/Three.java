import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ronni on 9/15/2016.
 */
public class Three
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] data = new int[100];
        addToList(data);
        for(int i = 0; i < data.length; i++)
        {
            System.out.println(data[i]);
        }
        System.out.println();
        System.out.println("Insert index");
        outOfBoundsOrNah(input.nextInt(), data);
    }

    public static void outOfBoundsOrNah (int index, int[] data)
    {
        if (index < data.length && index >= 0)
        {
            System.out.println(data[index]);
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("Out of Bounds");
        }
    }

    public static void addToList(int[] data)
    {
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(100);
        }
    }
}
