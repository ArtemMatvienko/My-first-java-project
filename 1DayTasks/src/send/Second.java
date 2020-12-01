package send;

import java.util.ArrayList;

public class Second {
        public static ArrayList<Integer> second() {
            ArrayList<Integer> numb = new ArrayList<>();
            for(int i=0; i<=29; i ++){
                numb.add(i, 1 + (int) (Math.random() * 30));
                //System.out.println(numb.get(i));
            }
            return numb ;
        }

        public static void number(int number) {
            System.out.println(String.format("This is number %d", number));
        }

        public static void print (ArrayList<Integer> numb) {
            numb.forEach(Second::number);
        }

        public static void main(String[] args) {
            int age = 19;
            float money = 100;
            System.out.println("Start");
            //System.out.println(String.format("My age is %d and I have %f $", age, money ));
            print(second());
            //number(4);
            System.out.println("Finish");
        }

    }
