package edu.mum.cs.ds.atm.model;

import java.io.Serializable;

import edu.mum.cs.ds.atm.ATMMachine;

public class Payment implements Serializable {

	Account account;
	ATMMachine machine;
	NotesParser notesParser;
	
}
