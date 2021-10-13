package BASIC.Additional_Problems_MIX.WhileLoop;

import java.util.Scanner;

public class StreamOfLetters2_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        StringBuilder newWord = new StringBuilder();   //Започва се нова дума
        int n = 0;
        int c = 0;
        int o = 0;

        while (!(word.equals("End"))) {
            char num = word.charAt(0);
            if ((num > 64 && num < 91) || (num > 96 && num < 123)) {
                switch (num) {       //тайна команда от три букви – "c", "o" и "n".
                    case 'n':
                        if (n == 0) {
                            n += 1;
                        } else {
                            newWord.append(num);
                        }
                        break;
                    case 'c':
                        if (c == 0) {
                            c += 1;
                        } else {
                            newWord.append(num);
                        }
                        break;
                    case 'o':
                        if (o == 0) {
                            o += 1;
                        } else {
                            newWord.append(num);
                        }
                        break;
                    default:
                        newWord.append(num);
                }
                if (n == 1 && c == 1 && o == 1) {  //При първото получаване на една от тези букви, тя се маркира като срещната, но не се запазва в думата.
                    System.out.printf("%s ", newWord.toString());
                    n = 0;
                    c = 0;
                    o = 0;
                    newWord = new StringBuilder();
                }
            }
            word = scan.nextLine();
        }



    }
}
