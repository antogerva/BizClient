package utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FuncListLoaderUtil {
    
    public static HashMap<String, List<String>> fill(){

        HashMap<String, List<String>> funcLibMap = new HashMap<String, List<String>>();
        
        funcLibMap.put("bit",Arrays.asList(
                new String[]{"band"
                        ,"bnot"
                        ,"bor"
                        ,"bxor"
                        ,"lshift"
                        ,"rol"
                        ,"rshift"
                        ,"arshift"
                        ,"check"
                        ,"set"
                        ,"clear"
                        ,"byteswap_16"
                        ,"byteswap_32"
                        ,"byteswap_64"
                }
                ));

        funcLibMap.put("bizstring",Arrays.asList(
                new String[]{"hex"
                        ,"binary"
                        ,"octal"
                        ,"trim"
                        ,"replace"
                        ,"toupper"
                        ,"tolower"
                        ,"substring"
                        ,"remove"
                        ,"contains"
                        ,"startswith"
                        ,"endswith"
                        ,"split"
                }
                ));

        funcLibMap.put("client",Arrays.asList(
                new String[]{"borderheight"
                        ,"borderwidth"
                        ,"bufferheight"
                        ,"bufferwidth"
                        ,"clearautohold"
                        ,"closerom"
                        ,"enablerewind"
                        ,"frameskip"
                        ,"gettargetscanlineintensity"
                        ,"getwindowsize"
                        ,"ispaused"
                        ,"opencheats"
                        ,"openhexeditor"
                        ,"openramwatch"
                        ,"openramsearch"
                        ,"openrom"
                        ,"opentasstudio"
                        ,"opentoolbox"
                        ,"opentracelogger"
                        ,"paint"
                        ,"pause"
                        ,"pause_av"
                        ,"reboot_core"
                        ,"screenheight"
                        ,"screenshot"
                        ,"screenshottoclipboard"
                        ,"settargetscanlineintensity"
                        ,"setscreenshotosd"
                        ,"screenwidth"
                        ,"setwindowsize"
                        ,"speedmode"
                        ,"togglepause"
                        ,"transformPointX"
                        ,"transformPointY"
                        ,"unpause"
                        ,"unpause_av"
                        ,"xpos"
                        ,"ypos"
                }
                ));
        
        funcLibMap.put("console",Arrays.asList(
                new String[]{"clear"
                        ,"getluafunctionslist"
                        ,"log"
                        ,"writeline"
                        ,"write"
                }
                ));
        
        funcLibMap.put("emu",Arrays.asList(
                new String[]{"displayvsync"
                        ,"frameadvance"
                        ,"framecount"
                        ,"getregister"
                        ,"getregisters"
                        ,"setregister"
                        ,"getsystemid"
                        ,"islagged"
                        ,"lagcount"
                        ,"limitframerate"
                        ,"minimizeframeskip"
                        ,"setrenderplanes"
                        ,"yield"
                        ,"getdisplaytype"
                }
                ));

        funcLibMap.put("event",Arrays.asList(
                new String[]{"onframeend"
                        ,"onframestart"
                        ,"oninputpoll"
                        ,"onloadstate"
                        ,"onmemoryexecute"
                        ,"onmemoryread"
                        ,"onmemorywrite"
                        ,"onsavestate"
                        ,"onexit"
                        ,"unregisterbyid"
                        ,"unregisterbyname"
                }
                ));
        
        funcLibMap.put("forms",Arrays.asList(
                new String[]{"addclick"
                        ,"button"
                        ,"checkbox"
                        ,"clearclicks"
                        ,"destroy"
                        ,"destroyall"
                        ,"dropdown"
                        ,"getproperty"
                        ,"gettext"
                        ,"ischecked"
                        ,"label"
                        ,"newform"
                        ,"openfile"
                        ,"setlocation"
                        ,"setproperty"
                        ,"setsize"
                        ,"settext"
                        ,"textbox"
                }
                ));
        
        funcLibMap.put("gameinfo",Arrays.asList(
                new String[]{"getromname"
                        ,"getromhash"
                        ,"indatabase"
                        ,"getstatus"
                        ,"isstatusbad"
                        ,"getboardtype"
                        ,"getoptions"
                }
                ));
        
        funcLibMap.put("gui",Arrays.asList(
                new String[]{"DrawNew"
                        ,"addmessage"
                        ,"clearGraphics"
                        ,"cleartext"
                        ,"drawBezier"
                        ,"drawBox"
                        ,"drawEllipse"
                        ,"drawIcon"
                        ,"drawImage"
                        ,"drawLine"
                        ,"drawPie"
                        ,"drawPixel"
                        ,"drawPolygon"
                        ,"drawRectangle"
                        ,"drawString"
                        ,"drawText"
                        ,"text"
                }
                ));

        funcLibMap.put("input",Arrays.asList(
                new String[]{"get"
                        ,"getimmediate"
                        ,"setfrommnemonicstr"
                        ,"set"
                        ,"setanalog"
                }
                ));

        funcLibMap.put("mainmemory",Arrays.asList(
                new String[]{"getname"
                        ,"getcurrentmemorydomainsize"
                        ,"readbyte"
                        ,"writebyte"
                        ,"readbyterange"
                        ,"writebyterange"
                        ,"readfloat"
                        ,"writefloat"
                        ,"read_s8"
                        ,"write_s8"
                        ,"read_u8"
                        ,"write_u8"
                        ,"read_s16_le"
                        ,"write_s16_le"
                        ,"read_s16_be"
                        ,"write_s16_be"
                        ,"read_u16_le"
                        ,"write_u16_le"
                        ,"read_u16_be"
                        ,"write_u16_be"
                        ,"read_s24_le"
                        ,"write_s24_le"
                        ,"read_s24_be"
                        ,"write_s24_be"
                        ,"read_u24_le"
                        ,"write_u24_le"
                        ,"read_u24_be"
                        ,"write_u24_be"
                        ,"read_s32_le"
                        ,"write_s32_le"
                        ,"read_s32_be"
                        ,"write_s32_be"
                        ,"read_u32_le"
                        ,"write_u32_le"
                        ,"read_u32_be"
                        ,"write_u32_be"
                }
                ));

        funcLibMap.put("memory",Arrays.asList(
                new String[]{"getmemorydomainlist"
                        ,"getcurrentmemorydomain"
                        ,"getcurrentmemorydomainsize"
                        ,"readbyte"
                        ,"writebyte"
                        ,"readbyterange"
                        ,"writebyterange"
                        ,"readfloat"
                        ,"writefloat"
                        ,"read_s8"
                        ,"write_s8"
                        ,"read_u8"
                        ,"write_u8"
                        ,"read_s16_le"
                        ,"write_s16_le"
                        ,"read_s16_be"
                        ,"write_s16_be"
                        ,"read_u16_le"
                        ,"write_u16_le"
                        ,"read_u16_be"
                        ,"write_u16_be"
                        ,"read_s24_le"
                        ,"write_s24_le"
                        ,"read_s24_be"
                        ,"write_s24_be"
                        ,"read_u24_le"
                        ,"write_u24_le"
                        ,"read_u24_be"
                        ,"write_u24_be"
                        ,"read_s32_le"
                        ,"write_s32_le"
                        ,"read_s32_be"
                        ,"write_s32_be"
                        ,"read_u32_le"
                        ,"write_u32_le"
                        ,"read_u32_be"
                        ,"write_u32_be"
                }
                ));


        funcLibMap.put("movie",Arrays.asList(
                new String[]{"filename"
                        ,"getinput"
                        ,"getinputasmnemonic"
                        ,"getreadonly"
                        ,"getrerecordcounting"
                        ,"isloaded"
                        ,"length"
                        ,"mode"
                        ,"rerecordcount"
                        ,"setreadonly"
                        ,"setrerecordcount"
                        ,"setrerecordcounting"
                        ,"stop"
                        ,"getfps"
                }
                ));


        funcLibMap.put("nes",Arrays.asList(
                new String[]{"addgamegenie"
                        ,"getallowmorethaneightsprites"
                        ,"getbottomscanline"
                        ,"getclipleftandright"
                        ,"getdispbackground"
                        ,"getdispsprites"
                        ,"gettopscanline"
                        ,"removegamegenie"
                        ,"setallowmorethaneightsprites"
                        ,"setclipleftandright"
                        ,"setdispbackground"
                        ,"setdispsprites"
                        ,"setscanlines"
                }
                ));

        funcLibMap.put("savestate",Arrays.asList(
                new String[]{"load"
                        ,"loadslot"
                        ,"save"
                        ,"saveslot"
                }
                ));

        funcLibMap.put("snes",Arrays.asList(
                new String[]{"getlayer_bg_1"
                        ,"getlayer_bg_2"
                        ,"getlayer_bg_3"
                        ,"getlayer_bg_4"
                        ,"getlayer_obj_1"
                        ,"getlayer_obj_2"
                        ,"getlayer_obj_3"
                        ,"getlayer_obj_4"
                        ,"setlayer_bg_1"
                        ,"setlayer_bg_2"
                        ,"setlayer_bg_3"
                        ,"setlayer_bg_4"
                        ,"setlayer_obj_1"
                        ,"setlayer_obj_2"
                        ,"setlayer_obj_3"
                        ,"setlayer_obj_4"
                }
                ));

        funcLibMap.put("tastudio",Arrays.asList(
                new String[]{"engaged"
                        ,"getmarker"
                        ,"removemarker"
                        ,"setmarker"
                        ,"islag"
                        ,"hasstate"
                }
                ));
        
        return funcLibMap;
    }    
    
}
