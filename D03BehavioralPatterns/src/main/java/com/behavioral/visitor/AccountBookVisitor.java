package com.behavioral.visitor;

/**
 * 账单访问者
 * @Title: AccountBookVisitor
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public interface AccountBookVisitor {

    void visit(ConsumeBill bill);
    void visit(IncomeBill bill);
}
