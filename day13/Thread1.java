
class GoodMorningThread extends Thread {

    public void run() {
        while (true) {
            System.out.println("Good Morning");
            System.out.println("Priority: " + this.getPriority());
        }
    }
}

class WelcomeThread extends Thread {

    public void run() {
        while (true) {
            System.out.println("Welcome");
            System.out.println("Priority: " + this.getPriority());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class GoThread extends Thread {
    public void run() {
        // Get a reference to the current thread
        Thread currentThread = Thread.currentThread();

        while (true) {
            System.out.println("Good Morning");
            System.out.println("Thread Name: " + currentThread.getName());
            System.out.println("Thread ID: " + currentThread.getId());
            System.out.println("Thread Priority: " + currentThread.getPriority());
        }
    }
}


public class Thread1 {
    public static void main(String[] args) {
        //task1

        GoodMorningThread good=new GoodMorningThread();
        WelcomeThread wel=new WelcomeThread();
        good.start();
        wel.start();


        //task2
        WelcomeThread welcome=new WelcomeThread();
        welcome.start();

        //task3

        GoodMorningThread go=new GoodMorningThread();
        WelcomeThread we=new WelcomeThread();
        go.setPriority(Thread.MAX_PRIORITY);
        we.setPriority(Thread.MIN_PRIORITY);
        go.start();
        we.start();

        //task4

        //we can get the  given state of thread in java by using getstate method
        System.out.println(good.getState());
        System.out.println(wel.getState());


        //task5

        GoThread the=new GoThread();
        the.start();


    }
}
