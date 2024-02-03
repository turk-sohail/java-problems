public class Car {
    private String model;
    private String make;
    private int doors;
    private boolean isConvertable;




    public void setMake(String make){
        this.make = make;
        if(make == null) make = "unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
           case "maclaren","tasho","pasho" -> make  = lowerCaseMake;
           default ->{
            this.make = "Unsupported"; 
           }
        }
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setConvertable(boolean isConvertable ){
        this.isConvertable = isConvertable;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public String getModel(){
        return this.model;
    }

    public String getMake(){
        return this.make;
    }

    public boolean isConvertable(){
        return this.isConvertable;
    }

    public int getDoors(){
        return this.doors;
    }



}
