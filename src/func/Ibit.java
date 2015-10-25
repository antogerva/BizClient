package func;

/**
 * A library for performing standard bitwise operations.
 */
public interface Ibit {
    
    /**
     * Bitwise AND of 'val' against 'amt'.
     * @param val
     * @param amt
     * @return
     */
    public long band(long val, long amt);
    
    /**
     * Bitwise NOT of 'val' against 'amt'.
     * @param val
     * @return
     */
    public long bnot(long val);
    
    /**
     * Bitwise OR of 'val' against 'amt'.
     * @param val
     * @param amt
     * @return
     */
    public long bor(long val, long amt);
    
    /**
     * Bitwise XOR of 'val' against 'amt'.
     * @param val
     * @param amt
     * @return
     */
    public long bxor(long val, long amt);
    
    /**
     * Logical shift left of 'val' by 'amt' bits.
     * @param val
     * @param amt
     * @return
     */
    public long lshift(long val, int amt);
    
    /**
     * Left rotate 'val' by 'amt' bits.
     * @param val
     * @param amt
     * @return
     */
    public long rol(long val, int amt);
    
    /**
     * Right rotate 'val' by 'amt' bits.
     * @param val
     * @param amt
     * @return
     */
    public long ror(long val, int amt);
    
    /**
     * Logical shift right of 'val' by 'amt' bits.
     * @param val
     * @param amt
     * @return
     */
    public long rshift(int val, int amt);
    
    /**
     * Arithmetic shift right of 'val' by 'amt' bits.
     * @param val
     * @param amt
     * @return
     */
    public int arshift(int val, int amt);
    
    /**
     * @param num
     * @param pos
     * @return the result of bit 'pos' being set in 'num'.
     */
    public boolean check(long num, int pos);
    
    /**
     * Sets the bit 'pos' in 'num'.
     * @param num
     * @param pos
     * @return
     */
    public long set(long num, int pos);
    
    /**
     * Clears the bit 'pos' in 'num'.
     * @param num
     * @param pos
     * @return
     */
    public int clear(long num, int pos);    
    
    /**
     * Byte swaps 'short', i.e. bit.byteswap_16(0xFF00) would return 0x00FF.
     * @param val
     * @return
     */
    public long byteswap_16(long val);
    
    /**
     * Byte swaps 'dword'.
     * @param val
     * @return
     */
    public long byteswap_32(long val);
    
    /**
     * Byte swaps 'long'.
     * @param val
     * @return
     */
    public long byteswap_64(long val);
    
}
