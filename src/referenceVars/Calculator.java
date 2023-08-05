package src.referenceVars;
/* Method overloading:
concept when you have the same method, accepting different amount of parameters or different type of parameters or different return type
 */
public class Calculator {
    //sum
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static int sum(int[] nums) {
        int res = 0;
        for (int el : nums) res = res + el;
        return res;
    }

    public static int sum(int[] nums, int[] nums1){
        int res = 0;
        for (int el : nums) res=res+el;
        for (int el : nums1) res=res+el;
                return res;
            }
        }


    //sub

    //mul

    //div






