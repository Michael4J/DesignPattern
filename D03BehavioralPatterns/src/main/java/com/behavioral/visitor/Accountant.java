package com.behavioral.visitor;

/**
 * 会计师，账本访问者之一
 * @Title: Accountant
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public class Accountant implements AccountBookVisitor {

    /**
     * 支出是工资时，查看是否交税
     * @param bill
     */
    @Override
    public void visit(ConsumeBill bill) {
        if ("工资".equals(bill.getItem())) {
            System.out.println("会计查看工资" + bill.getAmount() + "是否交税");
        }
    }

    /**
     * 收入都要查看是否交税
     * @param bill
     */
    @Override
    public void visit(IncomeBill bill) {
        System.out.println("会计查看收入" + bill.getAmount() + "是否交税");
    }
}
