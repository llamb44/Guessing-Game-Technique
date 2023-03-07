/*
Purpose:
we're gonna try to make a guessing game?

*/
import java.util.*;

public class GuessingGame
{
    /*public static void main( String args[])
    {  
        Summation();
        //sixteenPlace();
    }
    */


    
    public static int oddNum()
    {
        //tests if the user's chosen chosen number is odd
        //*the one's place*

        int[] oddNums= {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,
            55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99,101,103,105,107,109,111,113,115,117,119};
        Display(oddNums);

        //getting the response from the user about whether or not their number is odd
        return Checking(); 
    }

    public static int twoPlace()
    {
        
        //the two's place

        int[] twoNums= {2, 3, 6, 7, 10, 11, 14, 15, 18, 199, 22, 23, 26, 27, 30, 31, 34, 35, 38, 39, 42, 43, 46, 47, 50, 51, 54, 55,
            58, 59, 62, 63, 66, 67, 70, 71, 74, 75, 78, 79, 82, 83, 86, 87, 90, 91, 94, 95,  98, 99, 102, 103, 106, 107, 110, 111, 114, 115, 118, 119};
        Display(twoNums);

        //getting the response from user

        //PROBLEM
        
        //System.out.println("number for two place "+ Checking());
        return (Checking()*2);
    }

    public static int fourPlace()
    {
        //*the fours place*
        int four;
        int[] fourNums= {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31, 36, 37, 38, 39, 44, 45, 46, 47,
         52, 53, 54, 55, 60, 61, 62, 63, 68, 69, 70, 71, 76, 77, 78, 79, 84, 87, 92, 93, 94, 95, 100, 101, 102, 103, 108, 109, 110, 111, 116, 117, 118, 119, 124, 125};

        Display(fourNums);

        //getting response from user
        //times 4 because Checking either returns 1 or 0 so I need this to get the correct sum later on
        four= Checking();
        return four* 4;
    }

    public static int eightPlace()
    {
        int[] eightNums= {8, 9, 10, 11, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31, 40, 41, 42, 43, 44, 45, 46, 47, 56, 57, 58, 59, 60, 61, 62, 63, 72,
            73, 74, 75, 77, 88, 89, 90, 91, 92, 93, 94, 95, 104, 105, 106, 107, 108, 109, 110, 111, 120, 121, 122, 123, 124, 125, 126, 127};

        Display(eightNums);  
        
        int eight= Checking();
        return eight*8;
    }

    public static int sixteenPlace()
    {
        int[] sixteenNums= {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
             61, 62, 63, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 112, 113, 114, 115, 116, 116, 117, 118, 119, 120, 121, 122};

        Display(sixteenNums);

        int sixteen= Checking();
        return sixteen*16;
    }

    public static int thirtyTwoPlace()
    {
        int[] thirtyTwoNums= {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62,
            63, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123};
        Display(thirtyTwoNums);

        int thirtyTwo= Checking();
        return thirtyTwo*32;
    }

    public static int sixtyFourPlace()
    {
        int[] sixtyFourNums= {64, 65, 67, 68, 69, 70, 71,  72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95,
            96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124};

        Display(sixtyFourNums);

        int sixtyFour= Checking();
        return sixtyFour*64;
    }



    
    public static int Checking()
    {
        //function that checks if the number is in the array
        Scanner scanner= new Scanner (System.in);
        System.out.println("Is your number in this table? (Y/N)");
        String s= scanner.next();
        char response= s.charAt(0);
        
        
        //testing
        //char response= 'Y';
        
        /*
        removing because it fucks up the structure but... i'm sad about it
        do
        {
            System.out.println("You have entered an invalid response \n"+ "response "+ response+ "\n Try again");
            System.out.println("Is your number in this table? (Y/N)");
            s= input.next();
            response= s.charAt(0);
        }
        while(response!= 'Y' && response != 'N');
        */

        
        
        while(response != 'Y' && response != 'N')
        {
            System.out.println("You have entered an invalid response \n"+ "\""+ response+ "\""+ "\n Try again");
            System.out.println("Is your number in this table? (Y/N)");
            s= scanner.next();
            response= s.charAt(0);
        }
        

        if ( response == 'N')
        {
            return 0;
        }

        else
        {
            return 1;
        }
    }


    public static void Display(int[] arr)
    {
        //displays the array how i want
        int count=0;
        System.out.println("");
        while(count<arr.length)
        {
            System.out.printf( "%4s", String.valueOf(arr[count]+ " "));
            count++;
            if(count%10==0)
            {
                System.out.println();
            }
        }
        System.out.println("");
    }

    public static void main(String args[])
    {
        /*
        int sum;
        sum= (fourPlace())+(eightPlace());
        */

        //I wanna randomly decide the order of the array
           //but how??

        //1 2 4 8 16 32 64 128
        //0 1 2 3  4  5  6   7



        int sum= oddNum()+ twoPlace()+ fourPlace()+ eightPlace()+ sixteenPlace()+ thirtyTwoPlace()+sixtyFourPlace();
        System.out.println("Is your number: "+ sum);
    }





}
