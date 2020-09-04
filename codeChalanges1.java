//Maya Henkel
//9/2/20
//

public class codeChalanges1{
  public static void main(String args[]){
    //chalange 1, word reverser
    String word = "Popcorn";
    int count = word.length();
    int midpoint = count / 2;
    String firstHalf = word.substring(0,midpoint);
    String secondHalf = word.substring(midpoint);
    String reverse = secondHalf + firstHalf;
    reverse = reverse.toLowerCase();
    System.out.println(reverse);

    //chalange 2, ascii art, prints a pink butterfly
    makeColorStr(" __ \\/ __ ");
    makeColorStr("/o \\{}/ o\\");
    makeColorStr("\\   ()   /");
    makeColorStr(" '> /\\ <' ");
    makeColorStr(" (o/\\/\\o)  ");
    makeColorStr("  )    (  ");
  }
  public static void makeColorStr(String startString) {
    System.out.print("\033[31m" + startString + "\n");
  }
}
