
/**
 * Write a description of class ProbabilityDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProbabilityDriver
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        Probability p1 = new Probability(6, 10);
        Probability p2 = new Probability (4, 10);
        System.out.println(p1.probabilityAND(p2));
    }
        
}
