package func;

/**
 * Functions specific to SNESHawk (functions may not run when an SNES game is not loaded).
 */
public interface Isnes {    
    /**
     * @return whether the bg 1 layer is displayed.
     */
    public boolean getlayer_bg_1();
    
    /**
     * @return whether the bg 2 layer is displayed.
     */
    public boolean getlayer_bg_2();
    
    /**
     * @return whether the bg 3 layer is displayed.
     */
    public boolean getlayer_bg_3();
    
    /**
     * @return whether the bg 4 layer is displayed.
     */
    public boolean getlayer_bg_4();
    
    /**
     * @return whether the obj 1 layer is displayed.
     */
    public boolean getlayer_obj_1();
    
    /**
     * @return whether the obj 2 layer is displayed.
     */
    public boolean getlayer_obj_2();
    
    /**
     * @return whether the obj 3 layer is displayed.
     */
    public boolean getlayer_obj_3();
    
    /**
     * @return whether the obj 4 layer is displayed.
     */
    public boolean getlayer_obj_4();
    
    /**
     * Sets whether the bg 1 layer is displayed.
     * @param value
     */
    public void setlayer_bg_1(boolean value);

    /**
     * Sets whether the bg 2 layer is displayed.
     * @param value
     */
    public void setlayer_bg_2(boolean value);
    
    /**
     * Sets whether the bg 3 layer is displayed.
     * @param value
     */
    public void setlayer_bg_3(boolean value);
    
    /**
     * Sets whether the bg 4 layer is displayed.
     * @param value
     */
    public void setlayer_bg_4(boolean value);
    
    /**
     * Sets whether the obj 1 layer is displayed.
     * @param value
     */
    public void setlayer_obj_1(boolean value);
    
    /**
     * Sets whether the obj 2 layer is displayed.
     * @param value
     */
    public void setlayer_obj_2(boolean value);
    
    /**
     * Sets whether the obj 3 layer is displayed.
     * @param value
     */
    public void setlayer_obj_3(boolean value);
    
    /**
     * Sets whether the obj 4 layer is displayed.
     * @param value
     */
    public void setlayer_obj_4(boolean value);
    
}
