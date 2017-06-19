package com.gll.ls.web.utils.captcha;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gll.ls.utils.context.Constants;

/**
 * Servlet implementation class getImageServlet
 */
public class GetImageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static final String CAPTCHA_IMAGE_FORMAT = "jpeg";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetImageServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("#######################生成数字和字母的验证码#######################");

		BufferedImage img = new BufferedImage(68, 22, BufferedImage.TYPE_INT_RGB); // 得到该图片的绘图对象
		Graphics g = img.getGraphics();
		Random r = new Random();
		Color c = new Color(200, 150, 255);
		g.setColor(c); // 填充整个图片的颜色
		g.fillRect(0, 0, 68, 22); // 向图片中输出数字和字母
		StringBuffer sb = new StringBuffer();
		char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		int index, len = ch.length;
		for (int i = 0; i < 4; i++) {
			index = r.nextInt(len);
			g.setColor(new Color(r.nextInt(88), r.nextInt(188), r.nextInt(255)));

			g.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));// 输出的 字体和大小
			g.drawString("" + ch[index], (i * 15) + 3, 18);// 写什么数字，在图片 的什么位置画
			sb.append(ch[index]);
		}
		String piccode = sb.toString();
		System.out.println(piccode + "######################");

		// flush it in the response
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/" + CAPTCHA_IMAGE_FORMAT);

		request.getSession().setAttribute(Constants.PICCODE_SESSION, piccode);
		ImageIO.write(img, "JPG", response.getOutputStream());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
