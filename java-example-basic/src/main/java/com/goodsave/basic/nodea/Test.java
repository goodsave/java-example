package com.goodsave.basic.nodea;

import com.alibaba.fastjson.JSON;

/**
 * Created by Joker on 2017/5/27.
 */

public class Test {

	public static void main(String args[]) {

		Node<String> root = new Node<String>("电影");
		Node<String> A = new Node<String>("科幻电影");
		Node<String> Aa = new Node<String>("太空科幻电影");

		Node<String> Ab = new Node<String>("地球科幻电影");
		Node<String> Ab1 = new Node<String>("《地球的起源》");
		Node<String> Ab2 = new Node<String>(" 地球的终点》");

		Node<String> Ac = new Node<String>("月球科幻电影");
		Node<String> Ad = new Node<String>("宇宙科幻电影");

		Node<String> B = new Node<String>("动作电影");
		Node<String> Ba = new Node<String>("好莱坞电影");
		Node<String> Bb = new Node<String>("大陆电影");
		Node<String> Bc = new Node<String>("香港电影");

		root.addChildNode(A);
		A.addChildNode(Aa);
		A.addChildNode(Ab);
		Ab.addChildNode(Ab1);
		Ab.addChildNode(Ab2);
		A.addChildNode(Ac);
		A.addChildNode(Ad);
		root.addChildNode(B);
		B.addChildNode(Ba);
		B.addChildNode(Bb);
		B.addChildNode(Bc);

		/*
		 * System.out.println(root.getNodeEntity()); printNodeTree(root);
		 */

		System.out.println(JSON.toJSONString(root));

	}

	public static void printNodeTree(Node<String> node) {
		for (Node<String> childNode : node.getChildNodes()) {
			System.out.println(childNode.getNodeEntity().toString());
			if (childNode.getChildNodes() != null) {
				printNodeTree(childNode);
			}
		}
	}

}
