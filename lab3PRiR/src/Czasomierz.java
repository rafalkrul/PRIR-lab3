public class Czasomierz extends Thread{

    int start=0;
    boolean petla = true;

    public void mierz(){
        System.out.println("zaczynamy liczyć czas");
        while (petla) {
            try {
                sleep(1000);
            } catch (Exception e) {

            }
            start++;
            System.out.println(start);
            if (start == 60){
                System.out.println("dobilismy do minuty");
                petla = false;
            }
        }
    }

}
