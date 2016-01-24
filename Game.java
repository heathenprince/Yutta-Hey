import java.io.*;
import java.util.*;
import physics.*;

public class Game {

    //Instance Vars
    private Jedi luke = new Jedi(); //character
    
    //change these constants to choose which topics to focus on
    public final static int kinQs = 2; // Kinematics
    public final static int motQs = 2; // Motion
    public final static int proQs = 2; // Projectiles
    public final static int forQs = 2; // Force
    public final static int momQs = 2; // Momentum
    public final static int eneQs = 2; // Energy
    public final static int cirQs = 2; // Circular

    private boolean gameOver; // hp at 0? answer all questions?
    private double userAns; // holds user answer

    private InputStreamReader isr;
    private BufferedReader in;

    public Game() {
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
    }

    //====================================================

    public void newGame() {
	String prt = "";
	String name = "";
	//==============INTRODUCTION=====================
	prt = "\n";
	System.out.print( prt );

	pause(1000);

	prt = "\t\tA long time ago in a galaxy far,\n\t\tfar away...\n\n";
	System.out.print( prt );

	pause(2000);

	prt =
	    "\t        ________________.  ___     .______  \n" +
	    "\t       /                | /   \\    |   _  \\ \n" +
	    "\t      |   (-----|  |----`/  ^  \\   |  |_)  | \n" +
	    "\t       \\   \\    |  |    /  /_\\  \\  |      / \n" +
	    "\t  .-----)   |   |  |   /  _____  \\ |  |\\  \\-------. \n" +
	    "\t  |________/    |__|  /__/     \\__\\| _| `.________| \n" +
	    "\t   ____    __    ____  ___     .______    ________. \n" +
	    "\t   \\   \\  /  \\  /   / /   \\    |   _  \\  /        | \n" +
	    "\t    \\   \\/    \\/   / /  ^  \\   |  |_)  ||   (-----` \n" +
	    "\t     \\            / /  /_\\  \\  |      /  \\   \\ \n" +
	    "\t      \\    /\\    / /  _____  \\ |  |\\  \\---)   | \n" +
	    "\t       \\__/  \\__/ /__/     \\__\\|__| `._______/ \n\n" ;

	System.out.print( prt );
	pause(1000);
	prt =
	    "                            EPISODE IV\n\n" + 
	    "                            A NEW HOPE" +
	    "\n\n";
	System.out.print(prt);
	pause(2000);
	prt = 
	    "\t\t    It is a period of civil war.\n" +
	    "\t\t     Rebel spaceships, striking\n" +
	    "\t\t    from a hidden base, have won\n" +
	    "\t\t    their first victory against\n" +
	    "\t\t     the evil Galactic Empire.\n"+
	    "\n\n";
	System.out.print(prt);
	pause(5000);
	prt =
	    "\t\t      During the battle, Rebel\n" +
	    "\t\t    spies managed to steal secret\n" +
	    "\t\t        plans to the Empire's\n" +
	    "\t\t     ultimate weapon, the DEATH\n" +
	    "\t\t       STAR, an armored space\n" +
	    "\t\t      station with enough power\n" +
	    "\t\t     to destroy an entire planet." +
	    "\n\n";
	System.out.print(prt);
	pause(5000);
	prt = 
	    "\t\t       Pursued by the Empire's\n" +
	    "\t\t      sinister agents, Princess\n" +
	    "\t\t      Leia races home aboard her\n" +
	    "\t\t      starship, custodian of the\n" +
	    "\t\t    stolen plans that can save her\n" +
	    "\t\t         people and restore\n" +
	    "\t\t      freedom to the galaxy...." +
	    "\n\n";
	System.out.print(prt);
	pause(5000);
	
	System.out.println("Greetings, young one! What do you call yourself?");
	name();
	System.out.println("Welcome, " + luke.getName() +".");
	//================END OF INTRO================
    }//end of newGame()
    //====================================================

    //pause(int time) pauses program for time milliseconds
    public static void pause(int time) {
	try {
	    Thread.sleep(time);//time in milliseconds
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
    }//end of pause()

    //getAnswer() gets the inputed answer to question
    public void getUserAnswer() {
	try {
	    userAns = Double.parseDouble( in.readLine() );
	}
	catch (IOException e) {}
    }//end of getUserAnswer

    //getName() gets name of user for Jedi
    
    public void name() {
	try {
	    luke.setName( in.readLine() );
	}
	catch (IOException e) {}
    }//end of name()

    public void kinSec() { //calls Kinematics questions
	while(kinQs > 0) {
	    Kinematics q = new Kinematics();
	}
    }//enf of kinSec

    public static void main(String[] args) {
	Game game = new Game();
	game.newGame();
    }//end of main

}//end of Driver
