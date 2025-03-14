
package javarush17ProposalCounter;
//Не используя synchronized сделайте так, чтобы количество сделанных и принятых предложений было одинаковым.
public class Main {

  public static void main(String[] args) {
    ProposalCounter proposalCounter = new ProposalCounter();

    Thread producerThread = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        proposalCounter.incrementMadeCount();
      }
    });

    Thread consumerThread = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        proposalCounter.incrementAcceptedCount();
      }
    });

    producerThread.start();
    consumerThread.start();

    try {
      producerThread.join();
      consumerThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Made proposals: " + proposalCounter.getMadeCount());
    System.out.println("Accepted proposals: " + proposalCounter.getAcceptedCount());
  }

}


