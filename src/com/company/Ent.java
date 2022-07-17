package com.company;

public class Ent { //the program will have multiple "Chains"
    String data = "";
    Ent child; //the child's index is distinct from its parent's
    Ent parent;
    Ent previous;
    Ent next; //if the child is the one below the Ent, this is the cousin
    int index = 0;
    int depth = 0;


    public void setNext() {
        next = new Ent();
        next.data = "";
        next.previous = this;
        next.index = this.index+1;
        next.parent = this;
        next.depth = this.depth;
    }

    public void setChild(){
        child = new Ent();
        child.data = "";
        child.index = 0;
        child.depth = this.depth+1;
        child.parent = this;
    }

    Ent goToIndex(int i) { //returns the Ent at the i-th index. It's not strictly neccessary for this project, but I thought it would be logical to have since this is based on lists.
        Ent auxiliary = this;
        while (i != auxiliary.index){
            if (i > auxiliary.index){
                auxiliary = this.next;
            }
            else{
                auxiliary = this.previous;
            }
        }
        return auxiliary;
    }



}
