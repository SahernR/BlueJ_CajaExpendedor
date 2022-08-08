
/**
 * Write a description of class Caja here.
 * La caja debe registrar monedas validad de acuerdo al sistema monetario chileno
 * La caja debe entregar vuelto de acuErdo a la moneda ingresada
 * @author (Sebastian Ahern)
 * @version (1.2)
 */
public class Caja
{
    // instance variables - replace the example below with your own Contenedor Vuelto
    private int cantC10;
    private int cantC50;
    private int cantC100;
    private int cantC500;
    // Contenedor de monedas entrantes
    private int cantCashC10;
    private int cantCashC50;
    private int cantCashC100;
    private int cantCashC500;
    private String mensaje;

    /**
     * Constructor for objects of class Caja
     * La caja solo se crea cuando se tienen todos los tipos de monedas en el contenedor de vuelto y
     * deja todos los tipos de moneda en el contenedor de monedas entrantes en 0
     */
    public Caja(int cantC10, int cantC50, int cantC100, int cantC500)
    {
        // initialise instance variables
        this.cantC10=cantC10;
        this.cantC50=cantC50;
        this.cantC100=cantC100;
        this.cantC500=cantC500;
        
    }
    
    public Caja()
    {
        // initialise instance variables = 0
        this.cantCashC10=0;
        this.cantCashC50=0;
        this.cantCashC100=0;
        this.cantCashC500=0;
        
    }

    /**
     * Verifica si la moneda pertenece a la moneda chilena entregando true si 
     * es valido y false si no es valido
     */
    public boolean verificaMoneda(int coin)
    {
        if(coin==10)
        {
            return true;
        }
        else if(coin==50)
        {
            return true;
        }
        else if(coin==100)
        {
            return true;
        }
        else if(coin==500)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    // Getter
    public int getTotalC10(){
        return cantC10;
    }
    // Setter
    public void setTotalC10()
    {
    this.cantC10=cantC10;
    }
    // Getter
    public int getTotalC50(){
        return cantC50;
    }
    // Setter
    public void setTotalC50()
    {
    this.cantC50=cantC50;
    }
    // Getter
    public int getTotalC100(){
        return cantC100;
    }
    // Setter
    public void setTotalC100()
    {
    this.cantC100=cantC100;
    }
    // Getter
    public int getTotalC500(){
        return cantC500;
    }
    // Setter
    public void setTotalC500()
    {
    this.cantC500=cantC500;
    }
    // total cash register
    // Getter
    public int getCantCashC10(){
        return cantCashC10;
    }
    // Setter
    public void setCantCashC10()
    {
    this.cantCashC10=cantCashC10;
    }
    // Getter
    public int getCantCashC50(){
        return cantCashC50;
    }
    // Setter
    public void setCantCashC50()
    {
    this.cantCashC50=cantCashC50;
    }
    // Getter
    public int getCantCashC100(){
        return cantCashC100;
    }
    // Setter
    public void setCantCashC100()
    {
    this.cantCashC100=cantCashC100;
    }
    // Getter
    public int getCantCashC500(){
        return cantCashC500;
    }
    // Setter
    public void setCantCashC500()
    {
    this.cantCashC500=cantCashC500;
    }
    
    /**
     * Metodo que permita ingresar la moneda, verificando si la moneda es valida e ingresando la 
     * moneda al contenedor de deposito en caso que no sea valido ingresar "Moneda invalida"
     */
    public String insertCoin(int coin)
    {
        if(verificaMoneda(coin)){

            if(coin == 10){
                this.cantCashC10 = this.cantCashC10 + 1;
                }
            if(coin == 50){
                this.cantCashC50 = this.cantCashC50 + 1;
                }
            if(coin == 100){
            this.cantCashC100 = this.cantCashC100 + 1;
            }
            if(coin == 500){
                this.cantCashC500 = this.cantCashC500 + 1;
                }
            return "Moneda ingresada";
        }
        return "Moneda inválida";
    }
}
    // {
    // mensaje = "";
        // if (coin == 10) 
            // {
                // mensaje = "moneda valida.";
            // } 
                // else if (coin == 50) 
                    // {
                        // mensaje = "moneda valida.";
                    // } 
                // else if (coin == 100) 
                    // {
                        // mensaje = "moneda valida.";
                    // } 
                // else if (coin == 500) 
                    // {
                        // mensaje = "moneda valida.";
                    // } 
                        // else 
                            // {
                                // mensaje = "moneda invalida.";
                            // }
    // return mensaje;
    // }
