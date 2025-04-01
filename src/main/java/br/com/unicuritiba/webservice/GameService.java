package br.com.unicuritiba.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Game> getAllGames() {
        String sql = "SELECT * FROM games";
        return jdbcTemplate.query(sql, new GameRowMapper());
    }

    public Game getGameById(Long id) {
        String sql = "SELECT * FROM games WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new GameRowMapper(), id);
    }

    public Game createGame(Game game) {
        String sql = "INSERT INTO games (title, genre, platform, publisher, releaseYear, rating, description) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, game.getTitle(), game.getGenre(), game.getPlatform(), game.getPublisher(), game.getReleaseYear(), game.getRating(), game.getDescription());
        return game;
    }

    public Game updateGame(Long id, Game gameDetails) {
        String sql = "UPDATE games SET title = ?, genre = ?, platform = ?, publisher = ?, releaseYear = ?, rating = ?, description = ? WHERE id = ?";
        jdbcTemplate.update(sql, gameDetails.getTitle(), gameDetails.getGenre(), gameDetails.getPlatform(), gameDetails.getPublisher(), gameDetails.getReleaseYear(), gameDetails.getRating(), gameDetails.getDescription(), id);
        return gameDetails;
    }

    public void deleteGame(Long id) {
        String sql = "DELETE FROM games WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}