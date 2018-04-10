/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TER;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Ankomah
 */
public class Executor {
    public static void main(String args[]) {
        ExecutorService ExecutorService = Executors.newScheduledThreadPool(1);
        MyStory myStory = new MyStory() {};
        ExecutorService(myStory, 15, TimeUnit.SECONDS);
        ExecutorService.shutdown();
        
    }

    private static void ExecutorService(MyStory myStory, int i, TimeUnit timeUnit) {
        System.out.println("the story runned for a while.");
    }
    
}
