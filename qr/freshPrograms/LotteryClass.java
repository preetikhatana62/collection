package freshPrograms;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class LotteryClass{
	

    public static final int NUM = 6;
    public static final int MAX_NUM = 40;
    public static final int gift= 100;
    public static void main(String[] args)
    {

        Set<Integer> winning = createWinningNumber();
        Set<Integer> ticket = getTicket();

        Set<Integer> matches = new TreeSet<>(ticket);
        matches.retainAll(winning);

        System.out.println("Your Ticket Was:"+ ticket);
        System.out.println("Winning Numbers:"+ matches);

        if(matches.size() > 0){
            double prize = gift * matches.size();
            System.out.println("Matched Number"+matches);
            System.out.println("Your Prize is:" + prize);
        }
    }



    public static Set<Integer> createWinningNumber(){
        Set<Integer> winning = new TreeSet<>();
        Random random = new Random();
        while (winning.size() < NUM){
            int number = random.nextInt(MAX_NUM) + 1;
            winning.add(number);

        }
        return winning;

    }



    public static Set<Integer> getTicket(){
        Set<Integer> ticket = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter"+ NUM + " Lottery Number");

        while (ticket.size() < NUM){
            int number = scanner.nextInt();
            if(number <= MAX_NUM)
            ticket.add(number);
        }
        return ticket;
    }



}


