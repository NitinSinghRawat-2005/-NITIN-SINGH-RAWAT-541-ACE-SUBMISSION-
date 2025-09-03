package easyTask1;

import java.util.*;

public class easyTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input From the user
        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        // Conversion to lowercase and remove punctuation or any symbols
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", "");

        // splitting into words
        String[] words = paragraph.split(" ");

        // count frequency of word using HashMap
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String w : words) {
            if (!w.isEmpty()) {
                if (wordCount.containsKey(w)) {
                    wordCount.put(w, wordCount.get(w) + 1);
                } else {
                    wordCount.put(w, 1);
                }
            }
        }

        // finding the top 3 words
        String first = "", second = "", third = "";
        int f1 = 0, f2 = 0, f3 = 0;

        for (String w : wordCount.keySet()) {
            int freq = wordCount.get(w);

            if (freq > f1) {
                f3 = f2; third = second;
                f2 = f1; second = first;
                f1 = freq; first = w;
            } else if (freq > f2) {
                f3 = f2; third = second;
                f2 = freq; second = w;
            } else if (freq > f3) {
                f3 = freq; third = w;
            }
        }

        // Output
        System.out.println("Top 3 most frequent words:");
        if (f1 > 0) System.out.println(first + " -> " + f1);
        if (f2 > 0) System.out.println(second + " -> " + f2);
        if (f3 > 0) System.out.println(third + " -> " + f3);

        sc.close();
    }
}
