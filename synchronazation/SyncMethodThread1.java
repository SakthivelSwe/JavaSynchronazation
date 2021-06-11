package synchronazation;

   class SyncMethodThread1 extends Thread{
     syncMethodTable table;
     public SyncMethodThread1(syncMethodTable table){
         this.table=table;
     }
     @Override
    public void run(){
         try{
             table.displayTable(2);
         }catch(InterruptedException ex){
             System.out.println(ex);
         }
     }
}
