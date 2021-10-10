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
    @Test
    public void testSettingJobId(){
        Job firstJob = new Job();
        Job secondJob = new Job();
        assertNotEquals(firstJob, secondJob);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job firstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(firstJob.getEmployer() instanceof Employer);
        assertTrue(firstJob instanceof Job);
        assertTrue(firstJob.getLocation() instanceof Location);
        assertTrue(firstJob.getPositionType() instanceof PositionType);
        assertTrue(firstJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("ACME", firstJob.getEmployer().getValue());
        assertEquals("Product tester", firstJob.getName());
        assertEquals("Desert", firstJob.getLocation().getValue());
        assertEquals("Quality control", firstJob.getLocation().getValue());
        assertEquals("Persistence", firstJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job jobOne = new Job();
        Job jobTwo = new Job();

        assertFalse(jobOne.equals(jobTwo));
    }

}
