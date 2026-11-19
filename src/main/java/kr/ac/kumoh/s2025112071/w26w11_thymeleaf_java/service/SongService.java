package kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.service;

import kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.model.Song;
import kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.repository.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SongService {
    private final SongRepository repository;

    public List<Song> getAllSongs() {
        return repository.findAll();
    }

    public Song getRandomSong() {
        return repository.findRandom();
    }
}
