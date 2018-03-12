package com.goodsave.basic.nodeb;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joker on 2017/5/31.
 */
public class Test {

    public  static  void main(String args[]){
        NodeEntity A = new NodeEntity(1,"A",0);
        NodeEntity B = new NodeEntity(2,"B",0);
        NodeEntity B1 = new NodeEntity(3,"B1",2);
        NodeEntity B2 = new NodeEntity(4,"B2",2);
        NodeEntity C = new NodeEntity(5,"C",0);

        List<NodeEntity> nodeEntities = new ArrayList<>();
        nodeEntities.add(A);
        nodeEntities.add(B);
        nodeEntities.add(B1);
        nodeEntities.add(B2);
        nodeEntities.add(C);


        for (NodeEntity parentNode:nodeEntities) {
            for (NodeEntity childNode:nodeEntities) {
                if (childNode.getParentId()==parentNode.getId()){

                }
            }
        }

    }




}
