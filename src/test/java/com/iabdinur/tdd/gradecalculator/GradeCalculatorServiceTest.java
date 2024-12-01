package com.iabdinur.tdd.gradecalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeCalculatorServiceTest {

    private GradeCalculatorService underTest;


    @Test
    void itShouldTestGradeCalculator() {
        // Given
        GradeCalculator gradeCalculator = new GradeCalculator();
        // When
        // Then
        assertEquals("fail", gradeCalculator.getClassification(74));
        assertEquals("pass", gradeCalculator.getClassification(75));
        assertEquals("merit", gradeCalculator.getClassification(80));
        assertEquals("distinction", gradeCalculator.getClassification(91));
        assertThrows(IllegalStateException.class, () -> gradeCalculator.getClassification(110));
    }
}