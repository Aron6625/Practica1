public class Perros
{  
    String raza;
    String color;
    String Pelo;
    int Patas;
    int Ojos;
    int Cola;
    
    public Perros(String raza, String color,String Pelo, int Patas, int Ojos, int Cola){
        this.raza = raza;
        this.color = color;
        this.Pelo = Pelo;
        this.Patas = Patas;
        this.Ojos = Ojos;
        this.Cola = Cola;
    }
    public void setraza(String raza){

        this.raza = raza;
    }
    public String getcolor(){
        this.Pelo = Pelo;
        return this.color;
    
    }
    public void Perros(){
    raza = "Bulldog";
    color = "cafe-Blanco";
    Pelo = "pequeño";
    }
     
}