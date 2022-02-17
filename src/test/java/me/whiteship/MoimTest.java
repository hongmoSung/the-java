package me.whiteship;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MoimTest extends TestCase {

    @Test
    public void testIsFull() {
        Moim moim = new Moim();
        moim.maxNumberOfAttendees = 100;
        moim.numberOfEnrollment = 10;
        Assert.assertFalse(moim.isEnrollmentFull());
    }

}