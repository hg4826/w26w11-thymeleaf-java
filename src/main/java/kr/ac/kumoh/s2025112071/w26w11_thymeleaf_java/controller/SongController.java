package kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Random;

@Controller
public class SongController {
    private final List<String> songs = List.of(
            "Cosmic Echo",
            "Midnight Drive",
            "Ocean Breeze",
            "Neon Dreams",
            "Silent Galaxy"
    );

    private final Random random = new Random();

    @GetMapping("/songs/random")
    String getRandomSong(Model model) {
        String song = songs.get(random.nextInt(songs.size()));
        model.addAttribute("song", song);
        return "random";
    }
}
