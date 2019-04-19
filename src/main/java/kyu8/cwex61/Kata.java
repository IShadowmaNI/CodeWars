package kyu8.cwex61;

/*

Subtract the sum
NOTE! This kata can be more difficult than regular 8-kyu katas

Complete the function which get an input number n such that n >= 10 and n < 10000, then:

Sum all the digits of n.
Subtract the sum from n, and it is your new n.
If the new n is in the list below return the associated fruit, otherwise return back to task 1.

Example
n = 325
sum = 3+2+5 = 10
n = 325-10 = 315 (not in the list)
sum = 3+1+5 = 9
n = 315-9 = 306 (not in the list)
sum = 3+0+6 = 9
n =306-9 = 297 (not in the list)
.
.
.
...until you find the first n in the list below.

There is no preloaded code to help you. This is not about coding skills; think before you code

1-kiwi
2-pear
3-kiwi
4-banana
5-melon
6-banana
7-melon
8-pineapple
9-apple
10-pineapple
11-cucumber
12-pineapple
13-cucumber
14-orange
15-grape
16-orange
17-grape
18-apple
19-grape
20-cherry
21-pear
22-cherry
23-pear
24-kiwi
25-banana
26-kiwi
27-apple
28-melon
29-banana
30-melon
31-pineapple
32-melon
33-pineapple
34-cucumber
35-orange
36-apple
37-orange
38-grape
39-orange
40-grape
41-cherry
42-pear
43-cherry
44-pear
45-apple
46-pear
47-kiwi
48-banana
49-kiwi
50-banana
51-melon
52-pineapple
53-melon
54-apple
55-cucumber
56-pineapple
57-cucumber
58-orange
59-cucumber
60-orange
61-grape
62-cherry
63-apple
64-cherry
65-pear
66-cherry
67-pear
68-kiwi
69-pear
70-kiwi
71-banana
72-apple
73-banana
74-melon
75-pineapple
76-melon
77-pineapple
78-cucumber
79-pineapple
80-cucumber
81-apple
82-grape
83-orange
84-grape
85-cherry
86-grape
87-cherry
88-pear
89-cherry
90-apple
91-kiwi
92-banana
93-kiwi
94-banana
95-melon
96-banana
97-melon
98-pineapple
99-apple
100-pineapple

 */

import java.util.HashMap;

public class Kata {

    public static String subtractSum (int n) {

        if (n < 10 || n > 10000) {
            throw new IllegalArgumentException("Invalid input. Use n in range: 10 <= n < 10000.");
        }

        int[] arrayKiwi = new int[] {1, 3, 24, 26, 47, 49, 68, 70, 91, 93, 0, 0};
        int[] arrayPear = new int[] {2, 21, 23, 42, 44, 46, 65, 67, 69, 88, 0, 0};
        int[] arrayBanana = new int[] {4, 6, 25, 29, 48, 50, 71, 73, 92, 94, 96, 0};
        int[] arrayMelon = new int[] {5, 7, 28, 30, 32, 51, 53, 74, 76, 95, 97, 0};
        int[] arrayPineapple= new int[] {8, 10, 12, 31, 33, 52, 56, 75, 77, 79, 98, 100};
        int[] arrayApple = new int[] {9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99, 0};
        int[] arrayCucumber = new int[] {11, 13, 34, 55, 57, 59, 78, 80, 0, 0, 0, 0};
        int[] arrayOrange = new int[] {14, 16, 35, 37, 39, 58, 60, 83, 0, 0, 0, 0};
        int[] arrayGrape = new int[] {15, 17, 19, 38, 40, 61, 82, 84, 86, 0, 0, 0};
        int[] arrayCherry = new int[] {20, 22, 41, 43, 62, 64, 66, 85, 87, 89, 0, 0};

//        HashMap<String, Integer[]> fruits = new HashMap<>();
//        fruits.put("kiwi", arrayKiwi);
//        fruits.put("pear", arrayPear);
//        fruits.put("banana", arrayBanana);
//        fruits.put("melon", arrayMelon);
//        fruits.put("pineapple", arrayPineapple);
//        fruits.put("apple", arrayApple);
//        fruits.put("cucumber", arrayCucumber);
//        fruits.put("orange", arrayOrange);
//        fruits.put("grape", arrayGrape);
//        fruits.put("cherry", arrayCherry);

        int sum;
        int copyN;
        do {
            sum = 0;
            copyN = n;
            while (copyN != 0) {
                sum += copyN % 10;
                copyN /= 10;
            }
            n -= sum;
        } while (n > 100);

        for (int i = 0; i < arrayKiwi.length; i++) {
            if (n == arrayKiwi[i]) {
                return "kiwi";
            } else if (n == arrayPear[i]) {
                return "pear";
            } else if (n == arrayBanana[i]) {
                return "banana";
            } else if (n == arrayMelon[i]) {
                return "melon";
            } else if (n == arrayPineapple[i]) {
                return "pineapple";
            } else if (n == arrayApple[i]) {
                return "apple";
            } else if (n == arrayCucumber[i]) {
                return "cucumber";
            } else if (n == arrayOrange[i]) {
                return "orange";
            } else if (n == arrayGrape[i]) {
                return "grape";
            } else if (n == arrayCherry[i]) {
                return "cherry";
            }
        }
        return "";
    }
}
