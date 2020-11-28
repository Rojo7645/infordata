import pack.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto( "123456CD" , "TECLADOS");
        System.out.println(producto);
        Alquilable alquilable = new Alquilable("654321AB" , "MONITOR 17 PULG" , 13.4);
        System.out.println(alquilable);
        Empresa empresa = new Empresa("PC FALCON" , "C. SAN MARTIN" , 21  );
        System.out.println(empresa);
        Tecnologico tecnologico =  new Tecnologico("f45" , "SSD" ,
                "USA", Calendar.getInstance().getTime(), empresa);
        System.out.println(tecnologico);
        Monitor monitor = new Monitor("24 pulgadas" , 17.2 , "1980x1080");
        System.out.println(monitor);
        Empresa INR = new Empresa("GAMIN CORPORATION" , "AV CIRCUNVALACION #895" , 540 );
        Cpu cpu = new Cpu("ER456" , "ASUS" , " ARGENTINA" , Calendar.getInstance().getTime() , INR , 16, null);
        System.out.println(cpu);
    }
}
