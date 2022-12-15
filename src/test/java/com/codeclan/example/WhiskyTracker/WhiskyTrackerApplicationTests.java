package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.ClientInfoStatus;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {
	@Autowired
	WhiskyRepository whiskyRepository.;
	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}
	@Test
	public void canFindWhiskeyPerYear(){
		List<Whisky> foundListOfWhiskey = whiskyRepository.findByYear(1991);
		assertEquals(1, foundListOfWhiskey.size());
	}
	@Test
	public void canFindDistilleriesByregion(){
		whiskyRepository.
		List<Distillery> distilleryList = distilleryRepository.findByRegion("Lowland");
		assertEquals(2, distilleryList.size());
	}
	@Test
	public void canFindByDistilleryAndAge(){
		List<Whisky> whiskeyList = whiskyRepository.findByDistilleryNameAndAge("Isle of Arran",30);
		assertEquals(0, whiskeyList.size());
	}
//	@Test
//	public void canFindByDistilleryNameAndRegion(){
//		List<Whisky> whiskyList = whiskyRepository.findByDistilleryRegion("Island");
//		assertEquals(1, whiskyList.size());
//	}



}
