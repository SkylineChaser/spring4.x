package com.smart.anno;


import com.smart.interfaces.StrongProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/com/smart/anno/producerbean.xml")
//@ContextConfiguration(locations = {"classpath:/com/smart/anno/producerbean.xml"})
public class MyComponentTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private StrongProducer strongProducer;


	@Test
	public void load() {
//		Producer producer = applicationContext.getBean(Producer.class);
		strongProducer.strongProducer();
		Map<String,String> testMap=new HashMap(750);
		for(Map.Entry<String,String> entry : testMap.entrySet()){
			String key=entry.getKey();
		}
	}
}
