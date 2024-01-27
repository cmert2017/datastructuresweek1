package practice;

import java.util.Arrays;

public class TwoSumIntegers {



    public static int[] twoSum_nestedloop(int[] inputArr, int target) {
        int[] result=new int[2];

        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr.length; j++) {

                if(inputArr[i]+inputArr[j]==target && i!=j){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;  //time complexity is O(n^2)
    }


    public static int[] twoSum(int[] inputArr, int target) {
        int[] result=new int[2];



        for (int i = 0; i < inputArr.length; i++) {




        }
        return result;
    }



    public static void main(String[] args) {

        int[] inputArr = {8,0,5,3,7,5,2};
        int target = 8;
        System.out.println("twoSum(inputArr, target) = " + Arrays.toString(twoSum_nestedloop(inputArr, target)));

    }

}
