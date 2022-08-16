package ru.netology.sqr;

public class SQRService {
    public int squareCount(int sqrMin, int sqrMax) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i) >= sqrMin) {
                if ((i * i) <= sqrMax) {
                    count++;
                }
            }
        }
        return count;
    }
}
