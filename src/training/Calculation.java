package training;
public class Calculation {
    public Integer addInt(Integer x,Integer y){
        return x+y;
    }
    public String addChar(Character x, Character y){
        return String.valueOf(x)+ String.valueOf(y);
    }
    
    public Boolean addBoolean(Boolean x, Boolean y){
        return x && y;
    }
    
    public Float addFloat(Float x, Float y){
        return x + y;
    }
    
    public static void main(String[]args){
        Calculation calc = new Calculation();
                
        String charResult = calc.addChar('A', 'B');
        System.out.println("Character :"  +charResult);
        
        float floatResult = calc.addFloat(3.5f, 2.7f);
        System.out.println("Floating Addition :"  +floatResult);
        
        Boolean boolResult = calc.addBoolean(true, false);
        System.out.println("Boolean add result :"  +boolResult);

    }
}
