package func;

public interface Iconsole {
    
    /**
     * Clears the output box of the Lua Console window.
     */
    public void clear();
    
    /**
     * @return a list of implemented functions.
     */
    public String getluafunctionslist();

    /**
     * Outputs the given object to the output box on the Lua Console dialog.
     * Note: Can accept a LuaTable
     * @param outputs
     */
    public void log(Object[] outputs);
    
    /**
     * Outputs the given object to the output box on the Lua Console dialog.
     * Note: Can accept a LuaTable
     * @param outputs
     */
    public void writeline(Object[] outputs);
    
    /**
     * Outputs the given object to the output box on the Lua Console dialog.
     * Note: Can accept a LuaTable
     * @param outputs
     */
    public void write(Object[] outputs);
    
    
}
