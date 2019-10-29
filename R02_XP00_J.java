//rule 02
//Expressions (XP) example 00
//noncompliant solution


public void deleteFile(){

	File someFile = new File ("someFileName.txt");
	//Do something with someFile
	someFile.delete();
}