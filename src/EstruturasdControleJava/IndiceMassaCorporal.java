package EstruturasdControleJava;

public class IndiceMassaCorporal {



    public void verificarImc(double  altura,int peso){
        double imc = peso / (altura*altura);
        if(imc <= 18.5){
            System.out.println("IMC: " + imc + " - Abaixo do peso");
        }
        else if(imc > 18.5 && imc <= 24.9){
            System.out.println("IMC: " + imc + " - Peso normal");
        }
        else if(imc > 24.9 && imc <= 29.9){
            System.out.println("IMC: " + imc + " - Sobrepeso");
        }
        else if(imc > 29.9 && imc <= 34.9){
            System.out.println("IMC: " + imc + " - Obesidade grau I");
        }
        else if(imc > 34.9 && imc <= 39.9){
            System.out.println("IMC: " + imc + " - Obesidade grau II");
        }
        else{
            System.out.println("IMC: " + imc + " - Obesidade grau III");
        }
    }
}
