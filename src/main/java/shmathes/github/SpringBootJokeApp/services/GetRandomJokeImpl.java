package shmathes.github.SpringBootJokeApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class GetRandomJokeImpl implements GetRandomJoke
{
    private static final Logger log = LoggerFactory.getLogger(GetRandomJokeImpl.class);

    private final ChuckNorrisQuotes quotes;

    public GetRandomJokeImpl(ChuckNorrisQuotes quotes)
    {
        this.quotes = quotes;
    }

    @PostConstruct
    public void init()
    {
        log.info("Chuck quote = {}", quotes.getRandomQuote());
    }

    @Override
    public String getRandomJoke()
    {
        return quotes.getRandomQuote();
    }
}
