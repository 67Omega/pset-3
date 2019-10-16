/**
 * Problem Set 3.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {
    
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();
        
        // comment out or uncomment as needed
        
        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10
        
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */
    
    public void sign() {
System.out.print("\nEnter an integer: ");
    int signNumber = in.nextInt();
    System.out.println();
    if (signNumber > 0) {
      System.out.println("Positive.\n");
    } else if (signNumber < 0) {
      System.out.println("Negative.\n");
    } else {
      System.out.println("Zero.\n");
    }
    
    /*
     * Exercise 2.
     * 
     * Prompt the user to enter an integer. Is it even or odd?
     */
    
    public void parity() {
System.out.print("Enter an integer: ");
    int evoNumber = in.nextInt();
    System.out.println();
    if (evoNumber % 2 == 0) {
      System.out.println("Even.\n");
    } else {
      System.out.println("Odd.\n");
    }
    
    /*
     * Exercise 3.
     * 
     * Prompt the user to enter three integers. How are the integers ordered?
     */
    
    public void ordered() {
System.out.println("Enter three integers. \n");
    System.out.print("Enter first integer: ");
    int orderNumberOne = in.nextInt();
    System.out.print("Enter second integer: ");
    int orderNumberTwo = in.nextInt();
    System.out.print("Enter third integer: ");
    int orderNumberThree = in.nextInt();
    System.out.println();
    if (orderNumberOne < orderNumberTwo) {
      if (orderNumberTwo < orderNumberThree) {
        System.out.println("Strictly increasing.\n");
      } else if (orderNumberTwo == orderNumberThree) {
        System.out.println("Increasing.\n");
      } else {
        System.out.println("Unordered.\n");
      }
      
    } else if (orderNumberOne == orderNumberTwo) {
      if (orderNumberTwo == orderNumberThree) {
        System.out.println("Same.\n");
      } else if (orderNumberTwo < orderNumberThree) {
        System.out.println("Increasing.\n");
      } else {
        System.out.println("Decreasing.\n");
      }
    } else {
      if (orderNumberTwo > orderNumberThree) {
        System.out.println("Strictly decreasing.\n");
      } else if (orderNumberTwo == orderNumberThree) {
        System.out.println("Decreasing.\n");
      } else {
        System.out.println("Unordered.\n");
      }
    }
    }
    
    /*
     * Exercise 4.
     * 
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */
    
    public void gpa() {
System.out.print("Enter a letter grade: ");
    String letterGrade = in.next();
    String uppercaseLetterGrade = letterGrade.toUpperCase();
    char gradeMark;
    int gradeLength = uppercaseLetterGrade.length();
    char gradeLetter = uppercaseLetterGrade.charAt(0);
    String newGradeLetter = Character.toString(gradeLetter);
    if (gradeLength == 2) {
      gradeMark = uppercaseLetterGrade.charAt(1);
    } else {
      gradeMark = 0;
    }
    String newGradeMark = Character.toString(gradeMark);
    double aScore = 4.00; 
    double bScore = 3.00;
    double cScore = 2.00;
    double dScore = 1.00;
    double fScore = 0.00;
    double plusScore = 0.33;
    double minusScore = (-0.33);
    double letterScore = 0;
    double signScore = 0;
    boolean scoreValid = true;
    System.out.println();
    if (newGradeLetter.equals("A")) {
      letterScore = aScore;
    } else if (newGradeLetter.equals("B")) {
      letterScore = bScore;
    } else if (newGradeLetter.equals("C")) {
      letterScore = cScore;
    } else if (newGradeLetter.equals("D")) {
      letterScore = dScore;
    } else if (newGradeLetter.equals("F")) {
      letterScore = fScore;
    } else {
      scoreValid = false;
    }
    if (newGradeMark.equals("+")) {
      signScore = plusScore;
    } else if (newGradeMark.equals("-")) {
      signScore = minusScore;
    } else if (newGradeMark.equals("")){
      signScore = 0;
    } else {
      scoreValid = false;
    }
    if (newGradeLetter.equals("A")) {
      signScore = 0;
    }
    if ((newGradeLetter.equals("F"))&&!(newGradeMark.isEmpty())) {
      scoreValid = false;
    }
    if (uppercaseLetterGrade.equals("F")) {
      scoreValid = true;
    }
    if (scoreValid == false) {
      System.out.println("That's not a valid letter grade.\n");
    } else if (scoreValid == true) {
      double gpa = letterScore + signScore;
      System.out.printf("Your GPA is %.2f.\n", gpa);
    }	
    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */
    
    public void grade() {
System.out.print("Enter a grade: ");
    double numberGrade = in.nextDouble();
    boolean gradeValidity = true;
    String letterGrade;
    String article;
    System.out.println();
    if (numberGrade > 100) {
    System.out.println("Grades above 100 are invalid.\n");
  } else if (numberGrade < 0) {
    System.out.println("Grades below 0 are invalid.\n");
  } else {
    if (numberGrade >= 90){
      letterGrade = "A";
      article = "an";
    } else if (numberGrade >= 80){
      letterGrade = "B";
      article = "a";
    } else if (numberGrade >= 70){
      letterGrade = "C";
      article = "a";
    } else if (numberGrade >= 60){
      letterGrade = "D";
      article = "a";
    } else {
      letterGrade = "F";
      article = "an";
    }
    System.out.println("You received " + article + " " + letterGrade + ".\n");
  }
    }
    
    /*
     * Exercise 6.
     * 
     * Prompt the user to enter a playing card. What card was entered?
     */
    
    public void cards() {
System.out.print("Enter a card: ");
    String cardLetters = in.next();
    String capCardLetters = cardLetters.toUpperCase();
    boolean suitValidity = true;
    boolean rankValidity = true;
    char cardRankLetter = capCardLetters.charAt(0);
    String rankLetter = Character.toString(cardRankLetter);
    char cardSuitLetter = capCardLetters.charAt(1);
    String suitLetter = Character.toString(cardSuitLetter);
    String cardRank;
    String cardSuit;
    System.out.println();
    switch (rankLetter) {
      case "2":
        cardRank = "Two";
        break;
      case "3":
        cardRank = "Three";
        break;
      case "4":
        cardRank = "Four";
        break;
      case "5":
        cardRank = "Five";
        break;
      case "6":
        cardRank = "Six";
        break;
      case "7":
        cardRank = "Seven";
        break;
      case "8":
        cardRank = "Eight";
        break;
      case "9":
        cardRank = "Nine";
        break;
      case "T":
        cardRank = "Ten";
        break;
      case "J":
        cardRank = "Jack";
        break;
      case "Q":
        cardRank = "Jack";
        break;
      case "K":
        cardRank = "King";
        break;
      case "A":
        cardRank = "Ace";
        //hey that's me i'm ace
        break;
      default:
        rankValidity = false;
        cardRank = null;
        break;
    }
    switch (suitLetter) {
      case "C":
        cardSuit = "Clubs";
        break;
      case "D":
        cardSuit = "Diamonds";
        break;
      case "S":
        cardSuit = "Spades";
        break;
      case "H":
        cardSuit = "Hearts";
        break;
      default:
        suitValidity = false;
        cardSuit = null;
        break;
    }
    if ((suitValidity = true) && (rankValidity = true)) {
      System.out.println(cardRank + " of " + cardSuit + ".\n");
    } else if (suitValidity = false) {
      System.out.println("That's not a valid suit.\n");
    } else if (rankValidity = false) {
      System.out.println("That's not a valid rank.\n");
    }
    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a year. Is it a leap year or not?
     */
    
    public void leapYear() {
System.out.print("Enter a year: ");
    int yearToTest = in.nextInt();
    boolean isLeapYear = false;
    boolean fourTest = (yearToTest % 4 == 0);
    boolean hundredTest = (yearToTest % 100 == 0);
    boolean fourHundredTest = (yearToTest % 400 == 0);
    System.out.println();
    if (fourTest = true) {
      if ((hundredTest == true) && (fourHundredTest == true)) {
        isLeapYear = true;
      } else if (hundredTest == true) {
        isLeapYear = false;
      } else {
        isLeapYear = true;
      }
    } else {
      isLeapYear = false;
    }
    if (isLeapYear == true) {
      System.out.println(yearToTest + " is a leap year.\n");
    } else {
      System.out.println(yearToTest + " is not a leap year.\n");
    }
    }
    
    /*
     * Exercise 8.
     * 
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */
    
    public void state() {
System.out.print("Enter a temperature: ");
    int waterTemp = in.nextInt();
    String waterState;
    System.out.print("Enter a scale: ");
    String tempScale = in.next();
    String temperatureScale = tempScale.toUpperCase();
    boolean isValidScale = true;
    System.out.println();
    if (temperatureScale.equals("F")) {
      if (waterTemp <= 32) {
        waterState = "Solid.\n";
      } else if ((waterTemp > 32) && (waterTemp < 212)) {
        waterState = "Liquid.\n";
      } else {
        waterState = "Gas.\n";
      }
    } else if (temperatureScale.equals("C")) {
      if (waterTemp <= 0) {
        waterState = "Solid.\n";
      } else if ((waterTemp > 0) && (waterTemp < 100)) {
        waterState = "Liquid.\n";
      } else {
        waterState = "Gas.\n";
      }
    } else {
      isValidScale = false;
      waterState = null;
    }
    if (isValidScale == true) {
      System.out.println(waterState);
    } else {
      System.out.println("That's not a valid scale.\n");
    }
    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter a month. How many days are in that month?
     */
    
    public void months() {        
System.out.print("Enter a month: ");
    String monthInput = in.next();
    String monthToTest = monthInput.toUpperCase();
    String numberOfDays;
    String monthToThree = monthToTest.substring(0, 3);
    System.out.println();
    switch (monthToThree) {
      case "JAN":
        numberOfDays = "31";
        break;
      case "FEB":
        numberOfDays = "28 or 29";
        break;
      case "MAR":
        numberOfDays = "31";
        break;
      case "APR":
        numberOfDays = "30";
        break;
      case "MAY":
        numberOfDays = "31";
        break;
      case "JUN":
        numberOfDays = "30";
        break;
      case "JUL":
        numberOfDays = "31";
        break;
      case "AUG":
        numberOfDays = "31";
        break;
      case "SEP":
        numberOfDays = "30";
        break;
      case "OCT":
        numberOfDays = "31";
        break;
      case "NOV":
        numberOfDays = "30";
        break;
      case "DEC":
        numberOfDays = "31";
        break;
      default:
        numberOfDays = "invalid";
        break;
    }
    if (numberOfDays == "invalid") {
      System.out.println("That's not a valid month.\n");
    } else {
      System.out.println(numberOfDays + " days.\n");
    }
    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */
    
    public void salary() {
System.out.print("Wage: ");
    double hourlyWage = in.nextDouble();
    System.out.print("Hours: ");
    double hoursWorked = in.nextDouble();
    System.out.println();
    double overtimePay;
    double normalPay;
    double finalPay;
    double overtimeRate = 1.5;
    double hoursOvertime = hoursWorked - 40;
    if (hoursWorked >= 40) {
      overtimePay = hoursOvertime * (hourlyWage * overtimeRate);
      normalPay = (hoursWorked - hoursOvertime) * hourlyWage;
      finalPay = normalPay + overtimePay;
    } else {
      overtimePay = 0;
      normalPay = hoursWorked * hourlyWage;
      finalPay = normalPay;
    }
    if (hourlyWage < 0) {
      System.out.println("Your wage must be greater than or equal to $0.00 per hour.\n");
    } else if (hoursWorked < 0) {
      System.out.println("Your hours must be greater than or equal to 0.0.\n");
    } else {
      System.out.printf("You'll make $%,.2f this week.\n\n", finalPay);
    }
    }
}