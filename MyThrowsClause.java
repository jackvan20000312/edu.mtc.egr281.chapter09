package edu.mtc.egr281.chapter09;

public class MyThrowsClause {
    public static void main(String a[]){
        MyThrowsClause mytc = new MyThrowsClause();
        try{
            for(int i=0; i<5; i++){
                mytc.getJunk();
                System.out.println(i);
            }
        } catch (InterruptedException iex){
            iex.printStackTrace();
        }
    }
     
    public void getJunk() throws InterruptedException {
        Thread.sleep(1000);
    }
}
