import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Zmienne

        Scanner asystent = new Scanner(System.in);
        String wybor;
        String haslo;
        int szansa;
        int min;
        int max;
        boolean special = false;
        boolean onetime = false;
        boolean conveyorKey = false;
        boolean snowfiend = false;
        boolean entranceKey = false;
        boolean exitKey = false;
        boolean computerPower = false;
        boolean oneTimeSnow = false;
        boolean freezerExitKey = false;
        boolean oneTimeSecond = false;
        boolean labirynthExit = false;
        boolean forkliftPower = false;
        boolean clawPower = false;
        boolean clawKey = false;
        boolean gatePower = false;
        boolean flyingAway = false;
        // Mecha-Sleigh
        boolean engine = false;
        boolean engineAdded = false;
        boolean fuel = false;
        boolean fuelAdded = false;
        boolean jets = false;
        boolean jetsAdded = false;
        boolean controlSystem = false;
        boolean controlSystemAdded = false;
        boolean accessKey = false;
        boolean accessKeyAdded = false;

        int entrance;
        int finalpath;
        int finalWayOut;

        // STATS:
        int power;
        int speed;
        int health;
        int maxHealth;
        int luck;
        int enemyPower;
        int enemySpeed;
        int enemyHealth;
        int round;
        int lastRoundSpecial;
        int lastRoundHeal;
        int lastRoundAttack;
        int lastRoundSpecialEnemy;
        int lastRoundHealEnemy;
        int lastRoundAttackEnemy;
        boolean death = false;


        // SECRETY:
        boolean thermoslash = false;
        boolean ladder = false;
        boolean mysteriousKey = false;
        boolean azarthosSword = false;
        boolean jollyblaster = false;
        boolean shovel = false;
        boolean grinchKey = false;

        // KLASY :

        // Elf
        // Strength: 30
        // Agility: 120
        // Luck: 1
        // Special Ability: Gift Grab (You grab your opponent, deal heavy damage, and then box him up into a gift, granting him gift effect.)

        // Santas Soldier
        // Strength: 230
        // Agility: 10
        // Luck: 1
        // Special Ability: CandyCane Cannon (Your old trusty cannon, every 5 enemies you defeat grants you additional ammo. Each blow deals 675 demage.)

        // Jolly Bombier
        // Strength: 165
        // Agility: 50
        // Luck: 1
        // Special Ability: Nice Nuclear Christmas (You have a huge nuke wrapped in gift paper, you can throw it on your enemies to instantly obliterate them. One-shots everything but bosses, they get only 2500 damage. Takes a looooong time to load up)

        // Holiday Paladin
        // Strength: 110
        // Agility: 70
        // Luck: 2
        // Special Ability: Santas Support (A bright light fills the sky as Santas signature ho ho hos are heard throughout the halls. After activation, you get "Santa's Support" status effect.)

        // Magic Mechanic
        // Strength: -Base 100; -Ability 250;
        // Agility: 75
        // Luck: 0.5
        // Special Ability: Cheerful Turret (Place the turret down, it will deal 250 damage every turn. It can last for 10 turns total if you protect it.)

        while(true){
            System.out.println("Press anything to start the game.");

            wybor = asystent.nextLine();
            break;

        }



        System.out.println("???: Welcome. Before we begin the story. You must choose your character.");
        while(true){
            System.out.println("Select your character type:");

            System.out.println("[1] >> Elf");
            System.out.println("[2] >> Santas Soldier");
            System.out.println("[3] >> Jolly Bombier");
            System.out.println("[4] >> Holiday Paladin");
            System.out.println("[5] >> Magic Mechanic");

            wybor = asystent.nextLine();
            if(Objects.equals(wybor, "1")){
                health = 175;
                power = 30;
                speed = 1;
                luck = 2;
                break;
            }else if(Objects.equals(wybor, "2")){
                health = 100;
                power = 230;
                speed = 3;
                luck = 2;
                break;
            }else if(Objects.equals(wybor, "3")){
                health = 250;
                power = 325;
                speed = 5;
                luck = 2;
                break;
            }else if(Objects.equals(wybor, "4")){
                health = 125;
                power = 110;
                speed = 2;
                luck = 4;
                break;
            }else if(Objects.equals(wybor, "5")){
                health = 100;
                power = 100;
                speed = 2;
                luck = 1;
                break;
            }else{
                System.out.println("Incorrect choice. Try again.");
            }
        }
        maxHealth = health;
        // The game begins
        while(true){
            System.out.println("___________.__             ___________              __                        _________         __                   __                       .__            \n" +
                    "\\__    ___/|  |__   ____   \\_   _____/____    _____/  |_  ___________ ___.__. \\_   ___ \\_____ _/  |______    _______/  |________  ____ ______ |  |__   ____  \n" +
                    "  |    |   |  |  \\_/ __ \\   |    __) \\__  \\ _/ ___\\   __\\/  _ \\_  __ <   |  | /    \\  \\/\\__  \\\\   __\\__  \\  /  ___/\\   __\\_  __ \\/  _ \\\\____ \\|  |  \\_/ __ \\ \n" +
                    "  |    |   |   Y  \\  ___/   |     \\   / __ \\\\  \\___|  | (  <_> )  | \\/\\___  | \\     \\____/ __ \\|  |  / __ \\_\\___ \\  |  |  |  | \\(  <_> )  |_> >   Y  \\  ___/ \n" +
                    "  |____|   |___|  /\\___  >  \\___  /  (____  /\\___  >__|  \\____/|__|   / ____|  \\______  (____  /__| (____  /____  > |__|  |__|   \\____/|   __/|___|  /\\___  >\n" +
                    "                \\/     \\/       \\/        \\/     \\/                   \\/              \\/     \\/          \\/     \\/                     |__|        \\/     \\/ ");
            System.out.println("____                                                                          \n" +
                    " /  / _  (   /  _ /  _ /      /  _ '_/_  _/    .       /_ /  _       _ '_ /_/ \n" +
                    "(  /)(-  |/|/()/ /(_) /)()/) (/)( /(/(-/)/     .    ()((-/( ( ()/)(// /(//)/  \n" +
                    "                         /                                     /  /   _/      ");
            System.out.println("You wake up in your bed. You can hear explosions in your village, screaming roars throughout the halls.");
            System.out.println("You can hear people screaming 'THE CHRISTMAS WILL GET CANCELLED!! ITS ALL OVER!!'. That's when you decide to wake up and look around.\n");


            while (true) {
                System.out.println("\nYou are in the main room.\n");
                System.out.println("[1] >> Look outside");
                System.out.println("[2] >> Check Calendar");
                System.out.println("[3] >> Go to the kitchen");
                if(thermoslash){
                    System.out.println("[T] >> Check temperature");
                }


                wybor = asystent.nextLine();
                if (Objects.equals(wybor, "1")) {
                    System.out.println("You decide to look outside. You can see everything burning, christmas trees falling, your village in shambles.");
                    System.out.println("You ask the elf who is running away from a large fire, 'What is happening??'.\n");
                    System.out.println("The elf explains that the Jolly Main Drive has overheated as caused a large explosion in 'The Santas Workshop'.");
                    System.out.println("The Jolly Main Drive is enrouted in the facility for centuries, it powers everything and gives everything and everyone working there, christmas energy.");
                    System.out.println("However in the middle of the night, the coolers have shut down, along with back-ups and the core started heating up.");
                    System.out.println("The first person to go in the workshop, Magical Mechanic Techni, withnessed the first huge explosion that set everything on fire completly.");
                    System.out.println("Now, no one knows what to do and Santa is not responding. Something could've happen to him as well!");
                    break;
                } else if (Objects.equals(wybor, "2")) {
                    System.out.println("\nIt is currently December 12th 1959, you are in the Snowelves village near the main workshop.");
                    System.out.println("The calendar has a sticky note attached to it 'I can't wait from christmas!!'.\n");
                } else if (Objects.equals(wybor, "3")) {
                    while (true) {
                        System.out.println("\nYou look around your kitchen. What do you want to check?\n");
                        System.out.println("[1] >> Check the oven");
                        System.out.println("[2] >> Check the bottom cupboard");
                        System.out.println("[3] >> Look into the sink");
                        System.out.println("[4] >> Check the upper cupboard");
                        System.out.println("[5] >> Check the drawer");
                        System.out.println("[B] >> Return to the main room");

                        wybor = asystent.nextLine();
                        if (Objects.equals(wybor, "1")) {
                            System.out.println("\nYou open the oven. Theres nothing notable there, maybe some ashes. It's really cold inside.\n");
                        } else if (Objects.equals(wybor, "2")) {
                            System.out.println("\nYou look inside the bottom cupboard. You can see a lot of dishes there, some plates, some pots and a frying pan.\n");
                        } else if (Objects.equals(wybor, "3")) {
                            System.out.println("\nYou peek inside the sink. You can see some water dripping from the tap.\n");
                        } else if (Objects.equals(wybor, "4")) {
                            min = 0;
                            max = 20/luck;
                            szansa = (int) (Math.random() * max + min);
                            if (szansa == 1) {
                                if (!thermoslash){
                                    System.out.println("\nYou take another peek inside. You notice something shiny in the darkness. You reach for it. What is that?\n");
                                    thermoslash = true;
                                    System.out.println("[SECRET] >> THERMOSLASH OBTAINED.\n");
                                    power += 25;
                                }else{
                                    System.out.println("\nEven though you thought you did, you find nothing new.\n");
                                }
                            } else {
                                System.out.println("\nYou check the upper cupboard. It seems empty.\n");
                            }
                        } else if (Objects.equals(wybor, "5")) {
                            System.out.println("\nYou look inside the drawer. You can see various spoons, forks and other types of cutlery.\n");
                        } else if (Objects.equals(wybor, "B")) {
                            System.out.println("\nYou go back to the main room.\n");
                            break;
                        } else {
                            System.out.println("\nIncorrect choice. Try again?\n");
                        }
                    }
                } else if(Objects.equals(wybor, "T")){
                    if(thermoslash){
                        System.out.println("\nThe temperature is 12 C\n");
                    }else{
                        System.out.println("\nIncorrect choice. Try again.\n");
                    }
                } else {
                    System.out.println("\nIncorrect choice. Try again.\n");
                }
            }
            System.out.println("You decide go to the factory and find out what happened.");
            System.out.println("You slowly approach the burning mess, the main gate is on fire.");
            while(true){
                System.out.println("\nWhat are you going to do?\n");

                System.out.println("[1] >> Look for an entrance at the right side");
                System.out.println("[2] >> Climb the dinner roof and look for an entrance");

                wybor = asystent.nextLine();
                if(Objects.equals(wybor, "1")){
                    System.out.println("\nYou find a hole in the right wall of the main lobby, from the side of the building.");
                    System.out.println("You decide to enter.\n");
                    entrance = 1;
                    break;
                }else if(Objects.equals(wybor, "2")){
                    System.out.println("\nYou climb the diner roof and notice that you can easily jump from the top, over the wall into the factory outdoor area.");
                    System.out.println("You jump and manage to get over the wall.\n");
                    entrance = 2;
                    break;
                }else{
                    System.out.println("\nIncorrect choice. Try again.\n");
                }
            }
            if(entrance==1){
                // Main lobby
                System.out.println("You enter the main lobby, there isn't much fire here, but everything is already in ruins.");
                System.out.println("The shattered lights are flickering, random sparks fall from the ceiling.");
                System.out.println("You continue to walk throughout the destroyed, previously really jolly area of the factory.");
                onetime = false;
                while(true){
                    System.out.println("\nWhat do you do?\n");

                    System.out.println("[1] >> Progress deeper into the factory");
                    System.out.println("[2] >> Check the broken factory sign");
                    System.out.println("[3] >> Search the lobby desk");
                    System.out.println("[4] >> Examine a vent");
                    System.out.println("[5] >> Look into the storage closet");

                    wybor = asystent.nextLine();
                    if(Objects.equals(wybor, "1")){
                        System.out.println("\nYou decide to continue deeper into the factory.");
                        System.out.println("As soon as you walk through it, the doorway behind you collapses. How luck you made it before it broke down.\n");
                        break;
                    } else if(Objects.equals(wybor, "2")){
                        System.out.println("\nYou take a deep look at the factory sign. It says Jolly Workshop.");
                        System.out.println("It randomly starts to flicker really quickly.");
                        System.out.println("Suddenly a large amount of sparks emerge from it and it turns off.");
                        System.out.println("You stare at it. Slowly it turns back on and starts to flicker.\n");
                    } else if(Objects.equals(wybor, "3")){
                        System.out.println("\nYou start going through the drawers at the main lobby desk.");
                        if(!onetime){
                            System.out.println("You find a small metal plate with a lot of duct tape next to it.");
                            System.out.println("You decide to use it as armor, just in-case you encounter something in this dark place.\n");
                            health += 25;
                            onetime = true;
                        }else{
                            System.out.println("You find nothing interesting.\n");
                        }
                    } else if(Objects.equals(wybor, "4")){
                        if(!ladder){
                            System.out.println("\nIt's too high for me to reach up there.\n");
                        }else{
                            if(!mysteriousKey){
                                System.out.println("\nYou use the ladder to reach the vent.");
                                System.out.println("It is broken so you can open it easily.");
                                System.out.println("You look inside.");
                                System.out.println("What's that? A key?\n");
                                System.out.println("[SECRET] >> MYSTERIOUS KEY OBTAINED??\n");
                                mysteriousKey = true;
                            }else{
                                System.out.println("\nYou climb up using a ladder. There's nothing else there.\n");
                            }
                        }
                    } else if(Objects.equals(wybor, "5")){
                        System.out.println("\nYou open the storage closet. Theres a bunch of old stuff, covered with cobwebs and dust.");
                        System.out.println("Due to the catastrophe that happened at the factory, part of the ceiling has collapsed into the room, making it impossible for you to progress further.\n");
                        min = 0;
                        max = 52/luck;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa==7){
                            if(!ladder){
                                System.out.println("You notice something in the room that looks useful.");
                                System.out.println("You go through the dusty closet, destroying many cobwebs along the way.");
                                System.out.println("You reach the object you noticed. It's a ladder.\n");
                                System.out.println("[SECRET] >> Ladder OBTAINED.\n");
                                ladder = true;
                            }else{
                                System.out.println("For a second, you though you found another useful thing. It was just a bunch of useless boxes though.\n");
                            }
                        }else{
                            System.out.println("You cannot see anything interesting so you exit the closet.\n");
                        }
                    } else {
                        System.out.println("\nIncorrect choice. Try again.\n");
                    }
                }
                System.out.println("As you walk through the ruins, you notice a sign saying you're leaving the main lobby and going into the main hallway.");
                System.out.println("Suddenly you make a loud noise by bumping into a table, on which a metal pipe was lying. The metal pipe falls.");
                System.out.println("You hear some noises coming from a pile of broken ceiling parts. A shiver runs down your spine.");
                System.out.println("Suddenly an elf jumps out of the ruins.\n");
                System.out.println("Elf: Hi I'm an elf called Dejolli. I just walked in to work this morning while suddenly a large explosion happened.");
                System.out.println("Dejolli: A huge part of ceiling has collapsed on me. I was calling my co-worker on this shift, Techni, for help but he didn't respond.");
                System.out.println("Dejolli: Since then I was looking for a way out but you somehow entered the building!! Tell me how to exit.");
                System.out.println("You explain that you entered the building but the exit has just collapsed.\n");
                System.out.println("Dejolli stands there in shock. After a while of thinking he says:");
                System.out.println("Dejolli: Well, our best bet right now is going even further into this workshop I guess! Let's go i can show you around.\n");
                System.out.println("You progress deeper into the factory, along the way your new companion Dejolli explains to you how the factory functions and tells you many stories. ");
                System.out.println("Your head still hurts and you're unable to tell if you were here before or not.");
                System.out.println("You finally walk into the workshop part of the factory with Dejolli.\n");
                System.out.println("You can see the ruined broken claws hanging from the ceiling. Sparks coming from the burnt machines.");
                System.out.println("This part of the factory got the worst treatment since a lot of machines were here.");
                System.out.println("Dejolli: WATCH OUT!! TOYS INCOMING!!\n");
                System.out.println("You turn around to see one of the machines beeping with a large red glowing sign Toys Dropping.");
                System.out.println("Suddenly you notice a lot of big toys falling down from an open chute near the ceiling.");
                System.out.println("Their fall is broken by the snow at the bottom. They're quite big for some toys.");
                System.out.println("They suddenly start moving. Dejolli has warned you. These robotic toys' wind-up keys start spinning on their own.");
                System.out.println("They start going into your direction.\n");

                // INSERT EPIC COMBAT SYSTEM HERE /w toys
                enemyPower = 10;
                enemySpeed = 3;
                enemyHealth = 500;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nThe toy approaches! Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+" Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the enemy!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nEnemy defeated.\n");
                        break;
                    }
                    System.out.println("\nIt's enemy's turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe enemy attacks you!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nIt heals itself!\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nIt's preparing an attack..!\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting a toy.. How..?\n");
                    break;
                }

                System.out.println("\nDejolli: Another one is coming!! You should fight it and I'll take care of the rest!\n");

                enemyPower = 10;
                enemySpeed = 2;
                enemyHealth = 550;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nAnother toy is ready to fight! Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the enemy!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nEnemy defeated.\n");
                        break;
                    }
                    System.out.println("\nIt's the toy's turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe enemy attacks you!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe toy heals itself!\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nIt's resting while planning an attack..\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting a second toy.. I mean it was harder than the first one..\n");
                    break;
                }
                // Ended

                System.out.println("Phew that was close.");
                System.out.println("Dejolli: Don't worry about your wounds. I have a medkit, I can help you.");
                health = maxHealth;
                System.out.println("<< You've got healed >>");
                while(true) {
                    System.out.println("\nWhat do you want to do now?\n");

                    System.out.println("[1] >> Examine the claw control panel");
                    System.out.println("[2] >> Examine the toy chute machine");
                    System.out.println("[3] >> Examine the conveyor belt");
                    System.out.println("[4] >> Check out the fire exit");
                    System.out.println("[5] >> See the broken toys");
                    System.out.println("[6] >> Examine a door");
                    System.out.println("[7] >> Search a work station");

                    wybor = asystent.nextLine();
                    if (Objects.equals(wybor, "1")) {
                        System.out.println("\nYou try to use the claw control panel.");
                        System.out.println("Each time you try to press a button, the sparks fly out and nothing happens.");
                        System.out.println("After trying for enough time, you decide it doesn't make any more sense to continue.\n");
                    } else if (Objects.equals(wybor, "2")) {
                        System.out.println("\nYou look at the toy chute machine, it is covered with christmas lights.");
                        System.out.println("You cannot find any way to control it, nor think of any ways it can really help you.\n");
                    } else if (Objects.equals(wybor, "3")) {
                        System.out.println("\nYou take a look at a conveyor belt, the toys travel through the factory on.");
                        if (conveyorKey) {
                            System.out.println("It seems to be really broken, none of each parts working. The only sign of it being a piece of a machine are occasional sparks coming out of it.");
                            System.out.println("You decide to walk on it and look for a way out of the workshop. You discover a way out, through a tunnel the toys travel through!");
                            System.out.println("You call for Dejolli and you both progress.\n");
                            break;
                        } else {
                            System.out.println("You look at it's control panel. It requires a key to operate.\n");
                        }
                    } else if (Objects.equals(wybor, "4")) {
                        System.out.println("\nYou run up to the fire exit. It looks very promising.");
                        System.out.println("However as soon as you open it, you're treated to a sight of collapsed walls, that don't let you progress. How sad.\n");
                    } else if (Objects.equals(wybor, "5")) {
                        System.out.println("\nYou take a look at the toys you just broke, these are purely mechanical.");
                        System.out.println("Dejolli: Hey, if you want to know what these toys are, let me tell you.");
                        System.out.println("Dejolli: They were supposed to be a replacement for our previous living toys.");
                        System.out.println("Dejolli: Yes, you've heard that right. We had living awesome toys, running purely on christmas spirit and jolly energy.");
                        System.out.println("Dejolli: However, both of those are fading more and more after Santa's disappearance. I wonder what happened to him.\n");
                    } else if (Objects.equals(wybor, "6")) {
                        System.out.println("\nYou noticed a mysterious door, in the back, behind all of the machinery.");
                        System.out.println("You manage to make your way over there. It's locked.");
                        if (!mysteriousKey) {
                            if (conveyorKey) {
                                System.out.println("You try to open it using that key, you found at the work station.");
                                System.out.println("It doesn't fit.\n");
                            } else {
                                System.out.println("It looks like you need some key to open it.\n");
                            }
                        } else {
                            if (!azarthosSword) {
                                System.out.println("You try to open it using a key, you found earlier in the vent.");
                                System.out.println("*Click*");
                                System.out.println("It's open. You walk in.\n");
                                System.out.println("You walk through a dark hallway, you can see green flames lighting up.");
                                System.out.println("You see a green illuminated pedestal, in the middle of the darkness.");
                                System.out.println("You approach it, to take a closer look. It is a some kind of sword.");
                                System.out.println("Green light and energy bursts from that sword. You see it's name inscribed into the pedestal.\n");
                                System.out.println("It looks powerful. You pick it up. A weird feeling goes through your body.");
                                System.out.println("You can feel the green energy going through you body, it empowers you.");
                                System.out.println("The sword releases green glowing particles. The ancient inscribes, on it glow. It found its new owner.");
                                System.out.println("You feel extremely powerful, with the sword in your hand.\n");

                                System.out.println("[SECRET] >> Azarthos Sword obtained\n");
                                azarthosSword = true;
                                power += 125;

                            } else {
                                System.out.println("You take another look into the home of your sword. You don't find anything interesting.\n");
                            }
                        }
                    } else if (Objects.equals(wybor, "7")) {
                        System.out.println("\nYou start to search a work station, you noticed in the workshop.");
                        System.out.println("You look for anything interesting.");
                        System.out.println("Nothing.");
                        System.out.println("You look in the boxes close to it.");
                        System.out.println("Nothing.");
                        System.out.println("You search it's drawers.");
                        if (!conveyorKey) {
                            System.out.println("Ooh you found something. It looks like a key.\n");
                            conveyorKey = true;
                        } else {
                            System.out.println("And... Nothing.\n");
                        }
                    } else {
                        System.out.println("\nIncorrect choice. Try again.\n");
                    }
                }
                System.out.println("As you go through the tunnel you and Dejolli hear a rolling sound throughout it.");
                System.out.println("Suddenly in front of you, a blue ball appears. However it seems to be moving on its own.");
                System.out.println("Prepare for the atta-..\n");
                System.out.println("Hi, I'm Rolli, a living ball. :D");
                System.out.println("You and Dejolli look at each other, both confused.");
                System.out.println("Dejolli: How can you talk?");
                System.out.println("Rolli: Don't worry about it. It's the christmas magic. Seriously. I just woke up one day and could speak.");
                System.out.println("Dejolli: Alrighty then.");
                System.out.println("Rooli: I'm gonna join your adventure, I need to get out of here. I cannot stand every moment inside this burning mess.\n");
                System.out.println("The three of you progress through the tunnels until you find yourself in the trash area.");
                System.out.println("Dejolli: The trash area is where all the bad toys go. They are being kept in check by the SnowGuards and their commander Krampus.");
                System.out.println("???: Intruders spotted. Proceed with combat.");
                System.out.println("You ask Dejolli what are those things.");
                System.out.println("Dejolli: The SnowGuards are special snowman trained in fighting so they can watch over the bad toys. Be careful!!\n");

                enemyPower = 40;
                enemySpeed = 7;
                enemyHealth = 1250;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nThe SnowGuard has spotted you.. Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the SnowGuard!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nSnowGuard 01 defeated.\n");
                        break;
                    }
                    System.out.println("\nIt's SnowGuard's turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe SnowGuard hits you with a big icicle!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe SnowGuard freezes himself, ice heals the SnowGuard!\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nThe SnowGuard is charging his cannon..\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting a SnowGuard.. You got frozen solid.\n");
                    break;
                }

                System.out.println("\nDejolli: Watch out more are incoming!!");
                System.out.println("Rolli: I got them!!");
                System.out.println("Rolli rolls down a pile of broken toys, gains a lot of speed and absolutely demolishes 3 of the SnowGuards.");
                System.out.println("Rolli: That was epic. BEHIND YOU!!--\n");

                enemyPower = 40;
                enemySpeed = 7;
                enemyHealth = 1250;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nThe SnowGuard has spotted you.. Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the SnowGuard!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nSnowGuard 02 defeated.\n");
                        break;
                    }
                    System.out.println("\nIt's SnowGuard's turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe SnowGuard hits you with a big icicle!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe SnowGuard freezes himself, ice heals the SnowGuard!\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nThe SnowGuard is charging his cannon..\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting a SnowGuard.. You got frozen solid.\n");
                    break;
                }

                System.out.println("\nRolli: Alright good job, only a couple left!!\n");

                enemyPower = 40;
                enemySpeed = 7;
                enemyHealth = 1250;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nThe SnowGuard has spotted you.. Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the SnowGuard!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nSnowGuard 03 defeated.\n");
                        break;
                    }
                    System.out.println("\nIt's SnowGuard's turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe SnowGuard hits you with a big icicle!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe SnowGuard freezes himself, ice heals the SnowGuard!\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nThe SnowGuard is charging his cannon..\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting a SnowGuard.. You got frozen solid.\n");
                    break;
                }

                System.out.println("\nDejolli: Good job guys you completely destroyed them!!");
                System.out.println("Rolli: It was a nice fight. Being a ball really helps in combat!!");
                System.out.println("You feel the air around you suddenly get super cold.");
                if(thermoslash){
                    System.out.println("You check the temperature on your ThermoSlash and it's -30 C");
                }
                System.out.println("Dejolli & Rolli: It-t-t is-s-s...--\n");

                enemyPower = 70;
                enemySpeed = 13;
                enemyHealth = 3750;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nThe Krampus looks at you, with a cold stare.. Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the Krampus!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nThe Krampus has been defeated.\n");
                        break;
                    }
                    System.out.println("\nIt's Krampuses turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe Krampus hits you, sending frosty winds at you as well.!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe Krampus freezes himself, the cold helps him heal!\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nThe Krampus is charging his frosty attack..\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting The Krampus.. You got destroyed beyond recovery.\n");
                    break;
                }

                System.out.println("\nDejolli: GREAT JOB NOW RUN, MORE OF THESE SNOWMEN ARE COMING FOR US, WE HAVE TO RUN.");
                System.out.println("You and the gang run as fast as you can through the tunnels. Eventually being able to make it to exit.");
                System.out.println("You spot a hole in the wall and you manage to exit into the main hallway.");
                System.out.println("After venturing for a while you find yourself at a problematic situation.");
                System.out.println("You cannot decide where to go. You, Dejolli and Rolli are all tired and want to get out of here, as soon as possible.\n");

                System.out.println("Rolli: Hey, didn't you wanted to go check on the core or whatever. We can go there before leaving for sure.");
                System.out.println("Dejolli: No we can't. The blueprints show that the only path has been blocked of by debris.");
                System.out.println("Rolli: I'm sure we can get around. Do you not belive in us??");
                System.out.println("Dejolli: I don't believe in us? I DON'T BELIEVE IN US?! Dude I'm tired, I have been trapped in here for a long time.");
                System.out.println("Dejolli: I want to get out of here ASAP!!");
                System.out.println("Rolli: Of course, you want to get out of here, you're lazy and a scared little elf.");
                System.out.println("Dejolli: WHAT ARE YOU TALKING ABOUT??! YOU'RE A LIVING TOY!! I RATHER BE AN ELF THAN SOME PLASTIC LIVING PURELY ON JOLLY ENERGY.");
                System.out.println("Rolli: Stop being pesimistic.");
                System.out.println("Dejolli: I am NOT PESSIMISTIC! You're SOOO annoying.");
                System.out.println("Rolli: Will you just shut up? If you want to get out of here we should take the path to the Jolly Reindeer Launching Station.");
                System.out.println("Rolli: In JRLS we can just use a reindeer and fly out of here.");
                System.out.println("Dejolli: If you think I'm trusting a ball, you're severly mistaken, we can go over to the boiler rooms and from there exit via pipes.");
                System.out.println("Dejolli: Unless the building has completly changed we should be able to get there un-spotted by any possible threats!");
                System.out.println("Rolli: Yeah, no. That's stupid. I'm not gonna be crawling through some pipes.");
                System.out.println("Dejolli: Well, I'm not gonna be flying on a reindeer!!");
                while (true){
                    System.out.println("\nWho's side do you pick??\n");

                    System.out.println("[R] >> Rolli: Get over to JRLS");
                    System.out.println("[D] >> Dejolli: Get over to the boiler rooms.");

                    wybor = asystent.nextLine();
                    if(Objects.equals(wybor, "R")){
                        System.out.println("\nYou say you think escaping via reindeer is a better idea.");
                        System.out.println("Dejolli: Whatever.\n");
                        finalpath = 1;
                        break;
                    }else if(Objects.equals(wybor, "D")){
                        System.out.println("\nYou say you think escaping via pipes sounds cooler and stealthier.");
                        System.out.println("Rolli: I guess we can do that.\n");
                        finalpath = 2;
                        break;
                    }else{
                        System.out.println("\nIncorrect choice. Try again.\n");
                    }
                }
                if(finalpath==1){
                    System.out.println("The atmosphere in your team is quite uneasy.");
                    System.out.println("Both of your companions are still mad at each other.");
                    System.out.println("Suddenly your journey interrupts a group of reindeers.\n");

                    enemyPower = 40;
                    enemySpeed = 7;
                    enemyHealth = 1250;
                    lastRoundAttack = 0;
                    lastRoundSpecial = 0;
                    lastRoundHeal = 0;
                    lastRoundAttackEnemy = 0;
                    lastRoundHealEnemy = 0;
                    lastRoundSpecialEnemy = 0;
                    round = 0;
                    while(true){
                        round += 1;
                        while(true){
                            System.out.println("\nA Reindeer has spotted you.. Round: "+round+".\n");
                            System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                            System.out.println("It's your turn.\n");
                            System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                            System.out.println("  HEAL << [H]       [S] >> SPARE");
                            wybor = asystent.nextLine();
                            if(Objects.equals(wybor, "A")){
                                if(round>=lastRoundAttack+speed){
                                    System.out.println("\nYou hit the SnowGuard!\n");
                                    enemyHealth -= power;
                                    lastRoundAttack = round;
                                    break;
                                }else{
                                    System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                                }
                            }else if(Objects.equals(wybor, "X")){
                                if(special){
                                    if(round>=lastRoundSpecial+5){
                                        System.out.println("\nYou use your special ability!!\n");
                                        enemyHealth -= 25000;
                                        lastRoundSpecial = round;
                                        break;
                                    }else{
                                        System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                    }
                                }else{
                                    if(round>=lastRoundSpecial+5){
                                        System.out.println("\nYou use your special ability!!\n");
                                        enemyHealth -= 1000;
                                        lastRoundSpecial = round;
                                        break;
                                    }else{
                                        System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                    }
                                }
                            }else if(Objects.equals(wybor, "H")){
                                if(round>=lastRoundHeal+3){
                                    System.out.println("\nYou heal yourself\n");
                                    if(health>maxHealth-25){
                                        health = maxHealth;
                                    }else{
                                        health += 25;
                                    }
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                                }
                            }else if(Objects.equals(wybor, "S")){
                                System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                                break;
                            }else{
                                System.out.println("\nIncorrect choice. Try again.\n");
                            }
                        }
                        if(enemyHealth<=0){
                            System.out.println("\nSnowGuard 01 defeated.\n");
                            break;
                        }
                        System.out.println("\nIt's Reindeer's turn.\n");
                        while(true){
                            min = 0;
                            max = 10;
                            szansa = (int) (Math.random() * max + min);
                            if(szansa>5){
                                if(round>=lastRoundAttackEnemy+enemySpeed){
                                    System.out.println("\nThe Reindeer hits you!\n");
                                    health -= enemyPower;
                                    lastRoundAttackEnemy = round;
                                    break;
                                }
                            }else if(5>=szansa && szansa>2){
                                if(round>=lastRoundHealEnemy+3){
                                    System.out.println("\nThe Reindeer's colorful nose glows, he gets healed.\n");
                                    if(enemyHealth>475){
                                        enemyHealth = 500 ;
                                    }else{
                                        enemyHealth += 25;
                                    }
                                    lastRoundHealEnemy = round;
                                    break;
                                }
                            }else{
                                System.out.println("\nThe Reindeer is charging his attack..\n");
                                break;
                            }
                        }
                        if(health<=0){
                            System.out.println("\nGAME OVER\n");
                            death = true;
                            break;
                        }
                    }
                    if(death){
                        System.out.println("\nYou died while fighting a Reindeer.. Why are they so aggressive?.\n");
                        break;
                    }

                    System.out.println("\nAfter fighting through all of the reindeers you start to run towards the JRLS.");
                    System.out.println("You manage to get in but there are even more rogue reindeers blocking your path.");
                    System.out.println("Rolli: WHY ARE THOSE REINDEERS SO AGGRESSIVE.");
                    System.out.println("Dejolli: I don't know, they all have noses similar to Rudolphs but those are meant to prevent attacks like these.");
                    System.out.println("Dejolli: However I just noticed Rudolphs not attacking us, he is sitting peacefully. Their noses perhaps got hacked,");
                    System.out.println("Dejolli points quickly at the peaceful Rudolph.");
                    System.out.println("Dejolli: Go!! Escape!! I will hold them off.\n");
                    System.out.println("You and even Rolli watch with sadness as your friend gets the reindeers attention.");
                    System.out.println("In the last second. Dejolli gets bounced off into Rudolphs direction. Rolli has taken his place.");
                    System.out.println("Rolli: Farewell guys, thanks for letting me join the team. I always wanted to ride a reindeer but I'm a ball.");
                    System.out.println("Rolli: It's not really possible for me to do that. So I'm just gonna let you escape. I'm just a toy after all!!");
                    System.out.println("Dejolli: NOOOOOOOOOOOOOO!!!\n");
                    System.out.println("You take Dejolli, you both sit on Rudolph and ask him kindly to let you fly away.");
                    System.out.println("Even though Rudolph hesitated at first, he got convinced by you and Rolli's sacrifice.");
                    System.out.println("He quickly flew right through the metal plated doors that were securing the JRLS.");
                    System.out.println("You managed to safely land at your village. Your friend shall not be forgotten.\n");
                    System.out.println("THE END.");
                    System.out.println("The Reindeer Ending");
                    break;
                }else if(finalpath==2){
                    // BOILER
                    System.out.println("The atmosphere in the team is quite uneasy.");
                    System.out.println("Both of your companions are still mad at each other.");
                    System.out.println("You get over to the boiler room. You ran into some suspicious on the way.");
                    System.out.println("Dejolli: Is that..?");
                    System.out.println("Rolli: No way...\n");

                    enemyPower = 10;
                    enemySpeed = 3;
                    enemyHealth = 1750;
                    lastRoundAttack = 0;
                    lastRoundSpecial = 0;
                    lastRoundHeal = 0;
                    lastRoundAttackEnemy = 0;
                    lastRoundHealEnemy = 0;
                    lastRoundSpecialEnemy = 0;
                    round = 0;
                    while(true){
                        round += 1;
                        while(true){
                            System.out.println("\nThe grinch wants to fight you.. Round: "+round+".\n");
                            System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                            System.out.println("It's your turn.\n");
                            System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                            System.out.println("  HEAL << [H]       [S] >> SPARE");
                            wybor = asystent.nextLine();
                            if(Objects.equals(wybor, "A")){
                                if(round>=lastRoundAttack+speed){
                                    System.out.println("\nYou hit the SnowGuard!\n");
                                    enemyHealth -= power;
                                    lastRoundAttack = round;
                                    break;
                                }else{
                                    System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                                }
                            }else if(Objects.equals(wybor, "X")){
                                if(special){
                                    if(round>=lastRoundSpecial+5){
                                        System.out.println("\nYou use your special ability!!\n");
                                        enemyHealth -= 25000;
                                        lastRoundSpecial = round;
                                        break;
                                    }else{
                                        System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                    }
                                }else{
                                    if(round>=lastRoundSpecial+5){
                                        System.out.println("\nYou use your special ability!!\n");
                                        enemyHealth -= 1000;
                                        lastRoundSpecial = round;
                                        break;
                                    }else{
                                        System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                    }
                                }
                            }else if(Objects.equals(wybor, "H")){
                                if(round>=lastRoundHeal+3){
                                    System.out.println("\nYou heal yourself\n");
                                    if(health>maxHealth-25){
                                        health = maxHealth;
                                    }else{
                                        health += 25;
                                    }
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                                }
                            }else if(Objects.equals(wybor, "S")){
                                System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                                break;
                            }else{
                                System.out.println("\nIncorrect choice. Try again.\n");
                            }
                        }
                        if(enemyHealth<=0){
                            System.out.println("\nThe Grinch has been defeated.\n");
                            break;
                        }
                        System.out.println("\nIt's Grinches turn.\n");
                        while(true){
                            min = 0;
                            max = 10;
                            szansa = (int) (Math.random() * max + min);
                            if(szansa>5){
                                if(round>=lastRoundAttackEnemy+enemySpeed){
                                    System.out.println("\nThe Grinch hits you with his unjolly energy!\n");
                                    health -= enemyPower;
                                    lastRoundAttackEnemy = round;
                                    break;
                                }
                            }else if(5>=szansa && szansa>2){
                                if(round>=lastRoundHealEnemy+3){
                                    System.out.println("\nThe Grinch spreads unjolly magic, he heals himself.\n");
                                    if(enemyHealth>475){
                                        enemyHealth = 500 ;
                                    }else{
                                        enemyHealth += 25;
                                    }
                                    lastRoundHealEnemy = round;
                                    break;
                                }
                            }else{
                                System.out.println("\nThe Grinch is charging his unjolly energy..\n");
                                break;
                            }
                        }
                        if(health<=0){
                            System.out.println("\nGAME OVER\n");
                            death = true;
                            break;
                        }
                    }
                    if(death){
                        System.out.println("\nYou died while fighting a Grinch.. Really unjolly.\n");
                        break;
                    }

                    System.out.println("\nDejolli: There's more of them?!\n");

                    enemyPower = 10;
                    enemySpeed = 3;
                    enemyHealth = 1750;
                    lastRoundAttack = 0;
                    lastRoundSpecial = 0;
                    lastRoundHeal = 0;
                    lastRoundAttackEnemy = 0;
                    lastRoundHealEnemy = 0;
                    lastRoundSpecialEnemy = 0;
                    round = 0;
                    while(true){
                        round += 1;
                        while(true){
                            System.out.println("\nThe grinch wants to fight you.. Round: "+round+".\n");
                            System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                            System.out.println("It's your turn.\n");
                            System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                            System.out.println("  HEAL << [H]       [S] >> SPARE");
                            wybor = asystent.nextLine();
                            if(Objects.equals(wybor, "A")){
                                if(round>=lastRoundAttack+speed){
                                    System.out.println("\nYou hit the SnowGuard!\n");
                                    enemyHealth -= power;
                                    lastRoundAttack = round;
                                    break;
                                }else{
                                    System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                                }
                            }else if(Objects.equals(wybor, "X")){
                                if(special){
                                    if(round>=lastRoundSpecial+5){
                                        System.out.println("\nYou use your special ability!!\n");
                                        enemyHealth -= 25000;
                                        lastRoundSpecial = round;
                                        break;
                                    }else{
                                        System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                    }
                                }else{
                                    if(round>=lastRoundSpecial+5){
                                        System.out.println("\nYou use your special ability!!\n");
                                        enemyHealth -= 1000;
                                        lastRoundSpecial = round;
                                        break;
                                    }else{
                                        System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                    }
                                }
                            }else if(Objects.equals(wybor, "H")){
                                if(round>=lastRoundHeal+3){
                                    System.out.println("\nYou heal yourself\n");
                                    if(health>maxHealth-25){
                                        health = maxHealth;
                                    }else{
                                        health += 25;
                                    }
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                                }
                            }else if(Objects.equals(wybor, "S")){
                                System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                                break;
                            }else{
                                System.out.println("\nIncorrect choice. Try again.\n");
                            }
                        }
                        if(enemyHealth<=0){
                            System.out.println("\nThe Grinch has been defeated.\n");
                            break;
                        }
                        System.out.println("\nIt's Grinches turn.\n");
                        while(true){
                            min = 0;
                            max = 10;
                            szansa = (int) (Math.random() * max + min);
                            if(szansa>5){
                                if(round>=lastRoundAttackEnemy+enemySpeed){
                                    System.out.println("\nThe Grinch hits you with his unjolly energy!\n");
                                    health -= enemyPower;
                                    lastRoundAttackEnemy = round;
                                    break;
                                }
                            }else if(5>=szansa && szansa>2){
                                if(round>=lastRoundHealEnemy+3){
                                    System.out.println("\nThe Grinch spreads unjolly magic, he heals himself.\n");
                                    if(enemyHealth>475){
                                        enemyHealth = 500 ;
                                    }else{
                                        enemyHealth += 25;
                                    }
                                    lastRoundHealEnemy = round;
                                    break;
                                }
                            }else{
                                System.out.println("\nThe Grinch is charging his unjolly energy..\n");
                                break;
                            }
                        }
                        if(health<=0){
                            System.out.println("\nGAME OVER\n");
                            death = true;
                            break;
                        }
                    }
                    if(death){
                        System.out.println("\nYou died while fighting a Grinch.. Really unjolly.\n");
                        break;
                    }

                    System.out.println("\nAfter fighting off another unjolly grinch. You make your way to a pipe that looks like a good candidate for your plan.");
                    System.out.println("However the entrance to the pipe is blocked off, by one of them.\n");

                    enemyPower = 10;
                    enemySpeed = 3;
                    enemyHealth = 1750;
                    lastRoundAttack = 0;
                    lastRoundSpecial = 0;
                    lastRoundHeal = 0;
                    lastRoundAttackEnemy = 0;
                    lastRoundHealEnemy = 0;
                    lastRoundSpecialEnemy = 0;
                    round = 0;
                    while(true){
                        round += 1;
                        while(true){
                            System.out.println("\nThe grinch wants to fight you.. Round: "+round+".\n");
                            System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                            System.out.println("It's your turn.\n");
                            System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                            System.out.println("  HEAL << [H]       [S] >> SPARE");
                            wybor = asystent.nextLine();
                            if(Objects.equals(wybor, "A")){
                                if(round>=lastRoundAttack+speed){
                                    System.out.println("\nYou hit the SnowGuard!\n");
                                    enemyHealth -= power;
                                    lastRoundAttack = round;
                                    break;
                                }else{
                                    System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                                }
                            }else if(Objects.equals(wybor, "X")){
                                if(special){
                                    if(round>=lastRoundSpecial+5){
                                        System.out.println("\nYou use your special ability!!\n");
                                        enemyHealth -= 25000;
                                        lastRoundSpecial = round;
                                        break;
                                    }else{
                                        System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                    }
                                }else{
                                    if(round>=lastRoundSpecial+5){
                                        System.out.println("\nYou use your special ability!!\n");
                                        enemyHealth -= 1000;
                                        lastRoundSpecial = round;
                                        break;
                                    }else{
                                        System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                    }
                                }
                            }else if(Objects.equals(wybor, "H")){
                                if(round>=lastRoundHeal+3){
                                    System.out.println("\nYou heal yourself\n");
                                    if(health>maxHealth-25){
                                        health = maxHealth;
                                    }else{
                                        health += 25;
                                    }
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                                }
                            }else if(Objects.equals(wybor, "S")){
                                System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                                break;
                            }else{
                                System.out.println("\nIncorrect choice. Try again.\n");
                            }
                        }
                        if(enemyHealth<=0){
                            System.out.println("\nThe Grinch has been defeated.\n");
                            break;
                        }
                        System.out.println("\nIt's Grinches turn.\n");
                        while(true){
                            min = 0;
                            max = 10;
                            szansa = (int) (Math.random() * max + min);
                            if(szansa>5){
                                if(round>=lastRoundAttackEnemy+enemySpeed){
                                    System.out.println("\nThe Grinch hits you with his unjolly energy!\n");
                                    health -= enemyPower;
                                    lastRoundAttackEnemy = round;
                                    break;
                                }
                            }else if(5>=szansa && szansa>2){
                                if(round>=lastRoundHealEnemy+3){
                                    System.out.println("\nThe Grinch spreads unjolly magic, he heals himself.\n");
                                    if(enemyHealth>475){
                                        enemyHealth = 500 ;
                                    }else{
                                        enemyHealth += 25;
                                    }
                                    lastRoundHealEnemy = round;
                                    break;
                                }
                            }else{
                                System.out.println("\nThe Grinch is charging his unjolly energy..\n");
                                break;
                            }
                        }
                        if(health<=0){
                            System.out.println("\nGAME OVER\n");
                            death = true;
                            break;
                        }
                    }
                    if(death){
                        System.out.println("\nYou died while fighting a Grinch.. Really unjolly.\n");
                        break;
                    }

                    System.out.println("\nYou manage to fight the tough last Grinch and climb into the pipe.");
                    System.out.println("You and Dejolli both manage to enter, however since Rolli is a ball he seems to have quite some issues climing up a ladder.");
                    System.out.println("Dejolli quickly exits the pipe to help his recent enemy. You can see a lot more Grinches approaching, with the corner of your eye.");
                    System.out.println("They are coming out of some passage formed with debris. They are quickly running towards your crew. Dejolli tries his best to throw Rolli into the pipe but fails. ");
                    System.out.println("Eventually he makes a heavy decision, he manages to throw Rolli into the pipe. But is grabbed by the Grinches.\n");
                    System.out.println("Dejolli: Farewell friends, I am sorry if I failed you. I won't be able to help you on your way out anymore.");
                    System.out.println("Dejolli: All you have to do is continue through that pipe, you should be able to exit from behind of the factory, the blueprints say so.");
                    System.out.println("Dejolli: Good luck guys, I'm gonna hold them off. Bye.");
                    System.out.println("Feeling extremely sad, both you and Rolli start running through the pipes.\n");
                    System.out.println("After several minutes of running you both fall out of the pipe.");
                    System.out.println("Your fall is broken by huge amounts of snow. You can see yourself surrounded with many broken toy parts, and trash from the factory.");
                    System.out.println("It seems to be some sort of outside trash area, at the back of the factory.");
                    System.out.println("You quickly escape through the broken fence. Your friend shall not be forgotten.\n");
                    System.out.println("THE END");
                    System.out.println("The Boiler Ending");
                    break;
                }
            }else if (entrance==2) {
                // Outside Area to be done
                System.out.println("You land in a pile of snow, inside the factory outside area.");
                System.out.println("You start progressing the only way you see available.");
                while (true) {
                    System.out.println("\nYou're outside of the factory. What do you do??\n");

                    System.out.println("[1] >> Search nearby piles of snow");
                    System.out.println("[2] >> Check out the snowman in the corner");
                    System.out.println("[3] >> Examine cold mysterious boxes");
                    System.out.println("[4] >> Walk to the gate of Entrance B");
                    System.out.println("[5] >> Try to find anything in the garbage can");

                    wybor = asystent.nextLine();
                    if (Objects.equals(wybor, "1")) {
                        System.out.println("\nYou search the snow. It's really cold.");
                        if (thermoslash) {
                            System.out.println("Your Thermoslash shows the snow is exactly -5 C.");
                        }
                        System.out.println("At the end, you find nothing interesting.\n");
                    } else if (Objects.equals(wybor, "2")) {
                        System.out.println("\nYou approach the snowman.");
                        System.out.println("You look at it. It's just a snowman?");
                        min = 0;
                        max = 8 / luck;
                        szansa = (int) (Math.random() * max + min);
                        if (!snowfiend) {
                            if (szansa == 1) {
                                System.out.println("Or is it? You catch the glimpse of it moving.");
                                System.out.println("It's face has changed from a smile to a frown.\n");
                                System.out.println("The air has gotten colder. You can feel it.");
                                System.out.println("You hear the snow cracking behind you...");
                                System.out.println("You quickly turn around, there's nothing there.");
                                System.out.println("You suddenly hear a quick rush of snow cracking behind you.");
                                System.out.println("You turn around again. The snowman has changed it's location.\n");
                                System.out.println("It's standing closer to the wall, closer to you.");
                                System.out.println("It stares at you, continuously.");
                                System.out.println("You can sense a bad aura in the air.\n");
                                snowfiend = true;
                            }
                        } else {
                            System.out.println("You know it's not just a snowman... It's still looking at you...\n");
                        }
                    } else if (Objects.equals(wybor, "3")) {
                        System.out.println("\nYou take a look at the mysterious black heavily secured boxes lying near an outside wall.");
                        System.out.println("You check if any of them are open, however all seem to be closed.\n");
                        min = 0;
                        max = 44 / luck;
                        szansa = (int) (Math.random() * max + min);
                        if (szansa == 4) {
                            if (!jollyblaster) {
                                System.out.println("!! Your hand feels an open lock. You find a box that wasn't properly locked.");
                                System.out.println("You move the big box into a more accessible position.");
                                System.out.println("You unlock the box and look inside. You find-..");
                                System.out.println("THE JOLLY BLASTER!! Jolly-Blaster is a classified weapon produced by the most trusted in the workshop.\n");
                                System.out.println("[SECRET] >> Jolly-Blaster obtained\n");
                                jollyblaster = true;
//                                    power += 225;
                                System.out.println("It runs purily on jolly energy and is extremely powerful. That's why it's heavily protected and kept in high-security boxes such as this one.");
                                System.out.println("Unfortunately for the factory, but fortunetly for you, the box you found wasn't closed down properly, so you managed to get your hands on this.\n");
                            } else {
                                System.out.println("It seems you found another open case..!! Wait no, it's closed.\n");
                            }
                        }
                    } else if (Objects.equals(wybor, "4")) {
                        System.out.println("\nYou head to the Entrance B, on the side of the building.");
                        System.out.println("However, when you approach it, it's closed. You try to open it but the control panel required a key to operate.\n");
                        if (entranceKey) {
                            System.out.println("You try to use the key from the garbage can and-..");
                            System.out.println("It fits perfectly, you turn it around and activate the control panel.");
                            System.out.println("You open the Entrance B gate and finally manage to go into the factory.\n");
                            break;
                        } else {
                            System.out.println("Maybe you can find one somewhere here.\n");
                        }
                    } else if (Objects.equals(wybor, "5")) {
                        System.out.println("\nYou search the garbage can near the main factory building.");
                        if (!entranceKey) {
                            System.out.println("There's so much trash inside. You see nothing interesti-..");
                            System.out.println(".. You can see something shiny inside. You reach for it. It's a key, with a tag attached, saying it's a backup.\n");
                            entranceKey = true;
                        } else {
                            System.out.println("There's so much trash inside. You see nothing interesting, for sure this time.\n");
                        }

                    } else {
                        System.out.println("\nIncorrect choice. Try again.\n");
                    }

                }
                System.out.println("You walk into the factory, with the hope of finding warmth.");
                System.out.println("Your hope is short-lived, as you realize the ceiling of the side-lobby room is completly broken. The snow is falling inside.");
                System.out.println("You make your way through the snowy ruins, however you hear some weird noises from the hole in the wall.");
                System.out.println("You freeze in place. A cold shiver runs down your spine.");
                System.out.println("The noise from the hole, turns more into the noise of rolling and bouncing.");
                System.out.println("Eventually a ball falls out of the hole.\n");
                System.out.println("The Ball: Helllooo, my name is Rolli and I am a living ball.");
                System.out.println("Rolli: Suprised, huh? Well due to the magic of the workshop and jolly spirit, I gained consciousness.");
                System.out.println("Rolli: Hey, don't worry friend! I won't harm you, I'm just looking for a buddy to help me escape this mess.");
                System.out.println("You point at the exit door that poetically closes behind you. The sparks fly out of the inner control panel.");
                System.out.println("Rolli: Well, it seems our way out is unavailable now. I guess we should venture further into the factory.");
                System.out.println("Rolli: Maybe we'll find something that can help us there?");
                System.out.println("You quickly explain to Rolli, what your goal is.");
                System.out.println("Rolli: Hmm, a main core huh? We'll see what we can do.\n");
                System.out.println("You and your new-found friend start your journey to find an exit.");
                System.out.println("You walk through the empty ruined tunnels of the workshop, trying to find a way through the debris.");
                System.out.println("Some pathways are blocked off by ruined parts of the environment.");
                System.out.println("Eventually you make your way through the endless hallways into The Freezer.");
                System.out.println("Rolli: The Freezer huh?? I remember bouncing and rolling by this place. I didn't pay much attention to what it is, or what purpose it serves though.");
                System.out.println("Rolli: Well, let's find out, shall we?!");
                System.out.println("You both enter The Frezzer.");

                while (true) {
                    System.out.println("\nYou can feel the cold air, what will you do?\n");

                    System.out.println("[1] >> Read the instructions on the wall");
                    System.out.println("[2] >> Examine a door");
                    System.out.println("[3] >> Search piles of ice");
                    System.out.println("[4] >> Check ice cubes");
                    System.out.println("[5] >> Search pile of cold boxes");
                    if (thermoslash) {
                        System.out.println("[T] >> Check temperature");
                    }

                    wybor = asystent.nextLine();
                    if (Objects.equals(wybor, "1")) {
                        System.out.println("You start reading the instructions on the wall.");
                        System.out.println("Instructions state:");
                        System.out.println("1. Get an ice-requiring object.");
                        System.out.println("2. Place it in The Freezer.");
                        System.out.println("3. Register it into the workshop system.");
                        System.out.println("4. In-case of a full storage, put in the next room. Repeat until you stored the cold object.");
                        System.out.println("5. In-case of losing a key, to the next room. In the current room there should be spares, hidden somewhere in the boxes.\n");
                    } else if (Objects.equals(wybor, "2")) {
                        System.out.println("\nYou try to open the door, however it seems to be closed.");
                        if(exitKey){
                            System.out.println("You use the key, you found in the box. It fits.");
                            System.out.println("*Click*");
                            System.out.println("You and Rolli continue through The Freezer.\n");
                            break;
                        }else{
                            System.out.println("Instructions may help.\n");
                        }
                    } else if (Objects.equals(wybor, "3")) {
                        System.out.println("\nYou start going through the piles of ice. They're REALLY cold.");
                        if(!onetime){
                            System.out.println("Eventually, while examining one of them, you can fell something in an unusual shape.");
                            System.out.println("It's still ice, but shaped like-.. a snowflake?");

                            enemyPower = 15;
                            enemySpeed = 1;
                            enemyHealth = 375;
                            lastRoundAttack = 0;
                            lastRoundSpecial = 0;
                            lastRoundHeal = 0;
                            lastRoundAttackEnemy = 0;
                            lastRoundHealEnemy = 0;
                            lastRoundSpecialEnemy = 0;
                            round = 0;
                            while(true){
                                round += 1;
                                while(true){
                                    System.out.println("\nA snowflake flies around.. Round: "+round+".\n");
                                    System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                                    System.out.println("It's your turn.\n");
                                    System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                                    System.out.println("  HEAL << [H]       [S] >> SPARE");
                                    wybor = asystent.nextLine();
                                    if(Objects.equals(wybor, "A")){
                                        if(round>=lastRoundAttack+speed){
                                            System.out.println("\nYou hit the SnowGuard!\n");
                                            enemyHealth -= power;
                                            lastRoundAttack = round;
                                            break;
                                        }else{
                                            System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                                        }
                                    }else if(Objects.equals(wybor, "X")){
                                        if(special){
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 25000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }else{
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 1000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }
                                    }else if(Objects.equals(wybor, "H")){
                                        if(round>=lastRoundHeal+3){
                                            System.out.println("\nYou heal yourself\n");
                                            if(health>maxHealth-25){
                                                health = maxHealth;
                                            }else{
                                                health += 25;
                                            }
                                            break;
                                        }else{
                                            System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                                        }
                                    }else if(Objects.equals(wybor, "S")){
                                        System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                                        break;
                                    }else{
                                        System.out.println("\nIncorrect choice. Try again.\n");
                                    }
                                }
                                if(enemyHealth<=0){
                                    System.out.println("\nThe snowflake has melted.\n");
                                    break;
                                }
                                System.out.println("\nIt's snowflakes turn.\n");
                                while(true){
                                    min = 0;
                                    max = 10;
                                    szansa = (int) (Math.random() * max + min);
                                    if(szansa>5){
                                        if(round>=lastRoundAttackEnemy+enemySpeed){
                                            System.out.println("\nThe snowflake hits you with its sharp corner!\n");
                                            health -= enemyPower;
                                            lastRoundAttackEnemy = round;
                                            break;
                                        }
                                    }else if(5>=szansa && szansa>2){
                                        if(round>=lastRoundHealEnemy+3){
                                            System.out.println("\nThe snowflake falls into a pile of ice, healing itself.\n");
                                            if(enemyHealth>475){
                                                enemyHealth = 500 ;
                                            }else{
                                                enemyHealth += 25;
                                            }
                                            lastRoundHealEnemy = round;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nThe snowflake is flying around.\n");
                                        break;
                                    }
                                }
                                if(health<=0){
                                    System.out.println("\nGAME OVER\n");
                                    death = true;
                                    break;
                                }
                            }
                            if(death){
                                System.out.println("\nYou died while fighting a snowflake.. kinda cold.\n");
                                break;
                            }

                            System.out.println("Rolli: Don't worry. I found this while you were fighting. Here.");
                            health = maxHealth;
                            System.out.println("<< Health Regained >>\n");
                            onetime = true;
                        }else{
                            System.out.println("You find nothing interesting.\n");
                        }

                    } else if (Objects.equals(wybor, "4")) {
                        System.out.println("\nYou examine the ice cubes, they are really cold.");
                        System.out.println("There's nothing unusual about them.\n");
                    } else if (Objects.equals(wybor, "5")) {
                        System.out.println("\nYou search the boxes.");
                        if(!exitKey){
                            System.out.println("Most of them seem to not have interesting.");
                            System.out.println("However, you manage to find a key in one.\n");
                            exitKey = true;
                        }else{
                            System.out.println("You find nothing.\n");
                        }
                    } else if (Objects.equals(wybor, "T")) {
                        if(thermoslash){
                            System.out.println("\nYou check the temperature in the environment, using your thermoslash.");
                            System.out.println("It's -20 C, pretty cold, as a freezer should be.\n");
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    } else {
                        System.out.println("\nIncorrect choice. Try again.\n");
                    }
                }
                System.out.println("You walk through the icy hallways of The Freezer, along with your friend Rolli.");
                System.out.println("After walking through countless halls, making this freezer seem endless.");
                System.out.println("You stumble into the final room, with an exit door.");
                System.out.println("However before you can even enter the room.\n");

                enemyPower = 15;
                enemySpeed = 1;
                enemyHealth = 375;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nA snowflake flies around.. Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the SnowGuard!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nThe snowflake has melted.\n");
                        break;
                    }
                    System.out.println("\nIt's snowflakes turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe snowflake hits you with its sharp corner!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe snowflake falls into a pile of ice, healing itself.\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nThe snowflake is flying around.\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting a snowflake.. kinda cold.\n");
                    break;
                }

                System.out.println("\nRolli: Are there more of them??\n");

                enemyPower = 15;
                enemySpeed = 1;
                enemyHealth = 375;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nA snowflake flies around.. Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the SnowGuard!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nThe snowflake has melted.\n");
                        break;
                    }
                    System.out.println("\nIt's snowflakes turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe snowflake hits you with its sharp corner!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe snowflake falls into a pile of ice, healing itself.\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nThe snowflake is flying around.\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting a snowflake.. kinda cold.\n");
                    break;
                }

                System.out.println("\nYou wonder, how many more do you have to fight.");
                System.out.println("Rolli: LOOK ABOVE YOU!!\n");

                enemyPower = 15;
                enemySpeed = 1;
                enemyHealth = 375;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nA snowflake flies around.. Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the SnowGuard!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nThe snowflake has melted.\n");
                        break;
                    }
                    System.out.println("\nIt's snowflakes turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe snowflake hits you with its sharp corner!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe snowflake falls into a pile of ice, healing itself.\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nThe snowflake is flying around.\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting a snowflake.. kinda cold.\n");
                    break;
                }

                System.out.println("\nThat seems to be the last of them.");
                onetime = false;
                oneTimeSnow = false;
                while(true){
                    System.out.println("\nYou finally enter the final room of The Freezer..\n");

                    System.out.println("[1] Check the big box");
                    System.out.println("[2] Search piles of ice");
                    System.out.println("[3] Look inside the closet");
                    System.out.println("[4] Open the computer system");
                    System.out.println("[5] Exit The Freezer");

                    wybor = asystent.nextLine();
                    if(Objects.equals(wybor, "1")){
                        System.out.println("\nYou search the big box, inside you find a smaller locked black metal box.");

                        System.out.println("It requires a code. A 5-digit code to be exact.");

                        haslo = asystent.nextLine();
                        if(haslo.length()==5){
                            if(Objects.equals(haslo, "22751")){
                                System.out.println("Passcode accepted. The box unlocked.");
                                System.out.println("Inside you find a key.\n");
                                freezerExitKey = true;
                            }else {
                                System.out.println("Incorrect passcode.\n");
                            }
                        }else{
                            System.out.println("The passcode must be 5 digits.");
                        }
                    }else if(Objects.equals(wybor, "2")){
                        if(!oneTimeSnow){
                            System.out.println("You search through the snow piles, in this room.");
                            System.out.println("You manage to find a crumbled wet paper inside one.");
                            System.out.println("It has barely visible text, written on it.");
                            System.out.println("You cannot read it fully, but you it seems it says:");
                            System.out.println("/XATR?ER Password: fre3zeR221");
                            System.out.println("You put the note back.");
                            oneTimeSnow = true;
                        }else{
                            System.out.println("You quickly search for the note you found.");
                            System.out.println("You find it again, and read it.");
                            System.out.println("You cannot read it fully, but you it seems it says:");
                            System.out.println("/XATR?ER Password: fre3zeR221");
                            System.out.println("You put the note back to it's place again.");
                        }
                    }else if(Objects.equals(wybor, "3")){
                        System.out.println("\nYou open the closet.");
                        while(true){
                            System.out.println("\nWhat do you do inside it?\n");

                            if(!computerPower){
                                System.out.println("[1] >> Turn on the power box");
                            }else{
                                System.out.println("[1] >> Turn off the power box");
                            }
                            System.out.println("[2] >> Check inside the small box");
                            System.out.println("[3] >> Search the bin");
                            System.out.println("[B] >> Go back");

                            wybor = asystent.nextLine();
                            if(Objects.equals(wybor, "1")){
                                System.out.println("\nYou switch the lever, on the power box.");
                                if(!computerPower){
                                    System.out.println("It turns on the power, going somewhere, to something.\n");
                                    computerPower = true;
                                }else{
                                    System.out.println("It turns off the power, going somewhere, to something.\n");
                                    computerPower = false;
                                }
                            }else if(Objects.equals(wybor, "2")){
                                if(!onetime){
                                    System.out.println("\nYou search the box and you find a couple metal plates, along with some duct tape and wrapping paper.");
                                    System.out.println("You decide to use it as armor.\n");
//                                        health += 25;
                                    onetime = true;
                                }else{
                                    System.out.println("\nYou search the box and you don't find anything else.\n");
                                }
                            }else if(Objects.equals(wybor, "3")){
                                System.out.println("\nYou take a look inside the bin, you find nothing of interest there.");
                                System.out.println("Just some thrown away art supplies.\n");
                            }else if(Objects.equals(wybor, "B")){
                                System.out.println("\nYou go back into the final room.\n");
                                break;
                            }else{
                                System.out.println("\nIncorrect choice. Try again.\n");
                            }

                        }
                    }else if(Objects.equals(wybor, "4")){
                        if(computerPower){
                            System.out.println("\nYou try to access the computer, and it turns on!");
                            System.out.println("However, you must enter a password.");

                            while(true) {
                                System.out.println("\n[O] >> Turn off the computer and walk away\n");
                                System.out.println("Enter the password:");

                                haslo = asystent.nextLine();
                                if (Objects.equals(haslo, "fre3zeR221")) {
                                    System.out.println("\nPassword accepted. Welcome.");
                                    System.out.println("You can see the desktop of this computer, in front of you.\n");
                                    System.out.println("Among many useless or uninteresting files, one catches your attention.");
                                    System.out.println("It's called: passcode.txt");
                                    System.out.println("You open it in notepad.");
                                    System.out.println("There's something written in this file:");
                                    System.out.println("22751");
                                    System.out.println("You close the file. You search the computer for a while.");
                                    System.out.println("You don't find anything more interesting, so you shut it down.\n");
                                    break;
                                } else if(Objects.equals(haslo, "O")){
                                    System.out.println("\nYou turn off the computer and walk away.\n");
                                    break;
                                }else{
                                    System.out.println("\nIncorrect password.\n");
                                }
                            }

                        }else{
                            System.out.println("\nYou try to access the computer, however it seems to not work right now.\n");
                        }
                    }else if(Objects.equals(wybor, "5")){
                        System.out.println("\nYou head to the exit door, in the final room.");
                        System.out.println("It seems to be locked.");
                        if(freezerExitKey){
                            System.out.println("You use the key, you found in the metal box. It fits.");
                            System.out.println("*Click*");
                            System.out.println("The door is now open.");
                            System.out.println("You along with Rolli, exit the freezer.\n");
                            break;
                        }else{
                            System.out.println("You try all the keys, you have currently. However, none of them seem to work.\n");
                        }
                    }else {
                        System.out.println("\nIncorrect choice. Try again.\n");
                    }
                }
                System.out.println("Rolli: Well, good thing we finally exited that freezer.");
                System.out.println("Rolli: It's a miracle we haven't frozen.");
                System.out.println("You and Rolli walk through long corridors, after exiting The Freezer.");
                System.out.println("It was really cold in there, it's way warmer now, but you notice there's snow and icy lying around the hallways.");
                System.out.println("You walk into a hallway with countless holes, both in the ceiling and walls.");
                System.out.println("You both suddenly stop. You hear a weird noise. Not from the room you're in, but rather from one of the holes.");
                System.out.println("There's something coming closer.");
                System.out.println("Rolli: I don't like this.. Prepare for combat!!");
                System.out.println("You both prepare to fight.");
                System.out.println("Suddenly, something small goes out of the hole.\n");
                System.out.println("???: Hello!! My name is Dejolli. I'm an elf and I was trapped in those ruins for hours.");
                System.out.println("Dejolli: I'm so happy I found someone.");
                System.out.println("Rolli: Oh, hi! I'm Rolli, I am a living green ball enchanted, with jolly magic!");
                System.out.println("You greet this elf. You talk for a bit.");
                System.out.println("Rolli: Our goal is to find out what happened to the main core.");
                System.out.println("Dejolli: Oh, alright. I'm gonna join you guys, if you don't mind. Faaar better than walking alone haha!");
                System.out.println("You quickly discuss with Rolli, whether you are going to let him join you.");
                System.out.println("Both of you agree. Dejolli joined your part!");
                System.out.println("You with your comrades continue to walk through the slightly cold corridors.");
                System.out.println("When you enter one hall, you notice something. The floor has gotten slippery.");
                System.out.println("It's getting more slippery the further you go.");
                System.out.println("Halfway through the hallway, you slip and fall down.");
                System.out.println("Dejolli: Hey, are you okay?");
                System.out.println("Dejolli helps you get up. You notice the icy sculptures in the darkness, in the corner.");
                System.out.println("After you get up, you continue through the hall, however one thing slips right in-front of you...\n");

                enemyPower = 25;
                enemySpeed = 3;
                enemyHealth = 1250;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nAn icy sculpture slips in closer to you... Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the SnowGuard!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nThe icy sculpture has melted.\n");
                        break;
                    }
                    System.out.println("\nIt's sculptures turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe snowflake hits you with its sharp corner!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe icy statue makes the area more cold, the cold temperature heals it.\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nThe icy sculpture is staring at you, getting closer with each of your blinks.\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting an icy sculpture.. kinda cold and spooky.\n");
                    break;
                }

                System.out.println("\nRolli: That was spooky.");
                System.out.println("All of you, continue through the corridors. Once you enter the next hallway, you bump into something..\n");

                enemyPower = 25;
                enemySpeed = 3;
                enemyHealth = 1250;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nAn icy sculpture slips in closer to you... Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the SnowGuard!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nThe icy sculpture has melted.\n");
                        break;
                    }
                    System.out.println("\nIt's sculptures turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe snowflake hits you with its sharp corner!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe icy statue makes the area more cold, the cold temperature heals it.\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nThe icy sculpture is staring at you, getting closer with each of your blinks.\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting an icy sculpture.. kinda cold and spooky.\n");
                    break;
                }

                System.out.println("\nDejolli: Another one defeated. There's clearly more of them.. I propose we hurry up.");
                System.out.println("Rolli: Good idea!");
                System.out.println("All of you, try to hurry up, while also be cautious to not slip.");
                System.out.println("Two of those sculptures block the doorway.\n");

                enemyPower = 25;
                enemySpeed = 3;
                enemyHealth = 1500;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nAn icy sculpture slips in closer to you... Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the SnowGuard!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nThe icy sculpture has melted.\n");
                        break;
                    }
                    System.out.println("\nIt's sculptures turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe snowflake hits you with its sharp corner!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe icy statue makes the area more cold, the cold temperature heals it.\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nThe icy sculpture is staring at you, getting closer with each of your blinks.\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting an icy sculpture.. kinda cold and spooky.\n");
                    break;
                }

                System.out.println("\nRolli: Nice job, defeat another one. We will defend the back.");
                System.out.println("Dejolli: YEAH. Come here you sculptures!!\n");

                enemyPower = 25;
                enemySpeed = 2;
                enemyHealth = 1750;
                lastRoundAttack = 0;
                lastRoundSpecial = 0;
                lastRoundHeal = 0;
                lastRoundAttackEnemy = 0;
                lastRoundHealEnemy = 0;
                lastRoundSpecialEnemy = 0;
                round = 0;
                while(true){
                    round += 1;
                    while(true){
                        System.out.println("\nAn icy sculpture slips in closer to you... Round: "+round+".\n");
                        System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                        System.out.println("It's your turn.\n");
                        System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                        System.out.println("  HEAL << [H]       [S] >> SPARE");
                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "A")){
                            if(round>=lastRoundAttack+speed){
                                System.out.println("\nYou hit the SnowGuard!\n");
                                enemyHealth -= power;
                                lastRoundAttack = round;
                                break;
                            }else{
                                System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                            }
                        }else if(Objects.equals(wybor, "X")){
                            if(special){
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 25000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }else{
                                if(round>=lastRoundSpecial+5){
                                    System.out.println("\nYou use your special ability!!\n");
                                    enemyHealth -= 1000;
                                    lastRoundSpecial = round;
                                    break;
                                }else{
                                    System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "H")){
                            if(round>=lastRoundHeal+3){
                                System.out.println("\nYou heal yourself\n");
                                if(health>maxHealth-25){
                                    health = maxHealth;
                                }else{
                                    health += 25;
                                }
                                break;
                            }else{
                                System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                            }
                        }else if(Objects.equals(wybor, "S")){
                            System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                            break;
                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                    }
                    if(enemyHealth<=0){
                        System.out.println("\nThe icy sculpture has melted.\n");
                        break;
                    }
                    System.out.println("\nIt's sculptures turn.\n");
                    while(true){
                        min = 0;
                        max = 10;
                        szansa = (int) (Math.random() * max + min);
                        if(szansa>5){
                            if(round>=lastRoundAttackEnemy+enemySpeed){
                                System.out.println("\nThe snowflake hits you with its sharp corner!\n");
                                health -= enemyPower;
                                lastRoundAttackEnemy = round;
                                break;
                            }
                        }else if(5>=szansa && szansa>2){
                            if(round>=lastRoundHealEnemy+3){
                                System.out.println("\nThe icy statue makes the area more cold, the cold temperature heals it.\n");
                                if(enemyHealth>475){
                                    enemyHealth = 500 ;
                                }else{
                                    enemyHealth += 25;
                                }
                                lastRoundHealEnemy = round;
                                break;
                            }
                        }else{
                            System.out.println("\nThe icy sculpture is staring at you, getting closer with each of your blinks.\n");
                            break;
                        }
                    }
                    if(health<=0){
                        System.out.println("\nGAME OVER\n");
                        death = true;
                        break;
                    }
                }
                if(death){
                    System.out.println("\nYou died while fighting an icy sculpture.. kinda cold and spooky.\n");
                    break;
                }

                System.out.println("\nWith the sculptures defeated, both you exit the hallway.");
                System.out.println("As soon as you can feel the floor not being slippery, you start running as fast as possible.");
                System.out.println("You pass a lot of those ice sculptures on the way.");
                System.out.println("You run into the final room.. wait, the final room??");
                System.out.println("At the end of the final hallway, there's a room, with the only way possibly being blocked off, by the debris.\n");
                System.out.println("The sculptures are getting closer, you feel like you're backed into a corner.");
                System.out.println("With time running out on the clock, you look around the room for any way out.");
                System.out.println("You are ready to exit this room, whatever it takes. You cannot fight the sculptures though, there's too many of them.");
                System.out.println("Their horde extends far beyond your sight.");
                System.out.println("After carefully looking around the room, in your final moments, you find a big brown-colored metal pipe, with a hole all of you could fit through. It extends from the floor, to the ceiling.");
                System.out.println("As soon as you spot that pipe, you signal your team to follow you.\n");
                System.out.println("You quickly make your way, to the pipe.");
                System.out.println("You freeze for a moment, as you realise that, there's a long way down through that pipe.");
                System.out.println("With you being in a hurry, and this being your only chance at escaping, you jump down into the pipe.");
                System.out.println("You can hear and see your comrades jumping down with you. During your fall, you hope. You hope that you will find a way out, and that you will survive all of this.\n");
                System.out.println("At the bottom, you find yourself in a room with several doorways, it was kinda painful, but somehow you and your team survived.");
                System.out.println("Dejolli: Hey, I found this medkit earlier, here, let me heal you.");
                System.out.println("\n<< You've got healed >>\n");
                health = maxHealth;
                System.out.println("Dejolli: I saw this place, in the blueprints! It seems to be a labyrinth. Let's find a way out!\n");
                onetime = false;
                oneTimeSecond = false;
                while(true){
                    System.out.println("THE LABYRINTH : You and your crew are at the start.");
                    System.out.println("||=================     ================||\n" +
                            "||                  [U]                 ||\n" +
                            "||                                      ||\n" +
                            "||                                      ||\n" +
                            "    << [L]                      [R] >>    \n" +
                            "||                                      ||\n" +
                            "||                                      ||\n" +
                            "||                                      ||\n" +
                            "||                                      ||\n" +
                            "||======================================||");

                    wybor = asystent.nextLine();
                    if(Objects.equals(wybor, "L")){
                        while(true){
                            System.out.println("\nTHE LABYRINTH : You enter a room, on the left.");
                            System.out.println("||======================================||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||                               [R] >>   \n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||======================================||");

                            wybor = asystent.nextLine();
                            if(Objects.equals(wybor, "R")){
                                break;
                            }else{
                                System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                            }
                            if(labirynthExit){
                                break;
                            }
                        }
                    }else if(Objects.equals(wybor, "R")){
                        while(true){
                            System.out.println("\nTHE LABYRINTH : You enter a room, on the right.");
                            System.out.println("||=================   ==================||\n" +
                                    "||                 [U]                  ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "   << [L]                               ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||======================================||");
                            wybor = asystent.nextLine();
                            if(Objects.equals(wybor, "L")){
                                break;
                            }else if(Objects.equals(wybor, "U")){
                                while(true){
                                    System.out.println("THE LABYRINTH : You can feel the dust in the air.");
                                    System.out.println("||======================================||\n" +
                                            "||                                      ||\n" +
                                            "||                                      ||\n" +
                                            "||                                      ||\n" +
                                            "||                               [R] >>   \n" +
                                            "||                                      ||\n" +
                                            "||                                      ||\n" +
                                            "||                                      ||\n" +
                                            "||                 [D]                  ||\n" +
                                            "||=================   ==================||");

                                    wybor = asystent.nextLine();
                                    if(Objects.equals(wybor, "D")){
                                        break;
                                    }else if(Objects.equals(wybor, "R")){
                                        while(true){
                                            System.out.println("THE LABYRINTH: It's a dead end..");
                                            System.out.println("||======================================||\n" +
                                                    "||                                      ||\n" +
                                                    "||                                      ||\n" +
                                                    "||                                      ||\n" +
                                                    "   << [L]                               ||\n" +
                                                    "||                                      ||\n" +
                                                    "||                                      ||\n" +
                                                    "||                                      ||\n" +
                                                    "||                                      ||\n" +
                                                    "||======================================||");

                                            wybor = asystent.nextLine();
                                            if(Objects.equals(wybor, "L")){
                                                break;
                                            }else{
                                                System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                                            }
                                        }
                                    }else{
                                        System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                                    }
                                }
                            }else{
                                System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                            }
                        }
                    }else if(Objects.equals(wybor, "U")){
                        while(true){
                            System.out.println("THE LABYRINTH : You enter the room, at the top.");
                            System.out.println("||=================   ==================||\n" +
                                    "||                 [U]                  ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||                                      ||\n" +
                                    "||                 [D]                  ||\n" +
                                    "||=================   ==================||");

                            wybor = asystent.nextLine();
                            if(Objects.equals(wybor, "D")){
                                break;
                            }else if(Objects.equals(wybor, "U")){
                                while(true){
                                    System.out.println("THE LABYRINTH : This basement seem really dusty.");
                                    System.out.println("||======================================||\n" +
                                            "||                                      ||\n" +
                                            "   << [L]                        [R] >>   \n" +
                                            "||                                      ||\n" +
                                            "||                                      ||\n" +
                                            "||                                      ||\n" +
                                            "||                                      ||\n" +
                                            "||                                      ||\n" +
                                            "||                 [D]                  ||\n" +
                                            "||=================   ==================||");

                                    wybor = asystent.nextLine();
                                    if(Objects.equals(wybor, "D")){
                                        break;
                                    } else if(Objects.equals(wybor, "L")) {
                                        System.out.println("THE LABYRINTH : You this room seems warmer, even hot slightly.");
                                        System.out.println("||======================================||\n" +
                                                "||//                                    ||\n" +
                                                "||=\\\\                            [R] >>   \n" +
                                                "|| ||                                   ||\n" +
                                                "|| ||                                   ||\n" +
                                                "|| ||                                   ||\n" +
                                                "|| ||                                   ||\n" +
                                                "||=//                                   ||\n" +
                                                "||//               [D]                  ||\n" +
                                                "||=================   ==================||");

                                        wybor = asystent.nextLine();
                                        if(Objects.equals(wybor, "R")){
                                            break;
                                        }else if(Objects.equals(wybor, "D")){
                                            while(true){
                                                System.out.println("THE LABYRINTH: Look! It's a way out!");
                                                System.out.println("||=================   ==================||\n" +
                                                        "||                 [U]                  ||\n" +
                                                        "||                                      ||\n" +
                                                        "--                                      ||\n" +
                                                        "|    << [X]                             ||\n" +
                                                        "--                                      ||\n" +
                                                        "||                                      ||\n" +
                                                        "||                                      ||\n" +
                                                        "||                 [D]                  ||\n" +
                                                        "||=================   ==================||");
                                                wybor = asystent.nextLine();
                                                if(Objects.equals(wybor, "U")){
                                                    break;
                                                }else if(Objects.equals(wybor, "D")){
                                                    while(true){
                                                        if(!grinchKey){
                                                            if(!shovel){
                                                                System.out.println("THE LABYRINTH : There's a weird X on the floor.");
                                                                System.out.println("||=================   ==================||\n" +
                                                                        "||                 [U]                  ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||    X                                 ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||======================================||");
                                                            }else{
                                                                System.out.println("THE LABYRINTH : Hmm.. Maybe we can dig it up with a shovel.");
                                                                System.out.println("||=================   ==================||\n" +
                                                                        "||                 [U]                  ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||    X  << [S]                         ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||======================================||");
                                                            }
                                                        }else{
                                                            if(!oneTimeSecond){
                                                                oneTimeSecond = true;
                                                                System.out.println("THE LABYRINTH : Hmm.. we dug up this key, it is rusty but has a greenish hue to it.");
                                                                System.out.println("||=================   ==================||\n" +
                                                                        "||                 [U]                  ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||    _                                 ||\n" +
                                                                        "||   (~)                                ||\n" +
                                                                        "||    |_                                ||\n" +
                                                                        "||    |_                                ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||======================================||");
                                                            }else{
                                                                System.out.println("THE LABYRINTH : This is the room where we dug up that key.");
                                                                System.out.println("||=================   ==================||\n" +
                                                                        "||                 [U]                  ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||   ';',                               ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||                                      ||\n" +
                                                                        "||======================================||");
                                                            }
                                                        }
                                                        wybor = asystent.nextLine();
                                                        if(Objects.equals(wybor, "U")){
                                                            break;
                                                        }else if(Objects.equals(wybor, "S")){
                                                            if(!grinchKey){
                                                                if(shovel){
                                                                    grinchKey = true;
                                                                }else{
                                                                    System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                                                                }
                                                            }else{
                                                                System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                                                            }
                                                        }
                                                    }
                                                }else if(Objects.equals(wybor, "X")){
                                                    labirynthExit = true;
                                                }else{
                                                    System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                                                }

                                                if(labirynthExit){
                                                    break;
                                                }
                                            }
                                        }else{
                                            System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                                        }
                                        if(labirynthExit){
                                            break;
                                        }
                                    } else if(Objects.equals(wybor, "R")){
                                        while(true){
                                            if(shovel){
                                                if(!onetime){
                                                    System.out.println("THE LABYRINTH : You pick up the shovel.");
                                                    onetime = true;
                                                }else{
                                                    System.out.println("THE LABYRINTH : This is the room where the shovel was.");
                                                }
                                            }else{
                                                System.out.println("THE LABYRINTH : Hmm? There's a shovel in this room.");
                                            }

                                            if(!shovel){
                                                System.out.println("||======================================||\n" +
                                                        "||                                      ||\n" +
                                                        "   << [L]                               ||\n" +
                                                        "||                                  Ý   ||\n" +
                                                        "||                         [E] >>   |   ||\n" +
                                                        "||                                  À   ||\n" +
                                                        "||                                 |_|  ||\n" +
                                                        "||                                      ||\n" +
                                                        "||                                      ||\n" +
                                                        "||======================================||");
                                            }else{
                                                System.out.println("||======================================||\n" +
                                                        "||                                      ||\n" +
                                                        "   << [L]                               ||\n" +
                                                        "||                                      ||\n" +
                                                        "||                                      ||\n" +
                                                        "||                                      ||\n" +
                                                        "||                                      ||\n" +
                                                        "||                                      ||\n" +
                                                        "||                                      ||\n" +
                                                        "||======================================||");
                                            }
                                            wybor = asystent.nextLine();
                                            if(Objects.equals(wybor, "L")){
                                                break;
                                            }else if(Objects.equals(wybor, "E")){
                                                if(!shovel){
                                                    shovel = true;
                                                }else{
                                                    System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                                                }
                                            }else{
                                                System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                                            }

                                            if(labirynthExit){
                                                break;
                                            }
                                        }
                                    }else{
                                        System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                                    }
                                    if(labirynthExit){
                                        break;
                                    }
                                }
                            }else{
                                System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                            }
                            if(labirynthExit){
                                break;
                            }
                        }
                    }else{
                        System.out.println("Unknown input. Make sure you input a corresponding letter, to the interaction.\n");
                    }
                    if(labirynthExit){
                        break;
                    }

                }
                // Continuatiom
                System.out.println("\nYou make it out of this maze!");
                System.out.println("Dejolli: *cough* this basement was so dusty!");
                System.out.println("Rolli: Hey! Look over here!");
                System.out.println("Rolli stands next to an old elevator he found.");
                System.out.println("Rolli: Let's get out of here.");
                System.out.println("Three of you enter the elevator. It stars up and stops in the middle of it's trip.");
                System.out.println("You all stand there, scared.");
                System.out.println("Eventually, it starts up again.");
                System.out.println("Dejolli: Phew. I was scared we're gonna die.");
                System.out.println("You make it up safely.\n");
                System.out.println("You continue walking through the factory until another door way is blocked off by some trash.");
                System.out.println("All of you decide to look around for a different entry way.");
                System.out.println("Eventually you stumble onto some weird hole. It's a hole in the wall, like most of the holes you encountered, but it's not leading to another room.");
                System.out.println("At least not the room that is accessible normally. You call your friends and you enter.\n");
                System.out.println("It is a really dark room, you see some plans and blueprints of the factory, on the desk.");
                System.out.println("There is a blocked off metal door. You freeze once more. You can hear something or someone.");
                System.out.println("You're done with waiting for something to happen, like before. You decide to confront the noise.");
                System.out.println("It's....");
                System.out.println("Santa..?\n");
                System.out.println("You can see a tied up real Santa Claus. You help him along with your friends.");
                System.out.println("Santa: Ho ho ho. Thanks for rescuing me. Those naughty Grinches have kidnapped me and put me in this hidden room.");
                System.out.println("Santa: No one could find or hear me for a long time. Thankfully you guys have found me!");
                System.out.println("You ask Santa what is this place.");
                System.out.println("Santa: I don't know. However it seems Grinches have transformed it into their hideout. I would warn you that they are plotting something.");
                System.out.println("Santa: But it seems they've already completed their plan. I heard a large explosion. They were planning to destroy this workshop and in doing so, they would destroy the whole Chritmas!!");
                System.out.println("Santa: I mean, what is Christmas without toys, gifts and christmas joy? Ohh it's so sad, they managed to do it.");
                System.out.println("You explain to the Santa how you got there, and that you are ready to help him.\n");
                System.out.println("Santa: Hmm I know this situation seems tough, but I know what we can do!! Ho ho ho!!");
                System.out.println("Santa: There's a factory reset controls, at the back of the main core room. I know it may be a dangerous task, but if you manage to reset the factory systems, it can rebuild itself, and bring the workshop back to life!");
                System.out.println("Santa: It seems those Grinches are up no good. Even though they already destroyed my workshop, I overheard them talking about destroying it even more.");
                System.out.println("Santa: I'm saw where they went and I noticed they have quite the knowledge of many secret passages. I'm going to stop them, hold them off and try to buy you a lot of time.");
                System.out.println("Santa: During that, I need you and your friends to help me reset the factory. Are you up to the task?? Ho ho ho.");
                System.out.println("You and your party agree to Santas plan.\n");
                System.out.println("Santa: Also before I go, it seems I've been regaining my magical jolly powers since you untied me, so I've got gifts for you and your companions!");
                System.out.println("Santa: Here you go, enjoy some christmas spirit!! HO HO HO!!");
                System.out.println("You and your party feel more strong, you've been enchanted with jolly magic and can perform empowered special attacks.");
                special = true;
                System.out.println("Santa: Alright, I'm going to stop those Grinches. Here, go through that hole to exit into the main hallway. From there you should be able to access the main core.");
                System.out.println("While saying that Santa has opened a hole in the wall, with his jolly magic.");
                System.out.println("Santa: Good luck!\n");

                System.out.println("You enter the main hallway. You can see the paths branching out to the main core and the main storage.");
                System.out.println("Dejolli: OH, the main storage!! I heard rumors of powerful weaponry being stored there!");
                System.out.println("Dejolli: We should go there first.");
                System.out.println("Rolli: There's no time!! Haven't you heard?? WE. HAVE. TO. HURRY. UP.");
                System.out.println("Dejolli: You don't understand, who cares about all of this, getting out safely is our top priority.");
                System.out.println("Rolli: Are you kidding me?? You're an elf and out of all of us you want to leave this place to burn??");
                System.out.println("Rolli: That's so dumb, c'mon let's all go to the core for that reset.");
                System.out.println("Dejolli: Are you stupid?? The weapons we get from that storage will help us survive. If we run into the main core, we will just die of all the hazards there.");
                System.out.println("Rolli: What do you mean?!! YOU'RE AN ELF?!! Start acting like one and SAVE YOUR WORKSHOP.");
                System.out.println("Dejolli: Big talk for someone who is just a toy.");
                System.out.println("Rolli: Hey, take that BACK!!");
                System.out.println("Rolli is preparing to attack Dejolli.");
                System.out.println("Dejolli: What're you doing have YOU COMPLETLY WENT INSANE??!!");
                System.out.println("Dejolli barely dodges Rollis attack.");
                System.out.println("Dejolli: PHEW, hey hey hey HEY I have an idea!!!");
                System.out.println("Rolli stops rolling for a moment to listen.");
                System.out.println("Dejolli: What if the person whose main purpose to go in here, was to find out what happened, decides what to do next??");
                System.out.println("Rolli: Hmm.. I guess this is one way to solve the issue..\n");
                while(true){
                    System.out.println("Choose your way.\n");
                    System.out.println("[R] >> Main Core");
                    System.out.println("[D] >> Main Storage");

                    wybor = asystent.nextLine();
                    if(Objects.equals(wybor, "R")){
                        finalWayOut = 1;
                        break;
                    }else if(Objects.equals(wybor, "D")){
                        finalWayOut = 2;
                        break;
                    }else{
                        System.out.println("\nIncorrect choice. Try again.\n");
                    }
                }
                if(finalWayOut==1){
                    // Main Core
                    System.out.println("\nRolli starts bouncing and is joyous that you chose to stay and try to save the factory.");
                    System.out.println("Dejolli rolls his eyes, but chooses to stay with you anyway, even though he is kinda angry for you not sticking with him.\n");
                    System.out.println("You enter the main core. It's looking horrible and dangerous due to the explosion that happened there.");
                    System.out.println("You can see ashes floating in the air, parts of the core that survived the explosion, are falling apart one by one.");
                    System.out.println("You locate the way you must head to reset the factory.");
                    System.out.println("You look at the main core, completly broken, no light inside it like it always had, just ruin.");
                    System.out.println("There are 2 ways to go to the reset controls, in the room behind it.");
                    System.out.println("There's a left doorway and a right one.\n");
                    while(true){
                        System.out.println("Which way do you pick?\n");
                        System.out.println("[L] >> Left way");
                        System.out.println("[R] >> Right way");

                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "L")){
                            System.out.println("\nYou enter the left hallway. At the entrance to the reset control room, stands a giant cybernetic guardian. It notices you.\n");
                            enemyPower = 30;
                            enemySpeed = 5;
                            enemyHealth = 100000;
                            lastRoundAttack = 0;
                            lastRoundSpecial = 0;
                            lastRoundHeal = 0;
                            lastRoundAttackEnemy = 0;
                            lastRoundHealEnemy = 0;
                            lastRoundSpecialEnemy = 0;
                            round = 0;
                            while(true){
                                round += 1;
                                while(true){
                                    System.out.println("\nThe PermaFrostGuardian3000 approaches you... Round: "+round+".\n");
                                    System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                                    System.out.println("It's your turn.\n");
                                    System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                                    System.out.println("  HEAL << [H]       [S] >> SPARE");
                                    wybor = asystent.nextLine();
                                    if(Objects.equals(wybor, "A")){
                                        if(round>=lastRoundAttack+speed){
                                            System.out.println("\nYou hit the SnowGuard!\n");
                                            enemyHealth -= power;
                                            lastRoundAttack = round;
                                            break;
                                        }else{
                                            System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                                        }
                                    }else if(Objects.equals(wybor, "X")){
                                        if(special){
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 25000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }else{
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 1000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }
                                    }else if(Objects.equals(wybor, "H")){
                                        if(round>=lastRoundHeal+3){
                                            System.out.println("\nYou heal yourself\n");
                                            if(health>maxHealth-25){
                                                health = maxHealth;
                                            }else{
                                                health += 25;
                                            }
                                            break;
                                        }else{
                                            System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                                        }
                                    }else if(Objects.equals(wybor, "S")){
                                        System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                                        break;
                                    }else{
                                        System.out.println("\nIncorrect choice. Try again.\n");
                                    }
                                }
                                if(enemyHealth<=0){
                                    System.out.println("\nThe PermaFrostGuardian3000 explodes.\n");
                                    break;
                                }
                                System.out.println("\nIt's PermaFrostGuardian3000's turn.\n");
                                while(true){
                                    min = 0;
                                    max = 10;
                                    szansa = (int) (Math.random() * max + min);
                                    if(szansa>5){
                                        if(round>=lastRoundAttackEnemy+enemySpeed){
                                            System.out.println("\nThe PermaFrostGuardian3000 hits you with its sharp blue neon blade.!\n");
                                            health -= enemyPower;
                                            lastRoundAttackEnemy = round;
                                            break;
                                        }
                                    }else if(5>=szansa && szansa>2){
                                        if(round>=lastRoundHealEnemy+3){
                                            System.out.println("\nThe PermaFrostGuardian3000 heals itself.\n");
                                            if(enemyHealth>475){
                                                enemyHealth = 500 ;
                                            }else{
                                                enemyHealth += 25;
                                            }
                                            lastRoundHealEnemy = round;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nThe PermaFrostGuardian3000 is charging his powerful attack.\n");
                                        break;
                                    }
                                }
                                if(health<=0){
                                    System.out.println("\nGAME OVER\n");
                                    death = true;
                                    break;
                                }
                            }
                            if(death){
                                System.out.println("\nYou died while fighting the PermaFrostGuardian3000.. it was kinda epic.\n");
                                break;
                            }
                            System.out.println("\nDejolli: Good job!! We defeated this beast!");
                            System.out.println("Rolli: Alright, it's time to reset that factory!!\n");
                            break;
                        }else if(Objects.equals(wybor, "R")){
                            System.out.println("\nYou choose the right hallway. As soon as you cross the middle line of the hallway, three smaller guardian robots, enter the hallway from the reset controls room.\n");
                            enemyPower = 30;
                            enemySpeed = 3;
                            enemyHealth = 25000;
                            lastRoundAttack = 0;
                            lastRoundSpecial = 0;
                            lastRoundHeal = 0;
                            lastRoundAttackEnemy = 0;
                            lastRoundHealEnemy = 0;
                            lastRoundSpecialEnemy = 0;
                            round = 0;
                            while(true){
                                round += 1;
                                while(true){
                                    System.out.println("\nThe PermaFrostGuardian3000 approaches you... Round: "+round+".\n");
                                    System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                                    System.out.println("It's your turn.\n");
                                    System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                                    System.out.println("  HEAL << [H]       [S] >> SPARE");
                                    wybor = asystent.nextLine();
                                    if(Objects.equals(wybor, "A")){
                                        if(round>=lastRoundAttack+speed){
                                            System.out.println("\nYou hit the SnowGuard!\n");
                                            enemyHealth -= power;
                                            lastRoundAttack = round;
                                            break;
                                        }else{
                                            System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                                        }
                                    }else if(Objects.equals(wybor, "X")){
                                        if(special){
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 25000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }else{
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 1000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }
                                    }else if(Objects.equals(wybor, "H")){
                                        if(round>=lastRoundHeal+3){
                                            System.out.println("\nYou heal yourself\n");
                                            if(health>maxHealth-25){
                                                health = maxHealth;
                                            }else{
                                                health += 25;
                                            }
                                            break;
                                        }else{
                                            System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                                        }
                                    }else if(Objects.equals(wybor, "S")){
                                        System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                                        break;
                                    }else{
                                        System.out.println("\nIncorrect choice. Try again.\n");
                                    }
                                }
                                if(enemyHealth<=0){
                                    System.out.println("\nThe Mini PermaFrostGuardian3000 explodes.\n");
                                    break;
                                }
                                System.out.println("\nIt's Mini PermaFrostGuardian3000's turn.\n");
                                while(true){
                                    min = 0;
                                    max = 10;
                                    szansa = (int) (Math.random() * max + min);
                                    if(szansa>5){
                                        if(round>=lastRoundAttackEnemy+enemySpeed){
                                            System.out.println("\nThe Mini PermaFrostGuardian3000 hits you with its sharp blue neon blade.!\n");
                                            health -= enemyPower;
                                            lastRoundAttackEnemy = round;
                                            break;
                                        }
                                    }else if(5>=szansa && szansa>2){
                                        if(round>=lastRoundHealEnemy+3){
                                            System.out.println("\nThe Mini PermaFrostGuardian3000 heals itself.\n");
                                            if(enemyHealth>475){
                                                enemyHealth = 500 ;
                                            }else{
                                                enemyHealth += 25;
                                            }
                                            lastRoundHealEnemy = round;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nThe mini PermaFrostGuardian3000 is charging his slightly less powerful attack.\n");
                                        break;
                                    }
                                }
                                if(health<=0){
                                    System.out.println("\nGAME OVER\n");
                                    death = true;
                                    break;
                                }
                            }
                            if(death){
                                System.out.println("\nYou died while fighting the Mini PermaFrostGuardian3000.. it was kinda epic but smaller.\n");
                                break;
                            }
                            System.out.println("\nOne down.\n");
                            enemyPower = 30;
                            enemySpeed = 3;
                            enemyHealth = 25000;
                            lastRoundAttack = 0;
                            lastRoundSpecial = 0;
                            lastRoundHeal = 0;
                            lastRoundAttackEnemy = 0;
                            lastRoundHealEnemy = 0;
                            lastRoundSpecialEnemy = 0;
                            round = 0;
                            while(true){
                                round += 1;
                                while(true){
                                    System.out.println("\nThe PermaFrostGuardian3000 approaches you... Round: "+round+".\n");
                                    System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                                    System.out.println("It's your turn.\n");
                                    System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                                    System.out.println("  HEAL << [H]       [S] >> SPARE");
                                    wybor = asystent.nextLine();
                                    if(Objects.equals(wybor, "A")){
                                        if(round>=lastRoundAttack+speed){
                                            System.out.println("\nYou hit the SnowGuard!\n");
                                            enemyHealth -= power;
                                            lastRoundAttack = round;
                                            break;
                                        }else{
                                            System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                                        }
                                    }else if(Objects.equals(wybor, "X")){
                                        if(special){
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 25000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }else{
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 1000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }
                                    }else if(Objects.equals(wybor, "H")){
                                        if(round>=lastRoundHeal+3){
                                            System.out.println("\nYou heal yourself\n");
                                            if(health>maxHealth-25){
                                                health = maxHealth;
                                            }else{
                                                health += 25;
                                            }
                                            break;
                                        }else{
                                            System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                                        }
                                    }else if(Objects.equals(wybor, "S")){
                                        System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                                        break;
                                    }else{
                                        System.out.println("\nIncorrect choice. Try again.\n");
                                    }
                                }
                                if(enemyHealth<=0){
                                    System.out.println("\nThe Mini PermaFrostGuardian3000 explodes.\n");
                                    break;
                                }
                                System.out.println("\nIt's Mini PermaFrostGuardian3000's turn.\n");
                                while(true){
                                    min = 0;
                                    max = 10;
                                    szansa = (int) (Math.random() * max + min);
                                    if(szansa>5){
                                        if(round>=lastRoundAttackEnemy+enemySpeed){
                                            System.out.println("\nThe Mini PermaFrostGuardian3000 hits you with its sharp blue neon blade.!\n");
                                            health -= enemyPower;
                                            lastRoundAttackEnemy = round;
                                            break;
                                        }
                                    }else if(5>=szansa && szansa>2){
                                        if(round>=lastRoundHealEnemy+3){
                                            System.out.println("\nThe Mini PermaFrostGuardian3000 heals itself.\n");
                                            if(enemyHealth>475){
                                                enemyHealth = 500 ;
                                            }else{
                                                enemyHealth += 25;
                                            }
                                            lastRoundHealEnemy = round;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nThe mini PermaFrostGuardian3000 is charging his slightly less powerful attack.\n");
                                        break;
                                    }
                                }
                                if(health<=0){
                                    System.out.println("\nGAME OVER\n");
                                    death = true;
                                    break;
                                }
                            }
                            if(death){
                                System.out.println("\nYou died while fighting the Mini PermaFrostGuardian3000.. it was kinda epic but smaller.\n");
                                break;
                            }
                            System.out.println("\nDejolli: Me and Rolli will cover the back, as it seems we have gotten more attention, than we needed.\n");
                            enemyPower = 30;
                            enemySpeed = 3;
                            enemyHealth = 25000;
                            lastRoundAttack = 0;
                            lastRoundSpecial = 0;
                            lastRoundHeal = 0;
                            lastRoundAttackEnemy = 0;
                            lastRoundHealEnemy = 0;
                            lastRoundSpecialEnemy = 0;
                            round = 0;
                            while(true){
                                round += 1;
                                while(true){
                                    System.out.println("\nThe PermaFrostGuardian3000 approaches you... Round: "+round+".\n");
                                    System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                                    System.out.println("It's your turn.\n");
                                    System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                                    System.out.println("  HEAL << [H]       [S] >> SPARE");
                                    wybor = asystent.nextLine();
                                    if(Objects.equals(wybor, "A")){
                                        if(round>=lastRoundAttack+speed){
                                            System.out.println("\nYou hit the SnowGuard!\n");
                                            enemyHealth -= power;
                                            lastRoundAttack = round;
                                            break;
                                        }else{
                                            System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                                        }
                                    }else if(Objects.equals(wybor, "X")){
                                        if(special){
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 25000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }else{
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 1000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }
                                    }else if(Objects.equals(wybor, "H")){
                                        if(round>=lastRoundHeal+3){
                                            System.out.println("\nYou heal yourself\n");
                                            if(health>maxHealth-25){
                                                health = maxHealth;
                                            }else{
                                                health += 25;
                                            }
                                            break;
                                        }else{
                                            System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                                        }
                                    }else if(Objects.equals(wybor, "S")){
                                        System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                                        break;
                                    }else{
                                        System.out.println("\nIncorrect choice. Try again.\n");
                                    }
                                }
                                if(enemyHealth<=0){
                                    System.out.println("\nThe Mini PermaFrostGuardian3000 explodes.\n");
                                    break;
                                }
                                System.out.println("\nIt's Mini PermaFrostGuardian3000's turn.\n");
                                while(true){
                                    min = 0;
                                    max = 10;
                                    szansa = (int) (Math.random() * max + min);
                                    if(szansa>5){
                                        if(round>=lastRoundAttackEnemy+enemySpeed){
                                            System.out.println("\nThe Mini PermaFrostGuardian3000 hits you with its sharp blue neon blade.!\n");
                                            health -= enemyPower;
                                            lastRoundAttackEnemy = round;
                                            break;
                                        }
                                    }else if(5>=szansa && szansa>2){
                                        if(round>=lastRoundHealEnemy+3){
                                            System.out.println("\nThe Mini PermaFrostGuardian3000 heals itself.\n");
                                            if(enemyHealth>475){
                                                enemyHealth = 500 ;
                                            }else{
                                                enemyHealth += 25;
                                            }
                                            lastRoundHealEnemy = round;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nThe mini PermaFrostGuardian3000 is charging his slightly less powerful attack.\n");
                                        break;
                                    }
                                }
                                if(health<=0){
                                    System.out.println("\nGAME OVER\n");
                                    death = true;
                                    break;
                                }
                            }
                            if(death){
                                System.out.println("\nYou died while fighting the Mini PermaFrostGuardian3000.. it was kinda epic but smaller.\n");
                                break;
                            }
                            System.out.println("\nThat was the last of them.\n");
                            break;
                        }else{
                            System.out.println("Incorrect path. Choose one of the provided two.");
                        }
                    }
                    System.out.println("\nAll three of you enter the room, however you're greeted to a sight, of cybernetic perma-frost guardians.");
                    System.out.println("There's too many of them. How did they even get here? Who's controlling them?");
                    System.out.println("It must be the Grinches!!\n");
                    System.out.println("Eventually, one of your comrades goes up to them. He throws a portable beacon of light, to get their attention.");
                    System.out.println("They are enraged, they're flying to your friends spot, one prepares to slash but..-");
                    System.out.println("..he dodges. Dejolli grabs the sword he got from one of the fallen guardians and starts attacking them.");
                    System.out.println("Dejolli: RUN TO THE CONSOLE. RESET. THE. FACTORY!!!!!!!");
                    System.out.println("You run to the console, faster than ever. You weren't even running that fast during the encounter with the ice sculptures earlier.\n");
                    System.out.println("You reach the console, press the button to reset.\n");
                    System.out.println("Everything goes dark, lights go out. You can hear weird noises. So much is happening at once.");
                    System.out.println("Suddenly the lights go back up.\n");
                    System.out.println("- FACTORY RECOVERY SYSTEMS ACTIVE -\n");
                    System.out.println("You can see various claws and other machines extending from the reset console. They're ready to repair this place completely.");
                    System.out.println("You look at where your friend, Dejolli was. There he lies. Dead. Sacrificed himself for all of you.");
                    System.out.println("For you, Rolli that he had an argument with earlier, Santa and the factory he wanted to abandon.");
                    System.out.println("He sacrificed himself.\n");
                    System.out.println("You can see Santa flying through the wall using his powerful jolly powers.");
                    System.out.println("Santa: Ho ho ho!! You did it guys!! Oh, what happened to my elf Dejolli?");
                    System.out.println("You explain to him what went down.");
                    System.out.println("Santa: Oh, well that was a very noble sacrifice.\n");
                    System.out.println("You ask him, pleading, whether he can bring back Dejolli.");
                    System.out.println("Santa: Well, I can try, but my powers are weakened since the workshop incident, and I haven't performed such magic in a long time.");
                    System.out.println("He casts a jolly spell on Dejolli's body, some golden sparks come out of Santas hand and hit Dejolly.");
                    System.out.println("Nothing happens. Rolli and Santa start crying. Your friend will be remembered.\n");
                    System.out.println("Suddenly, a glimmer of hope. Dejolli coughs.");
                    System.out.println("All of you stop crying and start looking at Dejolli. He starts moving and opens his eyes.");
                    System.out.println("Dejolli: What happened?\n");
                    System.out.println("You along with others, explain to him what happened and what he did.");
                    System.out.println("Dejolli: Whoa, well great you revived me. Thank you so much.");
                    System.out.println("All of you happily exit the factory, watching as it rebuilds itself.");
                    System.out.println("On the way, Santa explains that he defeated the Grinches and they were planting a giant bomb, underneath the reset control room, underneath you.");
                    System.out.println("All of you exit the factory, safe and alive.\n");
                    System.out.println("THE END");
                    System.out.println("Good Ending.\n");
                }else if(finalWayOut==2){
                    // Main Storage
                    System.out.println("\nDejolli: YES!! See? Told you it's the better option.");
                    System.out.println("Rolli stops fighting with Dejolli.");
                    System.out.println("Rolli: Fine.. but I still think it's extremely stupid.");
                    System.out.println("Rolli says that if you agree with it, he will trust you, whether he likes it or not.\n");
                    System.out.println("You make your way to the main storage, also named the main warehouse.");
                    System.out.println("You can see many boxes and different packages lying around here. You also notice the machines that help organise and control this whole place.");
                    System.out.println("You also see something you don't like. You see many walking toys, most likely ready to fight you on the first sight.\n");
                    System.out.println("Rolli: What are these things?");
                    System.out.println("Dejolli: Oh yeah, I should probably explain. Here we can see many living toys walking around, similar to Rolli.");
                    System.out.println("Dejolli: Here at the workshop, we put christmas enery and jolly magic into our toys to make them extra special.");
                    System.out.println("Dejolli: These toys are the example of this, however I don't understand why they are acting like this.\n");
                    System.out.println("Dejolli: It's not in their nature to patrol the warehouse. However they are stored here, so that kinda explains it.");
                    System.out.println("Dejolli: Also unlike our friend, they don't have consciousness or self-awereness, and they seem to be ready to fight is on sight.");
                    System.out.println("Dejolli: I know this sincce I had an unfortunate run in with them. We should be careful and break them, if they decide to attack us.\n");
                    System.out.println("Rolli: Hey, look there! What's that?");
                    System.out.println("Dejolli: Oooh, it seems to be some-kind of weaponized mecha sleigh, we can use it to get out of here, and maybe even help Santa on the way!");
                    System.out.println("Rolli: Great idea, let's do it!");
                    while(true){
                        System.out.println("You're in the main storage. What do you do?\n");
                        System.out.println("[1] >> Search an open box");
                        System.out.println("[2] >> Use the forklift");
                        System.out.println("[3] >> Go to the sideroom");
                        System.out.println("[4] >> Use the organizer claw");
                        System.out.println("[5] >> Check out Mecha-Sleigh");
                        System.out.println("[6] >> Go to the backroom");
                        System.out.println("[7] >> Search the outer balcony");

                        wybor = asystent.nextLine();
                        if(Objects.equals(wybor, "1")){
                            System.out.println("You search an open box.");
                            if(!engine){
                                System.out.println("Inside this big box, you can find an useful component for the sleigh.");
                                System.out.println("It's an engine.");
                                engine = true;
                            }else{
                                System.out.println("You find nothing interesting or useful inside.");
                            }
                        }else if(Objects.equals(wybor, "2")){
                            if(!forkliftPower){
                                System.out.println("\nYou try to use the forklift, however it seems to have no power.");
                                System.out.println("It would be really useful, you can see a pile of stacked boxes, blocking the way to the other part of the warehouse.\n");
                            }else{
                                System.out.println("\nYou climb into the forklift, and turn it on. It works!");
                                System.out.println("You use to ram into a large pile of stacked boxes, breaking them and clearing a way, to the previously inaccessible part of the warehouse.");
                                System.out.println("You crashed into the wall, it turns out there's more boxes here so you cannot go to the other part of the warehouse, on the bright side you cleared a path to an inaccessible box.");
                                System.out.println("You open it and among useless things, you manage to find an access keycard to something.\n");
                            }
                        }else if(Objects.equals(wybor, "3")){
                            System.out.println("\nYou walk into the sideroom.\n");
                            while(true){
                                System.out.println("You're in the sideroom.\n");
                                System.out.println("[1] >> Search boxes");
                                if(forkliftPower){
                                    System.out.println("[2] >> Turn off the generator");
                                }else{
                                    System.out.println("[2] >> Turn on the generator");
                                }
                                if(!fuel){
                                    System.out.println("[3] >> Grab fuel tanks");
                                }
                                System.out.println("[B] >> Go back to the main room");
                                wybor = asystent.nextLine();
                                if(Objects.equals(wybor, "1")){
                                    System.out.println("\nYou search the boxes in the sideroom. You find nothing interesting but one sticky note.");
                                    System.out.println("It says: 5722");
                                    if(!controlSystem){
                                        System.out.println("Oh also with the corner of your eye, you notice a control system. You take it.\n");
                                        controlSystem = true;
                                    }else{
                                        System.out.println("You walk away.\n");
                                    }
                                }else if(Objects.equals(wybor, "2")){
                                    if(forkliftPower){
                                        System.out.println("\nYou turn off the generator.\n");
                                        forkliftPower = false;
                                    }else{
                                        System.out.println("\nYou turn on the generator.\n");
                                        forkliftPower = true;
                                    }
                                }else if(Objects.equals(wybor, "3")){
                                    if(!fuel){
                                        System.out.println("You and your crew grab the fuel tanks.");
                                        fuel = true;
                                    }else{
                                        System.out.println("Incorrect choice. Try again.");
                                    }
                                }else if(Objects.equals(wybor, "B")){
                                    System.out.println("\nYou go back to the main room.\n");
                                    break;
                                }else{
                                    System.out.println("Incorrect choice. Try again.");
                                }
                            }
                        }else if(Objects.equals(wybor, "4")){
                            if(clawPower){
                                if(clawKey){
                                    System.out.println("\nYou are able to control the claw organizer.");
                                    if(!jets){
                                        System.out.println("You use it to bring the jets for Mecha-Sleigh down, from the top shelf.\n");
                                        jets = true;
                                    }else{
                                        System.out.println("But you don't find anything to do with it.\n");
                                    }
                                }else{
                                    System.out.println("\nIt seems you need some kind of key, to control the claw.\n");
                                }
                            }else{
                                System.out.println("\nYou try to use the organizer claw, however it looks like it doesn't have power.\n");
                            }
                        }else if(Objects.equals(wybor, "5")){
                            System.out.println("\nYou go to the Mega-Sleigh, but you're spotted by one of the toys.");
                            enemyPower = 20;
                            enemySpeed = 2;
                            enemyHealth = 50000;
                            lastRoundAttack = 0;
                            lastRoundSpecial = 0;
                            lastRoundHeal = 0;
                            lastRoundAttackEnemy = 0;
                            lastRoundHealEnemy = 0;
                            lastRoundSpecialEnemy = 0;
                            round = 0;
                            while(true){
                                round += 1;
                                while(true){
                                    System.out.println("\nThe toy is ready to fight! Round: "+round+".\n");
                                    System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                                    System.out.println("It's your turn.\n");
                                    System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                                    System.out.println("  HEAL << [H]       [S] >> SPARE");
                                    wybor = asystent.nextLine();
                                    if(Objects.equals(wybor, "A")){
                                        if(round>=lastRoundAttack+speed){
                                            System.out.println("\nYou hit the enemy!\n");
                                            enemyHealth -= power;
                                            lastRoundAttack = round;
                                            break;
                                        }else{
                                            System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                                        }
                                    }else if(Objects.equals(wybor, "X")){
                                        if(special){
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 25000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }else{
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 1000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }
                                    }else if(Objects.equals(wybor, "H")){
                                        if(round>=lastRoundHeal+3){
                                            System.out.println("\nYou heal yourself\n");
                                            if(health>maxHealth-25){
                                                health = maxHealth;
                                            }else{
                                                health += 25;
                                            }
                                            break;
                                        }else{
                                            System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                                        }
                                    }else if(Objects.equals(wybor, "S")){
                                        System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                                        break;
                                    }else{
                                        System.out.println("\nIncorrect choice. Try again.\n");
                                    }
                                }
                                if(enemyHealth<=0){
                                    System.out.println("\nEnemy defeated.\n");
                                    break;
                                }
                                System.out.println("\nIt's the toy's turn.\n");
                                while(true){
                                    min = 0;
                                    max = 10;
                                    szansa = (int) (Math.random() * max + min);
                                    if(szansa>5){
                                        if(round>=lastRoundAttackEnemy+enemySpeed){
                                            System.out.println("\nThe enemy attacks you!\n");
                                            health -= enemyPower;
                                            lastRoundAttackEnemy = round;
                                            break;
                                        }
                                    }else if(5>=szansa && szansa>2){
                                        if(round>=lastRoundHealEnemy+3){
                                            System.out.println("\nThe toy heals itself!\n");
                                            if(enemyHealth>475){
                                                enemyHealth = 500 ;
                                            }else{
                                                enemyHealth += 25;
                                            }
                                            lastRoundHealEnemy = round;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nIt's resting while planning an attack..\n");
                                        break;
                                    }
                                }
                                if(health<=0){
                                    System.out.println("\nGAME OVER\n");
                                    death = true;
                                    break;
                                }
                            }
                            if(death){
                                System.out.println("\nYou died while fighting a  toy.. I mean it is alive so..\n");
                                break;
                            }
                            System.out.println("You defeat the toy, and approach the Mega-Sleigh.");
                            while(true){
                                System.out.println("What do you do with the Mega-Sleigh?\n");
                                if(!fuelAdded){
                                    System.out.println("[F] >> Add fuel");
                                }
                                if(!engineAdded){
                                    System.out.println("[E] >> Add an engine");
                                }
                                if(!jetsAdded){
                                    System.out.println("[J] >> Add jets");
                                }
                                if(!accessKeyAdded){
                                    System.out.println("[A] >> Add access key");
                                }
                                if(!controlSystemAdded){
                                    System.out.println("[C] >> Add control system");
                                }
                                if(fuelAdded){
                                    if(engineAdded){
                                        if(jetsAdded){
                                            if(accessKeyAdded){
                                                if (controlSystemAdded) {
                                                    System.out.println("[V] >> Launch the Mecha-Sleigh");
                                                }
                                            }
                                        }
                                    }
                                }
                                System.out.println("[X] >> Walk away from the Mecha-Sleigh");
                                wybor = asystent.nextLine();
                                if(Objects.equals(wybor, "F")){
                                    if(!fuelAdded){
                                        if(fuel){
                                            System.out.println("You add fuel to the Mecha-Sleigh.");
                                            fuelAdded = true;
                                        }else{
                                            System.out.println("You have no fuel to add.");
                                        }
                                    }
                                }else if(Objects.equals(wybor, "E")){
                                    if(!engineAdded){
                                        if(engine){
                                            System.out.println("You add an engine to the Mecha-Sleigh.");
                                            engineAdded = true;
                                        }else{
                                            System.out.println("You have no engine to add.");
                                        }
                                    }
                                }else if(Objects.equals(wybor, "J")){
                                    if(!jetsAdded){
                                        if(jets){
                                            System.out.println("You add the jets to the Mecha-Sleigh.");
                                            jetsAdded = true;
                                        }else{
                                            System.out.println("You have no jets to add.");
                                        }
                                    }
                                }else if(Objects.equals(wybor, "A")){
                                    if(!accessKeyAdded){
                                        if(accessKey){
                                            System.out.println("You add the access key to the Mecha-Sleigh.");
                                            accessKeyAdded = true;
                                        }else{
                                            System.out.println("You have no access key to add.");
                                        }
                                    }
                                }else if(Objects.equals(wybor, "C")){
                                    if(!controlSystemAdded){
                                        if(controlSystem){
                                            System.out.println("You add control system to the Mecha-Sleigh.");
                                            controlSystemAdded = true;
                                        }else{
                                            System.out.println("You have no control system to add.");
                                        }
                                    }
                                }else if(Objects.equals(wybor, "V")){
                                    if(fuelAdded){
                                        if(engineAdded){
                                            if(jetsAdded){
                                                if(accessKeyAdded){
                                                    if(controlSystemAdded){
                                                        System.out.println("\nYou start preparing the Mecha-Sleigh for takeoff, however you're interrupted by the toys.");
                                                        System.out.println("They start attacking you, there's too much of them, eventually you can hear a loud bang coming from the warehouse.");
                                                        System.out.println("The toys turn around and start charging at the place the sound came from. You can see a silhouette.");
                                                        System.out.println("It's Rolli. He starts rolling, bouncing at jumping at those toys, destroying them. Eventually he bumps into a ton of boxes.");
                                                        System.out.println("In a chain reaction a ton of stuff in the warehouse starts falling down and destroyes every toy, including the one that sacrificed himself for his friends.\n");
                                                        System.out.println("You and Dejolli start crying. You can hear some stuff falling in the warehouse, but nothing matters right now.");
                                                        System.out.println("You friend will be remembered.");
                                                        System.out.println("Suddenly, a mysterious glowing elixir falls out of one of the boxes. The glass break, pouring elixir on liveless Rolli.");
                                                        System.out.println("He starts moving. You and Dejolli cannot belive what you're witnessing but he's moving.");
                                                        System.out.println("Rolli: Hi guys, it looks like that magic made me alive again. It's good I run purely on jolly magic.\n");
                                                        System.out.println("All of you happily jump into the Mecha-Sleigh.");
                                                        System.out.println("You start the systems. Start the engines.");
                                                        System.out.println("- READY FOR LAUNCH CAPTAIN -");
                                                        System.out.println("And you fly away!!");
                                                        flyingAway = true;
                                                        break;
                                                    }else{
                                                        System.out.println("\nIncorrect choice? Are you forgetting something?\n");
                                                    }
                                                }else{
                                                    System.out.println("\nIncorrect choice? Are you forgetting something?\n");
                                                }
                                            }else{
                                                System.out.println("\nIncorrect choice? Are you forgetting something?\n");
                                            }
                                        }else{
                                            System.out.println("\nIncorrect choice? Are you forgetting something?\n");
                                        }
                                    }else{
                                        System.out.println("\nIncorrect choice? Are you forgetting something?\n");
                                    }
                                }else{
                                    System.out.println("Incorrect choice. Try again.");
                                }
                            }


                        }else if(Objects.equals(wybor, "6")){
                            System.out.println("\nYou enter the backroom.\n");
                            while(true){
                                System.out.println("What do you want to do in the backroom?\n");
                                System.out.println("[1] >> Read the storage info board");
                                System.out.println("[2] >> Use the electrical box");
                                if(gatePower){
                                    if(!clawPower){
                                        System.out.println("[3] >> Turn on the generator");
                                    }else{
                                        System.out.println("[3] >> Turn off the generator");
                                    }

                                }else{
                                    System.out.println("[LOCKED] >> The gate is locked");
                                }
                                wybor = asystent.nextLine();
                                if(Objects.equals(wybor, "1")){
                                    System.out.println("\nYou read the main storage info board. There's nothng interesting written there.");
                                    System.out.println("Just where the supplies are stored and something about boxes in the sideroom.\n");
                                }else if(Objects.equals(wybor, "2")){
                                    if(!gatePower){
                                        System.out.println("\nYou try to use the electrical box to enable the power, however it requires a code to be put in.\n");
                                        while(true){
                                            System.out.println("[C] >> Close the box");
                                            System.out.println("Input the code:");
                                            haslo = asystent.nextLine();
                                            if(Objects.equals(haslo, "5722")){
                                                System.out.println("\nCode accepted. The power has been turned on.");
                                                System.out.println("The electrical box auto-closing procedure started.");
                                                System.out.println("The electrical box has locked itself.\n");
                                                gatePower = true;
                                                break;
                                            }else if(Objects.equals(haslo, "C")){
                                                System.out.println("\nYou close the box and walk away.\n");
                                                break;
                                            }else{
                                                System.out.println("\nIncorrect choice.. How about you try again?\n");
                                            }
                                        }
                                    }else{
                                        System.out.println("\nThe electrical box has blocked itself.\n");
                                    }

                                }else if(Objects.equals(wybor, "3")){
                                    if(!clawPower){
                                        if(gatePower){
                                            System.out.println("\nThanks to the electrical box powering it, the gate is open.");
                                            System.out.println("You turn on the generator that was hiding behind the gate.\n");
                                            clawPower = true;
                                        }else{
                                            System.out.println("\nIncorrect choice? Or is it?\n");
                                        }
                                    }else{
                                        System.out.println("\nThanks to the electrical box powering it, the gate is open.");
                                        System.out.println("You turn off the generator that was hiding behind the gate.\n");
                                        clawPower = false;
                                    }
                                }else if(Objects.equals(wybor, "B")){
                                    System.out.println("You go back to the main room");
                                    break;
                                }else{
                                    System.out.println("\nIncorrect choice. Try again.\n");
                                }
                            }
                        }else if(Objects.equals(wybor, "7")){
                            System.out.println("\nYou try to go to the outer balcony but you're cut off by one of the toys.\n");
                            enemyPower = 20;
                            enemySpeed = 2;
                            enemyHealth = 50000;
                            lastRoundAttack = 0;
                            lastRoundSpecial = 0;
                            lastRoundHeal = 0;
                            lastRoundAttackEnemy = 0;
                            lastRoundHealEnemy = 0;
                            lastRoundSpecialEnemy = 0;
                            round = 0;
                            while(true){
                                round += 1;
                                while(true){
                                    System.out.println("\nThe toy is ready to fight! Round: "+round+".\n");
                                    System.out.println("Enemy Health: "+enemyHealth+"     Health: "+health);
                                    System.out.println("It's your turn.\n");
                                    System.out.println("ATTACK << [A]       [X] >> SPECIAL");
                                    System.out.println("  HEAL << [H]       [S] >> SPARE");
                                    wybor = asystent.nextLine();
                                    if(Objects.equals(wybor, "A")){
                                        if(round>=lastRoundAttack+speed){
                                            System.out.println("\nYou hit the enemy!\n");
                                            enemyHealth -= power;
                                            lastRoundAttack = round;
                                            break;
                                        }else{
                                            System.out.println("\nYou cannot attack yet. It has a cooldown of "+speed+" rounds since last attack.\n");
                                        }
                                    }else if(Objects.equals(wybor, "X")){
                                        if(special){
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 25000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }else{
                                            if(round>=lastRoundSpecial+5){
                                                System.out.println("\nYou use your special ability!!\n");
                                                enemyHealth -= 1000;
                                                lastRoundSpecial = round;
                                                break;
                                            }else{
                                                System.out.println("\nThis ability is on cooldown. It has a recharge time of 5 rounds.\n");
                                            }
                                        }
                                    }else if(Objects.equals(wybor, "H")){
                                        if(round>=lastRoundHeal+3){
                                            System.out.println("\nYou heal yourself\n");
                                            if(health>maxHealth-25){
                                                health = maxHealth;
                                            }else{
                                                health += 25;
                                            }
                                            break;
                                        }else{
                                            System.out.println("\nThis ability is on cooldown. You may heal yourself 3 rounds, after the last healing action.\n");
                                        }
                                    }else if(Objects.equals(wybor, "S")){
                                        System.out.println("\nYou stand and nothing. You rest for a bit.\n");
                                        break;
                                    }else{
                                        System.out.println("\nIncorrect choice. Try again.\n");
                                    }
                                }
                                if(enemyHealth<=0){
                                    System.out.println("\nEnemy defeated.\n");
                                    break;
                                }
                                System.out.println("\nIt's the toy's turn.\n");
                                while(true){
                                    min = 0;
                                    max = 10;
                                    szansa = (int) (Math.random() * max + min);
                                    if(szansa>5){
                                        if(round>=lastRoundAttackEnemy+enemySpeed){
                                            System.out.println("\nThe enemy attacks you!\n");
                                            health -= enemyPower;
                                            lastRoundAttackEnemy = round;
                                            break;
                                        }
                                    }else if(5>=szansa && szansa>2){
                                        if(round>=lastRoundHealEnemy+3){
                                            System.out.println("\nThe toy heals itself!\n");
                                            if(enemyHealth>475){
                                                enemyHealth = 500 ;
                                            }else{
                                                enemyHealth += 25;
                                            }
                                            lastRoundHealEnemy = round;
                                            break;
                                        }
                                    }else{
                                        System.out.println("\nIt's resting while planning an attack..\n");
                                        break;
                                    }
                                }
                                if(health<=0){
                                    System.out.println("\nGAME OVER\n");
                                    death = true;
                                    break;
                                }
                            }
                            if(death){
                                System.out.println("\nYou died while fighting a  toy.. I mean it is alive so..\n");
                                break;
                            }
                            if(!clawKey){
                                System.out.println("\nYou defeat the toy and enter the outer balcony. You search it and manage to find somekind of key.\n");
                                clawKey = true;
                            }else{
                                System.out.println("\nYou defeat the toy and enter the outer balcony. You search it but you find nothing interesting.\n");
                            }

                        }else{
                            System.out.println("\nIncorrect choice. Try again.\n");
                        }
                        if(flyingAway){
                            break;
                        }
                    }
                    System.out.println("\nYou fly away from the launching pads, from the main warehouse.");
                    System.out.println("Rolli takes a look at the radar, he sees Santas location.");
                    System.out.println("Rolli: Are you friends ready to save christmas?!");
                    System.out.println("You all agree.\n");
                    System.out.println("You start flying at full power, into the wall. The Mecha-Sleigh didn't break, it's the wall that broke.");
                    System.out.println("You fly into a cave underneath the factory, only to see Santa and the Grinches fighting.");
                    System.out.println("He looks shocked to see.");
                    System.out.println("Dejolli: Hey Santa, look at this.");
                    System.out.println("The Mecha-Sleigh starts shooting at the Grinches. The Grinches try to fight back, but can't.");
                    System.out.println("Santa take this moment, while they're distracted to disarm and disappear their bomb.\n");
                    System.out.println("You manage to take down the Grinches, and leave with Santa safely.");
                    System.out.println("The Christmas is saved.\n");
                    System.out.println("THE END");
                    System.out.println("Mecha-Sleigh Ending.");
                }
            }
            break;
        }

    }
}