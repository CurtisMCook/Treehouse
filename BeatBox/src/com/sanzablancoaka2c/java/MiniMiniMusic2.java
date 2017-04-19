package com.sanzablancoaka2c.java;

import javax.sound.midi.*;

/**
 * Created by SanzaBlancoAkA2C on 3/15/17.
 */

public class MiniMiniMusic2 implements ControllerEventListener {

    public void go() {

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(this, eventsIWant);

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            for(int i = 5; i < 60; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));

                track.add(makeEvent(176, 1, 127, 0, i));
            } // end loop

            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } // close

    public void controlChange(ShortMessage event) {
        System.out.println("la");
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch(Exception e) {

        }
        return event;
    }
} // close class
