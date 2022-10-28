public class employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int taxDept;

    employee(String name , int salary , int workHours , int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.taxDept = 0;

    }
        float tax(float maas){
        if(salary < 1000){
            return 0;
        }
        else
            return(maas/3)*3;
    }
        int bonus(int saat){
        if(workHours > 40){
            saat = saat - 40;
            return saat * 30;
        }
        else
            return 0;
    }
    float raiseSalary(int yil ,float maas ){
        yil = 2021-yil;
        if(yil < 10){
            return (maas/100)*5;
        }else if
            (yil > 9 && yil < 20){
            return(maas/100)*10;
        }else
            return (maas/100)*15;
        }
        void toPrint(){
            System.out.println(" Adı:\t "+ this.name);
            System.out.println(" çalışanın maaşı:\t "+ this.salary);
            System.out.println(" çalışma saati:\t "+ this.workHours);
            System.out.println(" başlangıç yılı :\t "+ this.hireYear);
            System.out.println(" vergi:\t "+ tax(this.salary));
            System.out.println(" bonus:\t "+ bonus(this.workHours));
            System.out.println(" maaş artışı:\t "+ raiseSalary(this.hireYear ,this.salary));
            System.out.println(" vergi ve bonuslar ile maaş:\t "+(this.salary- tax(this.salary) -bonus(this.workHours)));
            System.out.println(" toplam maaş:\t "+ (this.salary + raiseSalary(this.hireYear , this.salary)));
    }

}
