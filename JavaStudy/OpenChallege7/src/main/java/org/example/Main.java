package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Word {
    private String korea;
    private String english;

    public Word(String korea, String english) {
        this.korea = korea;
        this.english = english;
    }

    public String getKorea() {
        return korea;
    }

    public String getEnglish() {
        return english;
    }
}

class WordGame {
    private Vector<Word> v = new Vector<>();
    private Scanner scanner;

    public WordGame() {
        this.scanner = new Scanner(System.in);
        v.add(new Word("사랑", "love"));
        v.add(new Word("아기", "baby"));
        v.add(new Word("연필", "pencil"));
        v.add(new Word("지우개", "eraser"));
        v.add(new Word("종이", "paper"));
        v.add(new Word("커피", "coffee"));
        v.add(new Word("물", "water"));
        v.add(new Word("핸드폰", "smartphone"));
        v.add(new Word("공책", "note"));
        v.add(new Word("가방", "backpack"));
    }

    public void run() {
        System.out.println("영단어 테스트를 시작합니다. -1을 입력하면 종료됩니다.");
        while (true) {
            Vector<String> quiz = new Vector<>();
            int idx = (int) (Math.random() * v.size());
            String answer = v.get(idx).getKorea();
            quiz.add(v.get(idx).getKorea());
            System.out.println(v.get(idx).getEnglish() + "?");
            while (quiz.size() < 4) {
                idx = (int) (Math.random() * v.size());
                if (quiz.contains(v.get(idx).getKorea())) {
                    continue;
                } else {
                    quiz.add(v.get(idx).getKorea());
                }
            }
            int[] arr = new int[4];
            Arrays.fill(arr, 0);
            int count = 0;
            int correct = -1;
            while (count < 4) {
                idx = (int) (Math.random() * 4);
                if (arr[idx] == 0) {
                    if (quiz.get(idx).equals(answer)) correct = count+1;
                    System.out.print((count + 1) + ": " + quiz.get(idx) + " | ");
                    arr[idx] = 1;
                    count++;
                }
            }
            System.out.print(" >> ");

            int command = scanner.nextInt();
            scanner.nextLine();
            if (command == -1) return;

            if (command == correct) {
                System.out.println("Excellent!!");
            } else {
                System.out.println("Nope!");
            }
         }
    }
}

public class Main {
    public static void main(String[] args) {
        WordGame wg = new WordGame();
        wg.run();
    }
}