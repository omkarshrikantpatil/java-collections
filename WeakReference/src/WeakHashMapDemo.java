import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args){
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        //Here we are using object of strings instead of directly using them because strings are strong referenced in string pool
        loadCache.loadcache(imageCache);
        System.out.println(imageCache);
        System.gc();
        Simulations.simulatApplicationRunning();
        System.out.println("Cache after running some entries may be cleared: " + imageCache);
    }
}
class loadCache{
    public static void loadcache(Map<String, Image> imageCache){
        String k1 = new String("img1");
        String k2 = new String("img2");
        imageCache.put(k1, new Image("Image1"));
        imageCache.put(k2, new Image("Image2"));
    }
}
class Simulations{
    public static void simulatApplicationRunning(){
        try{
            System.out.println("Simulating application running");
            Thread.sleep(20000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Image{
    String image;

    public Image(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Image{" +
                "image='" + image + '\'' +
                '}';
    }
}
