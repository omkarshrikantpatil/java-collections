import java.lang.ref.WeakReference;

public class Main {
    public static void main(String[] args) {
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("MI", "RedmiNote 11"));
        System.out.println(phoneWeakReference.get());
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Exception occured while sleeping: " + e);
        }
        //Now it will go to garbage collection
        System.gc();
        System.out.println(phoneWeakReference.get());
    }
}

class Phone{

    String brand;

    String model;

    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}