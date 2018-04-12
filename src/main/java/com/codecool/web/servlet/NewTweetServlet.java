package com.codecool.web.servlet;

import com.codecool.web.model.Tweet;
import com.codecool.web.service.TweetService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/newTweet")
public class NewTweetServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String poster = req.getParameter("poster");
        String post = req.getParameter("post");

        if (!poster.equals("") || !post.equals("")) {
            TweetService.getInstance().addToTweets(new Tweet(poster, post));
        }

        resp.sendRedirect("index.jsp");
    }
}
