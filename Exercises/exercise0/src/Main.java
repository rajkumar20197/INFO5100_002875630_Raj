class table {
    String legs;
    String color;
    boolean Height;
   int Weight;
    String Brand;
    String price;
    String Type;
    int model;


    table(String legs, String color, boolean height, int weight, String brand, String price, String type, int model) {
        this.legs = legs;
        this.color = color;
        this.Height = height;
        this.Weight = weight;
        this.Brand = brand;
        this.price = price;
        this.Type = type;
        this.model = model;
        System.out.println("table Instance created");

    }

    public void usingTable(){
        System.out.print("this table is hug in space"+model);
    }
    public void getTable(){
    }
    public void setTable(){
    }
     class powersupp{
        int voltage;
        int units;

         powersupp(int voltage, int units) {
             this.voltage = voltage;
             this.units = units;
             System.out.println("\nnested class for table created");
         }
     }
}
class Bottle {
    int Price;
    String model;
    String brand;
    String material;
    Double width;
    int volume;
    boolean reuse;
    String Straw;


    Bottle(int price, String model, String brand, String material, Double width, int volume, boolean reuse, String straw) {
        this.Price = price;
        this.model = model;
        this.brand = brand;
        this.material = material;
        this.width = width;
        this.volume = volume;
        this.reuse = reuse;
        this.Straw = straw;
        System.out.println("Bottle Instance created");
    }
    public void usingBottle(){
        System.out.print("\ncan fill large quantity"+model);
    }
    public void getBottle(){
    }
    public void setBottle(){
    }
}
class Fan{
    String brand;
    String model;
    String color;
    String noise;
    String SpeedLimit;
    String RemoteAccess;
    String lamp;
    int Height;


    Fan(String brand, String model, String color, String noise, String speedLimit, String remoteAccess, String lamp, int height) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.noise = noise;
        this.SpeedLimit = speedLimit;
        this.RemoteAccess = remoteAccess;
        this.lamp = lamp;
        this.Height = height;
        System.out.println("Fan Instance created");
    }
    public void usingFan(){
        System.out.print("\nwe can control the speed"+model);
    }
    public void getFan(){
    }
    public void setFan(){
    }
}
class WristWatch{
    String color;
    String Type;
    String Belt;
    String Tuner;
    int Dial;
    String  reuse;
    boolean Shape;
    int price;


    WristWatch(String color, String type, String belt, String tuner, int dial, String reuse, boolean shape, int price) {
        this.color = color;
        this.Type = type;
        this.Belt = belt;
        this.Tuner = tuner;
        this.Dial = dial;
        this.reuse = reuse;
        this.Shape = shape;
        this.price = price;
        System.out.println("WristWatch Instance created");
    }
    public void usingWristWatch(){
        System.out.print("\nGood looking in new model"+color);
    }
    public void getWristWatch(){
    }
    public void setWristWatch(){
    }
}
class CoffeeCup{
    String name;
    String color;
    int quantity;
    int height;
    int weight;
    String Type;
    int shape;
    int price;

    CoffeeCup(String name, String color, int quantity, int height, int weight, String type, String type1, int shape, int price) {
        this.name = name;
        this.color = color;
        this.quantity = quantity;
        this.height = height;
        this.weight = weight;
        this.Type = type;
        this.shape = shape;
        this.price = price;
        System.out.println("CoffeeCup Instance created");
    }
    public void usingCoffeeCup(){
        System.out.print("\nThe CoffeeCup hold heat for many hours"+shape);
    }
    public void getCoffeeCup(){
    }
    public void setCoffeeCup(){
    }
}
class Lamp{
    String brand;
    String type;
    String lampColor;
    int Height;
    String Frame;
    int Duration;
    int price;
    int lightDistance;


    Lamp(String brand, String type, String lampColor, int height, String frame, int duration, int price, int lightDistance) {
        this.brand = brand;
        this.type = type;
        this.lampColor = lampColor;
        this.Height = height;
        this.Frame = frame;
        this.Duration = duration;
        this.price = price;
        this.lightDistance = lightDistance;
        System.out.println("Lamp Instance created");
    }
    public void usingLamp(){
        System.out.print("\nWe brought in market place "+price);
    }
    public void getLamp(){
    }
    public void setLamp(){
    }
}
class pencil{
    String color;
    String Style;
    String material;
    String brand;
    int size;
    int Stock;
    double price;
    boolean eraser;

    pencil(String color, String style, String material, String brand, int size, int stock, double price, boolean eraser) {
        this.color = color;
        this.Style = style;
        this.material = material;
        this.brand = brand;
        this.size = size;
        this.Stock = stock;
        this.price = price;
        this.eraser = eraser;
        System.out.println("pencil Instance created");
    }
    public void usingPencil(){
        System.out.print("\none pack contain six pencil"+price);
    }
    public void getpencil(){
    }
    public void setpencil(){
    }
}
class musicPlayer{
    String name;
    String loudspeaker;
    String button;
    boolean size;
    String color;
    String battery;
    int playback;
    boolean withStand;

    musicPlayer(String name, String loudspeaker, String button, boolean size, String color, String battery, int playback, boolean withStand) {
        this.name = name;
        this.loudspeaker = loudspeaker;
        this.button = button;
        this.size = size;
        this.color = color;
        this.battery = battery;
        this.playback = playback;
        this.withStand = withStand;
        System.out.println("musicPlayer Instance created");
    }
    public void usingMusicPlayer(){
        System.out.print("\nIt is a loud musicPlayer with "+battery);
    }
    public void getmusicPlayer(){
    }
    public void setmusicPlayer(){
    }
}
class closet{
    boolean HangingRods;
    String Shelves;
    String Drawers;
    int Hooks;
    int DressDividers;
    boolean ProperLighting;
    String  Rotation;
    String capacity;

    closet(boolean hangingRods, String shelves, String drawers, int hooks, int dressDividers, boolean properLighting, String rotation, String capacity) {
        this.HangingRods = hangingRods;
        this.Shelves = shelves;
        this.Drawers = drawers;
        this.Hooks = hooks;
        this.DressDividers = dressDividers;
        this.ProperLighting = properLighting;
        this.Rotation = rotation;
        this.capacity = capacity;
        System.out.println("closet Instance created");
    }
    public void usingCloset(){
        System.out.print("\nwe are two people sharing closet"+capacity);
    }
    public void getcloset(){
    }
    public void setCloset(){
    }
}
class Bag{
    String capacity;
    String brand;
    String color;
    String height;
    int price;
    boolean type;
    String book;
    String bottle;

    Bag(String capacity, String brand, String color, String height, int price, boolean type, String book, String bottle) {
        this.capacity = capacity;
        this.brand = brand;
        this.color = color;
        this.height = height;
        this.price = price;
        this.type = type;
        this.book = book;
        this.bottle = bottle;
        System.out.println("Bag Instance created");
    }
    public void usingBag(){
        System.out.print("\nIt is easy to carry"+book);
    }
    public void getBag(){
    }
    public void setBag(){
    }
}

public class Main {
    public static void main(String[] args) {
        // Initialize three table objects
        table table1 = new table("long", "tableType1",true, 1000, "furnitureWallet", "long", "productionA", 1002);
        table table3 = new table("medium", "tableType3", false, 800, "wellKnown", "499", "productionC", 4451);
        table table2 = new table("short", "tableType2", true, 750, "Mamta", "300", "productionB", 1341);
        // Initialize three objects nested class
        table.powersupp engine2 = table2.new powersupp(230, 2);
        table.powersupp engine3 = table3.new powersupp(9, 1);

// Initialize three  Bottle objects
        Bottle bottle1 = new Bottle(10, "model1", "Milton", "plastic", 4.5, 700, true, "with Straw");
        Bottle bottle2 = new Bottle(15, "model4", "Hydro", "glass", 0.0, 7850, false, "StrawLess");
        Bottle bottle3 = new Bottle(12, "model7", "Nike", "metal", 8.5, 6800, true, "detachableStraw");
// Initialize three  Fan objects
        Fan fan1 = new Fan("Hunter", "lX", "white", "lowNoise", "3Speeds", "RemoteControl", "Lamp", 90);
        Fan fan2 = new Fan("Fan", "lY", "silver", "mediumNoise", "2Speeds", "NoRemote", "NoLamp", 75);
        Fan fan3 = new Fan("Kic", "lZ", "black", "highNoise", "4Speeds", "RemoteControl", "LampIncluded", 80);
// Initialize three WristWatch  objects
        WristWatch watch1 = new WristWatch("Silver", "digital", "leather", "quartz", 42, "waterResistant", true, 7150);
        WristWatch watch2 = new WristWatch("Gold", "analog", "metal", "automatic", 38, "notWaterResistant", false, 6200);
        WristWatch watch3 = new WristWatch("Black", "digital", "plastic", "quartz", 40, "waterResistant", true, 1900);
// Initialize three CoffeeCup objects
        CoffeeCup cup1 = new CoffeeCup("mug", "white", 5, 47, 02, "ceramic", "standard", 11, 166);
        CoffeeCup cup2 = new CoffeeCup("travelCup", "blue", 6, 66, 05, "plastic", "insulated", 13, 620);
        CoffeeCup cup3 = new CoffeeCup("espressoCup", "black", 7, 29, 01, "porcelain", "small", 6, 410);
// Initialize three Lamp  objects

        Lamp lamp1 = new Lamp("Generation ", "deskLamp", "white", 55, "metal Frame", 2000, 30, 120);
        Lamp lamp2 = new Lamp("Hin ", "floorLamp", "black", 66, "wooden Frame", 1500, 40, 100);
        Lamp lamp3 = new Lamp("Hub ", "tableLamp", "silver", 45, "plastic Frame", 1800, 25, 130);
// Initialize three pencil  objects
        pencil pencil1 = new pencil("Yellow", "HB", "Wood", "BrandA", 7, 50, 7.15, true);
        pencil pencil2 = new pencil("Red", "2B", "Plastic", "BrandB", 6, 40, 2.30, false);
        pencil pencil3 = new pencil("Blue", "B", "Wood", "BrandC", 8, 60, 1.01, true);

// Initialize three musicPlayer objects
        musicPlayer player1 = new musicPlayer("nokia", "Stereo", "Touch ", true, "Black", "Rechargeable", 70, false);
        musicPlayer player2 = new musicPlayer("samsung", "Mono", "Physical", false, "White", "Replaceable", 260, true);
        musicPlayer player3 = new musicPlayer("lg", "SurroundSound", "Touch", true, "Silver", "Rechargeable", 470, false);

// Initialize three closet  objects

        closet closet1 = new closet(true, "Wooden", "Two", 4, 2, true, "360", "large");
        closet closet2 = new closet(false, "Metal", "Three", 6, 3, true, "180", "medium");
        closet closet3 = new closet(true, "Glass", "Four", 8, 4, false, "NoRotation", "small");

// Initialize three Bag  objects
        Bag bag1 = new Bag("20L", "Backpack.", "Blue", "43cm", 500, true, "Laptop", "waterbottle");
        Bag bag2 = new Bag("30L", "Adventure", "Green", "56cm", 770, true, "Notebook", "thermos");
        Bag bag3 = new Bag("15L", "Fashion.", "Black", "47cm", 355, false, "Tablet", "Sodacan");


        table1.usingTable();
        table2.usingTable();
        table3.usingTable();

        bottle1.usingBottle();
        bottle2.usingBottle();
        bottle3.usingBottle();

        fan1.usingFan();
        fan2.usingFan();
        fan3.usingFan();

        watch1.usingWristWatch();
        watch2.usingWristWatch();
        watch3.usingWristWatch();

        cup1.usingCoffeeCup();
        cup2.usingCoffeeCup();
        cup3.usingCoffeeCup();


        lamp1.usingLamp();
        lamp2.usingLamp();
        lamp3.usingLamp();

        pencil1.usingPencil();
        pencil2.usingPencil();
        pencil3.usingPencil();


        player1.usingMusicPlayer();
        player2.usingMusicPlayer();
        player3.usingMusicPlayer();


        closet1.usingCloset();
        closet2.usingCloset();
        closet3.usingCloset();


        bag1.usingBag();
        bag2.usingBag();
        bag3.usingBag();
    }
}












