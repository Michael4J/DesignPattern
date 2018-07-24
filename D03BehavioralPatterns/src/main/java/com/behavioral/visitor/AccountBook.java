package com.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 账本  对象结构
 * @Title: AccountBook
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public class AccountBook {
    // 账单列表
    private List<Bill> billList = new ArrayList<Bill>();

    /**
     * 添加账单
     * @param bill
     */
    public void addBill(Bill bill) {
        billList.add(bill);
    }

    /**
     * 提供账本的查看
     * @param visitor
     */
    public void show(AccountBookVisitor visitor) {
        for (Bill bill : billList) {
            bill.accept(visitor);
        }
    }
}
