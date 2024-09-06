package com.hash.multithreading.pcproblem;

public class ReadThread implements Runnable{

    Notepad notepad;
    public ReadThread(Notepad notepad) {
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
