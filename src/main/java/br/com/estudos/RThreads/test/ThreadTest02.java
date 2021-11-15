package br.com.estudos.RThreads.test;

class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();
    }
}


//Yield - Este m�todo � s� uma indica��o para que a thread corrente pare de executar e d� uma oportunidade pra outras executarem. N�o vai dar pra saber qual vai ser a decis�o do scheduler de threads. Havendo uma thread de maior prioridade, � poss�vel que esta seja executado; mas se bobear, pode a pr�pria thread que deu yield() ser a escolhida.


