package fr.polytech.sim.log;

/**
 * Name logger that is supposed to log its name along with each log entry, to
 * facilitate tracing.
 */
public abstract class NamedLogger implements Logger {
    final protected String name;

    /**
     * Constructor.
     *
     * @param name logger name.
     */
    protected NamedLogger(String name) {
        this.name = name;
    }

    /**
     * Template method for logging.
     * 
     * @param format format string.
     * @param args   arguments.
     */
    public void log(String format, Object... args) {
        String message = format(format, args);
        write(message);
    }

    /**
     * Formats a message.
     * 
     * @param format format string.
     * @param args   arguments.
     */
    protected String format(String format, Object... args) {
        String entry = String.format(format, args);
        return String.format("%s\t%s\n", this.name, entry);
    }

    /**
     * Logs a message.
     * 
     * @param message message to log.
     */
    abstract protected void write(String message);

}
