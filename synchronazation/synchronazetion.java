package synchronazation;

public class synchronazetion {
    public static void main(String[] args){
        syncMethodTable table=new syncMethodTable();
        SyncMethodThread1 thread1= new SyncMethodThread1(table);
        SyncMethodThread2 thread2= new SyncMethodThread2(table);
        thread1.start();
        thread2.start();
    }
}
