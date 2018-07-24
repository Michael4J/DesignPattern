package com.behavioral.visitor;

/**
 * 访问者模式
 * @Title: VisitorPatternDemo
 * @Auther: MichaelJ
 * @Date: 2018-7-24
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        AccountBook accountBook = new AccountBook();
        // 添加两条支出
        accountBook.addBill(new ConsumeBill(6000, "工资"));
        accountBook.addBill(new ConsumeBill(8000, "材料费"));
        // 添加两条收入
        accountBook.addBill(new IncomeBill(10000, "卖商品"));
        accountBook.addBill(new IncomeBill(12000, "卖广告位"));

        // 创建两个访问者
        AccountBookVisitor boss = new Boss();
        AccountBookVisitor accountant = new Accountant();

        // 访问者访问账本
        accountBook.show(accountant);
        accountBook.show(boss);
        System.out.println("老板查看总支出:" + ((Boss)boss).getTotalConsume());
        System.out.println("老板查看总收入:" + ((Boss)boss).getTotalIncome());
    }
}
