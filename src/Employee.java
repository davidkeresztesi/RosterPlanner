public class Employee {

    private int dayAvailable;
    private int dayOff;
    private boolean priorThisWeek;

    //////////constructor




    //////////get

    public int getDayAvailable() {
        return dayAvailable;
    }

    public int getDayOff() {
        return dayOff;
    }

    public boolean isPriorThisWeek() {
        return priorThisWeek;
    }

    ///////////set

    public void setDayAvailable(int dayAvailable) {
        this.dayAvailable = dayAvailable;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }

    public void setPriorThisWeek(boolean priorThisWeek) {
        this.priorThisWeek = priorThisWeek;
    }
}
