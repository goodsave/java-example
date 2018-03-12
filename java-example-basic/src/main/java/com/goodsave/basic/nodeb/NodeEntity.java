package com.goodsave.basic.nodeb;

/**
 * Created by Joker on 2017/5/31.
 */
public class NodeEntity {

    private int id;
    private Object entity;
    private int parentId;

    public NodeEntity (int id,Object entity,int parentId){
        this.id=id;
        this.entity=entity;
        this.parentId=parentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
