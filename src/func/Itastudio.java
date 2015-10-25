package func;

/**
 * A library for manipulating the Tastudio dialog of the EmuHawk client.
 */
public interface Itastudio {
    
    /**
     * @return whether or not tastudio is currently engaged (active).
     */
    public boolean engaged();

    /**
     * @param frame
     * @return the marker text at the given frame, or an empty string if there is no marker for the given frame.
     */
    public String getmarker(int frame);
    
    /**
     * If there is a marker for the given frame, it will be removed.
     * @param frame
     */
    public void removemarker(int frame);
    
    /**
     * Adds or sets a marker at the given frame with the given message.
     * @param frame
     * @param message
     */
    public void setmarker(int frame, String message);
    
    /**
     * @param frame
     * @return whether or not the given frame was a lag frame, null if unknown.
     */
    public Boolean islag(int frame);
    
    /**
     * @param frame
     * @return whether or not the given frame has a savestate associated with it.
     */
    public boolean hasstate(int frame);
}
