package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int digitsCount = 0;
        int tempNumber = n;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            if (digit != 0) {
                if (n % digit == 0) {
                    digitsCount++;
                }
            }
            tempNumber = tempNumber / 10;
        }
        return digitsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/synerzip/IdeaProjects/hackerrank/example1/output.txt"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
