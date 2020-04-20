package com.clarusone.poker;

public class Card implements Comparable{

	   private int value;

	   private String suit;



	   //Input:  Assumes v from 1 to 13 and

	   //s = "Hearts", "Clubs", "Diamonds", or "Spades".

	   //Creates new card object.



	   public Card(int v, String s)

	   {

	      value = v;

	      suit = s;

	   }

	   

	   //Input: none

	   //Output:  value of card (1-13, inclusive)



	   public int getValue()

	   {

	      return value;

	   }



	   //Input: none

	   //Output:  suit of card



	   public String getSuit()

	   {

	      return suit;

	   }



	   public int compareTo(Object otherCard){

	      int thisValue = ((Card)this).getValue();

	      int otherValue = ((Card)otherCard).getValue();

	      return (thisValue - otherValue);     

	   }



	   public String toString()

	   {

	      if(value == 13)

	         return "A" + suit;

	      if(value == 12)

	         return "K" + suit;

	      if(value == 11)

	         return "Q" + suit;

	      if(value == 10)

	         return "J" + suit;

	      

	      return (value + 1) + suit;

	   }   

	}