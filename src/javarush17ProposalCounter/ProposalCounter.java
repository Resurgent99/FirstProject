
package javarush17ProposalCounter;

import java.util.concurrent.atomic.AtomicInteger;

public class ProposalCounter {

  private AtomicInteger madeCount = new AtomicInteger(0);
  private AtomicInteger acceptedCount = new AtomicInteger(0);

  public void incrementMadeCount() {
    madeCount.incrementAndGet();
  }

  public void incrementAcceptedCount() {
    acceptedCount.incrementAndGet();
  }

  public int getMadeCount() {
    return madeCount.get();
  }

  public int getAcceptedCount() {
    return acceptedCount.get();
  }
}


