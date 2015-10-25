package func;

public interface Igameinfo {
    
    /**
     * @return the path of the currently loaded rom, if a rom is loaded.
     */
    public String getromname();
    
    /**
     * @return the hash of the currently loaded rom, if a rom is loaded.
     */
    public String getromhash();
    
    /**
     * @return whether or not the currently loaded rom is in the game database.
     */
    public boolean indatabase();
    
    /**
     * @return the game database status of the currently loaded rom.
     * Statuses are for example: GoodDump, BadDump, Hack, Unknown, NotInDatabase.
     */
    public String getstatus();
    
    /**
     * @return the currently loaded rom's game database status is considered 'bad'.
     */
    public boolean isstatusbad();
    
    /**
     * @return identifying information about the 'mapper' or similar capability used for this game.
     * Empty if no such useful distinction can be drawn.
     */
    public String getboardtype();
    
    /**
     * @return the game options for the currently loaded rom.
     * Options vary per platform.
     */
    public Object getoptions();
}
