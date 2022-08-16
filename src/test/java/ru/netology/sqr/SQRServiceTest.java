package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqr.csv")
    public void squareCountBetweenSqrMinAndSqrMax(int expected, int sqrMin, int sqrMax) {
        SQRService service = new SQRService();
        int actual = service.squareCount(sqrMin, sqrMax);
        Assertions.assertEquals(expected, actual);

    }
}
