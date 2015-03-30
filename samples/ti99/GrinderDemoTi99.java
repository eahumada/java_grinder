
import net.mikekohn.java_grinder.TI99;

public class GrinderDemoTi99
{
  static short[] tones =
  {
    // C     C#      D     D#      E      F     F#      G     G#      A     A#
    0x60d, 0xa0c, 0xe0b, 0x40b, 0xa0a, 0x00a, 0x709, 0xf08, 0x708, 0xf07, 0x807,
    // BB
    0x107
  };

  static byte[] sprite_j =
  {
      0,    0,    0,    0,    0,    0,    0,    0,
      0,    0,  -32,  112,  112,   56,   28,   15,
     -4,   -4,  112,  112,  112,  112,  112,  112,
    112,  112,  112,  112,  112,  -32,  -64,  -128,
  };

  static byte[] sprite_a =
  {
     15,   31,   60,  120,  120,  -16,  -16,  -16,
     -1,   -1,  -16,  -16,  -16,  -16,  -16,  -16,
   -128,  -64,  -32,  -16,  -16,  120,  120,  120,
     -8,   -8,  120,  120,  120,  120,  120,  120,
  };

  static byte[] sprite_v =
  {
    -16,  -16,  -16,  -16,  -16,  -16,  -16,  -16,
    -16,  -16,  -16,  120,  120,   60,   63,   15,
    120,  120,  120,  120,  120,  120,  120,  120,
    120,  120,  120,  -16,  -16,  -32,  -32,  -128,
  };

  static public void drawMandelbrot()
  {
    final int DEC_PLACE = 4;
    int x,y;
    //int rs = (-2 << DEC_PLACE), re = (1 << DEC_PLACE);
    //int is = (-1 << DEC_PLACE), ie = (1 << DEC_PLACE);
    int rs,is;
    int zi,zr;
    int tr,ti;
    int zr2,zi2;
    //int dx = 0x0019, dy = 0x0015;  according to debugger, 2 lines below work
    //int dx = (re - rs) / 32;
    //int dy = (ie - is) / 24;
    //int rs_save = rs;
    int count;

    TI99.setCursor(0, 0);

    for (y = 0; y < 24; y++)
    {
      is = (((2 << DEC_PLACE) * y) / 24) - (1 << DEC_PLACE);
      //rs = rs_save;

      for (x = 0; x < 32; x++)
      {
        rs = (((3 << DEC_PLACE) * x) / 32) - (2 << DEC_PLACE);

        zr = 0;
        zi = 0;

        for (count = 0; count < 16; count++)
        {
          zr2 = (zr * zr) >> DEC_PLACE;
          zi2 = (zi * zi) >> DEC_PLACE;

          if (zr2 + zi2 > (4 << DEC_PLACE)) { break; }

          tr = zr2 - zi2;
          ti = 2 * ((zr * zi) >> DEC_PLACE);

          zr = tr + rs;
          zi = ti + is;
        }

        //TI99.printChar((char)((count >> 2) + '0'));
        //TI99.printChar((char)(count << 4));
        TI99.plot(x, y, (char)(count << 4));

        //rs += dx;
      }

      //is += dy;
    }
  }

  static public void delay()
  {
    int a;
    for (a = 0; a < 32767; a++);
  }

  static public void delayLong()
  {
    int a;
    for (a = 0; a < 4; a++) { delay(); }
  }

  static public void delayShort()
  {
    int a;
    for (a = 0; a < 10000; a++);
  }

  static public void delayShortTwo()
  {
    int a;
    for (a = 0; a < 2000; a++);
  }

  static public void playTone(int tone)
  {
    TI99.setSoundFreq(0, tones[tone]);
    TI99.setSoundVolume(0, 0);
    delayShort();
    TI99.setSoundVolume(0, 15);
    delayShortTwo();
  }

  static public void scrollcolors()
  {
    int a,b;

    for (a = 1; a < 12; a++)
    {
      for (b = 0; b < 4; b++)
      {
        TI99.setSpriteColor(b, a + b + 1);
      }
      delayShort();
    }
  }

  static public void hideSprites()
  {
    int a;

    for (a = 0; a < 4; a++)
    {
      TI99.setSpriteColor(a, a + 1);
      TI99.setSpritePos(a, 0xff, 0xd0);
    }
  }

  static public void main(String args[])
  {
    int a,pos;

    TI99.setSpriteSize(TI99.SPRITE_SIZE_16X16_SMALL);

    TI99.setCursor(10, 10);
    TI99.print("IN MEMORY OF");
    TI99.setCursor(8, 14);
    TI99.print("SUN MICROSYSTEMS");
    delayLong();
    TI99.clearScreen();

    //TI99.setSpriteVisible(0, true);
    TI99.setSpriteImage(0, sprite_j);
    TI99.setSpriteImage(1, sprite_a);
    TI99.setSpriteImage(2, sprite_v);
    TI99.setSpriteImage(3, sprite_a);
    hideSprites();

    TI99.setSpritePos(0, 0x45, 0x40);
    playTone(0);
    TI99.setSpritePos(1, 0x65, 0x40);
    playTone(4);
    TI99.setSpritePos(2, 0x85, 0x40);
    playTone(7);
    TI99.setSpritePos(3, 0xa5, 0x40);
    playTone(9);

    TI99.setCursor(13, 12);
    TI99.print("GRINDER");

    TI99.setSoundFreq(0, tones[0]);
    TI99.setSoundVolume(0, 0);
    TI99.setSoundFreq(1, tones[4]);
    TI99.setSoundVolume(1, 0);
    TI99.setSoundFreq(2, tones[7]);
    TI99.setSoundVolume(2, 0);

    delay();

    TI99.setSoundVolume(0, 15);
    TI99.setSoundVolume(1, 15);
    TI99.setSoundVolume(2, 15);

    scrollcolors();

    TI99.clearScreen();
    hideSprites();

    TI99.setColors();
    drawMandelbrot();

    delay();

    TI99.clearScreen();

    pos = 0x45;
    for (a = 0; a < 4; a++)
    {
      TI99.setSpritePos(a, pos, 0x40);
      pos += 0x20;
    }

    scrollcolors();
    delay();
    TI99.setSpriteSize(TI99.SPRITE_SIZE_16X16_BIG);
    scrollcolors();

    while(true);
  }
}

