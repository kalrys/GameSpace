package tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width = 84, height = 84 ;
	private static final int widthh = 128, heighth = 128;
	public static BufferedImage p1,p2,p3, bpdol , spn , spd, bpdop, bpnol, bpnop, her;
	public static void init() {
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("res\\textures\\spritsheet.png"));
	p1 = sheet.crop(0, 0, width, height);
	p2 = sheet.crop(width, 0, width, height);
	p3 = sheet.crop(width * 2, 0, width, height);
	bpdol = sheet.crop(0, height, width, height);
	spn = sheet.crop(height, width, width, height);
	spd = sheet.crop(width * 2, height, width, height);
	bpdop = sheet.crop(0, height * 2, width, height);
	bpnol = sheet.crop(width, height * 2 , width, height);
	bpnop= sheet.crop(width * 2 , height * 2, width, height);
		SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("res\\textures\\alien1.2.png"));
	her = sheet2.crop(0, 0, widthh, heighth);
			
	}
}
