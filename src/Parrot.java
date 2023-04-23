public class Parrot {
    private String eyes;
    private String AreEating;

     public Parrot(){

    }
    public Parrot(String eyes, String areEating) {
        this.eyes = eyes;
        AreEating = areEating;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getAreEating() {
        return AreEating;
    }

    public void setAreEating(String areEating) {
        AreEating = areEating;
    }
}
