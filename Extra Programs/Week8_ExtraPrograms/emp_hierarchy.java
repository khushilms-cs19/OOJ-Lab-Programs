import java.util.Scanner;


class person
{
    Scanner ss=new Scanner(System.in);
    String name;
}

class employee extends person
{
    int years_of_exp;
}

class teaching extends employee
{
    String Dept;

    teaching()
    {
        System.out.printf("Enter the details of the teacher: ");
        System.out.printf("\nName: ");
        name=ss.next();
        System.out.printf("Years of Experience: ");
        years_of_exp=ss.nextInt();
        System.out.printf("Department: ");
        Dept=ss.next();
    }

    public String toString()
    {
        return ("Details of teacher\nName:"+name+"\nYears of Experience: "+years_of_exp+"\nDepartment: "+Dept);
    }
}

class non_teaching extends employee
{
    int building_no;

    non_teaching()
    {
        System.out.printf("Enter the details of the non teaching staff: ");
        System.out.printf("\nName: ");
        name=ss.next();
        System.out.printf("Years of Experience: ");
        years_of_exp=ss.nextInt();
        System.out.printf("Building Number: ");
        building_no=ss.nextInt();
    }

    public String toString()
    {
        return ("Details of non teaching staff: \nName:"+name+"\nYears of Experience: "+years_of_exp+"\nBuilding Number: "+building_no);
    }
}


class student extends person
{
    String Dept;
}    

class ug extends student
{
    int semester;
    ug()
    {
        System.out.printf("Enter the details of the UG student: ");
        System.out.printf("\nName: ");
        name=ss.next();
        System.out.printf("Department: ");
        Dept=ss.next();
        System.out.printf("Semester: ");
        semester=ss.nextInt();
    }
    public String toString()
    {
        return ("Details of UG Student: \nName:"+name+"\nDepartment : "+Dept+"\nSemester: "+semester);
    }
}

class pg extends student 
{
    int semester;
    pg()
    {
        System.out.printf("Enter the details of the PG student: ");
        System.out.printf("\nName: ");
        name=ss.next();
        System.out.printf("Department: ");
        Dept=ss.next();
        System.out.printf("Semester: ");
        semester=ss.nextInt();
    }
    public String toString()
    {
        return ("Details of PG Student: \nName:"+name+"\nDepartment : "+Dept+"\nSemester: "+semester);
    }
}

class EmpMain
{
    public static void main(String args[])
    {
        teaching th=new teaching();
        non_teaching nth=new non_teaching();
        ug st_ug=new ug();
        pg st_pg=new pg(); 
        System.out.println(th);
        System.out.println(nth);
        System.out.println(st_ug);
        System.out.println(st_pg);

    }
}
