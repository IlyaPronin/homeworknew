public class Main {

    public static void main(String[] args) {

        Griffendor Harry = new Griffendor("Гарри ", "Поттер", "Грифендор",
                10, 50, 10, 8, 15);
        Griffendor Hermione = new Griffendor("Гермиона ", "Грейнджер", "Грифендор",
                15, 45, 15, 10, 20);
        Griffendor Ron = new Griffendor("Рон  ", "Уизли", "Грифендор",
                5, 30, 11, 15, 9);

        Puffendyi Zachariah = new Puffendyi("Захария  ", "Смит", "Пуффендуй",
                10, 50, 10, 8, 15);
        Puffendyi Cedrick = new Puffendyi("Седрик  ", "Диггори", "Пуффендуй",
                10, 50, 10, 8, 15);
        Puffendyi Justin = new Puffendyi("Джастин  ", "Финч-Флетчли", "Пуффендуй",
                10, 50, 10, 8, 15);

        Coktevran Zhou = new Coktevran("Чжоу ", "Чанг", "Когтевран",
                12, 42, 16, 8, 19, 20);
        Coktevran Padma = new Coktevran("Падма ", "Патил", "Когтевран",
                16, 36, 15, 9, 17, 25);
        Coktevran Marcus = new Coktevran(" Маркус ", "Белби", "Когтевран",
                19, 44, 8, 4, 18, 5);

        Slizerrin Draco = new Slizerrin("Драко ", "Малфой", "Когтевран",
                12, 42, 16, 8, 19, 20, 64);
        Slizerrin Graham = new Slizerrin("Грэхэм ", "Монтегю", "Когтевран",
                16, 36, 15, 9, 17, 25, 18);
        Slizerrin Gregory = new Slizerrin("Грегори ", "Гойл", "Когтевран",
                19, 44, 8, 4, 18, 5, 12);

        Gregory.print();
        System.out.println();
        Harry.compareGrifendor(Ron);
        System.out.println();
        Marcus.compareHogwarts(Ron);
    }
}
//        PrintService printService= new PrintService();
//        printService.print (griffendorStudents);
//        printService.print (puffendyiStudents);
//        printService.print (coktevranStudents);
//        printService.print (slizerrinStudents);



//        0 Студентам каждого из этих факультетов присущи свои свойства характера.
//        Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
////        Всем Гриффиндорцам присущи благородство, честь и храбрость.
////        Студенты Пуффендуя трудолюбивы, верны, честны.
////                Когтевранцы умны, мудры, остроумны и полны творчества.
////                Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
////                Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов
// и могут трансгрессировать на какое-то расстояние.
// Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном эквиваленте.
////        Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
////        Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
////        На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
////                На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
////        Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов.
// В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы в качестве объектов.
// Должна быть возможность задавать качества учеников через конструктор.
// Присвойте каждому свойству произвольное числовое значение от 0 до 100.
////        Сделайте метод, который выводит на экран описание студента.
// В описание надо включать качества, которые присущи всем студентам, плюс качества,
// которые присущи студенту, потому что он учится на конкретном факультете.
////        Реализуйте 4 метода, по одному для каждого факультета,
// которые сравнивают между собой учеников одного факультета по свойствам.
// У каждого ученика нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
////        Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
////        Метод должен выводить в консоль сравнение учеников.
////                Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов.
// У Рона Уизли благородство = 3 балла, честь = 6 баллов и храбрость = 5 баллов.
////                У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти.
// Значит метод должен вывести в консоль “Гермиона лучший Гриффиндорец, чем Рон”.
////        Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии,
// и выводит в консоль сравнительную оценку между двумя учениками.
////        Например, Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит.
//////        Важно: поля объектов должны быть приватными.





