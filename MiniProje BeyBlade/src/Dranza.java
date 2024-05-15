
public class Dranza extends Beyblade{
    private String kutsalCanavar;
    
    
    public Dranza(String kutsalCanavar, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }
    
    @Override
    public void kutsalCanavarOrtayaCikiyor(){
        System.out.println(getBeybladeci()+" ın kutsal canavarı:"+this.kutsalCanavar);
        
    }
    
    @Override
    public void BilgileriGoster(){
        System.out.println("isim:"+getBeybladeci()+"Donuş Hizi :"+getDonusHizi()+"saldırı gücü:" +getSaldiriGucu());
    }
}
