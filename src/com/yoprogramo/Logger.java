package com.yoprogramo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private BufferedWriter out;

    public Logger() throws IOException {
        this.out = new BufferedWriter(new FileWriter("logfile.text"));
    }

    public void appendToLog(Logable logable) throws IOException {
        out.write("Object log event: " + logable.getInitInfo());
        out.newLine();
        out.write("Object log event: " + logable.getLogableEvent());
        out.newLine();
    }

    public void close() throws IOException {
        out.flush();
        out.close();
    }
}
