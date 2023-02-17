package HareAndTortoise;

import HareAndTortoise.animals.Hare;
import HareAndTortoise.animals.Tortoise;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RaceStimulatorTest {

    private RaceCourse raceCourse;
    private Hare hare;
    private Tortoise ijapa;


    @BeforeEach
    void setUp(){
        raceCourse = new RaceCourse();
    }
    @Test
    void checkForRaceTrack(){
        assertNotNull(raceCourse.getRaceTrack());
    }
    @Test
    void createRaceTrackWithSmallTrack(){
        int[] smallTrack = new int[20];

    }

}
