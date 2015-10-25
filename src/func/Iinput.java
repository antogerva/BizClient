package func;

import luastruct.LuaTable;

/**
 * All buttons that are pressed have their key values set to true; all others remain nil.
 * All key names use the names from http://www.codeproject.com/Tips/73227/Keys-Enumeration-Win and are case-sensitive.
 */
public interface Iinput {
    
    /**
     * @return a lua table of all the buttons the user is currently pressing on their keyboard and gamepads.
     */
    public LuaTable get();

    /**
     * @return a lua table of the mouse X/Y coordinates and button states.Table keys are X, Y, Left, Middle, Right, XButton1, XButton2
     */
    public LuaTable getmouse();
    
}
