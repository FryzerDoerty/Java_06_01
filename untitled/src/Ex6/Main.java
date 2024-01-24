package Ex6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> set = new HashSet<>();
        Laptop laptop1 = new Laptop();
        laptop1.setModel("Sumsung");
        laptop1.setRAM(6);
        laptop1.setHard_drive(500);
        laptop1.setColor("Black");
        laptop1.setOperational_system("Windows");

        Laptop laptop2 = new Laptop();
        laptop2.setModel("Acer");
        laptop2.setRAM(4);
        laptop2.setHard_drive(500);
        laptop2.setColor("White");
        laptop2.setOperational_system("Linux");

        Laptop laptop3 = new Laptop();
        laptop3.setModel("Sumsung");
        laptop3.setRAM(8);
        laptop3.setHard_drive(1000);
        laptop3.setColor("Pink");
        laptop3.setOperational_system("Linux");

        Laptop laptop4 = new Laptop();
        laptop4.setModel("Lenovo");
        laptop4.setRAM(6);
        laptop4.setHard_drive(500);
        laptop4.setColor("Black");
        laptop4.setOperational_system("Windows");

        Laptop laptop5 = new Laptop();
        laptop5.setModel("Acer");
        laptop5.setRAM(8);
        laptop5.setHard_drive(1000);
        laptop5.setColor("Blue");
        laptop5.setOperational_system("Windows");


        set.add(laptop1);
        set.add(laptop2);
        set.add(laptop3);
        set.add(laptop4);
        set.add(laptop5);



        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Model");
        map.put(2, "RAM");
        map.put(3, "Hard drive");
        map.put(4, "Color");
        map.put(5, "Operational system");
        System.out.println(map);
        System.out.println("Напишите цифру, под которой необходимый критерий");


        Map<Integer, String> map_console = new HashMap<>();


        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);


        for (int i = 0; i < 4; i++) {
            System.out.println("Вы хотите продолжить?(Y-1/N-2)");
            int ongoing = scanner2.nextInt();
            if(ongoing!=2){
                System.out.println("Введите номер характеристики: ");
                int number_crit = scanner.nextInt();
                System.out.println("Введите значение: ");
                String value = scanner1.nextLine();
                map_console.put(number_crit, value);
            }
            else{

                break;
            }
        }
        System.out.println(map_console.get(1));
        Set<Laptop> control = new HashSet<>();
        //for (Map.Entry<Integer, Object> entry:map_console.entrySet()) {
        if(map_console.containsKey(1)){
            for(Laptop laptop:set){
                String a = map_console.get(1);
                String b = laptop.getModel();
                if(a.equals(b)){
                    control.add(laptop);
                    //System.out.println(laptop);

                }

            }

        } else if ((!map_console.containsKey(1))&(map_console.containsKey(2))) {
            for(Laptop laptop_set:set){
                int i = Integer.parseInt(map_console.get(2).trim());
                if(i>laptop_set.getRAM()){
                    control.add(laptop_set);
                }
            }
        } else if ((!map_console.containsKey(1))&(!map_console.containsKey(2))&(map_console.containsKey(3))) {
            for(Laptop laptop_set1:set){
                int i = Integer.parseInt(map_console.get(2).trim());
                if(i>laptop_set1.getHard_drive()){
                    control.add(laptop_set1);
                }
            }
        } else if ((!map_console.containsKey(1))&(!map_console.containsKey(2))&(!map_console.containsKey(3))&(map_console.containsKey(4))) {
            for(Laptop laptop_set2:set){
                if(map_console.get(4).equals(laptop_set2.getColor())){
                    control.add(laptop_set2);
                }

            }
        } else if ((!map_console.containsKey(1))&(!map_console.containsKey(2))&(!map_console.containsKey(3))&(!map_console.containsKey(4))&(map_console.containsKey(5))) {
            for(Laptop laptop_set3:set){
                if(map_console.get(5).equals(laptop_set3.getOperational_system())){
                    control.add(laptop_set3);
                }

            }
        }

        if(map_console.containsKey(2)){
            for(Laptop laptop:control){
                map_console.get(2);
                int i = Integer.parseInt(map_console.get(2).trim());
                if(i<laptop.getRAM()){
                    control.remove(laptop);
                }

            }
        }
        if(map_console.containsKey(3)){
            for(Laptop laptop:control){
                map_console.get(3);
                int i = Integer.parseInt(map_console.get(3).trim());
                if(i<laptop.getHard_drive()){
                    control.remove(laptop);
                }
            }
        }

        if(map_console.containsKey(4)){
            for(Laptop laptop:control){
                if(!map_console.get(4).equals(laptop.getColor())){
                    control.remove(laptop);
                }
            }
        }
        if(map_console.containsKey(5)){
            for(Laptop laptop:control){
                if(!map_console.get(5).equals(laptop.getOperational_system())){
                    control.remove(laptop);
                }
            }
        }

        System.out.println(control);

        //for (Map.Entry<Integer, Object> entry:map_console.entrySet()) {
        //  if(entry.getValue()==)
        //}



    }
}
