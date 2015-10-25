package func;

import luastruct.LuaTable;

/**
 * A library for creating and managing custom dialogs.
 */
public interface Iforms {
    
    /**
     * Adds the given lua function as a click event to the given control.
     * @param handle
     * @param clickEvent
     */
    public void addclick(int handle, Object clickEvent);

    /**
     * Creates a button control on the given form.
     * @param formHandle
     * @param caption will be the text value on the button.
     * @param clickEvent is the name of a Lua function that will be invoked when the button is clicked.
     * @param x optional location parameters for the position of the button within the given form.
     * @param yoptional location parameters for the position of the button within the given form.
     * @param width is optional, if not specified they will be a default size.
     * @param height is optional, if not specified they will be a default size.
     * @return the handle of the created button.
     */
    public int button(int formHandle, String caption, Object clickEvent, int x, int y, int width, int height);
    
    /**
     * Creates a checkbox control on the given form.
     * @param formHandle
     * @param caption will be the text of the checkbox.
     * @param x the optional location parameters for the position of the checkbox within the form.
     * @param y the optional location parameters for the position of the checkbox within the form.
     * @return
     */
    public int checkbox(int formHandle, String caption, int x, int y);
    
    /**
     * Removes all click events from the given widget at the specified handle.
     * @param handle
     */
    public void clearclicks(int handle);
    
    /**
     * Closes and removes a Lua created form with the specified handle.
     * @param handle
     * @return whether a dialog was found and removed.
     */
    public boolean destroy(int handle);
    
    /**
     * Closes and removes all Lua created dialogs.
     */
    public void destroyall();
    
    /**
     * Creates a dropdown (with a ComboBoxStyle of DropDownList) control on the given form.
     * Dropdown items are passed via a lua table.
     * Only the values will be pulled for the dropdown items, the keys are irrelevant.
     * Items will be sorted alphabetically.
     * @param formHandle
     * @param items
     * @param x the optional location parameters.
     * @param y the optional location parameters.
     * @param width the optional size parameters.
     * @param height the optional size parameters.
     * @return
     */
    public int dropdown(int formHandle, LuaTable items, int x, int y, int width, int height);
    
    /**
     * @param handle
     * @param property
     * @return a string representation of the value of a property of the widget at the given handle.
     */
    public String getproperty(int handle, String property);
    
    /**
     * @param handle
     * @return the text property of a given form or control.
     */
    public String gettext(int handle);
    
    /**
     * @param handle
     * @return the given checkbox's checked property.
     */
    public boolean ischecked(int handle);
    
    /**
     * Creates a label control on the given form.
     * @param formHandle
     * @param caption the text of the label.
     * @param x the position of the label within the given form.
     * @param y the position of the label within the given form.
     * @param width is optional, if not specified they will be a default size.
     * @param height is optional, if not specified they will be a default size.
     * @param fixedWidth
     * @return the handle of the created label.
     */
    public int label(int formHandle, String caption, int x, int y, int width, int height, boolean fixedWidth);
    
    /**
     * Creates a new default dialog.
     * @param width if is specified it will create a dialog of the specified size.
     * @param height if is specified it will create a dialog of the specified size.
     * @param title if title is specified it will be the caption of the dialog, else the dialog caption will be 'Lua Dialog'.
     * @return an int representing the handle of the dialog created.
     */
    public int newform(int width, int height, String title);
    
    /** Creates a standard openfile dialog with optional parameters for the filename, directory, and filter.
     * @param fileName
     * @param initialDirectory
     * @param filter
     * @return the directory that the user picked. If they chose to cancel, it will return an empty string.
     */
    public String openfile(String fileName, String initialDirectory, String filter);
    
    /**
     * Sets the location of a control or form by passing in the handle of the created object.
     * @param handle
     * @param x
     * @param y
     */
    public void setlocation(int handle, int x, int y);
 
    /**
     * Attempts to set the given property of the widget with the given value.
     * Note: not all properties will be able to be represented for the control to accept.
     * @param handle
     * @param property
     * @param value
     */
    public void setproperty(int handle, String property, Object value);
    
    /**
     * TODO
     */
    public void setsize(int handle, int width, int height);
    
    /**
     * Sets the text property of a control or form by passing in the handle of the created object.
     * @param handle
     * @param caption
     */
    public void settext(int handle, String caption);
    
    /**
     * Creates a textbox control on the given form.
     * @param formHandle
     * @param caption the initial value of the textbox (default is empty).
     * @param width is option, if not specified it will be a default size of 100. 
     * @param height is option, if not specified it will be a default size of 20.
     * @param boxtype an optional property to restrict the textbox input. The available options are HEX, SIGNED, and UNSIGNED. Passing it null or any other value will set it to no restriction.
     * @param x the optional location parameters for the position of the textbox within the given form.
     * @param y the optional location parameters for the position of the textbox within the given form.
     * @param multiline if true, the multiline will enable the standard winform multi-line property.
     * @param fixedWidth if true, the fixedWidth options will create a fixed width font.
     * @return the handle of the created textbox.
     */
    public String textbox(int formHandle, String caption, int width, int height, String boxtype, int x, int y, boolean multiline, boolean fixedWidth);
    
    
    
}
