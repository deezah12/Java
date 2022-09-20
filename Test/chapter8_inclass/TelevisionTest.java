package chapter8_inclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TelevisionTest {
    Television nexus;

    @BeforeEach
    public void setUp() {
       nexus = new Television();
    }

    @Test
    void checkTelevisionCanBeTurnedOn(){
        assertFalse(nexus.isOn());

        nexus.turOn();
        assertTrue(nexus.isOn());
    }

    @Test
    void checkThatTelevisionCanBeTurnedOff(){
        nexus.turOn();
        assertTrue(nexus.isOn());

        nexus.turOff();
        assertFalse(nexus.isOn());
    }

    @Test
    void checkThatICanInCreaseVolume(){
        nexus.turOn();
        assertTrue(nexus.isOn());
        assertEquals(3, nexus.getVolume());

        nexus.increaseVolume();
        nexus.increaseVolume();
        nexus.increaseVolume();

        assertEquals(6, nexus.getVolume());
    }

    @Test
    void checkThatICanDeCreaseVolume(){
        checkThatICanInCreaseVolume();
        nexus.decreaseVolume();
        nexus.decreaseVolume();
        nexus.decreaseVolume();
        nexus.decreaseVolume();
        nexus.decreaseVolume();
        nexus.decreaseVolume();
        nexus.decreaseVolume();
        nexus.decreaseVolume();

        assertEquals(0, nexus.getVolume());
    }

    @Test
    void checkThatVolumeCantDecreaseToNegativeNumber(){
        checkThatICanDeCreaseVolume();
        nexus.decreaseVolume();
        nexus.decreaseVolume();

        assertEquals(0, nexus.getVolume());
    }

    @Test
    void checkThatVolumeCantIncreaseAfter10(){
        nexus.turOn();
        assertTrue(nexus.isOn());
        assertEquals(3, nexus.getVolume());

        nexus.increaseVolume();
        nexus.increaseVolume();
        nexus.increaseVolume();
        nexus.increaseVolume();
        nexus.increaseVolume();
        nexus.increaseVolume();
        nexus.increaseVolume();

        assertEquals(10, nexus.getVolume());
    }

    @Test
    void checkThatVolumeTelevision_canBeSet(){
        nexus.turOn();
        assertTrue(nexus.isOn());
        assertEquals(6,nexus.setVolume(6));
        assertEquals(6, nexus.getVolume());
    }


    @Test
    void checkVolumeCanBeMuted(){
        nexus.turOn();
        assertTrue(nexus.isOn());
        assertEquals(6,nexus.setVolume(6));
        assertEquals(6, nexus.getVolume());

        assertTrue(nexus.muteOn());
        assertEquals(0,nexus.getVolume());
    }



    @Test
    void checkChannelCanBeIncreased(){
        nexus.turOn();
        assertTrue(nexus.isOn());
        assertEquals(3, nexus.getChannel());

        nexus.increaseChannel();
        nexus.increaseChannel();
        assertEquals(5, nexus.getChannel());
    }

    @Test
    void channelCanDecrease(){
        nexus.turOn();
        assertTrue(nexus.isOn());
        assertEquals(3, nexus.getChannel());

        nexus.decreaseChannel();
        nexus.decreaseChannel();
        assertEquals(1, nexus.getChannel());
    }

    @Test
    void channelCanSet(){
        nexus.turOn();
        assertTrue(nexus.isOn());
        assertEquals(3, nexus.getChannel());

        assertEquals(2, nexus.setChannel(2));
    }
    @Test
    void channelCantBeSetInNegativeValue(){
        nexus.turOn();
        assertTrue(nexus.isOn());
        assertEquals(3, nexus.getChannel());

        nexus.decreaseChannel();
        nexus.decreaseChannel();
        nexus.decreaseChannel();
        nexus.decreaseChannel();
        assertEquals(1, nexus.getChannel());
    }


    @Test
    void  checkIfI_turnOnMy_Television_channel_canBeSame(){
        nexus.turOn();
        assertTrue(nexus.isOn());
        assertEquals(5,nexus.setChannel(5));
        assertEquals(5, nexus.getChannel());

        nexus.turOff();
        nexus.increaseChannel();
        assertNotEquals(6, nexus.getChannel());

        nexus.turOn();
        assertEquals(5,nexus.getChannel());
    }

    @Test
    void  checkIfI_turnOnMy_Television_volume_canBeSame(){
        nexus.turOn();
        assertTrue(nexus.isOn());
        assertEquals(5,nexus.setVolume(5));
        assertEquals(5, nexus.getVolume());

        nexus.turOff();
        nexus.increaseVolume();
        assertNotEquals(6, nexus.getVolume());

        nexus.turOn();
        assertEquals(5,nexus.getVolume());
    }

    @Test
    void checkVolumeCanBeUnMuted(){
        nexus.turOn();
        assertTrue(nexus.isOn());
        assertEquals(6,nexus.setVolume(6));
        assertEquals(6, nexus.getVolume());

        assertTrue(nexus.muteOn());
        assertEquals(0,nexus.getVolume());

//        assertFalse(nexus.muteOn());
//        assertEquals(6, nexus.getVolume());
       }
}