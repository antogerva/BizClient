package func;

import luastruct.LuaTable;

/**
 * Main memory library reads and writes from the Main memory domain (the default memory domain set by any given core).
 */
public interface Imainmemory {
    
    /**
     * @return the name of the domain defined as main memory for the given core.
     */
    public String getname();
    
    /**
     * @return the number of bytes of the domain defined as main memory.
     */
    public int getcurrentmemorydomainsize();
    
    /**
     * @return the value from the given address as an unsigned byte.
     */
    public int readbyte(int addr);
    
    /**
     * Writes the given value to the given address as an unsigned byte.
     * @param addr
     * @param value
     */
    public void writebyte(int addr, long value);
    
    /**
     * Reads the address range that starts from address, and is length long.
     * @param addr
     * @param length
     * @return the result into a table of key value pairs (where the address is the key).
     */
    public Object readbyterange(int addr, int length);
    
    /**
     * Writes the given values to the given addresses as unsigned bytes.
     * @param memoryblock
     */
    public void writebyterange(LuaTable memoryblock);
    
    /**
     * Reads the given address as a 32-bit float value from the main memory domain with the given endian.
     * @param addr
     * @param bigendian
     * @return
     */
    public float readfloat(int addr, boolean bigendian);
    
    /**
     * Writes the given 32-bit float value to the given address and endian.
     * @param addr
     * @param value
     * @param bigendian
     */
    public void writefloat(int addr, double value, boolean bigendian);
    
    /**
     * Read signed byte.
     * @param addr
     * @return
     */
    public long read_s8(int addr);
    
    /**
     * Write signed byte.
     * @param addr
     * @param uint
     */
    public void write_s8(int addr, long uint);
    
    /**
     * Read unsigned byte.
     * @param addr
     * @return
     */
    public long read_u8(int addr);
    
    /**
     * Write unsigned byte.
     * @param addr
     * @param value
     */
    public void write_u8(int addr, long value);
    
    /**
     * Read signed 2 byte value, little endian.
     * @param addr
     * @return
     */
    public int read_s16_le(int addr);
    
    /**
     * Read signed 2 byte value, big endian.
     * @param addr
     * @return
     */
    public int read_s16_be(int addr);
    
    /**
     * Write signed 2 byte value, big endian.
     * @param addr
     * @param value
     */
    public void write_s16_be(int addr, int value);
    

    /**
     * Read signed 2 byte value, big endian.
     * @param addr
     * @return
     */
    public int read_u16_le(int addr);
    
    
    /**
     * Write unsigned 2 byte value, little endian.
     * @param addr
     * @param value
     */
    public void write_u16_le(int addr, long value);
    
    /**
     * Read unsigned 2 byte value, big endian.
     * @param addr
     * @return
     */
    public int read_u16_be(int addr);
    
    /**
     * Write unsigned 2 byte value, big endian.
     * @param addr
     * @param value
     */
    public void write_u16_be(int addr, long value);
    
    /**
     * Write signed 24 bit value, little endian.
     * @param addr
     * @return
     */
    public int read_s24_le(int addr);

    /**
     * Write signed 24 bit value, little endian.
     * @param addr
     * @param value
     */
    public void write_s24_le(int addr, int value);

    /**
     * Read signed 24 bit value, big endian.
     * @param addr
     * @return
     */
    public int read_s24_be(int addr);
    
    /**
     * Write signed 24 bit value, big endian.
     * @param addr
     * @param value
     */
    public void write_s24_be(int addr, int value);
    
    /**
     * Read unsigned 24 bit value, little endian.
     * @param addr
     * @return
     */
    public long read_u24_le(int addr);
    
    /**
     * Write unsigned 24 bit value, little endian.
     * @param addr
     * @param value
     */
    public void write_u24_le(int addr, long value);
    
    /**
     * Read unsigned 24 bit value, big endian.
     * @param addr
     * @return
     */
    public long read_u24_be(int addr);
    
    /**
     * Write unsigned 24 bit value, big endian.
     * @param addr
     * @param value
     */
    public void write_u24_be(int addr, long value);
    
    /**
     * Read signed 4 byte value, little endian.
     * @param addr
     * @return
     */
    public long read_s32_le(int addr);
    
    /**
     * Write signed 4 byte value, little endian.
     * @param addr
     * @param value
     */
    public void write_s32_le(int addr, int value);
    
    /**
     * Read signed 4 byte value, big endian.
     * @param addr
     * @return
     */
    public int read_s32_be(int addr);
    
    /**
     * Write signed 4 byte value, big endian.
     * @param addr
     * @param value
     */
    public void write_s32_be(int addr, int value);
    
    /**
     * Read unsigned 4 byte value, little endian.
     * @param addr
     * @return
     */
    public long read_u32_le(int addr);
    
    /**
     * Write unsigned 4 byte value, little endian.
     * @param addr
     * @param value
     */
    public void write_u32_le(int addr, long value);
    
    /**
     * Read unsigned 4 byte value, big endian.
     * @param addr
     * @return
     */
    public long read_u32_be(int addr);
    
    /**
     * Write unsigned 4 byte value, big endian.
     * @param addr
     * @param value
     */
    public void write_u32_be(int addr, long value);    
}
