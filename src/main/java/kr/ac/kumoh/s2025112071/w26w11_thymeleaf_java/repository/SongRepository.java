package kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.repository;

import kr.ac.kumoh.s2025112071.w26w11_thymeleaf_java.model.Song;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Random;

@Repository
public class SongRepository {
    private final List<Song> songs = List.of(
            new Song("Cosmic Echo", "Nova", 5),
            new Song("Midnight Drive", "The Lanes", 4),
            new Song("Ocean Breeze", "Blue Coast", 3),
            new Song("Neon Dreams", "Pixel Heart", 4),
            new Song("Silent Galaxy", "Starlight", 5)
    );

    private final Random random = new Random();

    public List<Song> findAll() {
        return songs;
    }

    public Song findRandom() {
        return songs.get(random.nextInt(songs.size()));
    }
}
