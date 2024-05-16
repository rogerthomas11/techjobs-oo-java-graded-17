package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();

        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob3.getName(), "Product tester");
        assertEquals(testJob3.getEmployer().getValue(), "ACME");
        assertEquals(testJob3.getLocation().getValue(), "Desert");
        assertEquals(testJob3.getPositionType().getValue(), "Quality control");
        assertEquals(testJob3.getCoreCompetency().getValue(), "Persistence");

        assertTrue(testJob3.getName() instanceof String);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(testJob4, testJob5);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob6 = new Job();

        assertTrue(testJob6.toString().startsWith(System.lineSeparator()));
        assertTrue(testJob6.toString().endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob7.toString(), System.lineSeparator() +
                "ID: " + testJob7.getId() + System.lineSeparator() +
                "Name: " + testJob7.getName() + System.lineSeparator() +
                "Employer: " + testJob7.getEmployer() + System.lineSeparator() +
                "Location: " + testJob7.getLocation() + System.lineSeparator() +
                "Position Type: " + testJob7.getPositionType() + System.lineSeparator() +
                "Core Competency: " + testJob7.getCoreCompetency() + System.lineSeparator());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob8 = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob8.toString(), System.lineSeparator() +
                "ID: " + testJob8.getId() + System.lineSeparator() +
                "Name: " + testJob8.getName() + System.lineSeparator() +
                "Employer: " + testJob8.getEmployer() + System.lineSeparator() +
                "Location: " + testJob8.getLocation() + System.lineSeparator() +
                "Position Type: " + testJob8.getPositionType() + System.lineSeparator() +
                "Core Competency: " + testJob8.getCoreCompetency() + System.lineSeparator());
    }
}
