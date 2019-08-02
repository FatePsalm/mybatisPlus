package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ShoppingChart extends Model<ShoppingChart> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String goodsinfo;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsinfo() {
        return goodsinfo;
    }

    public void setGoodsinfo(String goodsinfo) {
        this.goodsinfo = goodsinfo;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ShoppingChart{" +
        "id=" + id +
        ", goodsinfo=" + goodsinfo +
        "}";
    }
}
