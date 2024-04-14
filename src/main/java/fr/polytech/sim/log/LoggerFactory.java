package fr.polytech.sim.log;

public class LoggerFactory {
    public static FileLogger createFileLogger(String name) {
        return new FileLogger(name);
    }
}
