package com.customcollection;
import static org.junit.Assert.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
public class TestLists {
	private static final Logger logger=LogManager.getLogger(TestLists.class);
		@Test
		public void test() {
			DifferentLists games=new DifferentLists();
			games.add("running");
			games.add("relay");
			games.add("long jump");
			games.add("cycling");
			games.add("throw ball");
			games.add("cricket");
			games.add("hockey");
			games.add("baseball");
			games.add("tennis");
			//games.remove(9);
			assertEquals("[running,relay,long jump,cycling,throw ball,cricket,hockey,baseball,tennis]",games.print() );
			assertEquals(9,games.length());
			assertEquals("throw ball",games.get(4));
			logger.info("Items added and removed successfully");
			logger.debug(games.print());
			logger.warn("No warnings in using the custom list");
			logger.error("No errors in using the custom list");
			}
		@Test
		public void test2() {
			DifferentLists festivals=new DifferentLists();
			festivals.add("Diwali");
			festivals.add("Dusshera");
			festivals.add("Sankranthi");
			festivals.add("Moharam");
			festivals.add("Ramzan");
			festivals.add("Christmas");
			festivals.add("Ugadhi");
			festivals.remove(6);
			assertEquals("[Diwali,Dusshera,Sankranthi,Moharam,Ramzan,Christmas]",festivals.print() );
			assertEquals(6,festivals.length());
			assertEquals("Ramzan",festivals.get(4));
			logger.info("Items added and removed successfully");
			logger.debug(festivals.print());
			logger.warn("No warnings in using the custom list");
			logger.error("No errors in using the custom list");
			}
	}