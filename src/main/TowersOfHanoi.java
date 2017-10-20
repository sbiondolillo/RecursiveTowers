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
	private List<Integer> pegA = new ArrayList<Integer>();
	private List<Integer> pegB = new ArrayList<Integer>();
	private List<Integer> pegC = new ArrayList<Integer>();
	
	/*
	 * Moves a stack of disks from one peg to another. If the disk is not on top of the stack, 
	 * call moveStack() recursively until we find a disk that can be moved legally
	 * @param disk - an integer representing the disk to be moved
	 * @param source - the peg where the disk is currently sitting
	 * @param destination - the peg where we want to move the disk
	 * @param spare - the peg we can use to shuffle things around to follow the basic rules of the puzzle
	 */
	private static void moveStack(int disk, List<Integer> source, List<Integer> destination, List<Integer> spare) {
		//TODO - implement this
	}
	
	/*
	 * Handles the movement of individual disks
	 * @param disk - the disk to be moved, must be on top of a stack
	 * @param source - the peg where the disk is currently sitting
	 * @param destination - the peg where we want to move the disk
	 */
	private static void moveDisk(int disk, List<Integer> source, List<Integer> destination) {
		//TODO - implement this
	}

	
	public static void main(String[] args) {
		//TODO - implement solution
	}
}
