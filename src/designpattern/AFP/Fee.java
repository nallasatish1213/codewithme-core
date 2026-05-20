package designpattern.AFP;

public interface Fee {
   default double fee(){
       return 0.0;
   }
}
