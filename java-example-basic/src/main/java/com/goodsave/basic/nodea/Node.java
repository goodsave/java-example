package com.goodsave.basic.nodea;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joker on 2017/5/27.
 */
public class Node<T> implements Serializable {

	private static final long serialVersionUID = 2960635941348388442L;
	
	private T nodeEntity;
    private List<Node<T>> childNodes;

    public Node (T nodeEntity){
        this.nodeEntity=nodeEntity;
    }

    public Node (){}

    public void addChildNode(Node<T> childNode){
        if ( this.childNodes==null){
            this.childNodes = new ArrayList<Node<T>>();
        }
        this.childNodes.add(childNode);
    }

    public void removeChildNode(Node<T> childNode){
        if (this.childNodes!=null){
            this.childNodes.remove(childNode);
        }
    }

    public T getNodeEntity() {
        return nodeEntity;
    }

    public void setNodeEntity(T nodeEntity) {
        this.nodeEntity = nodeEntity;
    }

    public List<Node<T>> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<Node<T>> childNodes) {
        this.childNodes = childNodes;
    }
}
