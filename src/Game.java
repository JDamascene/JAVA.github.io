import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //Monster Atrib
        System.out.println("Enter in Monster-Attack Points");
        int monsterAttack = userInput.nextInt();

        //Monster Defense
        System.out.println("Enter in Monster-Defense Points");
        int monsterDefense = userInput.nextInt();

        //Monster Damge
        System.out.println("Enter in Monster-Damage Points");
        int monsterDamage = userInput.nextInt();

        //Monster Life
        System.out.println("Enter in Monster-Life Points");
        int monsterLife = userInput.nextInt();

        //gozilla attrib
        System.out.println("godZilla attack points");
        int godZillaAttack = userInput.nextInt();

        //gozilla defense
        System.out.println("godZilla defense points");
        int godZillaDefense = userInput.nextInt();

        //gozilla Damge
        System.out.println("godZilla Damage Points");
        int godZillaDamage = userInput.nextInt();

        //gozilla Life
        System.out.println("godZilla Life Points");
        int godZillaLife = userInput.nextInt();


        //Generate a random attacker
        Random generator = new Random();
        boolean attacker = generator.nextBoolean();

        //Choosing the attacker
        if (attacker){
            System.out.println("godzilla Attaker");
            int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1 ;
            int attackValue = godZillaAttack + dice;
            System.out.println("godzilla new points" + attackValue);
            if (attackValue > monsterDefense){
                System.out.println("godiZlla WON!! :-)");
                monsterLife = monsterLife - godZillaDamage;
                System.out.println("Monster's remaining life points" + monsterLife);
            } else {
                System.out.println("godiZlla Lost  :-( ");
            }
        } else {
            System.out.println("Monster Attaker");
            int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1 ;
            int attackValue = monsterAttack + dice;
            System.out.println("Monster new points" + attackValue);
            if (attackValue > godZillaDefense){
                System.out.println("Monster WON!! :-)");
                godZillaLife = godZillaLife - monsterDamage;
                System.out.println("godZilla's remaining life points" + monsterLife);
            } else {
                System.out.println("Monster Lost  :-( ");
            }
        }


        System.out.println("Do you wan't to see the players points?");
        System.out.println("Type 1 to see OR 2 if you dont want to see it");
        int doSee = userInput.nextInt();
        if (doSee == 1) {
            System.out.println(attacker);
            System.out.println("Monster Attacker = " + monsterAttack + ",Deffense = " + monsterDefense + ",Damage = " + monsterDamage + "& Life = "+ monsterLife);
            System.out.println("godzilla Attacker = " + godZillaAttack + ",Deffense = " + godZillaDefense + ",Damage = " + godZillaDamage + "& Life = "+ godZillaDamage);
        } else
            System.out.println(" OK byee...:_-( ||| sobs!");
    }



}
