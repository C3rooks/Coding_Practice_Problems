/**
 * Created by crookscc2 on 1/3/2017.
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problems {

public void setupfindPerimeter()
{
    int tests = 3;
    FindPerimeterTest test = new FindPerimeterTest();


    for(int i = 0; i <= tests; i++)
    {
        if(i == 0 )
        {
            System.out.println("Testing Matrix: ");
            int [][] matrix = new int[2][4];

            matrix[0][0] = 1;
            matrix[0][1] = 0;
            matrix[0][2] = 0;
            matrix[0][3] = 1;


            matrix[1][0] = 1;
            matrix[1][1] = 1;
            matrix[1][2] = 1;
            matrix[1][3] = 1;
            for(int j = 0; j < matrix.length; j++)
            {
                for(int k = 0; k < matrix[j].length; k++)
                {
                    System.out.printf("%5d ", matrix[j][k]);
                }
                System.out.println();
            }

            test.setTestAnswer(i +1,findPerimeter(matrix));
        }
        if(i == 1)
        {
            int [][] matrix = new int[2][2];

            matrix[0][0] = 1;
            matrix[0][1] = 0;

            matrix[1][0] = 1;
            matrix[1][1] = 1;

            for(int j = 0; j < matrix.length; j++)
            {
                for(int k = 0; k < matrix[j].length; k++)
                {
                    System.out.printf("%5d ", matrix[j][k]);
                }
                System.out.println();
            }
            test.setTestAnswer(i +1,findPerimeter(matrix));
        }
    }
    Result result = JUnitCore.runClasses(FindPerimeterTest.class);
    for (Failure failure : result.getFailures()) {
        System.out.println(failure.toString());
    }

    System.out.println(result.wasSuccessful());

}

    public int findPerimeter(int[][]matrix)
    {
        int position = 0;
        int original = 0;

        boolean empty = false;
        for(int [] array : matrix){
            for(int val : array){
                if(val!=0){
                    empty=true;
                    break;
                }
            }
        }


        if(empty) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 1) {
                        original++;
                        original += position;
                    } else {
                        position++;
                    }
                }
                original++; // this is for the right side end.

                if (matrix[i][0] == 1)
                    original++;

                position = 0;
                System.out.println();
            }
        }

        return original;
    }













    public static void uniqueCharacters(String unique)
    {
        boolean result = false;
        for(int i = 0; i <= unique.length()-1; i++)
        {
            if((int) unique.charAt(i) > 127)
            {
                result = false;
                break;
            }
            result = true;
        }
        if(result) System.out.println("There are all unique characters");
        else{
            System.out.println("There are non unique characters");
        }

    }

    public void setupDisappearingNumbers()
    {
        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> myList = findDisappearingNumbers(nums);
    }
    public List<Integer> findDisappearingNumbers(int[]nums)
    {
        List<Integer> myList = new ArrayList<Integer>();

        char copy[] = new char [nums.length];

        for(int i = 0; i <= copy.length-1; i++)
    {
        copy[nums[i]-1] = '*';
    }
    int counter = 1;
        for(char c: copy)
        {
            if(c != '*'){
                System.out.println("Missing: " + counter);
                myList.add(counter);

            }
            counter++;
        }
        return myList;
    }




    public void hammingDistance(int x, int y)
    {
        String binaryX = String.format("%4s", Integer.toBinaryString(x)).replace(' ', '0');
        String binaryY = String.format("%4s", Integer.toBinaryString(y)).replace(' ', '0');

        /*
        System.out.println(x + " to binary : " +binaryX);
        System.out.println(y + " to binary : " +binaryY);
        int counter = 0;
        for(int i  = 0; i <= binaryX.length()-1; i++)
        {
            if(binaryX.charAt(i) != binaryY.charAt(i))
            counter++;
        }
        */

        System.out.println(Integer.bitCount(x ^ y));
    }



    public void setupHammingDistance()
    {
        Scanner inScan = new Scanner(System.in);
        System.out.println("Please enter first value:");
        int x = inScan.nextInt();
        System.out.println("Please enter second value:");
        int y = inScan.nextInt();
        hammingDistance(x,y);
    }






















}
