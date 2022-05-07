package jump2Java.JavaPlusStudy;

//프로세스 : 동작하고 있는 프로세스. 한 개의 프로세스는 한 가지의 일을 한다.
//쓰레드 : 프로세스 내에서 두 가지 또는 그 이상의 일을 동시에 할 수 있다.

//Thread 클래스 상속받기 => 클래스를 상속하면 다른 클래스를 상속 할 수 없다.
//Runnable 인터페이스 구현

// run() : 쓰레드를 사용하려면 run메서드를 상속받아 구현해야한다.
// start() : 쓰레드를 실행한다.
// sleep(1000) : 1초 대기한다.
// join() : 쓰레드가 종료할 때까지 기다린다.



import java.util.ArrayList;

public class ThreadStudy{

    public static void main(String[] args) {
        //Thead 클래스로 쓰레드 사용하기
        ArrayList<Thread> threads = new ArrayList<>(); //쓰레드 생성시 생성된 객체를 threads에 저장했다.
        for(int i = 0; i <10; i++){//총 10개의 쓰레드를 생성하여 실행한다.
            Thread t = new ThreadSample(i);
            t.start();
            threads.add(t);
        }
        for(int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); //t 쓰레드가 종료 될 때까지 기다린다.
            } catch (Exception e) {

            }
        }
        System.out.println("main end"); //main 메소드 종료

        //Runnable 인터페이스로 쓰레드 사용하기
        ArrayList<Thread> threads2 = new ArrayList<>(); //쓰레드 생성시 생성된 객체를 threads에 저장했다.
        for(int i = 0; i <10; i++){//총 10개의 쓰레드를 생성하여 실행한다.
            Thread t = new Thread(new RunnableSample(i));
            t.start();
            threads2.add(t);
        }
        for(int i=0; i<threads2.size(); i++) {
            Thread t = threads2.get(i);
            try {
                t.join(); //t 쓰레드가 종료 될 때까지 기다린다.
            } catch (Exception e) {

            }
        }
        System.out.println("main end"); //main 메소드 종료
    }
    
}

//Thead 클래스로 쓰레드 사용하기
class ThreadSample extends Thread{
    int seq;

    public ThreadSample(int seq){
        this.seq = seq;
    }
    public void run(){ //Thread를 상속하면 run 메서드를 구현해야 한다.
        System.out.println(this.seq + "thread start"); //쓰레드 시작
        try{
            Thread.sleep(1000); //1초 대기한다.
        } catch(Exception e){

        }
        System.out.println(this.seq + "thread end."); //쓰레드 종료
    }

}

//Runnable 인터페이스로 쓰레드 사용하기
class RunnableSample implements Runnable{
    int seq;
    public RunnableSample(int seq){
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println(this.seq+" runnable thread start.");
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.println(this.seq+"runnable thread end.");
    }
}


