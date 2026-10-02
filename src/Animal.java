public class Animal {
    public void makeSound(){
        System.out.println("helloworld");
    }

    public static void  main(String[] args){
        Animal override= new Dog();
        Animal override1=new Cat();
        Animal override2=new Rabbit();
        Animal override3=new Cow();

        override.makeSound();
        override1.makeSound();
        override2.makeSound();
        override3.makeSound();

        Animal[] arr={override,override1,override2,override3};

        for (Animal x: arr){
            x.makeSound();
        }
    }
}

