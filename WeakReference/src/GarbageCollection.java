import java.lang.ref.WeakReference;

public class GarbageCollection {
    public static void main(String[] args){

        //This is strong reference
//        MyPhone phone = new MyPhone("Redmi", "Xiaomi");
//        System.out.println(phone);
//        phone = null;
        //After this line JVM will think the reference is gone, So I will destroy the memory corresponding to it so that memory will be available
//        System.out.println(phone);

        //Here will see weakreference
        WeakReference<MyBike> myBike = new WeakReference<>(new MyBike("Aapache", "TVS"));
        System.out.println(myBike.get().myBikeName + myBike.get().myBikeCompany);
        System.gc();
        try{
            Thread.sleep(2000);
        }catch(Exception ignored){
        }
        System.out.println(myBike.get());
    }
}

class MyPhone{
    String myPhoneName;
    String myPhoneCompany;

    public MyPhone(String myPhoneName, String myPhoneCompany) {
        this.myPhoneName = myPhoneName;
        this.myPhoneCompany = myPhoneCompany;
    }
}

class MyBike{
    String myBikeName;
    String myBikeCompany;

    public MyBike(String myBikeName, String myBikeCompany) {
        this.myBikeName = myBikeName;
        this.myBikeCompany = myBikeCompany;
    }
}
