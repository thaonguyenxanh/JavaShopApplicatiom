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
public class TestJava extends Thread{

    /**
     * @param args the command line arguments
     */
    public void run(){
        for(;;){
            System.out.println("hello duy!");
        }
    }
    public  void run2(){
        for(;;){
            System.out.println("hello duy2!");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread t= new MyThread();
        MyThread t2= new MyThread();
        t.start();
        t2.start();
        
    }
    
}
