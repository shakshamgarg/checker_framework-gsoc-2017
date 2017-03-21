/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerdemo;

/**
 *
 * @author this pc
 */
public class PlainMathService implements MathService 
{
    
    @Override
    public double add(double firstValue, double secondValue)
    {
        return firstValue + secondValue;
        
    }
    @Override
    public double sub(double firstValue, double secondValue)
    {
        return firstValue - secondValue;
        
    }
    @Override
    public double mul(double firstValue, double secondValue)
    {
        return firstValue * secondValue;
    }
    @Override
    public double div(double firstValue, double secondValue)
    {
        if(secondValue!=0)
        return firstValue / secondValue;
        else
        return Double.MAX_VALUE;
    }
    
}
