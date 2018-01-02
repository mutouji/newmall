package com.taotao.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.taotao.common.utils.FtpUtil;
import com.taotao.common.utils.IDUtils;
import com.taotao.common.utils.JsonUtils;

//import com.taotao.common.utils.JsonUtils;
//import com.taotao.service.PictureService;

@Controller
public class PictureController {
	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;
	@Value("${FTP_USERNAME}")
	private String FTP_USERNAME;
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;
	@Value("${FTP_BASE_PATH}")
	private String FTP_BASE_PATH;
	
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;
	
	@RequestMapping(value="/pic/upload", produces=MediaType.TEXT_PLAIN_VALUE +";charset=utf-8")
	@ResponseBody
	public String pictureUpload(MultipartFile uploadFile) {
		Map<String, Object> resultMap = new HashMap<>();
		
		try {
			// 生成一个新文件名
			String oldName = uploadFile.getOriginalFilename();
			String newName = IDUtils.genImageName();
			newName = newName + oldName.substring(oldName.lastIndexOf("."));
			boolean result = false;
			
			// 图片上传
			String imagePath = new DateTime().toString("/yyyy/MM/dd");
				result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATH, new DateTime().toString("/yyyy/MM/dd"), newName, uploadFile.getInputStream());
			
			if (!result) {
				resultMap.put("error", 1);
				resultMap.put("message", "文件上传失败");
			} else {
				resultMap.put("error", 0);
				resultMap.put("url", IMAGE_BASE_URL + imagePath + "/" + newName);
			}
		} catch (IOException e) {
			e.printStackTrace();
			resultMap.put("error", 1);
			resultMap.put("message", "文件上传发生异常");
		}
		
		return JsonUtils.objectToJson(resultMap);
	}
	
	// firefox不支持
//	@RequestMapping(value="/pic/upload")
//	@ResponseBody
//	public Map<String, Object> pictureUpload(MultipartFile uploadFile) {
//		Map<String, Object> resultMap = new HashMap<>();
//		
//		try {
//			// 生成一个新文件名
//			String oldName = uploadFile.getOriginalFilename();
//			String newName = IDUtils.genImageName();
//			newName = newName + oldName.substring(oldName.lastIndexOf("."));
//			boolean result = false;
//			
//			// 图片上传
//			String imagePath = new DateTime().toString("/yyyy/MM/dd");
//				result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATH, new DateTime().toString("/yyyy/MM/dd"), newName, uploadFile.getInputStream());
//			
//			if (!result) {
//				resultMap.put("error", 1);
//				resultMap.put("message", "文件上传失败");
//			} else {
//				resultMap.put("error", 0);
//				resultMap.put("url", IMAGE_BASE_URL + imagePath + "/" + newName);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//			resultMap.put("error", 1);
//			resultMap.put("message", "文件上传发生异常");
//		}
//		
//		return resultMap;
//	}
}
