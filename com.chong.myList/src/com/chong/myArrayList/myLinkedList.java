package com.chong.myArrayList;
/**
 * 手动实现Linkedlist（链表）
 * 仅供练习
 * @author chong
 *
 */

public class myLinkedList<E> {
		private Node<E> first;
		private Node<E> last;
		
		private int  size;
		/**
		 * 添加节点
		 * @param e 增加的节点的数据类型
		 */
		public void add(E e) {
			Node node =  new Node(e);
			
			if(first==null) {
				first = node;
				last = node;
			}else {
				node.previous = last;
				node.next = null;
				last.next = node;
				last = node;
			}
			size++;
		}
		/**
		 * 
		 * @param index 索引
		 * @return 定位到的节点
		 */
		public Node getNode(int index) {
			
			Node temp = null;
			if(index<(size>>1)) {
				temp = first;
			    int i = 1;
			   while(i<index) {
				i++;
				temp = temp.next;
			}
			}else {
				temp = last;
			    int i = size;
			   while(i>index) {
				i--;
				temp = temp.previous;
			}
			
			}
			return temp;
}
		/**
		 * 
		 * @return
		 */
		public int getSize() {
			return size;
		}

		/**
		 * 遍历链表
		 */
		public void ergodic() {
			Node temp = first;
			while(temp!=null) {
				System.out.println(temp.element);
				temp = temp.next;
			}
			
		}
		
		/**
		 * toString
		 */
		public String toString() {
			StringBuilder s =new StringBuilder();
			s.append("[");
			
			Node temp = first;
			while(temp!=null) {
				s.append(temp.element+",");
				temp = temp.next;
			}
			s.deleteCharAt(s.length()-1);
			s.append("]");
			System.out.println(s);
			
			return "";
		}
		
		/**
		 * 
		 * @param index 索引
		 * @return 元素
		 */
		public E get(int index) {
			checkRange(index);
			return (E) getNode(index).element;
}
		
		/**
		 * 按索引替换元素
		 * @param index 索引
		 * @param e 替换后的元素
		 * @return  原来的元素
		 */
		public E set(int index,E e) {
			checkRange(index);
			
			Node temp = first;
			int i = 1;
			while(i<index) {
				i++;
				temp = temp.next;
			}
			E oldElement = (E)temp.element;
			temp.element = e;
			return oldElement;
			
		}
		/**
		 * 移除结点
		 * @param index
		 */
	public Node remove(int index) {
		checkRange(index);
		Node temp = getNode(index);
		Node up = temp.previous;
		Node down = temp.next;
		if(up!=null)
			up.next = down;
		if(down!=null)
			down.previous = up;
		
		if(up==null) {
			first = down;
			
		}
		if(down==null) {
			last = up;
			
		}
		size--;
		return temp;
		
	}
	//public void add(int index,E e)
		
		/**
		 * 检查索引是否合法
		 * @param index
		 */
		public void checkRange(int index) {
			if(index<=0)
				throw new RuntimeException("负数或零不合法");
			else if(index>size)
				throw new RuntimeException("越界："+index);
			
		}
		
		
}
