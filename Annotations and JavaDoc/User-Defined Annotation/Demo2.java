package annodemo1;

import java.lang.annotation.*;

/*This Annotation is used to get the data like class, source and etc*/
//@Retention(RetentionPolicy.Class)

/*This Annotation is uded to create the JavaDoc*/
//@Documented

/*This Annotation is define that where to use whether LOCAL_VARIABLE, CLASS and etc*/
//@Target(value=ElementType.LOCAL_VARIABLE,ElementType.METHOD)

/*This Annotation can be Used Repeatable*/
//Repeatable(MyAnno.class)
@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
            }

//@MyAnno(name="Ajay",project="Bank")
public class Demo2
{
    int data;
    //@MyAnno(name="Ajay",project="Bank")
    
    
    //@MyAnno(name="Ajay")
    public static void main(String[] args) 
    {
        //@MyAnno(name="Ajay")
        int x;
    }
    
}
