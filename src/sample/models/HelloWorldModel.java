package sample.models;

public class HelloWorldModel {
    private String message = "";

    public void setMessage(String value){
        this.message = value;
    }

    public String getMessage(){
        return this.message;
    }
}
