/**
 * 
 */
package sellerTest;

import static org.junit.Assert.*;

import java.util.List;

import model.Ad;
import model.SellerStatusInfo;
import model.Seller_transferInfoBean;
import model.advertisement;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

import service.AppService;
import service.SellerTranserService;
import test.BaseTest;

/**
 * @author KEN
 *
 */
public class TransferTest extends BaseTest {

	

	@Test
	public void testTranser() {
		//配置输入参数
//		Seller_transferInfoBean transferbean=new Seller_transferInfoBean();
//		transferbean.setName("kens");
//		transferbean.setPassword("789");
//		transferbean.setPoints(100);
//		transferbean.setSeller_id(4);
//		transferbean.setTrade_type(2);
		
		int i=3;
		//通过配置文件获取服务的实体类
//		SellerTranserService service=(SellerTranserService)applicationContext.getBean("SellerTranserServiceImp");
		AppService service = (AppService) applicationContext.getBean("AppServiceImp");
		//主要测试point函数并获取返回结果
//		SellerStatusInfo sellerinfo=service.point(transferbean);
		List<Ad> ad=JSON.parseArray(service.getAd(i), Ad.class);
		//在这里验证结果
		 System.out.println(ad.get(0).getTitle());
		 System.out.println(ad.get(1).getTitle());
		 System.out.println(ad.get(2).getTitle());
		 

	}
	

}
