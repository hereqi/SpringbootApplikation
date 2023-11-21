package ch.bbw.st;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String welcome() {
        return "index";
    }

    @GetMapping("/barcode")
    public String barcodeDisplay(Model model) {
        model.addAttribute("barcode", new Barcode());
        return "barcode";
    }

    @PostMapping("/barcode")
    public String mySubmit2Method(@ModelAttribute Barcode barcode, Model model) {

        System.out.println(barcode.getName());
        System.out.println(barcode.getNachname());
        System.out.println(barcode.getFilm());
        System.out.println(barcode.getSaal());
        System.out.println(barcode.getSitzreihe());
        System.out.println(barcode.getZeit());


        model.addAttribute("barcode", barcode);

        return "barcode";
    }

}

