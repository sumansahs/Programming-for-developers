package ques3;

public class Matcher {
    public static void check(String word, String pattern) {
        int l = word.length();
        int counter = 0;
        if (pattern.contains("@")) {
            System.out.println("Matched");
        }
        else {
            if (pattern.length()>=l) {
                for (int i = 0; i < l; i++) {
                    if (word.charAt(i) == pattern.charAt(i)) {
                        counter++;
                    } else if (pattern.charAt(i) == '#') {
                        counter++;
                    }
                }
                if (counter==l){
                    System.out.println("Matched");
                }else {
                    System.out.println("Not matched");
                }
            } else {
                System.out.println("Not matched");
            }

        }
    }

    public static void main(String[] args) {
        String a="gogo";
        String b="gogo";
        check(a,b);
    }
}
