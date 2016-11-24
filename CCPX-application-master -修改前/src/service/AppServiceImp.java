package service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import model.Ad;
import model.advertisement;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;

import dao.AppDao;
import dao.AppDaoImp;
@Repository("AppServiceImp")
public class AppServiceImp implements AppService{
	@Resource(name = "AppDaoImp")
	private  AppDao appdao = new AppDaoImp();
	public   String getAd(int i)
	{
        
		List<advertisement> a = appdao.checkAdbynum(i);
		List<Ad> list = new ArrayList<Ad>();//

		
		
		for(advertisement adv:a)
		{
			Ad ad = new Ad();
			ad.setImage(adv.getAdvertisement_Image());
			ad.setTitle(adv.getAdvertisement_Title());
			list.add(ad);
			
			
		}
		String appjson = JSON.toJSONString(list);
		System.out.print(appjson);
//		 List<Ad> list2 =JSON.parseArray(appjson, Ad.class);
		return appjson;
		
		
		
	}

}
