//rule 02
//Expressions (XP) example 00
//compliant solution


public void deleteFile(){
 
  	File someFile = new File("someFileName.txt");
  	// Do something with someFile
  	if (!someFile.delete()) {
    		// Handle failure to delete the file
  	}
 }
