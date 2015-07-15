package edu.mum.cs.ds.atm.model;

import java.io.Serializable;

public class Payment implements Serializable {

	Account account;
	ATMMachine machine;
	NotesParser notesParser;
	
}
