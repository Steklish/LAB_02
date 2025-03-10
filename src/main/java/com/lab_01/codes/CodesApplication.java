package com.lab_01.codes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodesApplication.class, args);
	}
}


// !		GONNA BE IMPLEMENTING THIS STRUCTURE


// +------------+	  +------------------+			+--------+
// |Languages   |     |Translations      |      	|Users	 |
// +------------+     +------------------+          +--------+
// |LanguageID  |---->|TranslationID     |<-------->|UserID  |
// |LanguageName|     |Text              |          |UserName|
// +------------+     |OrifinalLanguageID|          +--------+
//                    |DesiredLanguageID |			   ^
// 					  +------------------+			   |
//	                        ^                          |
//	                        |                          |
//	              +----------------------------------------+
//	              |UserTranslations                        |
//	              |+---------------------------------------|
//	              |UserID                                  |
//	              |TranslationID                           |
//	              +----------------------------------------+
//


// !			THIS IS DATABASE TEMPLATE

//  -- Create the Languages table
// CREATE TABLE Languages (
//     LanguageID INT PRIMARY KEY,
//     LanguageName VARCHAR(100) NOT NULL
// );

// -- Create the Users table
// CREATE TABLE Users (
//     UserID INT PRIMARY KEY,
//     UserName VARCHAR(100) NOT NULL
// );

// -- Create the Translations table with original and destination languages
// CREATE TABLE Translations (
//     TranslationID INT PRIMARY KEY,
//     Text TEXT NOT NULL,
//     OriginalLanguageID INT,
//     DesiredLanguageID INT,
//     FOREIGN KEY (OriginalLanguageID) REFERENCES Languages(LanguageID),
//     FOREIGN KEY (DesiredLanguageID) REFERENCES Languages(LanguageID)
// );

// -- Create the UserTranslations join table for the many-to-many relationship
// CREATE TABLE UserTranslations (
//     UserID INT,
//     TranslationID INT,
//     PRIMARY KEY (UserID, TranslationID),
//     FOREIGN KEY (UserID) REFERENCES Users(UserID),
//     FOREIGN KEY (TranslationID) REFERENCES Translations(TranslationID)
// );