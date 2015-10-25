package func;

/**
 * A library for interacting with the currently loaded emulator core.
 */
public interface Iemu {
    
    /**
     * Sets the display vsync property of the emulator.
     */
    public void displayvsync(boolean enabled);
    
    /**
     * Signals to the emulator to resume emulation. Necessary for any lua script while loop or else the emulator will freeze!
     */
    public void frameadvance();
    
    /**
     * @return the current frame count.
     */
    public int framecount();
    
    /**
     * For a complete list of possible registers or flags for a given core, use getregisters.
     * @return the value of a cpu register or flag specified by name.
     */
    public String getregister(String name);
    
    /**
     * @return the complete set of available flags and registers for a given core.
     */
    public Object getregisters();
    
    /**
     * Sets the given register name to the given value.
     */
    public void setregister(String register, int value);
    
    /**
     * @return the ID string of the current core loaded. Note: No ROM loaded will return the string NULL.
     */
    public String getsystemid();
    
    /**
     * @return whether or not the current frame is a lag frame.
     */
    public boolean islagged();
    
    /**
     * @return the current lag count.
     */
    public int lagcount();
    
    /**
     * Sets the limit framerate property of the emulator.
     */
    public void limitframerate(boolean enabled);
    
    /**
     * Sets the autominimizeframeskip value of the emulator.
     */
    public void minimizeframeskip(boolean enabled);
    
    /**
     * Toggles the drawing of sprites and background planes.
     * Set to false or nil to disable a pane, anything else will draw them.
     */
    public void setrenderplanes(boolean[] luaParam);
    
    /**
     * Allows a script to run while emulation is paused and interact with the gui/main window in realtime.
     */
    public void yield();
    
    /**
     * @return the display type (PAL vs NTSC) that the emulator is currently running in.
     */
    public String getdisplaytype();
    
}
