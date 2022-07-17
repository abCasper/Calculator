package com.company;
//The idea here is to create sub-problems that involve no parentheses.



public class Main {

    public static void main(String[] args) {
        displayEnt("8*(20+2)1-(3+(5-(1+1-)2*(3)/4))2+3");

    }

    static float eval(String string) { //evaluates with no parentheses
        return 0; // <-- temporary
    }

    static void displayEnt(String string) {
        Ent auxiliary = new Ent();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (character == '('){
                System.out.println("Depth: + " + auxiliary.depth + " Index: " + auxiliary.index + " Data: " + auxiliary.data);
                auxiliary.setNext();
                auxiliary = auxiliary.next;
                auxiliary.setChild();
                auxiliary = auxiliary.child;
            }
            else if (character == ')') {
                System.out.println("Depth: + " + auxiliary.depth + " Index: " + auxiliary.index + " Data: " + auxiliary.data);
                auxiliary = auxiliary.parent;
                auxiliary.setNext();
                auxiliary = auxiliary.next;
            }
            else {
                auxiliary.data += character;
            }
        }
        System.out.println("Depth: + " + auxiliary.depth + " Index: " + auxiliary.index + " Data: " + auxiliary.data);
        }
    }

