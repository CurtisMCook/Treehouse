package com.sanzablancoaka2c.java;

import javax.sound.midi.*;

/**
 * Created by SanzaBlancoAkA2C on 3/12/17.
 */

public class MusicTest1 {

    public void play() {

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        } catch (MidiUnavailableException ex) {
            System.out.println("Bummer");
        }
    } // close play
}
