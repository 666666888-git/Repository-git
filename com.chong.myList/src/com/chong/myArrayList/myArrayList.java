package com.chong.myArrayList;
/**
 * 模仿StringBuilder实现对象的存储
 * @author chong
 * 2019年4月19日
 */
public class myArrayList {
	private Object[] value;//
	private int size;//
	
	public int getSize() {
		return value.length;
	}
	
	public myArrayList() {
		value = new Object[16];
	}
	
	public myArrayList(int size) {
		value = new Object[size];
	}
	
	public void add(Object obj) {
		
		if(size>=value.length) {
			int newCapacity = value.length*2;
        
			Object[] newlist = new Object[newCapacity];
			for(int i = 0;i<value.length;i++)
			{
				newlist[i] = value[i];
			}
			value = newlist;
		}
		value[size++] = obj;
	}
	
	public Object get(int index) {
		if(index<0||index>=value.length)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		return value[index];
	}
	
	public Object Set(int index,Object obj){
		if(index<0||index>value.length-1)
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Object oldObj = value[index];
		value[index] = obj;
		return oldObj;
	}
	
	
	public int IndexOf(Object obj) {
		if(value == null)
			try {
				throw new Exception();
				} catch (Exception e) {
				// TODO: handle exception
					e.printStackTrace();
			}
		int i = 0;
		while(!value[i].equals(obj)&&value[i+1]!=null) {
			if(value[i+1].equals(obj))
				return i+1;
			i++;
		}
			return -1;
	
	}
	
	public static void main(String[] args) {
		myArrayList list = new myArrayList(2);
		Human h = new Human(20,180,70,411424,"小明");
		System.out.println(h.name);
		list.add("i love you");
		list.add(h);
		list.add(1234);
		System.out.println(list.get(2));
		System.out.println(((Human)list.get(1)).name);//强制类型转换
		System.out.println(list.getSize());
		System.out.println(list.IndexOf("i love"));
		System.out.println(list.Set(3, "I love you"));
		System.out.println(list.get(3));

}
}
class Human{
	int age,height,weight,id;
	String name;
	public Human(int age, int height, int weight, int id, String name) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.id = id;
		this.name = name;
	}
}	

