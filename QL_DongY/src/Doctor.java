
public class Doctor extends Information implements Comparable{
    private String positon;
    private String specialized;

    public Doctor() {
    }

    public Doctor(String ID, String name, String sex, long birth, int phone, String address, String positon, String specialized) {
        super(ID, name, sex, birth, phone, address);
        this.positon = positon;
        this.specialized = specialized;
    }

    public String getPositon() {
        return positon;
    }

    public void setPositon(String positon) {
        this.positon = positon;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }
    
    @Override
    public String toString() {
        String s= super.toString();
        s=s+ "positon=" + getPositon() + ", specialized=" + getSpecialized();
        return s;
    } 

    @Override
    public int compareTo(Object o) {
        return this.getID().compareTo(((Doctor)o).getID());
    }
    

    
    
}
