package com.gcu.cst323cloudtestapp;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

    private static final Logger logger = LoggerFactory.getLogger(GameController.class);

    private final GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/games")
    public String listGames(Model model) {
        model.addAttribute("games", gameRepository.findAll());
        return "games";
    }

    @GetMapping("/games/add")
    public String showAddForm(Model model) {
        model.addAttribute("game", new Game());
        return "add-game";
    }

    @PostMapping("/games/save")
    public String saveGame(Game game) {
        gameRepository.save(game);
        logger.info("Saved game: {}", game.getTitle());
        return "redirect:/games";
    }

    @GetMapping("/games/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Optional<Game> game = gameRepository.findById(id);

        if (game.isPresent()) {
            model.addAttribute("game", game.get());
            return "edit-game";
        }

        return "redirect:/games";
    }

    @GetMapping("/games/delete/{id}")
    public String deleteGame(@PathVariable Integer id) {
        gameRepository.deleteById(id);
        logger.info("Deleted game with ID: {}", id);
        return "redirect:/games";
    }
}