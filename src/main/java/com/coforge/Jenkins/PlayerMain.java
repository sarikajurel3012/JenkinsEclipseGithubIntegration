package com.coforge.Jenkins;

public class PlayerMain {
	public static void main(String[] args){
		Player sachin = new Player(10, "Sachin Tendular", "Maharashtra");
		System.out.println(sachin.getJerseyNo()+" : "+sachin.getPlayerName()+" : " +sachin.getState());
	}

}
