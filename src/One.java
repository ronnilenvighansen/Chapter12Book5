import java.util.Scanner;

/**
 * Created by Ronni on 9/15/2016.
 */
public class One
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        first(console);
        second(console);
    }

    public static int first(Scanner console)
    {
        int i = 0;
        try
        {
            i = Integer.parseInt(console.next());
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Input is nonnummeric.");
        }
        return i;
    }

    public static int second(Scanner console)
    {
        int i = Integer.parseInt(console.next());
        return i;
    }
}
