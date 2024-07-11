package xAdvanceJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileHandling {

    public static void main(String[] args)  {

        // creating a File
        /*  File myFile = new File("FileHandling.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create new file");
            throw new RuntimeException(e);
        }
         */

        //  Write a File
/*
        try {
            FileWriter fileWriter = new FileWriter("FileHandling.txt");
            fileWriter.write("Oracle JDK 14 is the **fourteenth** release of the **Java Development Kit (JDK)**. It's a development environment for building applications using the **Java programming language**. The JDK includes tools that are useful for developing and testing programs written in Java, which can run on the **Java platform**. If you're interested in downloading older versions of the JDK for building and testing Java applications, you can find them on the [Oracle Java Archive page](https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html). Keep in mind that there have been **license changes** and security updates for Oracle JDK releases, so be sure to review the terms before downloading and using it¹. If you'd like to learn more about the new features and enhancements in JDK 14, you can check out the [JDK 14 Release Notes](https://www.oracle.com/java/technologies/javase/14-relnotes.html) for details³. \uD83D\uDE0A\n" +
                    "\n" +
                    "Source: Conversation with Copilot, 11/7/2024\n" +
                    "(1) Java Archive Downloads - Java SE 14 - Oracle. https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html.\n" +
                    "(2) JDK 14 Release Notes - Oracle. https://www.oracle.com/java/technologies/javase/14-relnotes.html.\n" +
                    "(3) La llegada de Java 14 - Oracle Blogs. https://blogs.oracle.com/oracle-latinoamerica/post/la-llegada-de-java-14.");
                fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

 */

        // Read a File
 /*       File myFile = new File("FileHandling.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

  */

        // Delete s File
        File myFile = new File("FileHandling.txt");
        if(myFile.delete()){
            System.out.println(myFile.getName()+" File deleted");
        }


    }
}
