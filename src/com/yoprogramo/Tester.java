package com.yoprogramo;

import java.io.IOException;

public class Tester {

    public static void main(String[] args) throws IOException, InterruptedException {
	new Tester();
    }

    public Tester() throws IOException, InterruptedException {
        Logger logger = new Logger();
        SystemStatus systemStatus = new SystemStatus();
        NetworkConnection networkConnection = new NetworkConnection();

        logger.appendToLog(systemStatus);
        logger.appendToLog(networkConnection);
        networkConnection.connect();
        Thread.sleep(2000);
        logger.appendToLog(systemStatus);
        logger.appendToLog(networkConnection);
        logger.close();

    }
}
