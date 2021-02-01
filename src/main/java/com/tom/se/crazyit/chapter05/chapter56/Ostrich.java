package com.tom.se.crazyit.chapter05.chapter56;

/**
 * @descriptions: Ostrich
 * @author: Tom
 * @date: 2021/1/14 下午 03:39
 * @version: 1.0
 */
public class Ostrich extends Bird{
    /***
     * 方法的重寫要遵循'兩同兩小一大'規則
     * '兩同'即方法名相同,形參列表相同;
     * '兩小'即子類方法返回值類型應該比父類方法返回值類型更小或者相等
     *  子類方法聲明拋出的異常類應當比父類方法聲明拋出的異常更小或者相等
     *  '一大' 子類方法的訪問權限應當比父類方法的訪問權限更大或者相等
     *  覆蓋方法和被覆蓋方法要麼是類方法,要麼都是實例方法,不能是一個是類方法
     *  一個是實例方法
     * 當子類方法覆蓋父類方法,子類的對象不能訪問被覆蓋的父類的方法,
     * 但可以在子類中調用父類中被覆蓋的方法.
     * 如果需要在子類方法調用父類被覆蓋的方法,則可以使用super(被覆蓋的是實例方法)
     * 或者父類類名(被覆蓋的是類方法)作為調用父類中被覆蓋的方法
     * 如果父類方法由private修飾,則這個方法是不能被繼承覆蓋的.可以在子類中繼承
     */
    /**
     * super和this不能出現在static修飾的方法中
     */

    /**
     * 當程序創建一個子類對象時,系統不僅會為該類中定義實例變量分配內存,也會為它從父類繼承
     * 得到的所有實例變量分配內存,即使子類定義了與父類中同名的實例變量.
     * 也就是說,當系統創建建一個java對象時,如果該Java對象類中有兩個父類(一個直接父類A,
     * 一個間接父類B),假設A類中定義了2個實例變量,B類中定義了3個實例變量,當前類中定義了
     * 2個實例變量,那麼這個Java對象將會保存2+3+2個實例變量
     * 如果子類中定義的變量名稱相同,則父類中定義的變量會被隱藏,空間會被保留
     */
    @Override
    public void fly(){
        System.out.println("我只能在地上奔跑...");
    }
    public void callOverridedMethod(){
        super.fly();
    }
    public void fly(String site){
        System.out.println("I am running in" + site + "!");
    }

    public static void main(String[] args) {
        Ostrich os = new Ostrich();
        os.fly();
    }
}
