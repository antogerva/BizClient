package func;

import luastruct.LuaTable;

public interface Imovie {    
    /**
     * @return the file name including path of the currently loaded movie.
     */
    public String filename();

    /**
     * @param frame
     * @return a table of buttons pressed on a given frame of the loaded movie.
     */
    public LuaTable getinput(int frame);
    
    /**
     * @param frame
     * @return the input of a given frame of the loaded movie in a raw inputlog string.
     */
    public String getinputasmnemonic(int frame);
    
    /**
     * @return true if the movie is in read-only mode, false if in read+write.
     */
    public boolean getreadonly();
    
    /**
     * @return whether or not the current movie is incrementing rerecords on loadstate.
     */
    public boolean getrerecordcounting();
    
    /**
     * @return true if a movie is loaded in memory (play, record, or finished modes), false if not (inactive mode).
     */
    public boolean isloaded();
    
    /**
     * @return the total number of frames of the loaded movie.
     */
    public double length();
    
    /**
     * @return the mode of the current movie. Possible modes: PLAY, RECORD, FINISHED, INACTIVE.
     */
    public String mode();
    
    /**
     * Deprecated Alias of getrerecordcount.
     * @return
     */
    @Deprecated 
    public String rerecordcount();
    
    /**
     * Sets the read-only state to the given value. true for read only, false for read+write.
     * @param readOnly
     */
    public void setreadonly(boolean readOnly);
    
    /**
     * Sets the rerecord count of the current movie.
     * @param count
     */
    public void setrerecordcount(double count);
    
    /**
     * Sets whether or not the current movie will increment the rerecord counter on loadstate.
     * @param counting
     */
    public void setrerecordcounting(boolean counting);
    
    /**
     * Stops the current movie.
     */
    public void stop();
    
    /**
     * If a movie is loaded, gets the frames per second used by the movie to determine the movie length time.
     * @return
     */
    public double getfps();    
}
