package productos;

import java.util.ArrayList;

public class Teclado extends Producto{

    private String color;
    private int teclas;
    private String conector;

    public Teclado(){
        super();
    }

    public Teclado(String id, String marca, double precio, double dcto, boolean prime, String color, int teclas, String conector){
        super(id, marca, precio, dcto, prime);
        this.color = color;
        this.teclas = teclas;
        this.conector = conector;
    }

    public String getColor() {
        return this.color.toUpperCase();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTeclas() {
        return this.teclas;
    }

    public void setTeclas(int teclas) {
        this.teclas = teclas;
    }

    public String getConector() {
        return this.conector.toUpperCase();
    }

    public void setConector(String conector) {
        this.conector = conector;
    }
    
    public void mostrarInfo(){
        System.out.printf("\nCodigo: %s\nMarca: %s\nPrecio: %.2f\nDescuento: %.0f\nPrime: %b\nColor: %s\nTeclas: %d\nConector: %s\nEnvio: %s\nPVP: %.2f\n"
        ,getId(),getMarca(),getPrecio(),getDcto(),isPrime(),getColor(),getTeclas(),getConector(),getEnvio(),getPrecioVenta());
    }

    public void toStringCute() {
        // System.out.printf("+-------+----------+-------+------+--------+----------+----+--------+-------+-------+\n");
        System.out.printf("|%-7s|%-10s|%-7s|%-9s|%-8s|%-10s|%-7s|%-8s|%-7s|%-7s|\n",getId(),getMarca(),getPrecio(),getDcto(),isPrime(),getColor(),getTeclas(),getConector(),getEnvio(),getPrecioVenta());
        System.out.printf("+-------+----------+-------+---------+--------+----------+-------+--------+-------+-------+\n");
    }

    @Override
    public String toString() {
         return getId()+ "," + getMarca()+ "," + getPrecio()+ "," + getDcto()+ "," + isPrime()+ "," + getColor()+ "," + getTeclas()+ "," + getConector() + "," + getEnvio() + "," + getPrecioVenta();
        }   


 
    @Override
    public String toStringDatos() {
         return "Id: "+getId()+ "\n" + "Marca: "+getMarca()+ "\n" + "Precio: "+getPrecio()+ "\n" + "Descuento: "+getDcto()+ "\n" + "Prime: "+isPrime()+ "\n" + "Color: "+getColor()+ "\n" + "Teclas: "+getTeclas()+ "\n" + "Conector: "+getConector() + "\n" + "Envio: "+getEnvio() + "\n" + "PVP: "+getPrecioVenta();
        }

    @Override
    public String toStringAbstract(String idioma ) {
        if (idioma.equals("EUS"))
        {
            return "Id: "+getId()+ "\n" + "Kodea: "+getMarca()+ "\n" + "Prezioa: "+getPrecio()+"€"+ "\n" + "Deskontua: "+getDcto()+"%"+ "\n" + "Prime: "+isPrime()+ "\n" + "Kolorea: "+color+ "\n" + "Teklak: "+teclas+ "\n" + "Konektorea: "+conector + "\n" + "Bidalketa: "+getEnvio() + "\n" + "Salmenta-prezioa: "+getPrecioVenta()+"€";
        }
        else if (idioma.equals("EN"))
        {
            return "Id: "+getId()+ "\n" + "Brand: "+getMarca()+ "\n" + "Price: "+getPrecio()+"€"+ "\n" + "Discount: "+getDcto()+"%"+ "\n" + "Prime: "+isPrime()+ "\n" + "Color: "+color+ "\n" + "Keys: "+teclas+ "\n" + "Conection: "+conector + "\n" + "Delivery: "+getEnvio() + "\n" + "Sale Price: "+getPrecioVenta()+"€";
        }
        else
        {
            return "Id: "+getId()+ "\n" + "Marca: "+getMarca()+ "\n" + "Precio: "+getPrecio()+"€"+ "\n" + "Descuento: "+getDcto()+"%"+ "\n" + "Prime: "+isPrime()+ "\n" + "Color: "+color+ "\n" + "Teclas: "+teclas+ "\n" + "Conector: "+conector + "\n" + "Envio: "+getEnvio() + "\n" + "PVP: "+getPrecioVenta()+"€";
        }
        
    }

    @Override
    public void toStringAbstract() {
        // TODO Auto-generated method stub
        // System.out.println("Código: " + kodea);
        // System.out.println("Fabricante: " + ekoizlea);
        // System.out.println("Modelo: " + modeloa);
    }


    

}
