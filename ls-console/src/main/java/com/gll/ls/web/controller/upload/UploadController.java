package com.gll.ls.web.controller.upload;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.gll.ls.core.pojo.utils.kindeditor.vo.KindEditorUpload;
import com.gll.ls.utils.context.Constants;
import com.gll.ls.utils.utils.ConversionUtil;
import com.gll.ls.utils.web.http.ResponseUtils;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import net.fckeditor.response.UploadResponse;

/**
 * 上传图片公共类
 * 商品
 * 品牌
 * 商品介绍FCK
 * 
 * @author XL
 *
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

	public static Random random = new Random();

	/**
	 * KindEditorUpload 文件上传
	 * 
	 * @param pic
	 *            // required false 不上传也不报错
	 * @param module
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/uploadPicK.do", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=utf-8")
	public @ResponseBody String uploadPicK(@RequestParam(required = false) MultipartFile pic, String module, HttpServletResponse response) {

		// 图片名称生成策略（）

		// 获取上传文件的扩展名
		String ext = FilenameUtils.getExtension(pic.getOriginalFilename());

		// 封装文件名
		String fileName = new SimpleDateFormat("yyyy-MM-dd-HHmmss-SSS").format(new Date());
		// 随机三位数；
		for (int i = 0; i < 3; i++) {
			fileName = fileName + random.nextInt(10);
		}

		// 保存数据库的 文件名
		String path = "";
		if (null == module) {
			path = "upload/" + fileName + "." + ext;
		} else {
			path = "upload/" + module + "/" + fileName + "." + ext;
		}

		// 另外一台tomcat的请求路径是多少 （真是得文件路径）
		String url = Constants.UPLOAD_IMAGE_URL + path;

		// 实例化一个Jersey
		Client client = new Client();
		// 设置请求路径//webResource具备 可以讲图片发送出去
		WebResource resource = client.resource(url);

		// 封装的 文件上传的信息
		KindEditorUpload keu = new KindEditorUpload();

		// 发送开始 post get put
		try {
			// 发送数据
			resource.put(String.class, pic.getBytes());
			System.out.println("发送完毕" + url + "===========" + path + "");
			// 返回成功信息信息
			keu.setError(0);
			keu.setUrl(url);
			keu.setPath(path);

		} catch (IOException e) {
			e.printStackTrace();
			// 返回错误信息！
			keu.setError(1);
			keu.setMessage("图片上传失败");
		}

		String json = ConversionUtil.objectToJson(keu);

		return json;
	}

	/**
	 * AJAX 上传图片
	 * 
	 * @param pic
	 * @param response
	 */
	@RequestMapping("/uploadPic.do") // required false 不上传也不报错
	public void uploadPic(@RequestParam(required = false) MultipartFile pic, String module, HttpServletResponse response) {
		// 图片名称生成策略

		// 获取上传文件的扩展名
		String ext = FilenameUtils.getExtension(pic.getOriginalFilename());

		// 封装文件名
		String fileName = new SimpleDateFormat("yyyy-MM-dd-HHmmss-SSS").format(new Date());
		// 随机三位数；
		for (int i = 0; i < 3; i++) {
			fileName = fileName + random.nextInt(10);
		}

		// 保存数据库的
		String path = "upload/imgs/" + module + "/" + fileName + "." + ext;
		// 另外一台tomcat的请求路径是多少
		String url = Constants.UPLOAD_IMAGE_URL + path;

		// 实例化一个Jersey
		Client client = new Client();
		// 设置请求路径//webResource具备 可以讲图片发送出去
		WebResource resource = client.resource(url);

		// 发送开始 post get put
		try {
			resource.put(String.class, pic.getBytes());
			System.out.println("发送完毕" + url + "====" + path + "");

		} catch (IOException e) {
			e.printStackTrace();
		}

		JSONObject jo = new JSONObject();
		jo.put("url", url);
		jo.put("path", path);

		// 第二次返回
		ResponseUtils.renderJson(response, jo.toString());
	}

	/**
	 * AJAX 上传图片
	 * 
	 * @param pic
	 * @param response
	 */
	@RequestMapping("/uploadFile.do") // required false 不上传也不报错
	public void uploadFile(@RequestParam(required = false) MultipartFile file, String module, HttpServletResponse response) {
		// 图片名称生成策略

		// 获取上传文件的扩展名
		String ext = FilenameUtils.getExtension(file.getOriginalFilename());

		// 封装文件名
		String fileName = new SimpleDateFormat("yyyy-MM-dd-HHmmss-SSS").format(new Date());
		// 随机三位数；
		for (int i = 0; i < 3; i++) {
			fileName = fileName + random.nextInt(10);
		}

		// 保存数据库的
		String path = "upload/file/" + module + "/" + fileName + "." + ext;
		// 另外一台tomcat的请求路径是多少
		String url = Constants.UPLOAD_IMAGE_URL + path;

		// 实例化一个Jersey
		Client client = new Client();
		// 设置请求路径//webResource具备 可以讲图片发送出去
		WebResource resource = client.resource(url);

		// 发送开始 post get put
		try {
			resource.put(String.class, file.getBytes());
			System.out.println("发送完毕" + url + "====" + path + "");

		} catch (IOException e) {
			e.printStackTrace();
		}

		JSONObject jo = new JSONObject();
		jo.put("url", url);
		jo.put("path", path);

		// 第二次返回
		ResponseUtils.renderJson(response, jo.toString());
	}

	/**
	 * 上传FCK图片
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping("/uploadFck.do") // required false 不上传也不报错
	public void uploadFck(HttpServletRequest request, HttpServletResponse response) {

		// 强转request（支持多个图片）
		MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;

		// 获取值
		// mr.getFile("");
		Map<String, MultipartFile> fileMap = mr.getFileMap();

		// 遍历map
		Set<Entry<String, MultipartFile>> entrySet = fileMap.entrySet();
		for (Entry<String, MultipartFile> entry : entrySet) {
			// 上传来的图片
			MultipartFile pic = entry.getValue();

			// 获取上传文件的扩展名
			String ext = FilenameUtils.getExtension(pic.getOriginalFilename());

			String fileName = new SimpleDateFormat("yyyy-MM-dd-HHmmss-SSS").format(new Date());
			for (int i = 0; i < 3; i++) {
				fileName = fileName + random.nextInt(10);
			}

			// 保存数据库的
			String path = "upload/item/" + fileName + "." + ext;

			// 另外一台tomcat的请求路径是多少
			String url = Constants.UPLOAD_IMAGE_URL + path;

			// 实例化一个Jersey
			Client client = new Client();
			// 设置请求路径//webResource具备 可以讲图片发送出去
			WebResource resource = client.resource(url);

			// 发送开始 post get put
			try {
				resource.put(String.class, pic.getBytes());
				System.out.println("发送完毕");
			} catch (IOException e) {
				e.printStackTrace();
			}

			// 返回url给fck
			UploadResponse ok = UploadResponse.getOK(url);

			try {
				response.getWriter().print(ok);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
