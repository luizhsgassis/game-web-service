package br.com.unicuritiba.webservice;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GameRowMapper implements RowMapper<Game> {
    @Override
    public Game mapRow(ResultSet rs, int rowNum) throws SQLException {
        Game game = new Game();
        game.setId(rs.getLong("id"));
        game.setTitle(rs.getString("title"));
        game.setGenre(rs.getString("genre"));
        game.setPlatform(rs.getString("platform"));
        game.setPublisher(rs.getString("publisher"));
        game.setReleaseYear(rs.getInt("releaseYear"));
        game.setRating(rs.getDouble("rating"));
        game.setDescription(rs.getString("description"));
        return game;
    }
}