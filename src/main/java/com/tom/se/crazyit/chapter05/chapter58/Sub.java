package com.tom.se.crazyit.chapter05.chapter58;

/**
 * @descriptions: Sub
 * @author: Tom
 * @date: 2021/1/15 下午 01:28
 * @version: 1.0
 *
 * 繼承帶來高度複用的同時也帶來了嚴重的問題,繼承嚴重破壞了
 * 父類的封裝性.
 * 每個類都應該封裝他的內部信息和實現細節,而只暴露必要的方法給其他類使用
 * 但在繼承關係中,子類可以訪問父類的成員變量和方法,從而導致子類和父類的
 * 嚴重耦合
 * 為保證父類良好的封裝性,不被子類隨意改變,設計父類應遵循如下規則:
 * 盡量隱藏父類的內部數據.盡量把父類的所有成員變量都設置成private
 * 屬性,不要讓子類直接訪問父類的成員變量
 * 不要讓子類可以隨意訪問修改父類的方法.父類僅僅是為輔助其他方法,
 * 如果父類方法需要被外界訪問則使用public ,如果不希望外界修改免責使用final
 * 如果希望父類某個方法可以被複寫,但是不希望被其他類自有訪問,則可以使用protected來修飾
 * 盡量不要調用在子類中被複寫的方法
 *
 *
 */
public class Sub extends Base{
    private String name;
    @Override
    public void test(){
        System.out.println("子類重寫父類的方法, "
        + "其name字符串長度" + name.length());
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
    }
}
class Base{
    public Base(){
        test();
    }
    public void test(){
        System.out.println("將被子類重寫的方法");
    }
}