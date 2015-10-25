 package func;

import luastruct.LuaTable;

/**
 * A library exposing standard .NET string methods.
 */
public interface Ibizstring {

    /**
     * Converts the number to a string representation of the hexadecimal value of the given number.
     * @param num
     * @return
     */
    public String hex(long num);
    
    /**
     * Converts the number to a string representation of the binary value of the given number.
     * @param num
     * @return
     */
    public String binary(long num);
    
    /**
     * Converts the number to a string representation of the octal value of the given number.
     * @param num
     * @return
     */
    public String octal(long num);
    
    /**
     * @param str
     * @return a string that trims whitespace on the left and right ends of the string.
     */
    public String trim(String str);
    
    /**
     * @param str
     * @param str2
     * @param replace
     * @return a string that replaces all occurances of str2 in str1 with the value of replace.
     */
    public String replace(String str, String str2, String replace);
    
    /**
     * @param str
     * @return an uppercase version of the given string.
     */
    public String toupper(String str);
    
    /**
     * @param str
     * @return an lowercase version of the given string.
     */
    public String tolower(String str);
    
    /**
     * @param str
     * @param position
     * @param length
     * @return a string that represents a substring of str starting at position for the specified length.
     */
    public String substring(String str, int position, int length);
    
    /**
     * @param str
     * @param position
     * @param count
     * @return a string that represents str with the given position and count removed.
     */
    public String remove(String str, int position, int count);
    
    /**
     * @param str
     * @param str2
     * @return whether or not str contains str2.
     */
    public boolean contains(String str, String str2);
    
    /**
     * @param str
     * @param str2
     * @return whether str starts with str2.
     */
    public boolean startswith(String str, String str2);
    
    /**
     * @param str
     * @param str2
     * @return whether str ends wth str2.
     */
    public boolean endswith(String str, String str2);
    
    /**
     * Splits str based on separator into a LuaTable.
     * Same functionality as .NET string.Split() using the RemoveEmptyEntries option.
     * @param str
     * @param separator must be one character.
     * @return
     */
    public LuaTable split(String str, String separator);
    
}
