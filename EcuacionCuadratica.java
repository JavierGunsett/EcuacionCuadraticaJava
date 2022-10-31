
package Ecuacion;

public class EcuacionCuadratica {
    private int a,b,c;
    
    //Constructor
    public EcuacionCuadratica(int n1,int n2,int n3){
        this.a=n1;
        this.b=n2;
        this.c=n3;
    };
    //Metodos
    public boolean TieneRaicesReales(){
        return (this.b*this.b-4*this.a*this.c) >= 0;
    };

    public double VerRaiz1(){  
        return (-this.b-Math.sqrt(this.b*this.b-4*this.a*this.c))/2*this.a;        
    };
    
    public double VerRaiz2(){
        return (-this.b+Math.sqrt(this.b*this.b-4*this.a*this.c))/2*this.a;        
    };

    public double VerParteReal(){
        return -this.b/2.0*this.a;        
    };

    public double VerParteImaginaria(){
        return Math.sqrt(Math.abs(this.b*this.b-4*this.a*this.c));       
    };

};
