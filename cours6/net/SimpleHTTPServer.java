package net;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.util.LinkedList;
import java.util.List;

class Game {
    int year;
    String name;
    String genre;
    String developer;

    public Game(int year, String name, String genre, String developer) {
        this.year = year;
        this.name = name;
        this.genre = genre;
        this.developer = developer;
    }

    public String toString() {
        // Pour créer une répresentation du jeu vidéo sous le format JSON
        return String.format("{\"year\":%d, \"name\":\"%s\", " +
                "\"genre\":\"%s\", \"developer\":\"%s\"}", year, name, genre, developer);
    }

    /* Méthode statique juste pour creer une liste de jeux vidéos */
    static List<Game> createGameList() {
        List<Game> list = new LinkedList<>();
        list.add(new Game(2014, "Dragon Age: Inquisition", "Action role-playing", "BioWare"));
        list.add(new Game(2015, "The Witcher 3: Wild Hunt", "Action role-playing", "CD Projekt Red"));
        list.add(new Game(2016, "Overwatch", "First-person shooter", "Blizzard Entertainment"));
        list.add(new Game(2017, "The Legend of Zelda: Breath of the Wild", "Action role-playing", "Nintendo EPD"));
        list.add(new Game(2018, "God of War", "Action-adventure", "Santa Monica Studio"));
        list.add(new Game(2019, "Sekiro: Shadows Die Twice", "Action-adventure", "FromSoftware"));
        list.add(new Game(2020, "The Last of Us Part II", "Action-adventure", "Naughty Dog"));
        list.add(new Game(2021, "It Takes Two", "Action-adventure", "Hazelight Studios"));
        return list;
    }
}

class SimpleHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        StringBuilder strBuilder = new StringBuilder();
        List<Game> games = Game.createGameList();
        String response = "{\"data\":" + games.toString() + "}";
        exchange.getResponseHeaders().set("Content-Type", "application/json");
        exchange.sendResponseHeaders(200, response.length());
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}

public class SimpleHTTPServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/games", new SimpleHandler());
        server.setExecutor(null); // creation d'executor défaut
        server.start();
    }
}
