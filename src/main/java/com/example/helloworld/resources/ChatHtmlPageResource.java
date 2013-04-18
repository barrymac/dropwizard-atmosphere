package com.example.helloworld.resources;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.URL;

@Path("/chatpage")
@Produces(MediaType.TEXT_HTML)
public class ChatHtmlPageResource {

    @GET
    public Response chatRoom() {
        String pageContent = "";
        try {
            URL clientPage = Resources.getResource("assets/chat.html");
            pageContent = Resources.toString(clientPage, Charsets.UTF_8);
        } catch (IOException e) {
            return Response.serverError().build();
        }
        return Response.ok(pageContent).build();
    }
}

