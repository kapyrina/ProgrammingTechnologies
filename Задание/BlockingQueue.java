import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(2);


        Thread producer = new Thread(() ->{
            String[] words = new String[] {"Алексей Н", "Иван Ш", "Ирина Л", "Гость", "Михаил Л", "Дмитрий", "Александр"};

            for (int i = 0; i < words.length && !Thread.interrupted();) {
                try {
                    Thread.sleep(3000);
                    queue.put(words[i]);
                    System.out.println("Иван: записал в очередь " + words[i] + ", число людей в очереди: " + queue.size());
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()) {
                try {
                    sb.setLength(0);
                    Thread.sleep(5000);
                    sb.append(queue.take());
                    System.out.println("Стажёр Роман: обработал из очереди " + ", число людей в очереди: " + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                
                }
            }
        });
        producer.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer.start();
    }
}
