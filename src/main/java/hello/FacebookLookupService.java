 package hello;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.client.RestTemplate;

public class FacebookLookupService {

    RestTemplate restTemplate = new RestTemplate();

    @Cacheable("hello")
    public Page findPage(String page) {
 //       return restTemplate.getForObject("http://graph.facebook.com/" + page, Page.class);
 try {
			synchronized (page) {
				System.out.println("------------start waiting");
				Thread.sleep(3000);
				System.out.println("------------stop waiting");
			}
			
	}catch (Exception e) {
				e.printStackTrace();
			}
			return null;
    
	}
}