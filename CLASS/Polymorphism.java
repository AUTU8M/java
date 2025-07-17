class animal{
    void animalsound(){
        System.out.println("the animal makes a sound");
    } 
}

class pig extends animal{
    @Override
    void animalsound(){
        System.out.println("pig makes sound: wee wee");
    }
}
class dog extends animal{
    @Override
    void animalsound(){
        System.out.println("the dog says : bow bow");
    }
}

public class Polymorphism{
    public static void main(String[] args){
        animal myanimal= new animal();
        animal mypig= new animal();
        animal mydog= new animal();
        myanimal.animalsound();
        mypig.animalsound();
        mydog.animalsound();
    }
}
//not properly explained here we'll look into that later
