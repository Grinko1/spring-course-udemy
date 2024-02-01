package ru.course.spring.aop.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.course.spring.aop.Book;

@Component
@Aspect
@Order(10)
public class  LoggingAspect {



    @Before("MyPointcuts.allAddMethods()")
    public void BeforeAddMethodAdvice(JoinPoint joinPoint){
//
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println("methodSignature: "+ methodSignature);
//        System.out.println("methodSignature method: "+ methodSignature.getMethod());
//        System.out.println("methodSignature return type: "+ methodSignature.getReturnType());
//        System.out.println("methodSignature name: "+ methodSignature.getName());
        System.out.println("Logging getting methods");
//        System.out.println("********params*******");
//        if(methodSignature.getName().equals("addBook")){
//             Object[] arguments= joinPoint.getArgs();
//             for (Object obj : arguments){
//                 if(obj instanceof Book){
//                     Book book = (Book) obj;
//                     System.out.println("Book info: name - "+ book.getName() + ", author - " + book.getAuthor()+", publication - " + book.getYearOfPublication());
//                 } else if (obj instanceof String) {
//                     System.out.println("add student: "+ obj);
//
//                 }
//
//             }
//        }else{
//            System.out.println("No params");
//        }
//        System.out.println("********end params*******");
        System.out.println("----------------------------------");
    }

@AfterReturning("MyPointcuts.allAddMethods()")
    public void afterReturningAddMethod(){
    System.out.println("^^^^^^^^ completed successfully ^^^^^^^^");
    System.out.println("----------------------------------");
}



//    @Pointcut("execution(* *(..))")
//    private void allLibraryMethods(){}
//
//    @Pointcut("execution( * getBook() )")
//    private void getBook(){}
//    @Pointcut("execution(* getMagazine())")
//    private void getMagazine(){}
//
//    @Pointcut("execution( * return*() )")
//    private void returnMethods(){}
//
//    @Pointcut("execution( * add*() )")
//    private void addMethods(){}
//
//    @Before("getBook() || returnMethods() || addMethods()")
//    public void beforeAllMethodsLibraryAdvice(){
//        System.out.println("before 1 way ");
//    }
//    @Before("allLibraryMethods() && !getMagazine()")
//    public void beforeGetAllExceptGetMagazineAdvice(){
//        System.out.println("before 2 way");
//    }





//    @Pointcut("execution(* ru.course.spring.aop.LibraryUniver.get*())")
//    private void beforeGetAllAdvice(){}
//
//    @Pointcut("execution(* ru.course.spring.aop.LibraryUniver.add*())")
//    private void beforeAddAllAdvice(){}
//
//    @Before("beforeGetAllAdvice()")
//    public void beforeGetAllMethodsLibraryAdvice(){
//        System.out.println(" before get in library: log #1");
//    }
//    @Before("beforeAddAllAdvice()")
//    public void beforeAddAllMethodsLibraryAdvice(){
//        System.out.println(" before add in library: log #2 ");
//    }
//    @Pointcut("beforeGetAllAdvice() || beforeAddAllAdvice()")
//    private void getOrAddMethodsLibrary(){}
//
//    @Before("getOrAddMethodsLibrary()")
//    public void BeforeGetOrAddMethodInlibraryAdvice(){
//        System.out.println("before get ar add method: log #3");
//    }

//    @Pointcut("execution(* get*(..))")
//    private void allGetMethods(){}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("before Get Book/magazine Advice");
//    }
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("before Get Security Advice");
//    }
//    @Before("execution(public void ru.course.spring.aop.LibraryUniver.getBook(ru.course.spring.aop.Book))")
//    public void beforeGetBookAdvice(){
//        System.out.println("before Get Book Advice: try to get book");
//    }
//    @Before("execution(public void getMagazine(..))")
//    public void beforeGetMagazineAdvice(){
//        System.out.println("before Get Magazine Advice");
//    }
//    @Before("execution(public void get*())")
//    public void beforeGetAllAdvice(){
//        System.out.println("before Get All Advice: try to get all");
//    }
//    @Before("execution( * returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("before Return Book");
//    }
//    @Before("execution(* *(..))")
//    public void beforeAllMethodsAdvice(){
//        System.out.println("before All Methods Advice");
//    }

}
