package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    Job firstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test
    public void testSettingJobId(){
        Job firstJob = new Job();
        Job secondJob = new Job();
        assertNotEquals(firstJob, secondJob);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(firstJob.getEmployer() instanceof Employer);
        assertTrue(firstJob instanceof Job);
        assertTrue(firstJob.getLocation() instanceof Location);
        assertTrue(firstJob.getPositionType() instanceof PositionType);
        assertTrue(firstJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("ACME", firstJob.getEmployer().getValue());
        assertEquals("Product tester", firstJob.getName());
        assertEquals("Desert", firstJob.getLocation().getValue());
        assertEquals("Quality control", firstJob.getPositionType().getValue());
        assertEquals("Persistence", firstJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job jobOne = new Job();
        Job jobTwo = new Job();

        assertFalse(jobOne.equals(jobTwo));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
       assertEquals('\n', firstJob.toString().charAt(0));
       assertEquals('\n', firstJob.toString().charAt(firstJob.toString().length()-1));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        String expected = "\nID: " + firstJob.getId() + '\n' +
                "Name: " + firstJob.getName() + '\n' +
                "Employer: " + firstJob.getEmployer() + '\n' +
                "Location: " + firstJob.getLocation() + '\n' +
                "Position Type: " + firstJob.getPositionType() + '\n' +
                "Core Competency: " + firstJob.getCoreCompetency() + '\n';
        assertEquals(expected, firstJob.toString());

        }

        @Test
    public void testToStringHandlesEmptyField() {
            Job blankJob = new Job();
            String expected = "\nID: " + blankJob.getId() + '\n' +
                "Name: Data not available" + '\n' +
                "Employer: Data not available" + '\n' +
                "Location: Data not available" + '\n' +
                "Position Type: Data not available" + '\n' +
                "Core Competency: Data not available" + '\n';
        assertEquals(expected, blankJob.toString());
            }


        }
