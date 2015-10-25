package func;

public interface Ijoypad {

    /**
     * @return a lua table of the controller buttons pressed.
     * If supplied, it will only return a table of buttons for the given controller.
     */
    public Object get(int controller);
    
    /**
     * @return a lua table of any controller buttons currently pressed by the user.
     */
    public Object getimmediate();
    
    /**
     * Sets the given buttons to their provided values for the current frame,
     * string will be interpretted the same way an entry from a movie input log would be.
     */
    public void setfrommnemonicstr(String inputLogEntry);
    
    /**
     * Sets the given buttons to their provided values for the current frame
     */
    public void set(Object buttons, int controller);

    /**
     * Sets the given analog controls to their provided values for the current frame.
     * Note that unlike set() there is only the logic of overriding with the given value.
     */
    public void setanalog(Object controls, int controller);
}
