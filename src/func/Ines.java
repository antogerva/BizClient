package func;

/**
 * Functions related specifically to Nes Cores.
 */
public interface Ines {
    
    /**
     * Adds the specified game genie code.
     * If an NES game is not currently loaded or the code is not a valid game genie code, this will have no effect.
     * @param code
     */
    public void addgamegenie(String code);
    
    /**
     * Gets the NES setting 'Allow more than 8 sprites per scanline' value.
     * @return
     */
    public boolean getallowmorethaneightsprites();
    
    /**
     * @param pal default is false.
     * @return the current value for the bottom scanline value
     */
    public int getbottomscanline(boolean pal);
    
    /**
     * @return the current value for the Clip Left and Right sides option.
     */
    public boolean getclipleftandright();
    
    /**
     * @return whether or not the bg layer is being displayed.
     */
    public boolean getdispbackground();
    
    /**
     * @return whether or not sprites are being displayed.
     */
    public boolean getdispsprites();
    
    /**
     * @return the current value for the top scanline value.
     */
    public int gettopscanline();
    
    /**
     * Removes the specified game genie code.
     * If an NES game is not currently loaded or the code is not a valid game genie code, this will have no effect.
     * @param code
     */
    public void removegamegenie(String code);
    
    /**
     * Sets the NES setting 'Allow more than 8 sprites per scanline'.
     * @param allow
     */
    public void setallowmorethaneightsprites(boolean allow);
    
    /**
     * Sets the Clip Left and Right sides option.
     * @param leftandright
     */
    public void setclipleftandright(boolean leftandright);
    
    /**
     * Sets whether or not the background layer will be displayed.
     * @param show
     */
    public void setdispbackground(boolean show);
    
    /**
     * Sets whether or not sprites will be displayed.
     * @param show
     */
    public void setdispsprites(boolean show);
    
    /**
     * Sets the top and bottom scanlines to be drawn (same values as in the graphics options dialog).
     * @param top must be in the range of 0 to 127.
     * @param bottom must be between 128 and 239.
     * @param pal default is false. Not supported in the Quick Nes core.
     */
    public void setscanlines(int top, int bottom, boolean pal);

}
