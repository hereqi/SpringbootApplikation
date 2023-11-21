package ch.bbw.st;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class MainController2 {
    /*
    private ArrayList<Player> myteam;

    @GetMapping("/")
    public String welcome() {
        return "index";
    }

    @GetMapping("/greetings")
    public String welcome(Model model) {
        model.addAttribute("message", "Greetings from the controller");
        return "greetings";
    }

    @GetMapping("/phrases")
    public String getPhrases(Model model) {
        ArrayList<String> phrases = new ArrayList<>();
        phrases.add("Better late than never");
        phrases.add("Beat around the bush");
        phrases.add("Bite the bullet");
        phrases.add("Make a long story short");
        model.addAttribute("phrases", phrases);
        return "phrases";
    }

    @GetMapping("/persons")
    public String getPersons(Model model) {
        ArrayList<Person> persons = new ArrayList<>();
        Person p1 = new Person();
        p1.setFirstname("Anna");
        p1.setLastname("Müller");
        persons.add(p1);

        Person p2 = new Person();
        p2.setFirstname("Monkey");
        p2.setLastname("D. Luffy");
        persons.add(p2);

        model.addAttribute("persons", persons);
        return "persons";
    }

    private int getValuOfAllPlayer() {
        int sum = 0;
        for (Player player : myteam) {
            sum += player.getValue();
        }
        return sum;
    }

    private Player getPlayerWithID(int number) {
        for (Player player : myteam) {
            if (player.getNumber() == number) {
                return player;
            }
        }
        return null;
    }


    @GetMapping("/myteam")
    public String getMyTeam(Model model) {
        myteam = new ArrayList<>();
        Player pirlo = new Player();
        pirlo.setAge(38);
        pirlo.setClub("Juve");
        pirlo.setGebDate("19.5.1979");
        pirlo.setBildUrl("https://www.fifaindex.com/static/FIFA18/images/players/10/7763.webp");
        pirlo.setHight(177);
        pirlo.setName("Pirlo");
        pirlo.setNationaliti("Italien");
        pirlo.setNumber(21);
        pirlo.setValue(2200000);
        myteam.add(pirlo);

        Player dybala = new Player();
        pirlo.setAge(27);
        pirlo.setClub("Juve");
        pirlo.setGebDate("15. November 1993");
        pirlo.setBildUrl("https://www.fifaindex.com/static/FIFA21/images/players/10/211110.webp");
        pirlo.setHight(177);
        pirlo.setName("Dybala");
        pirlo.setNationaliti("Argentinien");
        pirlo.setNumber(21);
        pirlo.setValue(95000000);
        myteam.add(dybala);

        Player varane = new Player();
        varane.setAge(28);
        varane.setClub("Real");
        varane.setGebDate("25. April 1993");
        varane.setBildUrl("https://www.fifaindex.com/static/FIFA21/images/players/10/201535.webp");
        varane.setHight(191);
        varane.setName("Raphaël Varane");
        varane.setNationaliti("Frankreich");
        varane.setNumber(5);
        varane.setValue(57000000);
        myteam.add(varane);

        Player virgilVanDijk = new Player();
        virgilVanDijk.setAge(29);
        virgilVanDijk.setClub("Liverpool");
        virgilVanDijk.setGebDate("8. Juli 1991");
        virgilVanDijk.setBildUrl("https://www.fifaindex.com/static/FIFA21/images/players/10/203376.webp");
        virgilVanDijk.setHight(193);
        virgilVanDijk.setName("Virgil van Dijk");
        virgilVanDijk.setNationaliti("Niederlande");
        virgilVanDijk.setNumber(4);
        virgilVanDijk.setValue(113000000);
        myteam.add(virgilVanDijk);

        Player buffon = new Player();
        buffon.setAge(43);
        buffon.setClub("Juve");
        buffon.setGebDate("28. Januar 1978");
        buffon.setBildUrl("https://www.fifaindex.com/static/FIFA21/images/players/10/1179.webp");
        buffon.setHight(192);
        buffon.setName("Gianluigi Buffon");
        buffon.setNationaliti("Italien");
        buffon.setNumber(77);
        buffon.setValue(1000);
        myteam.add(buffon);

        Player zambrotta = new Player();
        zambrotta.setAge(44);
        zambrotta.setClub("Milan");
        zambrotta.setGebDate("19. Februar 1977");
        zambrotta.setBildUrl("https://www.fifaindex.com/static/FIFA12/images/players/10/5099.webp");
        zambrotta.setHight(181);
        zambrotta.setName("Gianluca Zambrotta");
        zambrotta.setNationaliti("Italien");
        zambrotta.setNumber(19);
        zambrotta.setValue(925000);
        myteam.add(zambrotta);

        Player marcelo = new Player();
        marcelo.setAge(33);
        marcelo.setClub("Real");
        marcelo.setGebDate("19. Februar 1977");
        marcelo.setBildUrl("https://img.a.transfermarkt.technology/portrait/header/44501-1603112392.jpg?lm=1");
        marcelo.setHight(174);
        marcelo.setName("Marcelo Vieira da Silva Júnior");
        marcelo.setNationaliti("Brasilien/Spanien");
        marcelo.setNumber(19);
        marcelo.setValue(10000000);
        myteam.add(marcelo);

        Player maradona = new Player();
        maradona.setAge(60);
        maradona.setClub("Napoli");
        maradona.setGebDate("30.10.1960");
        maradona.setBildUrl("https://s.hs-data.com/bilder/spieler/gross/1834.jpg?fallback=png");
        maradona.setHight(165);
        maradona.setName("Diego Armando Maradona Franco");
        maradona.setNationaliti("Argentinien");
        maradona.setNumber(10);
        maradona.setValue(340000000);
        myteam.add(maradona);

        Player pele = new Player();
        pele.setAge(80);
        pele.setClub("New York Cosmos");
        pele.setGebDate("23. Oktober 1940");
        pele.setBildUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Pel%C3%A9_Mar_del_Plata_1965.PNG/229px-Pel%C3%A9_Mar_del_Plata_1965.PNG");
        pele.setHight(173);
        pele.setName("Edson Arantes do Nascimento");
        pele.setNationaliti("Brasilien");
        pele.setNumber(10);
        pele.setValue(70000000);
        myteam.add(pele);

        Player neymar = new Player();
        neymar.setAge(29);
        neymar.setNumber(10);
        neymar.setName("Neymar Jr");
        neymar.setBildUrl("https://www.fifaindex.com/static/FIFA21/images/players/10/190871.webp%22");
        neymar.setNationaliti("Brasilien");
        neymar.setHight(175);
        neymar.setGebDate("5. Februar 1992");
        neymar.setValue(132000000);
        neymar.setClub("Paris Saint Germain");
        myteam.add(neymar);

        model.addAttribute("myteam", myteam);
        return "myteam";

    }

    /*
        @GetMapping("/myView")
        public String myViewDisplay(Model model) {
            model.addAttribute("myModel", new MyModel());
            return "myView";
        }

        @PostMapping("/myView")
        public String mySubmitMethod(@ModelAttribute MyModel myModel) {
            System.out.println(myModel.getContent());
            return "myView";
        }


     */

    @GetMapping("/myCalculator")
    public String myCalculatordisplay(Model model) {
        model.addAttribute("myCalculator", new MyCalculator());
        return "myCalculator";
    }

    @PostMapping("/myCalculator")
    public String mySubmit2Method(@ModelAttribute MyCalculator myCalculator, Model model) {

        System.out.println(myCalculator.getHeight());
        System.out.println(myCalculator.getWeight());
        System.out.println(myCalculator.getValue());
        model.addAttribute("myCalculator", myCalculator);

        return "myCalculator";


    }


    class Person {
        private String firstname;
        private String lastname;
        // Getter- und Setter-Methoden

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
    }
}

