//rule 13
//Input Output (FIO) example 02
//compliant solution


File file = new File("file");
if (!file.delete()) {
  System.out.println("Deletion failed");
}
