import models.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;




public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        //get: show new post form
        get("/teams/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "newteam-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Team> teams = Team.getAll();
            model.put("teams", teams);
            return new ModelAndView(model, "/index.hbs");
        },  new HandlebarsTemplateEngine());
    }

//    //post: process new post form
//        post("/teams/new", () -> { //URL to make new post on POST route
//            Map<String, Object> model = new HashMap<>();
//
//            String teamName = request.queryParams("teamName");
//            String teamDescription = request.queryParams("teamDescription");
//            String teamMember1 = request.queryParams("teamMember1");
//            String teamMember2 = request.queryParams("teamMember2");
//            String teamMember3 = request.queryParams("teamMember3");
//            String teamMember4 = request.queryParams("teamMember4");
//            Team newTeam = new Team(teamName,teamDescription,teamMember1,teamMember2,teamMember3,teamMember4);
//            model.put("team", newTeam);
//            return new ModelAndView(model, "success.hbs");
//        },  new HandlebarsTemplateEngine());

}
