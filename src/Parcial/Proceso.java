package Parcial;

public class Proceso {
    
    public double basico;
    public double vhed;
    public double totdev;
    public double pension;
    public double salud;
    public double totded;
    public double totpagar;
   
    
    public void realizar_basico(double salario , int dias_lab){
        
        basico = (salario/30)*dias_lab;
        
    }
    
    public void realizar_vhed(double salario, int hed){
        
        vhed = (((salario/30/8)*0.25)+(salario/30/8))*hed;
        
    }
    
    public void realizar_totdev(){
        
        totdev = basico + vhed;
        
    }
    
    public void realizar_pension(double salario){
        
        pension = salario * 0.04;
        
    }
    
    public void realizar_salud(double salario){
        
        salud = salario * 0.04;
        
    }
    
    public void realizar_totded(){
        
        totded = pension + salud;
        
    }
    
    public void realizar_totpagar(){
        
        totpagar = totdev - totded;
        
    }
}
