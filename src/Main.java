import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] strAr = s.split(" ");
        String[] sorted = sortString(strAr);
        for (String str : sorted) {
            System.out.print(str + " ");
        }
    }

    public static String[] sortString(String[] str) {
        Arrays.sort(str,
                new Comparator<String>() {
                    @Override
                    public int compare(String str1, String str2) {
                        int num1 = extractInteger(str1);
                        int num2 = extractInteger(str2);
                        if (num1 != num2) {
                            return Integer.compare(num1, num2);
                        } else {
                            return str1.compareTo(str2);
                        }
                    }
                });
        return str;
    }

    public static int extractInteger(String str) {
        StringBuilder numStr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                numStr.append(ch);
            }
        }
        return Integer.parseInt(numStr.toString());
    }
}