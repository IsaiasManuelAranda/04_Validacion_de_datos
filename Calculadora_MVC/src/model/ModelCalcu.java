
package model;

public class ModelCalcu {
    public float num1;
    public float num2;
    public float result;
    
    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
    
    public float suma(){
        this.result = this.num1 + this.num2;
        return this.result;
    }
    public float resta(){
        this.result = this.num1 - this.num2;
        return this.result;
    }
    public float multiplicacion(){
        this.result = this.num1 * this.num2;
        return this.result;
    }
    public float division(){
        this.result = this.num1 / this.num2;
        return this.result;
    }
    public float modulo(){
        this.result = this.num1 % this.num2;
        return this.result;
    }
    
}
