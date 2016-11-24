package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import model.Ad;
import model.advertisement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.AppService;
import service.AppServiceImp;

import dao.AppDao;
import dao.AppDaoImp;

@Controller
@RequestMapping("App")
public class AppController {
	@Resource(name = "AppServiceImp")
	private  AppService appservice = new AppServiceImp();
	
	
	@RequestMapping("getad")
	public  String getAd(int i)
	{
		return appservice.getAd(i);
		
		
		
	}
	
	
	
	
	

}
