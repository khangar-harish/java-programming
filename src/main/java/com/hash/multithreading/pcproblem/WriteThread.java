package com.hash.multithreading.pcproblem;

public class WriteThread implements Runnable{

    Notepad notepad;
    public WriteThread(Notepad notepad) {
        this.notepad = notepad;
    }

    @Override
    public void run() {
        try {
            notepad.printing();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
