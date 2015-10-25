package func;

import luastruct.LuaColor;
import luastruct.LuaTable;

public interface Igui {
    
    /**
     * Changes drawing target to the specified lua surface name.
     * This may clobber any previous drawing to this surface.
     * @param name
     */
    public void DrawNew(String name);

    /**
     * Adds a message to the OSD's message area.
     * @param message
     */
    public void addmessage(String message);
    
    /**
     * Clears all lua drawn graphics from the screen.
     */
    public void clearGraphics();
    
    /**
     * Clears all text created by gui.text().
     */
    public void cleartext();
    
    /**
     * Draws a Bezier curve using the table of coordinates provided in the given color.
     * @param points
     * @param color
     */
    public void drawBezier(LuaTable points, LuaColor color);
    
    /**
     * Draws a rectangle on screen from x1/y1 to x2/y2.
     * Same as drawRectangle except it receives two points instead of a point and width/height
     * @param x
     * @param y
     * @param x2
     * @param y2
     * @param line is optional.
     * @param background is optional.
     */
    public void drawBox(int x, int y, int x2, int y2, LuaColor line, LuaColor background);

    /**
     * Draws an ellipse at the given coordinates and the given width and height.
     * @param x
     * @param y
     * @param width
     * @param height
     * @param line is the color of the ellipse.
     * @param background is optional fill color
     */
    public void drawEllipse(int x, int y, int width, int height, LuaColor line, LuaColor background);
    
    /**
     * Draws an Icon (.ico) file from the given path at the given coordinate.
     * @param path
     * @param x
     * @param y
     * @param width is optional, if specified, it will resize the image accordingly.
     * @param height is optional, if specified, it will resize the image accordingly.
     */
    public void drawIcon(String path, int x, int y, Integer width, Integer height);
    
    /**
     * Draws an image file from the given path at the given coordinate.
     * @param path
     * @param x
     * @param y
     * @param width is optional, if specified, it will resize the image accordingly.
     * @param height is optional, if specified, it will resize the image accordingly.
     */
    public void drawImage(String path, int x, int y, Integer width, Integer height);
    
    /**
     * Draws a line from the first coordinate pair to the 2nd.
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param color is optional (if not specified it will be drawn black).
     */
    public void drawLine(int x1, int y1, int x2, int y2, LuaColor color);
    
    /**
     * Draws a Pie shape at the given coordinates and the given width and height.
     * @param x
     * @param y
     * @param width
     * @param height
     * @param startangle
     * @param sweepangle
     * @param line is optional.
     * @param background is optional.
     */
    public void drawPie(int x, int y, int width, int height, int startangle, int sweepangle, LuaColor line, LuaColor background);
    
    /**
     * Draws a single pixel at the given coordinates in the given color.
     * @param x
     * @param y
     * @param color is optional (if not specified it will be drawn black).
     */
    public void drawPixel(int x, int y, LuaColor color);
    
    /**
     * Draws a polygon using the table of coordinates specified in points.
     * @param points
     * @param line is the color of the polygon.
     * @param background is the optional fill color.
     */
    public void drawPolygon(LuaTable points, LuaColor line, LuaColor background);
    
    /**
     * Draws a rectangle at the given coordinate and the given width and height.
     * @param x
     * @param y
     * @param width
     * @param height
     * @param line is the color of the box.
     * @param background is the optional fill color.
     */
    public void drawRectangle(int x, int y, int width, int height, LuaColor line, LuaColor background);
    
    /**
     * Alias of gui.drawText().
     * @param x
     * @param y
     * @param message
     * @param color
     * @param fontsize
     * @param fontfamily
     * @param fontstyle
     */
    public void drawString(int x, int y, String message, LuaColor color, Integer fontsize, String fontfamily, String fontstyle);
    
    /**
     * Draws the given message in the emulator screen space (like all draw functions) at the given x,y coordinates and the given color.
     * @param x
     * @param y
     * @param message
     * @param color the default color is white.
     * @param fontsize the fontsize default is 12.
     * @param fontfamily a fontfamily can be specified and is monospace generic if none is specified (font family options are the same as the .NET FontFamily class.
     * @param fontstyle the font style options are regular, bold, italic, strikethrough, underline.
     */
    public void drawText(int x, int y, String message, LuaColor color, Integer fontsize, String fontfamily, String fontstyle);
    
    /**
     * Displays the given text on the screen at the given coordinates.
     * @param x
     * @param y
     * @param message
     * @param background is the optional background color.
     * @param forecolor is the optional foreground color.
     * @param anchor is the optional anchor flag anchors the text to one of the four corners. Anchor flag parameters: topleft, topright, bottomleft, bottomright.
     */
    public void text(int x, int y, String message, LuaColor background, LuaColor forecolor, String anchor);
    
}
