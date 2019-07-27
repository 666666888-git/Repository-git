package com.chong.myArrayList;
/**
 * 节点
 * @author chong
 *
 */
public class Node<E> {
		Node previous;//前一个结点
		Node next;//后一个节点
		E element;//数据
		public Node(E element) {
			super();
			this.element = element;
		}
}
	
