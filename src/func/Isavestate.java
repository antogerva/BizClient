package func;

public interface Isavestate {
    
    /**
     * Loads a savestate with the given path.
     * @param path
     */
    public void load(String path);
    
    /**
     * Loads the savestate at the given slot number (must be an integer between 0 and 9).
     * @param slotNum
     */
    public void loadslot(int slotNum);
 
    /**
     * Saves a state at the given path.
     * @param path
     */
    public void save(String path);
    
    /**
     * Saves a state at the given save slot (must be an integer between 0 and 9).
     * @param slotNum
     */
    public void saveslot(int slotNum);
}
