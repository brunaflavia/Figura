public class GerenteDeFiguras {
    private int tipo; // 1 -Triangulo, 2 - retangulo
    private FiguraGeometrica figura;


    public double calculaAreaToral(){
        Retangulo retangulogerente = new Retangulo();
        Triangulo triangulogerente = new Triangulo();
        if(this.tipo == 1){
            return (retangulogerente.getBase()*retangulogerente.getAltura())/2;
        }else{
            return (triangulogerente.getBase()*triangulogerente.getAltura());
        }
    }


    public FiguraGeometrica getFigura() {
        return figura;
    }
    public void setFigura(FiguraGeometrica figura) {
        this.figura = figura;
    }
    

}
