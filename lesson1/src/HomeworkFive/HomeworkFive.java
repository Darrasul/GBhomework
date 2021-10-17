package HomeworkFive;



public class HomeworkFive {

    public static void main(String[] args) {

        Employee[] companyEmployees = new Employee[5];
        companyEmployees[0] = new Employee("Бузас Витовтас Дарио", "Учащийся",
                                        "vitovtasbuzas@gmail.com",  "89110278421", -6000, 23);
        companyEmployees[1] = new Employee("Иванов Иван Иванович","Человек-заглушка","ivan@list.ru",
                                                "89151234567",15000,31);
        companyEmployees[2] = new Employee("Невероятно Cтарый Cотрудник","Человек предпенсионного возраста",
                                        "diplodocus@yandex.ru","89001234567",14500,255);
        companyEmployees[3] = new Employee("Друзь Александр Абрамович","Магистр Что?Где?Когда?",
                                            "WhatWhereWhen@mail.ru","88005553535",250000,66);
        companyEmployees[4] = new Employee("Ульяненко Максим Анатольевич","Пограничник(по возрасту)","ulamax@gmail.com",
                                            "89899888989",25000,40);

        System.out.println("Вот запрошенные результаты: сотрудники старше 40 лет");
        for (int i = 0; i < companyEmployees.length; i++) {
            if (companyEmployees[i].getAge() > 40){
                companyEmployees[i].EmployeeStatus();
            }
        }






    }
}
