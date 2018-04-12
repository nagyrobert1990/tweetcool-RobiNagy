package com.codecool.web.service;

import com.codecool.web.model.Tweet;

import java.util.ArrayList;
import java.util.List;

public class TweetService {
    private static TweetService ourInstance = new TweetService();
    private List<Tweet> tweets;

    public static TweetService getInstance() {
        return ourInstance;
    }

    public TweetService() {
        this.tweets = new ArrayList<>();
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void addToTweets(Tweet tweet) {
        tweets.add(tweet);
    }
}
