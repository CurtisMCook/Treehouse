package com.sanzablancoaka2c.java;

public class Main {

    public static void main(String[] args) {

//        MusicTest1 mt = new MusicTest1();
//        mt.play();
//
//        MiniMiniMusic mini = new MiniMiniMusic();
//        mini.play();

//        MiniMiniMusicCmdLine mini = new MiniMiniMusicCmdLine();
//        if(args.length == 2) { // I had to switch the condition from < to ==
//            System.out.println("Don't forget the instrument and note args");
//        } else {
//            int instrument = Integer.parseInt("40");
//            int note = Integer.parseInt("70");
//            mini.play(instrument, note);
//            System.out.println("MiniMusicCmdLine " + instrument + " " + note); // Line added for testing purposes
//        }
//
//        try {
//            Sequencer sequencer = MidiSystem.getSequencer();
//            sequencer.open();
//
//            Sequence sequence = new Sequence(Sequence.PPQ, 4);
//            Track track = sequence.createTrack();
//
//            for(int i = 5; i < 61; i +=4) {
//                track.add(makeEvent(144, 1, i, 100, i));
//                track.add(makeEvent(128, 1, i, 100, i + 2));
//            } // end loop
//
//            sequencer.setSequence(sequence);
//            sequencer.setTempoInBPM(220);
//            sequencer.start();
//        } catch(Exception ex) {
//            ex.printStackTrace();
//        }
//    } // close main
//
//    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
//        MidiEvent event = null;
//        try {
//            ShortMessage a = new ShortMessage();
//            a.setMessage(comd, chan, one, two);
//            event = new MidiEvent(a, tick);
//        } catch(Exception e) {
//
//        }
//        return event;

//        MiniMiniMusic2 mini = new MiniMiniMusic2();
//        mini.go();

        MiniMiniMusic3 mini = new MiniMiniMusic3();
        mini.go();


    } // close main
} // close class
