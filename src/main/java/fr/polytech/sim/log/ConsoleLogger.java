package fr.polytech.sim.log;

/**
 * Console logger.
 */
public class ConsoleLogger extends NamedLogger {

    /**
     * Constructor. It is package private to prevent instantiation from anything
     * other than the LoggerFactory.
     *
     * @param name logger name.
     */
    ConsoleLogger(String name) {
        super(name);
    }

    @Override
    protected void write(String message) {
        System.out.print(message);
    }
}
