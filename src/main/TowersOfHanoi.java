/*
 * TowersOfHanoi Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To implement a recursive solution to the classic Towers of Hanoi puzzle
 * Version  0.0.1   10/20/17
 */

package main;

import java.util.ArrayList;
import java.util.List;

public class TowersOfHanoi {
	
	// Use lists of integers to represent the pegs on which the disks are placed
	private static List<Integer> pegA = new ArrayList<Integer>();
	private static List<Integer> pegB = new ArrayList<Integer>();
	private static List<Integer> pegC = new ArrayList<Integer>();
	
	/*
	 * Moves a stack of disks from one peg to another. If the disk is not on top of the stack, 
	 * call moveStack() recursively until we find a disk that can be moved legally
	 * @param disk - an integer representing the disk to be moved
	 * @param source - the peg where the disk is currently sitting
	 * @param destination - the peg where we want to move the disk
	 * @param spare - the peg we can use to shuffle things around to follow the basic rules of the puzzle
	 */
	private static void moveStack(int disk, List<Integer> source, List<Integer> destination, List<Integer> spare) {
		// if we are moving the smallest disk, just move it directly
		if (disk == 1)
			moveDisk(disk, source, destination);
		else {
			// Move the disks above the current disk to the spare peg, using the final destination peg as the spare
			moveStack(disk-1, source, spare, destination);
			// Once the disks above have been moved to the spare peg, move the target disk to the final destination peg
			moveDisk(disk, source, destination);
			// Now, we just need to move the remaining disks from the spare peg to the final destination peg
			// use the original source peg as the spare for this step
			moveStack(disk-1, spare, destination, source);
		}
	}
	
	/*
	 * Handles the movement of individual disks
	 * @param disk - the disk to be moved, must be on top of a stack - must be in source List
	 * @param source - the peg where the disk is currently sitting
	 * @param destination - the peg where we want to move the disk
	 */
	private static void moveDisk(int disk, List<Integer> source, List<Integer> destination) {
		// remove the disk from the source peg
		source.remove(Integer.valueOf(disk));
		
		// add it to the top of the destination peg
		destination.add(disk);
		
		// print out the stacks to show progress
		printStacks();
	}
	
	/*
	 * Initialize the starting peg with a stack of 5 disks
	 */
	private static void buildStack() {
		pegA.add(5);
		pegA.add(4);
		pegA.add(3);
		pegA.add(2);
		pegA.add(1);
	}
	
	/*
	 * Display the current location of the disks in a readable format
	 */
	private static void printStacks() {
		System.out.println("Orginal Peg: " + pegA);
		System.out.println("Destination Peg: " + pegB);
		System.out.println("Spare Peg: " + pegC);
	}

	/*
	 * Main
	 * Introduces the program and then runs the simulated solution
	 */
	public static void main(String[] args) {
		// Inroduce the program
		System.out.println("This program will simulate the solution to the Towers of Hanoi puzzle for a starting stack of 5 disks.");
		System.out.println("The progress will be displayed after each move so you can follow along.");
		moveStack(5,pegA,pegB,pegC);
	}
}
