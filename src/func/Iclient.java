package func;

/**
 * A library for manipulating the EmuHawk client UI.
 */
public interface Iclient {
    /**
     * @return the current height in pixels of the border around the emulator's drawing area.
     */
    public int borderheight();
    
    /**
     * @return the current width in pixels of the border around the emulator's drawing area.
     */
    public int borderwidth();
    
    /**
     * @return the current height in pixels of the emulator's drawing area.
     */
    public int bufferheight();
    
    /**
     * @return the current width in pixels of the emulator's drawing area.
     */
    public int bufferwidth();
    
    /**
     * Clears all autohold keys.
     */
    public void clearautohold();
    
    /**
     * Closes the loaded Rom.
     */
    public void closerom();
    
    /**
     * Sets whether or not the rewind feature is enabled.
     * @param enabled
     */
    public void enablerewind(boolean enabled);
    
    /**
     * Sets the frame skip value of the client UI
     * @param numFrames
     */
    public void frameskip(int numFrames);
    
    /**
     * @return the current scanline intensity setting, used for the scanline display filter.
     */
    public int gettargetscanlineintensity();
    
    /**
     * @return the main window's size Possible values are 1, 2, 3, 4, 5, and 10.
     */
    public int getwindowsize();

    /**
     * @return whether the emulator is paused.
     */
    public boolean ispaused();
    
    /**
     * Opens the Cheats dialog.
     */
    public void opencheats();
    
    /**
     * Opens the Hex Editor dialog.
     */
    public void openhexeditor();
    
    /**
     * Opens the Ram Watch dialog.
     */
    public void openramwatch();
    
    /**
     * Opens the Ram Search dialog.
     */
    public void openramsearch();
    
    /**
     * Opens the Open ROM dialog.
     */
    public void openrom();
    
    /**
     * Opens the TAStudio dialog.
     */
    public void opentasstudio();
    
    /**
     * Opens the Toolbox Dialog.
     */
    public void opentoolbox();
    
    /**
     * Opens the tracelogger if it is available for the given core.
     */
    public void opentracelogger();
    
    /**
     * Causes the client UI to repaint the screen.
     */
    public void paint();
    
    /**
     * Pauses the emulator.
     */
    public void pause();
    
    /**
     * If currently capturing Audio/Video, this will suspend the record.
     * Frames will not be captured into the AV until client.unpause_av() is called.
     */
    public void pause_av();
    
    /**
     * Reboots the currently loaded core.
     */
    public void reboot_core();
    
    /**
     * @return the current width in pixels of the emulator's drawing area.
     */
    public int screenheight();
    
    /**
     * If a parameter is passed it will function as the Screenshot as menu item of EmuHawk,
     * else it will function as the Screenshot menu item
     * @param path
     */
    public void screenshot(String path);
    
    /**
     * Performs the same function as EmuHawk's Screenshot To Clipboard menu item.
     */
    public void screenshottoclipboard();
    
    /**
     * Sets the current scanline intensity setting, used for the scanline display filter.
     * @param val
     */
    public void settargetscanlineintensity(int val);
    
    /**
     * Sets the screenshot Capture OSD property of the client.
     * @param value
     */
    public void setscreenshotosd(boolean value);
    
    /**
     * @return the current height in pixels of the emulator's drawing area.
     */
    public int screenwidth();
    
    /**
     * Sets the main window's size to the give value.
     * Accepted values are 1, 2, 3, 4, 5, and 10.
     * @param size
     */
    public void setwindowsize(int size);
     
    /**
     * Sets the speed of the emulator (in terms of percent).
     * @param percent
     */
    public void speedmode(int percent);
    
    /**
     * Toggles the current pause state.
     */
    public void togglepause();
    
    /**
     * Transforms an x-coordinate in emulator space to an x-coordinate in client space.
     * @param x
     * @return
     */
    public int transformPointX(int x);
    
    /**
     * Transforms an y-coordinate in emulator space to an y-coordinate in client space.
     * @param y
     * @return
     */
    public int transformPointY(int y);
    
    /**
     * Unpauses the emulator.
     */
    public void unpause();
    
    /**
     * If currently capturing Audio/Video this resumes capturing.
     */
    public void unpause_av();    
    
    /**
     * @return the x value of the screen position where the client currently sits.
     */
    public int xpos();
    
    /**
     * @return the y value of the screen position where the client currently sits.
     */
    public int ypos();
}
