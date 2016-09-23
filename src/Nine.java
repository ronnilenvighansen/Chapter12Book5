import java.util.Scanner;

/**
 * Created by Ronni on 22-Sep-16.
 */
public class Nine
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a bin number: ");
        String bin = input.nextLine();
        System.out.println(binToDecimal(bin.toUpperCase()));
    }

    public static int binToDecimal(String bin)
    {
        int binaryValue = 0;
        for(int i = 0; i < bin.length(); i++)
        {
            if(bin.charAt(i) == '0' || bin.charAt(i) == '1')
            {
                continue;
            }
            else
            {
                throw new BinFormatException();
            }
        }
        binaryValue = Integer.parseInt(bin, 2);
        return binaryValue;
    }
}