//scoping means where we can access our variables

public class Scope {
    public static void main(String[] args) {
        int a=20;
        int b=10;
       random(a, a, b);
       random(a, a, b);
       {
           a=78;// already initializled outsise the vblick in the same  method , hense you can't initialized it again
           System.out.println(a);
        int c=99;
        System.out.println(c);
        System.out.println(a+""+c);
        //values initialized in this block , will remian in this block
       }
       // >> System.out.println(c); // yo u can't use 'c' variable here becz it wasn't initialized outside of this block so it will throw a error
    }
    static void random(int marks,int total,int ezz){
        ezz=56;
        marks=2;
        total=ezz+marks;
        System.out.println(total);
        /*System.out.println(a);
        >>you can't access 'a' here because a wasn't decalres here so we gotta declare a
         in this position first. It is called function scope . you can only access those which you have defined here .
        you can't initialize same variable in block scope it will give error*/
        //one thing is initialzing and another is updating . first you  declare than intialize then you can update for
        //furtur purposes 
    }
}
