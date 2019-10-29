//rule 04
//Characters and Strings (STR) example 03
//compliant solution


BigInteger x = new BigInteger("530500452766");
String s = x.toString();  // Valid character data
byte[] byteArray = s.getBytes();
String ns = new String(byteArray); 
x = new BigInteger(ns); 
