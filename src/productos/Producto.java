package productos;

public abstract class Producto implements Comparable<Producto> {

    private String id;
    private String marca;
    private double precio;
    private double dcto;
    private boolean prime;

    public Producto(){
    }

    public Producto(String id, String marca, double precio, double dcto, boolean prime){
        this.id     = id;
        this.marca  = marca;
        this.precio = precio;
        this.dcto   = dcto;
        this.prime  = prime;

    }
 
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return this.marca.toUpperCase();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDcto() {
        return this.dcto;
    }

    public void setDcto(double dcto) {
        this.dcto = dcto;
    }

    // public boolean isPrime() {
    //     return this.prime;
    // }

    public String isPrime() {
        String p = "PRIME";
        String r = "Regular";
        if(this.prime==true){
            return p;
        }else{
        return r;}
    }

    public void setPrime(boolean prime) {
        this.prime = prime;
    }

    public double getPrecioVenta(){
        if(this.prime==true){
            return precio - Math.round(precio*dcto)/100;
        }else{
            return precio - Math.round(precio*dcto)/100 + 15;
    }

    }

    public String getEnvio(){
        String euro = "\u20AC";
        String g = "GRATIS";
        String e = "+15"+euro;
        if(this.prime==true){
            return g;
        }else{
        return e;}
    }

    public abstract String toString();
    public abstract void toStringCute();
    public abstract String toStringDatos();
    public abstract void toStringAbstract();
    public abstract String toStringAbstract(String idioma);

    @Override
    public int compareTo(Producto p){
        return this.id.compareToIgnoreCase(p.getId());
    }

}
