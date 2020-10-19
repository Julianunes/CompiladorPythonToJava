package pythonreader; 
 import java.util.Scanner; 
 public class IMC { 
 public void calculaIMC(){ 
Scanner in = new Scanner (System.in);
int idade = in.nextInt(); 
boolean obeso = false; 
float peso = in.nextFloat(); 
float altura = in.nextFloat(); 
char sexo = in.next().charAt(0); 
float imc = peso/(altura*altura);
if(sexo=='f'||sexo=='F'){
if(imc<19.1){
System.out.println("Você está abaixo do peso");
}
else if(imc<25.8){
System.out.println("Você está com o peso ideal");
}
else if(imc<27.3){
System.out.println("Você está um pouco acima do peso");
}
else if(imc<31.1){
System.out.println("Você está acima do peso");
}
else if(imc>31.1){
System.out.println("Você está obesa");
obeso = true; 
}
}
else if(sexo=='m'||sexo=='M'){
if(imc<20.7){
System.out.println("Você está abaixo do peso");
}
else if(imc<26.4){
System.out.println("Você está com o peso ideal");
}
else if(imc<27.8){
System.out.println("Você está um pouco acima do peso");
}
else if(imc<33.3){
System.out.println("Você está acima do peso");
}
else if(imc>33.3){
System.out.println("Você está obeso");
obeso = true; 
}
}else{
System.out.println("Genero não definido");
}
if(obeso&&idade<=12){
System.out.println("Você também possui obesidade infantil");
}
}
}
