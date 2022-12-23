package week_03;

public class variables {
    public static void main(String[] args) {


        int firstInt = 25;
        int secondInt = 5;
        int sum, difference, product, max, min;
        double averange;
        int averageInt;
        sum=firstInt+secondInt;
        System.out.println("sum = " + sum);
        difference=firstInt-secondInt;
        System.out.println("difference = " + difference);
        product=firstInt*secondInt;
        System.out.println("product = " + product);
        averange=(firstInt+secondInt)/2;//implicit castingis done by machine/compler
        /*we are adding two integers and dividing by a number
        assign it to bouble variable:implicit casting*/
        System.out.println("averange = " + averange);//15
        averange = (double)(firstInt+secondInt)/2;
       //(double) (firstInt+secondInt)/2;-->explicit casting is done by coder(person
        System.out.println("averange = " + averange);//15.6 daca firstnum=26


        averageInt=(int)averange;//bigger data type trying tofit smaller
        //mandatory explicit casting
        System.out.println("averageInt = " + averageInt);//15


        boolean isMaxFirstInteger=firstInt>secondInt;
        System.out.println("isMaxFirstInteger = " + isMaxFirstInteger);
        //prima metoda
        if(isMaxFirstInteger){
            max=firstInt;
            min=secondInt;
        }else{
            max=secondInt;
            min=firstInt;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        //---------------------------------------------------------------
          // a doua metoda
     if(firstInt>secondInt){
          max=firstInt;
          min=secondInt;
      }else{
          max=secondInt;
          min=firstInt;
      }
        System.out.println("max = " + max);
        System.out.println("min = " + min);



    }
}
