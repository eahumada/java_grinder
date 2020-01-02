
import net.mikekohn.java_grinder.amiga.Copper;

public class SpriteJava
{
  static final int width = 16;
  static final int height = 15;

  static public void init(Copper copper)
  {
    copper.appendSetSprite(0, sprite_j);
    copper.appendSetSprite(1, sprite_a0);
    copper.appendSetSprite(2, sprite_v);
    copper.appendSetSprite(3, sprite_a1);
    copper.appendSetSprite(4, sprite_blank);
    copper.appendSetSprite(5, sprite_blank);
    copper.appendSetSprite(6, sprite_blank);
    copper.appendSetSprite(7, sprite_blank);
    copper.appendSetColor(17, 0xfff);
    copper.appendSetColor(21, 0xfff);

    // Don't add appendEnd() so that Copper bars can be made with Logo.java.
  }

  static public short[] palette =
  {
    0x05a, 0xfff,
  };

  static public char[] sprite_j =
  {
    0x5555, 0x6300,
    0x00e0, 0x0000,
    0x00e0, 0x0000,
    0x0060, 0x0000,
    0x0060, 0x0000,
    0x0060, 0x0000,
    0x0060, 0x0000,
    0x0060, 0x0000,
    0x0060, 0x0000,
    0x0c60, 0x0000,
    0x0c60, 0x0000,
    0x0c60, 0x0000,
    0x0c60, 0x0000,
    0x07c0, 0x0000,
    0x07c0, 0x0000,
  };

  static public char[] sprite_a0 =
  {
    0x7555, 0x6300,
    0x0180, 0x0000,
    0x0180, 0x0000,
    0x03c0, 0x0000,
    0x03c0, 0x0000,
    0x03c0, 0x0000,
    0x03c0, 0x0000,
    0x0660, 0x0000,
    0x0660, 0x0000,
    0x07e0, 0x0000,
    0x07e0, 0x0000,
    0x0c30, 0x0000,
    0x0c30, 0x0000,
    0x0c30, 0x0000,
    0x0c30, 0x0000,
  };

  static public char[] sprite_v =
  {
    0x9555, 0x6300,
    0x0c30, 0x0000,
    0x0c30, 0x0000,
    0x0c30, 0x0000,
    0x0c30, 0x0000,
    0x0660, 0x0000,
    0x0660, 0x0000,
    0x0660, 0x0000,
    0x0660, 0x0000,
    0x03c0, 0x0000,
    0x03c0, 0x0000,
    0x03c0, 0x0000,
    0x03c0, 0x0000,
    0x0180, 0x0000,
    0x0180, 0x0000,
  };

  static public char[] sprite_a1 =
  {
    0xa555, 0x6300,
    0x0180, 0x0000,
    0x0180, 0x0000,
    0x03c0, 0x0000,
    0x03c0, 0x0000,
    0x03c0, 0x0000,
    0x03c0, 0x0000,
    0x0660, 0x0000,
    0x0660, 0x0000,
    0x07e0, 0x0000,
    0x07e0, 0x0000,
    0x0c30, 0x0000,
    0x0c30, 0x0000,
    0x0c30, 0x0000,
    0x0c30, 0x0000,
  };

  static public char[] sprite_blank =
  {
    0, 0, 0 ,0,
  };
}

