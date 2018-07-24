package com.behavioral.visitor;

/**
 * 票据单子 数据元素接口
 * @Title: Bill
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public interface Bill {

    void accept(AccountBookVisitor visitor);
}
