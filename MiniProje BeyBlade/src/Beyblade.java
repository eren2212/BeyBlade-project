
public class Beyblade {
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;
    
    public Beyblade(String beybladeci,int donusHizi,int saldiriGucu){
        this.beybladeci=beybladeci;
        this.donusHizi=donusHizi;
        this.saldiriGucu=saldiriGucu;
    }
    
    public String getBeybladeci(){
        return this.beybladeci;
    }
    public void setBeybladeci(String beybladeci){
        this.beybladeci=beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    
    public void saldir(){
        System.out.println(this.beybladeci+" "+this.saldiriGucu + " ve "+ this.donusHizi + "ile saldırıyor" );
    }
    public void kutsalCanavarOrtayaCikiyor(){
        System.out.println("Bu beybaldenin kutsal canavarı bulunmuyor");
        
    }
    
    public void BilgileriGoster(){
        System.out.println("isim:"+this.beybladeci+"Donuş Hizi :"+this.donusHizi+"saldırı gücü:" +this.saldiriGucu);
    }
    
}
