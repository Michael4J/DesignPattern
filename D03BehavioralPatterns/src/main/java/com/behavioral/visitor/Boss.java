package com.behavioral.visitor;

/**
 * 老板，账本访问者之一
 * @Title: Boss
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public class Boss implements AccountBookVisitor {

    private double totalConsume;
    private double totalIncome;

    // 老板只关心总消费和总收入
    @Override
    public void visit(ConsumeBill bill) {
        totalConsume += bill.getAmount();
    }

    @Override
    public void visit(IncomeBill bill) {
        totalIncome += bill.getAmount();
    }

    public double getTotalConsume() {
        return totalConsume;
    }

    public double getTotalIncome() {
        return totalIncome;
    }
}
