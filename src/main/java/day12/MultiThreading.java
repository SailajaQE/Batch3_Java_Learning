package day12;

public class MultiThreading extends Thread {
    private int threadNumber;

MultiThreading(int threadNumber)
{
    this.threadNumber = threadNumber;
}
@Override

    public void run()
    {
      //print value from 1 to 5
      for (int i=1;i<=5;i++)
          System.out.println(i+"From thread number"+threadNumber);
      try {
          Thread.sleep(40000);
      }
      catch (InterruptedException e)
      {
          System.out.println(e.fillInStackTrace());
      }
    }

}
