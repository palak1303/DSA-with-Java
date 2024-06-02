import java.util.*;
class task{
    String taskName;
    public task(String tn){
        taskName = tn;
        work();
    }
    public void work(){
        for( int i = 1; i<+10;i++){
            System.out.println(taskName);
        }
    }
}
    public class wevClass4 {
        public static void main(String[] args) {
            task task1 = new task("task-1");
            task task2 = new task("task-2");
            task task3 = new task("task-3");
        }
    }