import java.io.IOException;
import java.util.*;

public class FirstActivity {

public static void main(String[] args) throws  IOException {
Student obj=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("***************************************************************************** \n ***********************************WELCOME LOCKME************************* ");


String expressionOne=" ^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*$";
String expressionTwo="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
               
int flag=0;
while(flag!=1) {
System.out.println("Enter the username :");
String username=sc.next();
System.out.println("Enter the password : ");
String password=sc.next();


if((username.matches(expressionOne))&& (password.matches(expressionTwo))){
flag=1;
}
else {
System.out.println("Invalid");
}
}


System.out.println("Validating........");
System.out.println("Ente youy choices");
char ch;
do {
System.out.println("1.Add \n 2.Delete 3.Ascending order \n 4.search  \n 5.exit");
int choice=sc.nextInt();

switch(choice) {
case 1:
System.out.println("Adding the file..");
obj.add();
break;
case 2:
System.out.println("Deleting the file..");
obj.Delelte();
break;
case 3:
System.out.println("Ascending order of the files in directory..");
obj.sort();
break;
case 4:
System.out.println("Searching the file..");
obj.search();
break;
case 5:
System.exit(0);
}

ch=sc.next().charAt(0);
}while(ch=='Y'|ch=='y');




}

}





student:



import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.*;

public class Student {
private String filename1;
private String filename;
public void Delelte() {
try {
File f=new File("E:\\project1.txt");

if(f.delete())
{
System.out.println("deleted");
}
else {
System.out.println("Not deleted");
}
}catch(Exception ex) {
ex.printStackTrace();


}
//System.out.println("1.Ascending order \n 2.Add  \n 3.Delete  4.Search ");
}
public void add() throws IOException {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

File file=new File("E:\\project1.txt");
//File file=new File(filename);
//System.out.println("Enter the file with path");
//System.out.println(file.getName());
boolean status;
if(file.exists()) {
System.out.println("File exists");
}
else
{
status=file.createNewFile();
System.out.println((status==true)?"File created":"File Not Created ");
}
//System.out.println("1.Ascending order \n 2.Add  \n 3.Delete  4.Search ");
}
public void search()
{
//File files=new File("E:\\project1.txt");
//String filenames1[]=files.list();
//for(String filename1:filenames1) {
//System.out.println(filename1);

//}
//if(files.exists()) {
//System.out.println("exists");
//System.out.println(files.getName());

//}
//else {
//System.out.println("no file exists");

File file1=new File("E:\\project1.txt");
//File file1=new File(filename);
//System.out.println("Enter the file with path");
System.out.println(file1.getName());
//boolean status;
if(file1.exists()) {
System.out.println("File exists");
}
else
{

System.out.println("No file exists");
}
//System.out.println("1.Ascending order \n 2.Add  \n 3.Delete  4.Search ");
}

public void sort() {
File dir = new File("E:\\sts-bundle\\New folder");

     File[] files = dir.listFiles();

     Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

     for (File file : files) {
        if (!file.isHidden()) {
           if (file.isDirectory()) {
              System.out.println("DIR \t" + file.getName());
           } else {
              System.out.println("FILE\t" + file.getName());
           }
        }
     }
   
}
}





