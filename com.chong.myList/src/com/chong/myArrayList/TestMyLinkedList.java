package com.chong.myArrayList;
/**
 * 测试我的自定义链表
 * @author chong
 *
 */
public class TestMyLinkedList {
	public static void main(String[] args) {
		
		myLinkedList<String>list = new myLinkedList<>();
		System.out.println(list.getSize());
		list.add("aa");
		list.add("bb");
		list.add("cc");
		System.out.println(list.getSize());
		list.toString();
//		list.ergodic();
//		list.toString();
//		System.out.println(list.get(1));
//		System.out.println("**************************");
//		System.out.println(list.set(1, "I love you!!!!!!"));
//		list.toString();
//		System.out.println(list.get(1));
//		System.out.println("**************************");
		System.out.println(list.remove(-1).element);
		list.ergodic();
		list.toString();
		
	
}

}
