import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeTest {

    @TestFactory
    Stream<DynamicTest> allYearsShouldBeValid() {
        List<String> years = Arrays.asList("2019", "2020", "2021");
        return years.stream()
                .map(
                        year ->
                                DynamicTest.dynamicTest(
                                        String.format("check string for %s", year), () -> checkString(year)));
    }

    void checkString(String year) {
        assertEquals("2020", year);
    }
}
