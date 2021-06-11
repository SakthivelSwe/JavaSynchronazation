package synchronazation;

public class syncMethodTable {
    public synchronized void displayTable(int tableNo) throws InterruptedException{
        System.out.println("I print the table");
        for(int i=1;i<5;i++){
            System.out.println(tableNo+"*"+i+"="+tableNo*i);
            Thread.sleep(500);
        }
        System.out.println("I finished in printing table");
    }
}
