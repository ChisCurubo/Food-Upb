package domain;

public class Menu {
    private final String plate1 = "Hamburguesa" ;
    private final String plate2 = "Crazy Potato" ;
    private final String plate3 = "Hot Perro" ;
    private final String plate4 = "Hamburguesa ElPingu" ;
    private final String plate5 = "Pepito" ;
    private final String plate6 = "Sanwich" ;
    private final String plate7 = "Pipipicada" ;
    private int idProducto ;
    private int camtProd;
    private int tiempoPrepRapi;
    private int tiempoPrepLen;
    private String product;
    private double precio;

    public Menu(int idPr, String choice,int camtProd, int tiempoPrepRa, int precio, int tiempLe){
        this.idProducto = idPr;
        this.product = choice;
        this.camtProd = camtProd;
        this.tiempoPrepRapi = tiempoPrepRa;
        this.tiempoPrepLen = tiempLe;
        this.precio = precio;
    }
    public Menu(){

    }
    public Menu(int camtProd, int tiempoPrep, int tiempoPrepLen, String choice, double precio){
        this.product = choice;
        this.camtProd = camtProd;
        this.tiempoPrepRapi = tiempoPrep;
        this.tiempoPrepLen = tiempoPrepLen;
        this.precio = precio;
    }
    public Menu(int id){this.idProducto = id;}
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCamtProd() {
        return camtProd;
    }

    public void setCamtProd(int camtProd) {
        this.camtProd = camtProd;
    }

    public int getTiempoPrepRapi() {
        return tiempoPrepRapi;
    }

    public void setTiempoPrepRapi(int tiempoPrepRapi) {
        this.tiempoPrepRapi = tiempoPrepRapi;
    }

    public int getTiempoPrepLen() {
        return tiempoPrepLen;
    }

    public void setTiempoPrepLen(int tiempoPrepLen) {
        this.tiempoPrepLen = tiempoPrepLen;
    }

    public String getPlate1() {
        return plate1;
    }

    public String getPlate2() {
        return plate2;
    }

    public String getPlate3() {
        return plate3;
    }

    public String getPlate4() {
        return plate4;
    }

    public String getPlate5() {
        return plate5;
    }

    public String getPlate6() {
        return plate6;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPlate7() {
        return plate7;
    }
}
