package com.behavioral.visitor;

/**
 * 收入单子 数据元素之一
 * @Title: IncomeBill
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public class IncomeBill implements Bill {

    private double amount;

    private String item;

    public IncomeBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accept(AccountBookVisitor visitor) {
        visitor.visit(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
