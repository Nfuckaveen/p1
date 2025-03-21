abstract class Bank{
abstract int getRateOfInterest();
}
class SBI extends Bank{
int getRateOfInterest(){return 7;}
}
class PNB extends Bank{
int getRateOfInterest(){return 8;}
}
public class Mushuuu12{
public static void main(String[] args){
Bank B;
B = new SBI();
System.out.println("SBI interest:" +B.getRateOfInterest()+"%");
B = new PNB();
System.out.println("PNB Interest:" +B.getRateOfInterest()+"%");
}
}