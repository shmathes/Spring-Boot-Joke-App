package shmathes.github.SpringBootJokeApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import shmathes.github.SpringBootJokeApp.services.GetRandomJoke;

@Controller
public class JokeController
{
    private final GetRandomJoke getRandomJoke;

    public JokeController(GetRandomJoke getRandomJoke)
    {
        this.getRandomJoke = getRandomJoke;
    }

    @RequestMapping("/")
    public String getRandomJoke(Model model)
    {
        model.addAttribute("joke", getRandomJoke.getRandomJoke());

        return "chucknorris";
    }
}
