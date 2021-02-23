package com.tom.se.crazyit.review01.exception;

/**
 * AuctionException
 *
 * @author Tom on 2021/2/23
 */
 class AuctionException extends Exception{
    public AuctionException(){}
    public AuctionException(String msg){
        super(msg);
    }
}
public class AuctionTest{
     private double initPrice = 30.0;

     public void bid(String bidPrice) throws AuctionException {
         double d = 0.0;
         try{
             d = Double.parseDouble(bidPrice);
         }catch(Exception e){
             e.printStackTrace();
             throw new AuctionException("竞拍价必须是数字，" +
                     "不能包含其他字符!");
         }
         if(initPrice > d){
             throw new AuctionException("竞拍价比起拍价低,不允许竞拍!");
         }
         initPrice = d;
     }

    public static void main(String[] args) {
        AuctionTest at = new AuctionTest();
        try{
            at.bid("df");
        }catch(AuctionException ae){
            System.err.println(ae.getMessage());
        }
    }

}
