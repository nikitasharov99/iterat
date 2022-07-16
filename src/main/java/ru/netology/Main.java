package ru.netology;

public class Main {
    public static void main(String[] args) {
        int exitNumber = 1000;
        int iterationCount = 0;
        for (int r : new Randoms(10, 10000)) {
            System.out.println("Случайное число: " + r);
            iterationCount++;
            if (r == exitNumber) {
                System.out.printf("Выпало число %d, давайте на этом закончим. ", exitNumber);
                System.out.println("Количество итераций - " + iterationCount);
                break;
            }
        }
    }
}