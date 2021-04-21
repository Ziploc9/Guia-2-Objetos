package com.company;

public class Main {

    public static void main(String[] args) {

        Persona estudiante []= new Estudiante[4];

        estudiante[0] = new Estudiante("Tecnico Programacion", "2003",3500,"Martin"," Penepe", "Acantilados 4931", "susana@gmail.com","40392422");
        estudiante[1] = new Estudiante("Tecnico Programacion", "2007",4600,"Ricky"," Frekiste", "Temple 211", "fotolog@live.com","13928722");
        estudiante[2] = new Estudiante("Tecnico Programacion", "2013",2100,"Frank"," Fucula", "Guemes 414", "turritofif@gmail.com","40386722");
        estudiante[3] = new Estudiante("Tecnico Programacion", "2020",5790,"Marlon"," Coquinio", "Marvella 12", "fachita@hotmail.com","38924122");

        for (Persona nuevo: estudiante) {
            System.out.println(nuevo);
        }

        System.out.println("\n--------------------------------------------------------------------------------------------\n");

        Persona[] nuevoStaff = new Staff[4];

        nuevoStaff[0] = new Staff("Carlos","Montero","Comerce 312", "Tuprofesexy@Yahoo.com.ar","20345211",35000,"Mañana");
        nuevoStaff[1] = new Staff("Flavio","Kristof","Ponce 12", "MontanerTeAmo@msn.com.ar","53145211",36410,"Tarde");
        nuevoStaff[2] = new Staff("Splinter","Gimenez","Popu 118", "lolipop@gmail.com","53127511",27000,"Tarde");
        nuevoStaff[3] = new Staff("Donatelo","Tulipan","Entucama 123", "MonicaFarro@hotmail.com","20348875",55000,"Mañana");

        for(Persona novo: nuevoStaff){
            System.out.println(novo);
        }

        System.out.println("\n--------------------------------------------------------------------------------------------\n");

        Persona[] conjunto = new Persona[8];
        int i=0;
        for (Persona value : estudiante) {
            conjunto[i] = value;
            i++;
        }
        for (Persona persona : nuevoStaff) {
            conjunto[i] = persona;
            i++;
        }


        for (Persona n: conjunto) {
            System.out.println(n);
        }

        System.out.println("\n--------------------------------------------------------------------------------------------\n");

        float ingresosdeAlumnos=0;

        for (Persona alumno : conjunto) {
            if(alumno instanceof Estudiante){
                ingresosdeAlumnos += ((Estudiante) alumno).getCuotaMensual();
            }
        }

        System.out.println("Ingresos por cuotas mensuales de estudiantes $"+ingresosdeAlumnos);

        System.out.println("\n--------------------------------------------------------------------------------------------\n");

        Figura [] nuevaFigura = new Figura[6];

        nuevaFigura[0] = new Circulo("Rojo",5);
        nuevaFigura[1] = new Circulo(6);
        nuevaFigura[2] = new Rectangulo("Verde",10,10);
        nuevaFigura[3] = new Rectangulo(10,10);
        nuevaFigura[4] = new Cuadrad("Violeta",20,20);
        nuevaFigura[5] = new Cuadrad(20,20);

        for (Figura fig:nuevaFigura) {
            System.out.println(fig);
        }


    }

}
