package com.cg.persist;

public class ClientMain {

	public static void main(String[] args) {
		FilePersistant fp = new FilePersistant();
		fp.persist();
		DatabasePersistant dp = new DatabasePersistant();
		dp.persist();

	}



	}


