import java.util.function.Consumer;
import java.util.function.Supplier;
// p,c, function package
// producer-->produce data
//consumer -->consumes data.
//how to get producer object ?
//A) using lambda expression return as string ... ()->"message";
//so producer returntype is Supplier<T> so Supplier<T> producer =()->"message";
//producer.get();


//how to get consumer object?
//  Consumer<String> consumer =  ()->Syso(message);
//consumer.accept();
class ProducerAndConsumer{
    public static void main(String[] args) {

       Supplier<String>data= ()->"massage sent";
       String s =data.get();
       Consumer<String> consumer= (massage)-> System.out.println(massage);
       consumer.accept(s);
    }

}