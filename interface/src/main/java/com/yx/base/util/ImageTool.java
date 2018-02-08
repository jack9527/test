package com.yx.base.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.opslab.util.RandomUtil;

public class ImageTool {

	public static final Color[] Colors = new Color[] { new Color(0xF65E5E), new Color(0x5C6BC0), new Color(0x3BC2B5),
			new Color(0x78C06E), new Color(0xC5CB63), new Color(0xFF943E) };

	public static void main(String[] args) throws Exception {
		createImage("群", "e:/1.png");
		createImage("充值", "e:/2.png");
		createImage("充值", "e:/3.png");
		createImage("充值", "e:/4.png");
		createImage("充值", "e:/5.png");
		createImage("充值", "e:/6.png");
		createImage("充值", "e:/7.png");
		System.out.println("1".getBytes().length);
	}

	public static void createImage(String text, String pathAndName) throws Exception {
		int width = 128;
		int height = 128;
		Font font = new Font("宋体", Font.BOLD, 50);

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		Graphics g = image.getGraphics();
		g.setClip(0, 0, width, height);
		g.setColor(Colors[RandomUtil.integer(0, 5)]);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.white);
		g.setFont(font);

		FontMetrics fm = g.getFontMetrics(font);
		int fHeight = fm.getHeight();
		int fWidth = fm.stringWidth(text);

		int y = (height / 2) + fHeight / 2 -10;
		int x = (width - fWidth) / 2;
		g.drawString(text, x, y);

		g.dispose();
		ImageIO.write(image, "png", new File(pathAndName));
	}
}
