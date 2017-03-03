/**
 * 
 */
package maQiao.test;

import maQiao.maQiaoArrayListMulti3.MQArrayListMulti3;

import org.junit.Test;

/**
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
public class testarrayListMulti3 {

	@Test
	public void test() {	
		MQArrayListMulti3<String,Long,Character> list=new MQArrayListMulti3<String,Long,Character>();
		list.add("first", 100L, 'a');
		list.add("second", 200L, 'b');
		list.add("three", 300L, 'c');
		list.add("free", 500L, 'K');
		System.out.println("size:"+list.size());
	}

}
