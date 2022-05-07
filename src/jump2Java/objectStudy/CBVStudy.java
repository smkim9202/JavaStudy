package jump2Java.objectStudy;
//Call by value
//메소드의 입력으로 객체를 전달받는 경우 메소드가 입력받은 객체를 그대로 사용함
//=> 메소드가 객체의 속성 값을 변경하면 메소드 수행 후에도 객체의 변경된 속성값이 유지된다.

class Updater{
    //void update(int count){
    void update(Counter counter){
        //count++;
        counter.count++;
    }
}

class Counter{
    int count = 0; //객체변수
}



public class CBVStudy {
    public static void main(String[] args){
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        //myUpdater.update(myCounter.count);
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }

}
