package zte;

import org.junit.Test;

import java.util.*;

/**
 * Created by Kyle on 2017/8/25.
 */
public class Solution {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       while (scanner.hasNext()) {
           String s = scanner.nextLine();
           int k = Integer.parseInt(scanner.nextLine());

           String[] strings = s.split(" ");
           int[] ints = new int[strings.length];
           for (int i=0; i<strings.length; i++) {
               ints[i] = Integer.parseInt(strings[i]);
           }

           Arrays.sort(ints);
           System.out.println(ints[strings.length - k]);
       }
   }
}
