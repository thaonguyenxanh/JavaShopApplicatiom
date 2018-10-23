/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

/**
 *
 * @author Duy.hv150601
 */
public class MyThread extends Thread{
    public int count;
    public VisitCount c;
    public MyThread(){
        count = 0;
    }
    public synchronized void run(){
        while(true){
        try {
            System.out.println("count= "+ c.count++);
            Thread.sleep(100);
        } catch (Exception e) {
        }
        }
    }
}
