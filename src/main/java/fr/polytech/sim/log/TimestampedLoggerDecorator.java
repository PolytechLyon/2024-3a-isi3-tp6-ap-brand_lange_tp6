package fr.polytech.sim.log;

import java.util.Date;

public class TimestampedLoggerDecorator {

    private final Logger logger;

    public TimestampedLoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    public void log(String format, Object... args) {
        logger.log(String.format("[%s]: %s", new Date(System.currentTimeMillis()), String.format(format, args)));
    }
}
