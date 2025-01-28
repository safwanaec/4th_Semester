package codeforces;

import java.util.Scanner;

public class Kevin_and_Arithmetic {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int n;
        int[] nums;
        int[] point = new int[t];
        boolean hasEv;

        for (int x = 0; x < t; x++) {
            n = inp.nextInt();
            nums = new int[n];
            point[x] = 0;
            hasEv = false;

            for (int i = 0; i < n; i++) {
                nums[i] = inp.nextInt();
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0 && !hasEv) {
                    point[x]++;
                    hasEv = true;
                } else if (nums[i] % 2 != 0) {
                    point[x]++;
                }
            }
            if (!hasEv)
                point[x]--;
        }

        for (int i = 0; i < point.length; i++) {
            System.out.println(point[i]);
        }
        inp.close();

    }
}
