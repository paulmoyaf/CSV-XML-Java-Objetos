package productos;

public class Guitarra extends Producto{

    private String material;
    private int cuerdas;
    private String orientacion;

    public Guitarra(){
        super();
    }

    public Guitarra(String id, String marca, double precio, double dcto, boolean prime, String material, int cuerdas, String orientacion){
        super(id, marca, precio, dcto, prime);
        this.material = material;
        this.cuerdas = cuerdas;
        this.orientacion = orientacion;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCuerdas() {
		return this.cuerdas;
	}

    public void setCuerdas(int cuerdas) {
		this.cuerdas = cuerdas;
	}

    public String getOrientacion() {
        return this.orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public void mostrarInfo(){
        System.out.printf("\nCodigo: %s\nMarca: %s\nPrecio: %.2f\nDescuento: %.2f\nPrime: %b\nMaterial: %s\nCuerdas: %d\nOrientacion: %s\nPVP: %.2f\n"
        ,getId(),getMarca(),getPrecio(),getDcto(),isPrime(),getMaterial(),getCuerdas(),getOrientacion(),getPrecioVenta());
    }

    @Override
    public void toStringAbstract() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toStringAbstract(String idioma) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toStringDatos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void toStringCute() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toStringCute'");
    }
}
