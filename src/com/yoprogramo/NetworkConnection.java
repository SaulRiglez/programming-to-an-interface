package com.yoprogramo;

public class NetworkConnection implements Logable {

    private long createTimestamp;
    private String currentLogMessage;

    public NetworkConnection() {
        /*
         * Establish connection
         */

        currentLogMessage = "Connected at " + System.currentTimeMillis();

        this.currentLogMessage = currentLogMessage;
    }

    public void connect() {
        /*
         * Establish connection
         */

        currentLogMessage = "Connected at " + createTimestamp;
    }

    @Override
    public String getInitInfo() {
        return "NetworkConnection object created " + createTimestamp;
    }

    @Override
    public String getLogableEvent() {
        return currentLogMessage;
    }
}
