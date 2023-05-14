import java.util.Scanner;
public class App {
     public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        DbQuerier querier = new DbQuerier();
        
       
        System.out.println("Wellcome to my homework java app 2!");
        System.out.println("There were 10 tasks in this homework");
        System.out.println("To get the answers please press the number of the task You are interested in");
        System.out.println("To quit please press q");
        String input = scanner.nextLine();
       
        int index = 0;
        while(index ==0){



            try{
                int number = Integer.parseInt(input);
                if( number <=10 && number >= 1 ){
                        switch(number){
                            case 1: querier.task1();
                            break;
                            case 2: querier.task2();
                            break;
                            case 3: querier.task3();
                            break;
                            case 4: querier.task4();
                            break;
                            case 5: querier.task5();
                            break;
                            case 6: querier.task6();
                            break;
                            case 7: querier.task7();
                            break;
                            case 8: querier.task8();
                            break;
                            case 9: querier.task9();
                            break;
                            case 10: querier.task10();
                            break;
                        }
                        input = scanner.nextLine();
                }else{
                    System.out.println("enter a number between 1 and 10");
                    input = scanner.nextLine();
                }
            }catch(Exception e){
               
               if(input.equals("q")){
                System.out.println("Exiting, Good bye");
                index++;
               }else{
                System.out.println("Please enter a number from 1 to 10 or enter q to quit ");
                input = scanner.nextLine();
               }
               
            }

           

        }

        scanner.close();

    }
}
