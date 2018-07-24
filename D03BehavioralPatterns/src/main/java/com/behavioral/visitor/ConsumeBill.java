package com.behavioral.visitor;

/**
 * 消费单子 数据元素之一
 * @Title: ConsumeBill
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public class ConsumeBill implements Bill {

    private double amount;

    private String item;

    public ConsumeBill(double amount, String item) {
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
