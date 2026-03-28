class Cricketer {
    String name;
    String country;
    int totMatches;

    Cricketer(){

    }

    void printCricketerDetails(){
        System.out.printf("Cricketer Name: %s Cricketer Country: %s Total Matches Played: %d", name, country, totMatches);
    }

}

class Batsman extends Cricketer {
    int totRuns;

    Batsman(){

    }

    Batsman(String name, String country, int totMatches, int totRuns) {
        this.name = name;
        this.country = country;
        this.totMatches = totMatches;
        this.totRuns = totRuns;
    }

    void printBatsmanDetails(){
        printCricketerDetails();
        System.out.print(" Total Runs: " + totRuns + "\n");
    }

}

class Bowler extends Cricketer {

    int totWickets;

    Bowler(){

    }

    Bowler(String name, String country, int totMatches, int totWickets) {
        this.name = name;
        this.country = country;
        this.totMatches = totMatches;
        this.totWickets = totWickets;
    }

    void printBowlerDetails(){
        printCricketerDetails();
        System.out.print(" Total Wickets: " + totWickets + "\n");
    }

}

class AllRounder extends Cricketer {
    int totRuns;
    int totWickets;

    AllRounder(){

    }

    AllRounder(String name, String country, int totMatches, int totRuns, int totWickets) {
        this.name = name;
        this.country = country;
        this.totMatches = totMatches;
        this.totRuns = totRuns;
        this.totWickets = totWickets;
    }

    void printAllRounderDetails(){
        printCricketerDetails();
        System.out.print(" Total Runs: " + totRuns + " Total Wickets: " + totWickets + "\n");
    }

}

public class Hierarchial_Inheritance {
    public static void main(String [] args) {
        Batsman bat1 = new Batsman("Rohit Sharma", "India", 250, 20000);
        Bowler bol1 = new Bowler("lasith Malinga", "Srilanka", 250, 500);
        AllRounder allRou = new AllRounder("Ravichandran Ashwin", "India", 150, 12000, 312);

        bat1.printBatsmanDetails();
        bol1.printBowlerDetails();
        allRou.printAllRounderDetails();

    }
}