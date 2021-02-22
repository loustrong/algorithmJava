package com.tom.se.crazyit.review01.innerClass;

/**
 * @descriptions: Out
 * @author: Tom
 * @date: 2021/2/22 上午 10:27
 * @version: 1.0
 */
class Out {
    class In{
        public In(String msg){
            System.out.println(msg);
        }

    }
}
public class CreateInnerInstance{
    public static void main(String[] args) {
        Out.In in = new Out().new In("測試信息");
        /**
         * 上面的代碼可以改為如下三行代碼
         * 使用OutClass.InnerClass的形式定義內部類變量
         * Out.In in;
         * 創建外部類實例,非靜態內部類實例將寄生在該實例中
         * Out out = new Out();
         * 通過外部類實例和new來調用內部類構造器創建非靜態內部類實例
         * in = out.new In("測試信息");
         */
    }
}
