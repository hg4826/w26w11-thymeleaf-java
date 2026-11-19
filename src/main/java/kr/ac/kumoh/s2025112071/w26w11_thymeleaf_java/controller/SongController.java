package kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.controller;

import kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.model.Song;
import kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.repository.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SongController {
    private final SongRepository repository;

    @GetMapping("/songs/random")
    String getRandomSong(Model model) {
        Song song = repository.findRandom();
        model.addAttribute("song", song);
        return "random";
    }
}
