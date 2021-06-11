package synchronazation;

 class SyncMethodThread2 extends Thread{
    syncMethodTable table;
    public SyncMethodThread2(syncMethodTable table){
        this.table=table;
    }
    @Override
    public  void run(){
        try{
            table.displayTable(3);

        }catch(InterruptedException ex){
            System.out.println(ex);
        }
    }
}
