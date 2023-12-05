package com.coding;

import java.util.Stack;

//Ferly ferdiansyah SK1C
public class soal9 {
    // Metode untuk memeriksa kecocokan urutan kurung
    public static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (char karakter : ekspresi.toCharArray()) {
            if (karakter == '(' || karakter == '[' || karakter == '{') {
                stack.push(karakter);
            } else if (karakter == ')' || karakter == ']' || karakter == '}') {
                if (stack.isEmpty() || !isKurungCocok(stack.pop(), karakter)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Metode untuk memeriksa apakah pasangan kurung cocok
    private static boolean isKurungCocok(char kurungBuka, char kurungTutup) {
        return (kurungBuka == '(' && kurungTutup == ')') ||
                (kurungBuka == '[' && kurungTutup == ']') ||
                (kurungBuka == '{' && kurungTutup == '}');
    }

    public static void main(String[] args) {
        String ekspresi1 = "((a + b) * (c - d))";
        String ekspresi2 = "[(a + b) * (c - d)]";
        String ekspresi3 = "{(a + b) * (c - d)}";
        String ekspresi4 = "((a + b) * (c - d)";

        System.out.println("Ekspresi 1: " + cekUrutanKurung(ekspresi1));
        System.out.println("Ekspresi 2: " + cekUrutanKurung(ekspresi2));
        System.out.println("Ekspresi 3: " + cekUrutanKurung(ekspresi3));
        System.out.println("Ekspresi 4: " + cekUrutanKurung(ekspresi4));
    }
}
