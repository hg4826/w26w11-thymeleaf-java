package kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.controller;

import kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.model.Song;
import kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SongController {
    private final SongService service;

    @GetMapping("/songs")
    String getAllSongs(Model model) {
        List<Song> songs = service.getAllSongs();
        model.addAttribute("songs", songs);
        return "songs";
    }

    @GetMapping("/songs/random")
    String getRandomSong(Model model) {
        Song song = service.getRandomSong();
        model.addAttribute("song", song);
        return "random";
    }
}
