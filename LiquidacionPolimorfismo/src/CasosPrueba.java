package LiquidacionPolimorfismo.src;

public class CasosPrueba {
    
    
    Cuenta objeto_cuenta=new Cuenta(10,"2010/10/06/",1,600000);
    System.out.println(objeto_cuenta.calcular_interes());
    CuentaCorriente objeto_corriente=new CuentaCorriente(10,"2010/10/06/",600000,2.5,100000);
    System.out.println(objeto_corriente.calcular_interes());

    Cuenta objeto_cuenta=new Cuenta(10,"2010/10/06/",1,600000,91243,"Luisa Lane","llane@gmail.com",312312456,"Calle 20 no 30-40");
    System.out.println(objeto_cuenta.calcular_interes());
    CuentaCorriente objeto_corriente=new CuentaCorriente(10,"2010/10/06/",600000,2.5,100000);
    System.out.println(objeto_corriente.calcular_interes());

    Cuenta objeto_cuenta=new Cuenta(10,"2010/10/06/",1,600000);
    System.out.println(objeto_cuenta.calcular_interes());
    CuentaCorriente objeto_corriente=new CuentaCorriente(10,"2010/10/06/",600000,2.5,100000,91243,"Luisa Lane","llane@gmail.com",312312456,"Calle 20 no 30-40");
    System.out.println(objeto_corriente.calcular_interes());

    Cuenta objeto_cuenta=new Cuenta(10,"2010/10/06/",2,600000);
    System.out.println(objeto_cuenta.calcular_interes());
    CuentaCorriente objeto_corriente=new CuentaCorriente(10,"2010/10/06/",600000,4.5,100000);
    System.out.println(objeto_corriente.calcular_interes());
}
