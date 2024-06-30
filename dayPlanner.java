public class dayPlanner
{
    /*
     * variables -> name, duration
     * 
     * methods :
     * getDuration() -> returns duration when called
     */

    private String name;
    private int duration;

    public dayPlanner(String name, int duration)
    {
        this.name = name;
        this.duration = duration;
    }
    public int getDuration()
    {
        return duration;
    }
    public String toString()
    {
        return (this.name + " => " + this.duration + " minutes");
    }
}
