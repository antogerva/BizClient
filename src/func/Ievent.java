package func;

/**
 * A library for registering lua functions to emulator events.
 * All events support multiple registered methods.
 * All registered event methods can be named and return a Guid when registered.
 */
public interface Ievent {
    /**
     * Calls the given lua function at the end of each frame, after all emulation and drawing has completed.
     * Note: this is the default behavior of lua scripts.
     */
    public String onframeend(Object luaf, String name);
    
    /**
     * Calls the given lua function at the beginning of each frame before any emulation and drawing occurs.
     */
    public String onframestart(Object luaf, String name);
    
    /**
     * Calls the given lua function after each time the emulator core polls for input.
     */
    public String oninputpoll(Object luaf, String name);
    
    /**
     * Fires after a state is loaded.
     * Receives a lua function name, and registers it to the event immediately following a successful savestate event.
     */
    public String onloadstate(Object luaf, String name);
    
    /**
     * Fires after the given address is executed by the core.
     */
    public String onmemoryexecute(Object luaf, String name);
    
    /**
     * Fires after the given address is read by the core.
     * If no address is given, it will attach to every memory read.
     */
    public String onmemoryread(Object luaf, String name);
    
    /**
     * Fires after the given address is written by the core.
     * If no address is given, it will attach to every memory write.
     */
    public String onmemorywrite(Object luaf, String name);
    
    /**
     * Fires after a state is saved.
     */
    public String onsavestate(Object luaf, String name);
    
    /**
     * Fires after the calling script has stopped.
     */
    public String onexit(Object luaf, String name);
    
    /**
     * Removes the registered function that matches the guid.
     * If a function is found and remove the function will return true.
     * If unable to find a match, the function will return false.
     */
    public boolean unregisterbyid(Object luaf, String name);
    
    /**
     * Removes the first registered function that matches Name.
     * If a function is found and remove the function will return true.
     * If unable to find a match, the function will return false.
     */
    public boolean unregisterbyname(Object luaf, String name);
}
