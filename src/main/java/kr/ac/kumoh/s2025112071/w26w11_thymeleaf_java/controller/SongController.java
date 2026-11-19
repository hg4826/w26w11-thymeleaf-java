package kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.controller;

import kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Random;

@Controller
public class SongController {
    private final List<Song> songs = List.of(
            new Song("Cosmic Echo", "Nova", 5),
            new Song("Midnight Drive", "The Lanes", 4),
            new Song("Ocean Breeze", "Blue Coast", 3),
            new Song("Neon Dreams", "Pixel Heart", 4),
            new Song("Silent Galaxy", "Starlight", 5)
    );

    private final Random random = new Random();

    @GetMapping("/songs/random")
    String getRandomSong(Model model) {
        Song song = songs.get(random.nextInt(songs.size()));
        model.addAttribute("song", song);
        return "random";
    }
}
