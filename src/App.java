import br.com.queue.Queue;

public class App {

    public static void main(String[] args) throws Exception {
        
        Queue<String> queue = new Queue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");

        System.out.println("First: " + queue.get());

    }

}
