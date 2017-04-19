package com.sanzablancoaka2c.java;

import javax.sound.midi.*;

/**
 * Created by SanzaBlancoAkA2C on 3/12/17.
 */

public class MiniMiniMusic {

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence sequence = new Sequence(Sequence.PPQ, 4);

            Track track = sequence.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);;
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(sequence);
            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } // close play
} // close class
