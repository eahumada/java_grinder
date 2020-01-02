
import net.mikekohn.java_grinder.amiga.Blitter;
import net.mikekohn.java_grinder.amiga.Copper;

/*
 ---------- BMP Info Header ----------
            size: 108
           width: 112
          height: 37

Total Colors: 16
*/

public class ImageAmigaLogo16
{
  static public void init(Copper copper, Blitter blitter)
  { 
    int n;
    
    for (n = 0; n < palette.length; n++)
    { 
      Display.setPalette(copper, n, palette[n]);
    }
    
    // 320 / 8 = 40, 40 - (width / 8) = 26.
    blitter.setModuloDestination(26);
  }
  
  static public int getCenter()
  {
    return (4000 - (28 * 40)) + (20 - 6);
  }

  static public short[] palette =
  {
    0x000, 0x450, 0x222, 0x8f2, 0x5e8, 0x555, 0x999, 0xccc,
    0xfff, 0x4db, 0xef0, 0xcb0, 0x29e, 0x15c, 0x740, 0xf90,
  };

  static public byte[] bitplane_0 =
  {
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 121, -16, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    -5, -32, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 1, -9, -64,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 1, -25, -64, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 3, -17, -128, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 7,
    -33, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 7, -97, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 15, -66, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 31, 124, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 62,
    124, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 126, -8, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 71, 16, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, -122, 16, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 1, 12,
    32, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 2, 12, 32, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 2, 24, 64, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    4, 48, 4, 1, 26, 0, -61, -8,
    1, 1, 0, 32, 0, 0, 8, 32,
    -114, 0, -4, 3, -7, -2, 11, -18,
    0, 112, 0, 0, 8, 97, 62, 0,
    124, 15, -63, -4, 63, 7, 1, -16,
    0, 0, 16, -64, 34, 0, 66, 8,
    65, 0, -60, 2, 1, 16, 0, 0,
    32, -126, 0, 0, -126, 0, 65, 1,
    -116, 2, 2, 8, 125, -16, 33, -124,
    0, 0, -126, 32, 1, 10, 8, 4,
    0, 8, 127, -8, 67, 9, 33, 0,
    98, 40, 66, 16, 0, 0, 9, 0,
    43, -4, -126, 9, 1, 0, 32, 8,
    0, 4, 32, 0, 9, 0, 32, 0,
    -122, 16, -127, 1, 96, -96, -126, 16,
    0, 0, 4, 0, 0, -61, 12, 36,
    -128, 0, -96, -80, -128, 0, 0, 2,
    36, 0, 7, 94, 8, 37, 0, 0,
    32, 0, 0, 40, 64, 0, 41, 8,
    15, -2, 24, 64, 0, 2, 32, -112,
    -124, 8, 65, 5, 64, 8, 7, -8,
    48, -112, 0, 5, 32, -127, 0, 40,
    65, 4, -127, 8, 3, -16, 32, -112,
    33, 0, 32, 33, 8, 64, 64, 8,
    0, 8, 2, 8, -95, 8, 33, 5,
    34, 0, 0, 0, 1, 1, 1, 8,
    0, 31, -66, 64, 1, 8, 2, 33,
    8, 0, 0, 8, 1, 8, 1, 63,
    -1, 8, 64, 40, 0, -128, -96, 32,
    2, 24, 99, 0, 0, 127, -4, 0,
    -128, 32, 73, 0, -64, 17, -124, 0,
    0, 2, 0, 125, -7, 124, 63, -65,
    -112, -2, -97, -32, 14, 75, -30, -2,
    0, 125, -16, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0,
  };

  static public byte[] bitplane_1 =
  {
    0, 0, 0, 0, 125, -16, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, -1, -16, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 1,
    -1, -16, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 1, -1, -32,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 3, -1, -64, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 7, -1, -64, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 15,
    -1, -128, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 15, -1, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 31, -1, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 63, -2, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 63,
    -4, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 63, -4, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, -3, -8, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, -1, -16, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, -5,
    -16, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 1, -9, -64, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 3, -1, -60, 0, 0, 0,
    0, 0, 0, 0, 0, 48, 0, 0,
    3, -17, -34, 0, -28, 7, 56, 7,
    2, -2, 0, -16, 0, 0, 7, -33,
    30, 1, -2, 7, -13, -1, 7, -1,
    0, -8, 0, 0, 15, -1, 30, 0,
    -2, 7, -14, -8, 31, -50, 0, -8,
    0, 0, 31, -65, 99, 0, -62, 24,
    96, 8, 71, 11, 3, 24, 0, 0,
    31, 124, 65, 0, 2, 16, 65, 8,
    -120, 10, 2, 0, 0, 0, 62, -4,
    -127, 0, -126, 0, 65, 0, 0, 10,
    4, 0, 0, 0, 126, -4, 32, 1,
    98, 104, 0, 20, 16, 0, 1, 8,
    0, 0, 125, -15, 96, 1, 96, 88,
    66, 20, 32, 0, 27, 8, 0, -127,
    -5, -14, -96, 1, 32, 48, -126, 8,
    32, 0, 23, 8, 0, 1, -5, -16,
    33, 2, -95, -128, -124, 24, 35, -4,
    1, 8, 24, -95, -9, -51, -31, 2,
    -95, 80, -124, 40, 68, 1, 111, 8,
    0, 3, -17, -56, 1, 2, -96, -48,
    4, 40, 67, 6, 64, 8, 0, 3,
    -17, -125, -31, 1, 32, 33, 0, 8,
    64, 0, 31, 8, 4, 7, -33, 52,
    1, 5, 33, 1, 0, 72, 65, 9,
    33, 8, 0, 15, -66, 44, 1, 4,
    35, 33, 8, 72, 33, 9, 32, 8,
    0, 31, -66, 8, 33, 1, 32, 32,
    8, 68, 34, 2, 64, 8, 0, 63,
    -4, -114, 32, -39, -28, 65, 16, 66,
    24, 20, 85, 6, 0, 127, -6, 2,
    0, 96, 44, 0, -128, 0, -124, 16,
    20, 2, 0, -3, -8, -126, -64, 64,
    9, 1, 96, 0, 127, -92, 21, 0,
    0, 0, 8, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0,
  };

  static public byte[] bitplane_2 =
  {
    0, 0, 0, 0, 125, -16, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, -1, -16, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 1,
    -1, -16, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 1, -1, -32,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 3, -1, -64, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 7, -1, -128, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 7,
    -1, -128, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 15, -1, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 31, -2, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 31, -2, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 1,
    -128, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 1, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 8, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 14, 1, -2, 3, -13, -2,
    1, -1, 0, 112, 0, 0, 0, 0,
    30, 1, -2, 7, -5, -2, 15, -1,
    0, -16, 0, 0, 0, 0, 62, 0,
    126, 15, -31, -4, 63, -113, 1, -16,
    0, 0, 0, 0, 34, 0, 66, 8,
    65, 8, -58, 10, 1, 16, 0, 0,
    0, 0, 64, 0, -126, 16, 65, 9,
    -116, 10, 2, 8, 125, -16, 0, 0,
    -128, 0, -126, 32, 65, 10, 8, 4,
    4, 8, 127, -8, 0, 1, 33, 0,
    98, 40, 66, 16, 16, 0, 9, 8,
    63, -4, 0, 1, 97, 1, 96, 88,
    2, 20, 32, 0, 11, 8, 63, 124,
    0, 2, -95, 1, 96, -96, -126, 16,
    32, 0, 21, 8, 31, -2, 0, 4,
    -95, 0, -96, -80, -128, 8, 0, 2,
    37, 8, 8, -32, 0, 5, -31, 2,
    -95, 80, -124, 40, 64, 1, 47, 8,
    8, 32, 0, 8, 1, 2, 32, -112,
    -124, 40, 67, 7, 64, 8, 0, 36,
    0, 19, -31, 5, 32, -127, 0, 40,
    65, 4, -97, 8, 0, 24, 0, 20,
    33, 5, 33, 33, 8, 72, 65, 8,
    33, 8, 1, -16, 64, 40, 33, 5,
    34, 33, 8, 64, 1, 9, 1, 8,
    1, -32, 64, 72, 1, 8, 34, 33,
    8, 68, 32, 10, 65, 8, 0, -64,
    1, -116, 96, -71, -92, -63, -80, 98,
    18, 28, 99, 4, 0, -128, 0, 2,
    -128, 96, 105, 0, -64, 17, -124, 16,
    20, 2, 0, 2, 1, -4, 127, -65,
    -112, -1, -65, -32, 63, -49, -29, -2,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0,
  };

  static public byte[] bitplane_3 =
  {
    0, 0, 0, 0, 125, -16, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, -1, -16, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 1,
    -1, -16, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 1, -1, -32,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 3, -1, -64, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 7, -1, -128, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 7,
    -1, -128, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 15, -1, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 31, -2, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 31, -2, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 63,
    -4, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 63, -8, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 125, -8, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, -1, -16, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, -5,
    -32, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 1, -9, -64, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 3, -1, -64, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    3, -17, -128, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 7, -33,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 15, -1, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 31, -66, 28, 0, 60, 7,
    -128, -16, 56, 4, 0, -32, 0, 0,
    31, 124, 62, 0, 124, 15, -128, -16,
    112, 4, 1, -16, 125, -16, 62, -4,
    126, 0, 124, 31, -128, -15, -16, 0,
    3, -16, 127, -8, 126, -8, -34, 0,
    -100, 23, -127, -29, -32, 0, 6, -16,
    63, -4, 125, -16, -98, 0, -98, 39,
    -127, -29, -64, 0, 4, -16, 31, 124,
    -5, -15, 30, 0, -98, 79, 1, -25,
    -64, 0, 8, -16, 31, 61, -5, -29,
    30, 1, 30, 79, 3, -25, -64, 0,
    24, -16, 7, 31, -9, -62, 30, 1,
    30, -113, 3, -57, -125, -2, 16, -16,
    7, -35, -17, -57, -2, 1, 31, 15,
    3, -57, -128, -8, 63, -16, 7, -37,
    -17, -116, 30, 2, 31, 30, 7, -57,
    -128, -8, 96, -16, 3, -25, -33, 8,
    30, 2, 30, 30, 7, -121, -128, -16,
    -64, -16, 2, 7, 30, 16, 30, 2,
    28, 30, 7, -121, -64, -16, -64, -16,
    0, 0, 0, 48, 30, 6, 28, 30,
    7, -125, -63, -15, -128, -16, 0, 0,
    0, 112, 31, 6, 24, 62, 15, -127,
    -31, -29, -128, -8, 0, 0, 1, -4,
    127, -97, -112, -1, 63, -32, 123, -17,
    -29, -4, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0, 0, 0,
    0, 0, 0, 0, 0, 0,
  };

/*
  static public void show(Copper copper)
  {
    copper.stop();
    copper.resetIndex();
    copper.appendSetBitplane(0, bitplane_0);
    copper.appendSetBitplane(1, bitplane_1);
    copper.appendSetBitplane(2, bitplane_2);
    copper.appendSetBitplane(3, bitplane_3);
    copper.appendSetColor(0, palette[0]);
    copper.appendSetColor(1, palette[1]);
    copper.appendSetColor(2, palette[2]);
    copper.appendSetColor(3, palette[3]);
    copper.appendSetColor(4, palette[4]);
    copper.appendSetColor(5, palette[5]);
    copper.appendSetColor(6, palette[6]);
    copper.appendSetColor(7, palette[7]);
    copper.appendSetColor(8, palette[8]);
    copper.appendSetColor(9, palette[9]);
    copper.appendSetColor(10, palette[10]);
    copper.appendSetColor(11, palette[11]);
    copper.appendSetColor(12, palette[12]);
    copper.appendSetColor(13, palette[13]);
    copper.appendSetColor(14, palette[14]);
    copper.appendSetColor(15, palette[15]);
    copper.appendEnd();
    copper.run();
  }
*/
}

